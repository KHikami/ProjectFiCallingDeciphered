package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.api.client.http.HttpStatusCodes;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlResponseInfo;

/* renamed from: juo */
public class juo {
    private static final kad a;
    private static final AtomicInteger b;
    private static final kad c;
    private static volatile String d;
    public static final kad f;
    private jvs A;
    private CronetEngine B;
    private final String e;
    public final Context g;
    public final jvc h;
    public final int i;
    juv j;
    public int k;
    public String l;
    public Exception m;
    int n;
    boolean o;
    public final juz p;
    String q;
    boolean r;
    private final String s;
    private final juy t;
    private final List<jun> u;
    private final String v;
    private String w;
    private UrlRequest x;
    private WritableByteChannel y;
    private int z;

    static {
        f = new kad("debug.rpc.dogfood");
        a = new kad("debug.rpc.metrics");
        b = new AtomicInteger(1);
        c = new kad("debug.rpc.use_obscura_nonce", false);
        d = null;
    }

    public juo(Context context, jvc jvc, String str, juy juy) {
        this(context, jvc, str, juy, null, null);
    }

    private juo(Context context, jvc jvc, String str, juy juy, String str2, String str3) {
        this.i = b.getAndIncrement();
        this.k = -1;
        this.n = 3;
        this.r = false;
        this.g = context;
        this.h = jvc;
        this.s = str;
        this.t = juy;
        this.e = null;
        this.v = null;
        this.u = jyn.c(this.g, jun.class);
        this.A = (jvs) jyn.b(this.g, jvs.class);
        this.p = new juz();
    }

    public final void g() {
        ((jum) jyn.a(this.g, jum.class)).a(this);
    }

    public void h() {
        synchronized (this) {
            this.o = true;
            UrlRequest urlRequest = this.x;
            if (urlRequest != null) {
                urlRequest.e();
            }
        }
    }

    public void a() {
    }

    public void a(ByteBuffer byteBuffer) {
        b(byteBuffer, null);
    }

    public void a(ByteBuffer byteBuffer, String str) {
        b(byteBuffer, null);
    }

    public void a(int i, String str, Exception exception) {
    }

    public boolean i() {
        return this.o;
    }

    public String j() {
        return getClass().getSimpleName();
    }

    public String k() {
        return this.e;
    }

    private String d() {
        try {
            return new URL(k()).getHost();
        } catch (MalformedURLException e) {
            return null;
        }
    }

    public String[] l() {
        return new String[]{j()};
    }

    public byte[] c() {
        return null;
    }

    public String m() {
        return null;
    }

    public String b() {
        return this.v;
    }

    public boolean n() {
        return (this.k == HttpStatusCodes.STATUS_CODE_OK && this.m == null) ? false : true;
    }

    void o() {
        Callback juq;
        jur jur;
        a();
        this.p.i();
        Map a = this.t.a(k());
        String str = d;
        if (Log.isLoggable("HttpOperation", 3)) {
            StringBuilder stringBuilder = new StringBuilder("HTTP headers:\n");
            for (Entry entry : a.entrySet()) {
                if ("Authorization".equals(entry.getKey())) {
                    stringBuilder.append("Authorization: <removed>");
                } else {
                    try {
                        stringBuilder.append((String) entry.getKey()).append(": ").append((String) entry.getValue());
                    } catch (IOException e) {
                        a(0, null, e);
                        q();
                        this.x = null;
                        return;
                    } catch (Throwable th) {
                        this.x = null;
                    }
                }
                stringBuilder.append('\n');
            }
        }
        Object juu = new juu();
        if (this.y == null) {
            jur jur2 = new jur();
            juq = new juq(this, jur2);
            jur = jur2;
        } else {
            juq = new jut(this, this.y);
            jur = null;
        }
        synchronized (this) {
            if (i()) {
                this.x = null;
                return;
            }
            ByteBuffer byteBuffer;
            if (this.B == null) {
                this.B = (CronetEngine) jyn.a(this.g, CronetEngine.class);
            }
            Builder a2 = new Builder(k(), juq, juu, this.B).a(this.n).a(this.s);
            for (Entry entry2 : a.entrySet()) {
                a2.a((String) entry2.getKey(), (String) entry2.getValue());
            }
            this.r = false;
            this.p.b(d());
            this.p.d();
            byte[] c = c();
            if (c != null) {
                a2.a("Content-Type", b());
                a2.a(new jus(c), juu);
                this.p.a((long) c.length);
                if (s()) {
                    a(c, m());
                }
            }
            this.x = a2.a();
            this.x.a();
            while (!this.r) {
                juu.a();
            }
            this.x = null;
            if (jur == null) {
                byteBuffer = null;
            } else {
                byteBuffer = jur.a();
            }
            UrlResponseInfo urlResponseInfo = juq.b;
            IOException iOException = juq.a;
            if (urlResponseInfo != null && urlResponseInfo.e().containsKey("Content-Type")) {
                this.w = (String) ((List) urlResponseInfo.e().get("Content-Type")).get(0);
            }
            if (urlResponseInfo != null) {
                this.p.b(urlResponseInfo.g());
            }
            a(urlResponseInfo == null ? 0 : urlResponseInfo.b(), null, iOException);
            if (this.k == HttpStatusCodes.STATUS_CODE_OK) {
                if (this.j != null) {
                    this.j.c();
                }
                a(byteBuffer);
            } else if (!(i() || this.k == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED)) {
                a(byteBuffer, this.w);
            }
            this.x = null;
        }
    }

    void p() {
        this.z++;
        if (b(this.m) && this.z < 2) {
            try {
                if (c(this.m)) {
                    this.t.a();
                }
                o();
                p();
                return;
            } catch (IOException e) {
                a(0, null, e);
            }
        }
        a(this.k, this.l, this.m);
    }

    public void a(int i, String str, IOException iOException) {
        if (i == HttpStatusCodes.STATUS_CODE_OK && iOException != null) {
            i = 0;
        } else if (!(i == HttpStatusCodes.STATUS_CODE_OK || i == 0 || iOException != null)) {
            iOException = new jul(i, null);
        }
        this.k = i;
        this.l = null;
        this.m = iOException;
        if (this.A != null && i == 0) {
            k();
            j();
        }
    }

    protected boolean b(Exception exception) {
        return c(exception);
    }

    public boolean c(Exception exception) {
        if (exception instanceof jul) {
            switch (((jul) exception).a()) {
                case HttpStatusCodes.STATUS_CODE_UNAUTHORIZED /*401*/:
                    return true;
            }
        }
        return false;
    }

    protected void q() {
        Object obj;
        Exception exception = this.m;
        if (exception == null) {
            obj = 1;
        } else if (exception instanceof SocketException) {
            r0 = 1;
        } else if (exception instanceof UnknownHostException) {
            r0 = 1;
        } else if (exception instanceof SSLException) {
            r0 = 1;
        } else if ((exception instanceof jul) && ((jul) exception).a() == HttpStatusCodes.STATUS_CODE_UNAUTHORIZED) {
            r0 = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            String valueOf = String.valueOf(j());
            Log.e("HttpOperation", new StringBuilder(String.valueOf(valueOf).length() + 23).append("[").append(valueOf).append("] Unexpected exception").toString(), this.m);
        }
    }

    void r() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            try {
                jun jun = (jun) this.u.get(i);
                String b = this.h.b();
                j();
                jun.a(b, this.j, this.k, this.q);
            } catch (Throwable th) {
                Log.e("HttpOperation", "Couldn't save network data", th);
            }
        }
    }

    public void a(byte[] bArr, String str) {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            try {
                jun jun = (jun) this.u.get(i);
                if (jun.a(j())) {
                    j();
                    jun.c(str);
                }
            } catch (Throwable th) {
                Log.e("HttpOperation", "Couldn't log request", th);
            }
        }
    }

    public void b(ByteBuffer byteBuffer, String str) {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            try {
                jun jun = (jun) this.u.get(i);
                if (jun.b(j())) {
                    j();
                    byteBuffer.duplicate();
                    jun.d(str);
                }
            } catch (Throwable th) {
                Log.e("HttpOperation", "Couldn't log response", th);
            }
        }
    }

    protected boolean s() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            if (((jun) this.u.get(i)).a(j())) {
                return true;
            }
        }
        return false;
    }

    public boolean t() {
        int size = this.u.size();
        for (int i = 0; i < size; i++) {
            if (((jun) this.u.get(i)).b(j())) {
                return true;
            }
        }
        return false;
    }
}
