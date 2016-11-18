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
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLException;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;

public class juo {
    private static final kad a = new kad("debug.rpc.metrics");
    private static final AtomicInteger b = new AtomicInteger(1);
    private static final kad c = new kad("debug.rpc.use_obscura_nonce", false);
    private static volatile String d = null;
    public static final kad f = new kad("debug.rpc.dogfood");
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

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void o() {
        /*
        r12 = this;
        r2 = 0;
        r3 = 0;
        r12.a();	 Catch:{ IOException -> 0x0051 }
        r0 = r12.p;	 Catch:{ IOException -> 0x0051 }
        r0.i();	 Catch:{ IOException -> 0x0051 }
        r0 = r12.t;	 Catch:{ IOException -> 0x0051 }
        r1 = r12.k();	 Catch:{ IOException -> 0x0051 }
        r6 = r0.a(r1);	 Catch:{ IOException -> 0x0051 }
        r0 = d;	 Catch:{ IOException -> 0x0051 }
        r0 = "HttpOperation";
        r1 = 3;
        r0 = android.util.Log.isLoggable(r0, r1);	 Catch:{ IOException -> 0x0051 }
        if (r0 == 0) goto L_0x007b;
    L_0x001f:
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0051 }
        r0 = "HTTP headers:\n";
        r4.<init>(r0);	 Catch:{ IOException -> 0x0051 }
        r0 = r6.entrySet();	 Catch:{ IOException -> 0x0051 }
        r5 = r0.iterator();	 Catch:{ IOException -> 0x0051 }
    L_0x002e:
        r0 = r5.hasNext();	 Catch:{ IOException -> 0x0051 }
        if (r0 == 0) goto L_0x007b;
    L_0x0034:
        r0 = r5.next();	 Catch:{ IOException -> 0x0051 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ IOException -> 0x0051 }
        r1 = "Authorization";
        r7 = r0.getKey();	 Catch:{ IOException -> 0x0051 }
        r1 = r1.equals(r7);	 Catch:{ IOException -> 0x0051 }
        if (r1 == 0) goto L_0x005d;
    L_0x0046:
        r0 = "Authorization: <removed>";
        r4.append(r0);	 Catch:{ IOException -> 0x0051 }
    L_0x004b:
        r0 = 10;
        r4.append(r0);	 Catch:{ IOException -> 0x0051 }
        goto L_0x002e;
    L_0x0051:
        r0 = move-exception;
        r1 = 0;
        r2 = 0;
        r12.a(r1, r2, r0);	 Catch:{ all -> 0x0077 }
        r12.q();	 Catch:{ all -> 0x0077 }
        r12.x = r3;
    L_0x005c:
        return;
    L_0x005d:
        r1 = r0.getKey();	 Catch:{ IOException -> 0x0051 }
        r1 = (java.lang.String) r1;	 Catch:{ IOException -> 0x0051 }
        r1 = r4.append(r1);	 Catch:{ IOException -> 0x0051 }
        r7 = ": ";
        r1 = r1.append(r7);	 Catch:{ IOException -> 0x0051 }
        r0 = r0.getValue();	 Catch:{ IOException -> 0x0051 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0051 }
        r1.append(r0);	 Catch:{ IOException -> 0x0051 }
        goto L_0x004b;
    L_0x0077:
        r0 = move-exception;
        r12.x = r3;
        throw r0;
    L_0x007b:
        r7 = new juu;	 Catch:{ IOException -> 0x0051 }
        r7.<init>();	 Catch:{ IOException -> 0x0051 }
        r0 = r12.y;	 Catch:{ IOException -> 0x0051 }
        if (r0 != 0) goto L_0x009b;
    L_0x0084:
        r1 = new jur;	 Catch:{ IOException -> 0x0051 }
        r1.<init>();	 Catch:{ IOException -> 0x0051 }
        r0 = new juq;	 Catch:{ IOException -> 0x0051 }
        r0.<init>(r12, r1);	 Catch:{ IOException -> 0x0051 }
        r4 = r0;
        r5 = r1;
    L_0x0090:
        monitor-enter(r12);	 Catch:{ IOException -> 0x0051 }
        r0 = r12.i();	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00a5;
    L_0x0097:
        monitor-exit(r12);	 Catch:{ all -> 0x00f0 }
        r12.x = r3;
        goto L_0x005c;
    L_0x009b:
        r0 = new jut;	 Catch:{ IOException -> 0x0051 }
        r1 = r12.y;	 Catch:{ IOException -> 0x0051 }
        r0.<init>(r12, r1);	 Catch:{ IOException -> 0x0051 }
        r4 = r0;
        r5 = r3;
        goto L_0x0090;
    L_0x00a5:
        r0 = r12.B;	 Catch:{ all -> 0x00f0 }
        if (r0 != 0) goto L_0x00b5;
    L_0x00a9:
        r0 = r12.g;	 Catch:{ all -> 0x00f0 }
        r1 = org.chromium.net.CronetEngine.class;
        r0 = defpackage.jyn.a(r0, r1);	 Catch:{ all -> 0x00f0 }
        r0 = (org.chromium.net.CronetEngine) r0;	 Catch:{ all -> 0x00f0 }
        r12.B = r0;	 Catch:{ all -> 0x00f0 }
    L_0x00b5:
        r0 = new org.chromium.net.UrlRequest$Builder;	 Catch:{ all -> 0x00f0 }
        r1 = r12.k();	 Catch:{ all -> 0x00f0 }
        r8 = r12.B;	 Catch:{ all -> 0x00f0 }
        r0.<init>(r1, r4, r7, r8);	 Catch:{ all -> 0x00f0 }
        r1 = r12.n;	 Catch:{ all -> 0x00f0 }
        r0 = r0.a(r1);	 Catch:{ all -> 0x00f0 }
        r1 = r12.s;	 Catch:{ all -> 0x00f0 }
        r8 = r0.a(r1);	 Catch:{ all -> 0x00f0 }
        r0 = r6.entrySet();	 Catch:{ all -> 0x00f0 }
        r6 = r0.iterator();	 Catch:{ all -> 0x00f0 }
    L_0x00d4:
        r0 = r6.hasNext();	 Catch:{ all -> 0x00f0 }
        if (r0 == 0) goto L_0x00f3;
    L_0x00da:
        r0 = r6.next();	 Catch:{ all -> 0x00f0 }
        r0 = (java.util.Map.Entry) r0;	 Catch:{ all -> 0x00f0 }
        r1 = r0.getKey();	 Catch:{ all -> 0x00f0 }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x00f0 }
        r0 = r0.getValue();	 Catch:{ all -> 0x00f0 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x00f0 }
        r8.a(r1, r0);	 Catch:{ all -> 0x00f0 }
        goto L_0x00d4;
    L_0x00f0:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x00f0 }
        throw r0;	 Catch:{ IOException -> 0x0051 }
    L_0x00f3:
        r0 = 0;
        r12.r = r0;	 Catch:{ all -> 0x00f0 }
        monitor-exit(r12);	 Catch:{ all -> 0x00f0 }
        r0 = r12.p;	 Catch:{ IOException -> 0x0051 }
        r1 = r12.d();	 Catch:{ IOException -> 0x0051 }
        r0.b(r1);	 Catch:{ IOException -> 0x0051 }
        r0 = r12.p;	 Catch:{ IOException -> 0x0051 }
        r0.d();	 Catch:{ IOException -> 0x0051 }
        r0 = r12.c();	 Catch:{ IOException -> 0x0051 }
        if (r0 == 0) goto L_0x0130;
    L_0x010b:
        r1 = "Content-Type";
        r6 = r12.b();	 Catch:{ IOException -> 0x0051 }
        r8.a(r1, r6);	 Catch:{ IOException -> 0x0051 }
        r1 = new jus;	 Catch:{ IOException -> 0x0051 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0051 }
        r8.a(r1, r7);	 Catch:{ IOException -> 0x0051 }
        r1 = r12.p;	 Catch:{ IOException -> 0x0051 }
        r6 = r0.length;	 Catch:{ IOException -> 0x0051 }
        r10 = (long) r6;	 Catch:{ IOException -> 0x0051 }
        r1.a(r10);	 Catch:{ IOException -> 0x0051 }
        r1 = r12.s();	 Catch:{ IOException -> 0x0051 }
        if (r1 == 0) goto L_0x0130;
    L_0x0129:
        r1 = r12.m();	 Catch:{ IOException -> 0x0051 }
        r12.a(r0, r1);	 Catch:{ IOException -> 0x0051 }
    L_0x0130:
        r0 = r8.a();	 Catch:{ IOException -> 0x0051 }
        r12.x = r0;	 Catch:{ IOException -> 0x0051 }
        r0 = r12.x;	 Catch:{ IOException -> 0x0051 }
        r0.a();	 Catch:{ IOException -> 0x0051 }
    L_0x013b:
        r0 = r12.r;	 Catch:{ IOException -> 0x0051 }
        if (r0 != 0) goto L_0x0143;
    L_0x013f:
        r7.a();	 Catch:{ IOException -> 0x0051 }
        goto L_0x013b;
    L_0x0143:
        r0 = 0;
        r12.x = r0;	 Catch:{ IOException -> 0x0051 }
        if (r5 != 0) goto L_0x0198;
    L_0x0148:
        r1 = r3;
    L_0x0149:
        r5 = r4.b;	 Catch:{ IOException -> 0x0051 }
        r4 = r4.a;	 Catch:{ IOException -> 0x0051 }
        if (r5 == 0) goto L_0x0170;
    L_0x014f:
        r0 = r5.e();	 Catch:{ IOException -> 0x0051 }
        r6 = "Content-Type";
        r0 = r0.containsKey(r6);	 Catch:{ IOException -> 0x0051 }
        if (r0 == 0) goto L_0x0170;
    L_0x015b:
        r0 = r5.e();	 Catch:{ IOException -> 0x0051 }
        r6 = "Content-Type";
        r0 = r0.get(r6);	 Catch:{ IOException -> 0x0051 }
        r0 = (java.util.List) r0;	 Catch:{ IOException -> 0x0051 }
        r6 = 0;
        r0 = r0.get(r6);	 Catch:{ IOException -> 0x0051 }
        r0 = (java.lang.String) r0;	 Catch:{ IOException -> 0x0051 }
        r12.w = r0;	 Catch:{ IOException -> 0x0051 }
    L_0x0170:
        if (r5 == 0) goto L_0x017b;
    L_0x0172:
        r0 = r12.p;	 Catch:{ IOException -> 0x0051 }
        r6 = r5.g();	 Catch:{ IOException -> 0x0051 }
        r0.b(r6);	 Catch:{ IOException -> 0x0051 }
    L_0x017b:
        if (r5 != 0) goto L_0x019e;
    L_0x017d:
        r0 = r2;
    L_0x017e:
        r2 = 0;
        r12.a(r0, r2, r4);	 Catch:{ IOException -> 0x0051 }
        r0 = r12.k;	 Catch:{ IOException -> 0x0051 }
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r0 != r2) goto L_0x01a3;
    L_0x0188:
        r0 = r12.j;	 Catch:{ IOException -> 0x0051 }
        if (r0 == 0) goto L_0x0191;
    L_0x018c:
        r0 = r12.j;	 Catch:{ IOException -> 0x0051 }
        r0.c();	 Catch:{ IOException -> 0x0051 }
    L_0x0191:
        r12.a(r1);	 Catch:{ IOException -> 0x0051 }
    L_0x0194:
        r12.x = r3;
        goto L_0x005c;
    L_0x0198:
        r0 = r5.a();	 Catch:{ IOException -> 0x0051 }
        r1 = r0;
        goto L_0x0149;
    L_0x019e:
        r0 = r5.b();	 Catch:{ IOException -> 0x0051 }
        goto L_0x017e;
    L_0x01a3:
        r0 = r12.i();	 Catch:{ IOException -> 0x0051 }
        if (r0 != 0) goto L_0x0194;
    L_0x01a9:
        r0 = r12.k;	 Catch:{ IOException -> 0x0051 }
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r0 == r2) goto L_0x0194;
    L_0x01af:
        r0 = r12.w;	 Catch:{ IOException -> 0x0051 }
        r12.a(r1, r0);	 Catch:{ IOException -> 0x0051 }
        goto L_0x0194;
        */
        throw new UnsupportedOperationException("Method not decompiled: juo.o():void");
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
