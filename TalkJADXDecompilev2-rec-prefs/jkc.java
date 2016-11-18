package p000;

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
    private static final jsh f20329n = new jkd();
    final jkj f20330a;
    final jkn f20331b;
    long f20332c;
    String f20333d;
    long f20334e;
    long f20335f;
    int f20336g = 0;
    long f20337h;
    UrlRequest f20338i;
    jsm<WritableByteChannel> f20339j;
    boolean f20340k;
    File f20341l;
    ByteBuffer f20342m;
    private String f20343o;
    private CronetEngine f20344p;
    private ExecutorService f20345q;
    private final Callback f20346r = new jke(this);

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m24532a(UrlRequest urlRequest, UrlRequestException urlRequestException) {
        synchronized (this) {
            if (urlRequest != this.f20338i) {
            } else {
                this.f20338i = null;
                this.f20342m = null;
            }
        }
    }

    jkc(jkj jkj, jkn jkn) {
        this.f20330a = jkj;
        this.f20331b = jkn;
        if (jkn != null) {
            this.f20344p = (CronetEngine) jyn.m25426a(jkn.mo3535l(), CronetEngine.class);
            this.f20345q = (ExecutorService) jyn.m25426a(jkn.mo3535l(), ExecutorService.class);
        }
    }

    static String m24528a(UrlResponseInfo urlResponseInfo, String str) {
        List list = (List) urlResponseInfo.e().get(str);
        return (list == null || list.isEmpty()) ? null : (String) list.get(0);
    }

    boolean m24533a() {
        return this.f20336g <= 3;
    }

    void m24535b() {
        jjr c;
        jtw l = this.f20330a.m24246l();
        String e = this.f20330a.m24267e();
        if ((l.f20071i & 1024) != 0) {
            c = this.f20331b.mo3547c();
        } else {
            c = this.f20331b.mo3544b();
        }
        String b = c.m24511b(e);
        this.f20341l = new File(b);
        if (this.f20341l.exists()) {
            this.f20343o = m24530b(b, false);
        }
        if (this.f20330a.m24250p()) {
            b = this.f20343o;
            e = String.valueOf(this.f20330a.m24246l());
            new StringBuilder((String.valueOf(b).length() + 34) + String.valueOf(e).length()).append("Downloading using URL: ").append(b).append(" resource: ").append(e);
        }
        File parentFile = this.f20341l.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            this.f20339j = new jsm(new FileOutputStream(this.f20341l, true).getChannel(), f20329n);
            if (this.f20343o == null) {
                e = String.valueOf(this);
                throw new NullPointerException(new StringBuilder(String.valueOf(e).length() + 22).append("Download URL is null: ").append(e).toString());
            }
            UrlRequest urlRequest;
            Builder a = new Builder(this.f20343o, this.f20346r, this.f20345q, this.f20344p).a(0);
            jkc.m24529a(a, this.f20341l.length());
            synchronized (this) {
                this.f20338i = a.a();
                urlRequest = this.f20338i;
            }
            urlRequest.a();
        } catch (Throwable e2) {
            this.f20330a.m24236a("Cannot open cache file", e2);
            this.f20330a.mo3512a(4);
        }
    }

    private static void m24529a(Builder builder, long j) {
        if (j != 0) {
            builder.a("Range", "bytes=" + j + "-");
        }
    }

    void m24536c() {
        Map a;
        UrlRequest urlRequest;
        this.f20337h = 0;
        String e = this.f20330a.m24267e();
        this.f20341l = this.f20331b.mo3544b().m24507a(e);
        if (this.f20341l != null) {
            this.f20343o = m24530b(this.f20341l.getPath(), true);
            if (!this.f20341l.exists()) {
                this.f20341l = null;
            }
        }
        if (this.f20330a.m24250p()) {
            String str = this.f20343o;
            String valueOf = String.valueOf(this.f20330a.m24246l());
            new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length()).append("Downloading using URL: ").append(str).append(" resource: ").append(valueOf);
        }
        this.f20339j = new jsm(new ChunkedWritableByteChannel(), this.f20330a);
        if (this.f20341l != null) {
            try {
                this.f20337h = this.f20341l.length();
                if (this.f20330a.m24250p()) {
                    long j = this.f20337h;
                    String valueOf2 = String.valueOf(this.f20330a.m24246l());
                    new StringBuilder((String.valueOf(e).length() + 68) + String.valueOf(valueOf2).length()).append("Continuing download to file ").append(e).append(" (").append(j).append(" bytes) resource: ").append(valueOf2);
                }
                this.f20339j.write(gwb.m1683a(this.f20341l, true));
            } catch (IOException e2) {
                this.f20339j = null;
                this.f20337h = 0;
            }
        }
        jki jki = (jki) jyn.m25433b(this.f20331b.mo3535l(), jki.class);
        if (jki != null) {
            a = jki.m24552a();
            if (this.f20330a.m24250p() && !a.isEmpty()) {
                String valueOf3 = String.valueOf(a);
                str = String.valueOf(this.f20330a.m24246l());
                new StringBuilder((String.valueOf(valueOf3).length() + 33) + String.valueOf(str).length()).append("Adding image headers: ").append(valueOf3).append(" resource: ").append(str);
            }
        } else {
            a = null;
        }
        Builder a2 = new Builder(this.f20343o, this.f20346r, this.f20345q, this.f20344p).a(2);
        if (a != null) {
            for (Entry entry : a.entrySet()) {
                a2.a((String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (this.f20339j != null) {
            jkc.m24529a(a2, this.f20337h);
        }
        synchronized (this) {
            this.f20338i = a2.a();
            urlRequest = this.f20338i;
        }
        urlRequest.a();
    }

    private String m24530b(String str, boolean z) {
        try {
            return kdq.m25598a(String.valueOf(str).concat("u"));
        } catch (FileNotFoundException e) {
            return this.f20330a.mo3511a();
        } catch (Throwable e2) {
            this.f20330a.m24236a("Cannot obtain download URL for partial file", e2);
            if (z) {
                this.f20341l.delete();
                new File(String.valueOf(str).concat("u")).delete();
            }
            return this.f20330a.mo3511a();
        }
    }

    File m24537d() {
        if (this.f20340k) {
            File file = this.f20341l;
            m24534a(this.f20341l.getName(), (((jtw) this.f20330a.m24246l()).f20071i & 1024) != 0);
            return file;
        }
        File f = this.f20330a.mo3518f();
        this.f20341l.renameTo(f);
        return f;
    }

    void m24538e() {
        if (this.f20330a.f20095n) {
            UrlRequest urlRequest;
            synchronized (this) {
                urlRequest = this.f20338i;
            }
            if (urlRequest != null) {
                this.f20345q.submit(new jkf(this, urlRequest));
            }
        }
    }

    void m24539f() {
        this.f20330a.f20095n = true;
        this.f20334e = System.currentTimeMillis();
        this.f20331b.mo3541a(this.f20330a);
    }

    void m24540g() {
        if (this.f20330a.f20095n) {
            this.f20330a.f20095n = false;
            this.f20335f = System.currentTimeMillis();
            this.f20331b.mo3545b(this.f20330a);
            if (this.f20330a.m24250p()) {
                String valueOf = String.valueOf(this.f20330a.m24273k());
                String valueOf2 = String.valueOf(this.f20330a.m24246l());
                new StringBuilder((String.valueOf(valueOf).length() + 24) + String.valueOf(valueOf2).length()).append("Download completed in ").append(valueOf).append("; ").append(valueOf2);
            }
            if (this.f20339j != null) {
                try {
                    this.f20339j.close();
                } catch (Throwable e) {
                    Log.e("Downloader", "onDownloadEnd: Error closing progress channel ", e);
                }
            }
        }
    }

    void m24531a(String str) {
        this.f20343o = str;
    }

    boolean m24534a(String str, boolean z) {
        jjr c = z ? this.f20331b.mo3547c() : this.f20331b.mo3544b();
        try {
            kdq.m25601a(c.m24511b(String.valueOf(str).concat("u")), this.f20343o);
            return true;
        } catch (Throwable e) {
            this.f20330a.m24236a("Cannot save download URL", e);
            new File(c.m24511b(str)).delete();
            return false;
        }
    }

    void m24541h() {
        if (this.f20341l != null) {
            this.f20341l.delete();
        }
    }

    long m24542i() {
        return this.f20334e;
    }

    long m24543j() {
        return this.f20337h;
    }

    long m24544k() {
        return this.f20335f;
    }
}
