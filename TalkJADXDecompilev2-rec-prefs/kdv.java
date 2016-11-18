package p000;

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
    static final Logger f21430a = Logger.getLogger(kdv.class.getName());
    public final kfk f21431b;
    public final HttpTransport f21432c;
    public final HttpExecuteInterceptor f21433d;
    public final JsonFactory f21434e;
    public final String f21435f;
    private final Lock f21436g = new ReentrantLock();
    private final kdw f21437h;
    private String f21438i;
    private Long f21439j;
    private String f21440k;
    private final Collection<C0000a> f21441l;
    private final HttpRequestInitializer f21442m;

    public kdv(kdx kdx) {
        this.f21437h = (kdw) bc.m4799a(kdx.f21443a);
        this.f21432c = kdx.f21444b;
        this.f21434e = kdx.f21445c;
        this.f21435f = kdx.f21446d == null ? null : kdx.f21446d.build();
        this.f21433d = kdx.f21448f;
        this.f21442m = kdx.f21449g;
        this.f21441l = Collections.unmodifiableCollection(kdx.f21450h);
        this.f21431b = (kfk) bc.m4799a(kdx.f21447e);
    }

    public void intercept(HttpRequest httpRequest) {
        this.f21436g.lock();
        try {
            Long b = m25606b();
            if (this.f21438i == null || (b != null && b.longValue() <= 60)) {
                m25607c();
                if (this.f21438i == null) {
                    return;
                }
            }
            this.f21437h.m25615a(httpRequest, this.f21438i);
            this.f21436g.unlock();
        } finally {
            this.f21436g.unlock();
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
                    find = kdu.f21429a.matcher(str).find();
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
                this.f21436g.lock();
                if (ba.m4612b(this.f21438i, this.f21437h.m25614a(httpRequest)) && !m25607c()) {
                    z3 = false;
                }
                this.f21436g.unlock();
                return z3;
            } catch (Throwable e) {
                f21430a.log(Level.SEVERE, "unable to refresh token", e);
            } catch (Throwable th) {
                this.f21436g.unlock();
            }
        }
        return false;
    }

    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
        httpRequest.setUnsuccessfulResponseHandler(this);
    }

    public kdv mo3645a(String str) {
        this.f21436g.lock();
        try {
            this.f21438i = str;
            return this;
        } finally {
            this.f21436g.unlock();
        }
    }

    public kdv mo3649b(String str) {
        this.f21436g.lock();
        if (str != null) {
            try {
                boolean z = (this.f21434e == null || this.f21432c == null || this.f21433d == null || this.f21435f == null) ? false : true;
                bc.m4815a(z, (Object) "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
            } catch (Throwable th) {
                this.f21436g.unlock();
            }
        }
        this.f21440k = str;
        this.f21436g.unlock();
        return this;
    }

    public kdv mo3644a(Long l) {
        this.f21436g.lock();
        try {
            this.f21439j = l;
            return this;
        } finally {
            this.f21436g.unlock();
        }
    }

    private Long m25606b() {
        this.f21436g.lock();
        try {
            if (this.f21439j == null) {
                return null;
            }
            Long valueOf = Long.valueOf((this.f21439j.longValue() - this.f21431b.mo3671a()) / 1000);
            this.f21436g.unlock();
            return valueOf;
        } finally {
            this.f21436g.unlock();
        }
    }

    public kdv mo3648b(Long l) {
        return mo3644a(l == null ? null : Long.valueOf(this.f21431b.mo3671a() + (l.longValue() * 1000)));
    }

    private boolean m25607c() {
        boolean z = true;
        this.f21436g.lock();
        try {
            ked a = mo3647a();
            if (a != null) {
                mo3646a(a);
                Iterator it = this.f21441l.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.f21436g.unlock();
                return true;
            }
        } catch (kee e) {
            if (400 > e.getStatusCode() || e.getStatusCode() >= 500) {
                z = false;
            }
            if (e.f21472a != null && z) {
                mo3645a(null);
                mo3648b(null);
            }
            Iterator it2 = this.f21441l.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            if (z) {
                throw e;
            }
        } catch (Throwable th) {
            this.f21436g.unlock();
        }
        this.f21436g.unlock();
        return false;
    }

    public ked mo3647a() {
        if (this.f21440k == null) {
            return null;
        }
        return new kdy(this.f21432c, this.f21434e, new GenericUrl(this.f21435f), this.f21440k).m25627a(this.f21433d).m25628a(this.f21442m).m25620a();
    }

    public kdv mo3646a(ked ked) {
        mo3645a(ked.f21469a);
        if (ked.f21471c != null) {
            mo3649b(ked.f21471c);
        }
        mo3648b(ked.f21470b);
        return this;
    }
}
