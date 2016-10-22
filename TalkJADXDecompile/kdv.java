import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpStatusCodes;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class kdv implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler {
    static final Logger a;
    public final kfk b;
    public final HttpTransport c;
    public final HttpExecuteInterceptor d;
    public final JsonFactory e;
    public final String f;
    private final Lock g;
    private final kdw h;
    private String i;
    private Long j;
    private String k;
    private final Collection<a> l;
    private final HttpRequestInitializer m;

    static {
        a = Logger.getLogger(kdv.class.getName());
    }

    public kdv(kdx kdx) {
        this.g = new ReentrantLock();
        this.h = (kdw) bc.a(kdx.a);
        this.c = kdx.b;
        this.e = kdx.c;
        this.f = kdx.d == null ? null : kdx.d.build();
        this.d = kdx.f;
        this.m = kdx.g;
        this.l = Collections.unmodifiableCollection(kdx.h);
        this.b = (kfk) bc.a(kdx.e);
    }

    public void intercept(HttpRequest httpRequest) {
        this.g.lock();
        try {
            Long b = b();
            if (this.i == null || (b != null && b.longValue() <= 60)) {
                c();
                if (this.i == null) {
                    return;
                }
            }
            this.h.a(httpRequest, this.i);
            this.g.unlock();
        } finally {
            this.g.unlock();
        }
    }

    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z) {
        boolean find;
        boolean z2;
        boolean z3 = true;
        List<String> authenticateAsList = httpResponse.getHeaders().getAuthenticateAsList();
        if (authenticateAsList != null) {
            for (String str : authenticateAsList) {
                if (str.startsWith("Bearer ")) {
                    find = kdu.a.matcher(str).find();
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        find = false;
        if (!z2) {
            find = httpResponse.getStatusCode() == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED;
        }
        if (find) {
            try {
                this.g.lock();
                if (ba.b(this.i, this.h.a(httpRequest)) && !c()) {
                    z3 = false;
                }
                this.g.unlock();
                return z3;
            } catch (Throwable e) {
                a.log(Level.SEVERE, "unable to refresh token", e);
            } catch (Throwable th) {
                this.g.unlock();
            }
        }
        return false;
    }

    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    public kdv a(String str) {
        this.g.lock();
        try {
            this.i = str;
            return this;
        } finally {
            this.g.unlock();
        }
    }

    public kdv b(String str) {
        this.g.lock();
        if (str != null) {
            try {
                boolean z = (this.e == null || this.c == null || this.d == null || this.f == null) ? false : true;
                bc.a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.g.unlock();
            }
        }
        this.k = str;
        this.g.unlock();
        return this;
    }

    public kdv a(Long l) {
        this.g.lock();
        try {
            this.j = l;
            return this;
        } finally {
            this.g.unlock();
        }
    }

    private Long b() {
        this.g.lock();
        try {
            if (this.j == null) {
                return null;
            }
            Long valueOf = Long.valueOf((this.j.longValue() - this.b.a()) / 1000);
            this.g.unlock();
            return valueOf;
        } finally {
            this.g.unlock();
        }
    }

    public kdv b(Long l) {
        return a(l == null ? null : Long.valueOf(this.b.a() + (l.longValue() * 1000)));
    }

    private boolean c() {
        boolean z = true;
        this.g.lock();
        try {
            ked a = a();
            if (a != null) {
                a(a);
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.g.unlock();
                return true;
            }
        } catch (kee e) {
            if (400 > e.getStatusCode() || e.getStatusCode() >= HttpStatusCodes.STATUS_CODE_SERVER_ERROR) {
                z = false;
            }
            if (e.a != null && z) {
                a(null);
                b(null);
            }
            Iterator it2 = this.l.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            this.g.unlock();
        }
        this.g.unlock();
        return false;
    }

    public ked a() {
        if (this.k == null) {
            return null;
        }
        return new kdy(this.c, this.e, new GenericUrl(this.f), this.k).a(this.d).a(this.m).a();
    }

    public kdv a(ked ked) {
        a(ked.a);
        if (ked.c != null) {
            b(ked.c);
        }
        b(ked.b);
        return this;
    }
}
