import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import org.chromium.net.ChunkedWritableByteChannel;
import org.chromium.net.CronetEngine;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequest.Builder;
import org.chromium.net.UrlRequest.Callback;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlResponseInfo;

final class jkc {
    private static final jsh n;
    final jkj a;
    final jkn b;
    long c;
    String d;
    long e;
    long f;
    int g;
    long h;
    UrlRequest i;
    jsm<WritableByteChannel> j;
    boolean k;
    File l;
    ByteBuffer m;
    private String o;
    private CronetEngine p;
    private ExecutorService q;
    private final Callback r;

    static {
        n = new jkd();
    }

    void a(UrlRequest urlRequest, UrlRequestException urlRequestException) {
        synchronized (this) {
            if (urlRequest != this.i) {
                return;
            }
            this.i = null;
            this.m = null;
            g();
            this.g++;
            if (urlRequestException != null) {
                String valueOf;
                if (Log.isLoggable("Downloader", 3)) {
                    valueOf = String.valueOf(this.a.l());
                    new StringBuilder(String.valueOf(valueOf).length() + 25).append("Network Exception: Id is:").append(valueOf);
                }
                jkj jkj = this.a;
                String str = "Network exception: ";
                valueOf = String.valueOf(urlRequestException.getMessage());
                jkj.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), (Throwable) urlRequestException);
            }
            this.a.a(4);
        }
    }

    jkc(jkj jkj, jkn jkn) {
        this.g = 0;
        this.r = new jke(this);
        this.a = jkj;
        this.b = jkn;
        if (jkn != null) {
            this.p = (CronetEngine) jyn.a(jkn.l(), CronetEngine.class);
            this.q = (ExecutorService) jyn.a(jkn.l(), ExecutorService.class);
        }
    }

    static String a(UrlResponseInfo urlResponseInfo, String str) {
        List list = (List) urlResponseInfo.e().get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    boolean a() {
        return this.g <= 3;
    }

    void b() {
        jjr c;
        jtw l = this.a.l();
        String e = this.a.e();
        if ((l.i & 1024) != 0) {
            c = this.b.c();
        } else {
            c = this.b.b();
        }
        String b = c.b(e);
        this.l = new File(b);
        if (this.l.exists()) {
            this.o = b(b, false);
        }
        if (this.a.p()) {
            b = this.o;
            e = String.valueOf(this.a.l());
            new StringBuilder((String.valueOf(b).length() + 34) + String.valueOf(e).length()).append("Downloading using URL: ").append(b).append(" resource: ").append(e);
        }
        File parentFile = this.l.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            this.j = new jsm(new FileOutputStream(this.l, true).getChannel(), n);
            if (this.o == null) {
                e = String.valueOf(this);
                throw new NullPointerException(new StringBuilder(String.valueOf(e).length() + 22).append("Download URL is null: ").append(e).toString());
            }
            UrlRequest urlRequest;
            Builder a = new Builder(this.o, this.r, this.q, this.p).a(0);
            a(a, this.l.length());
            synchronized (this) {
                this.i = a.a();
                urlRequest = this.i;
            }
            urlRequest.a();
        } catch (Throwable e2) {
            this.a.a("Cannot open cache file", e2);
            this.a.a(4);
        }
    }

    private static void a(Builder builder, long j) {
        if (j != 0) {
            builder.a("Range", "bytes=" + j + "-");
        }
    }

    void c() {
        Map a;
        UrlRequest urlRequest;
        this.h = 0;
        String e = this.a.e();
        this.l = this.b.b().a(e);
        if (this.l != null) {
            this.o = b(this.l.getPath(), true);
            if (!this.l.exists()) {
                this.l = null;
            }
        }
        if (this.a.p()) {
            String str = this.o;
            String valueOf = String.valueOf(this.a.l());
            new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()).append("Downloading using URL: ").append(str).append(" resource: ").append(valueOf);
        }
        this.j = new jsm(new ChunkedWritableByteChannel(), this.a);
        if (this.l != null) {
            try {
                this.h = this.l.length();
                if (this.a.p()) {
                    long j = this.h;
                    String valueOf2 = String.valueOf(this.a.l());
                    new StringBuilder((String.valueOf(e).length() + 68) + String.valueOf(valueOf2).length()).append("Continuing download to file ").append(e).append(" (").append(j).append(" bytes) resource: ").append(valueOf2);
                }
                this.j.write(gwb.a(this.l, true));
            } catch (IOException e2) {
                this.j = null;
                this.h = 0;
            }
        }
        jki jki = (jki) jyn.b(this.b.l(), jki.class);
        if (jki != null) {
            a = jki.a();
            if (this.a.p() && !a.isEmpty()) {
                String valueOf3 = String.valueOf(a);
                str = String.valueOf(this.a.l());
                new StringBuilder((String.valueOf(valueOf3).length() + 33) + String.valueOf(str).length()).append("Adding image headers: ").append(valueOf3).append(" resource: ").append(str);
            }
        } else {
            a = null;
        }
        Builder a2 = new Builder(this.o, this.r, this.q, this.p).a(2);
        if (a != null) {
            for (Entry entry : a.entrySet()) {
                a2.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (this.j != null) {
            a(a2, this.h);
        }
        synchronized (this) {
            this.i = a2.a();
            urlRequest = this.i;
        }
        urlRequest.a();
    }

    private String b(String str, boolean z) {
        try {
            return kdq.a(String.valueOf(str).concat("u"));
        } catch (FileNotFoundException e) {
            return this.a.a();
        } catch (Throwable e2) {
            this.a.a("Cannot obtain download URL for partial file", e2);
            if (z) {
                this.l.delete();
                new File(String.valueOf(str).concat("u")).delete();
            }
            return this.a.a();
        }
    }

    File d() {
        if (this.k) {
            File file = this.l;
            a(this.l.getName(), (((jtw) this.a.l()).i & 1024) != 0);
            return file;
        }
        File f = this.a.f();
        this.l.renameTo(f);
        return f;
    }

    void e() {
        if (this.a.n) {
            UrlRequest urlRequest;
            synchronized (this) {
                urlRequest = this.i;
            }
            if (urlRequest != null) {
                this.q.submit(new jkf(this, urlRequest));
            }
        }
    }

    void f() {
        this.a.n = true;
        this.e = System.currentTimeMillis();
        this.b.a(this.a);
    }

    void g() {
        if (this.a.n) {
            this.a.n = false;
            this.f = System.currentTimeMillis();
            this.b.b(this.a);
            if (this.a.p()) {
                String valueOf = String.valueOf(this.a.k());
                String valueOf2 = String.valueOf(this.a.l());
                new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("Download completed in ").append(valueOf).append("; ").append(valueOf2);
            }
            if (this.j != null) {
                try {
                    this.j.close();
                } catch (Throwable e) {
                    Log.e("Downloader", "onDownloadEnd: Error closing progress channel ", e);
                }
            }
        }
    }

    void a(String str) {
        this.o = str;
    }

    boolean a(String str, boolean z) {
        jjr c = z ? this.b.c() : this.b.b();
        try {
            kdq.a(c.b(String.valueOf(str).concat("u")), this.o);
            return true;
        } catch (Throwable e) {
            this.a.a("Cannot save download URL", e);
            new File(c.b(str)).delete();
            return false;
        }
    }

    void h() {
        if (this.l != null) {
            this.l.delete();
        }
    }

    long i() {
        return this.e;
    }

    long j() {
        return this.h;
    }

    long k() {
        return this.f;
    }
}
