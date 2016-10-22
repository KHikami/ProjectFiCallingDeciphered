package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* renamed from: atu */
public class atu implements anv {
    private final atv b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public atu(URL url) {
        this(url, atv.b);
    }

    public atu(String str) {
        this(str, atv.b);
    }

    private atu(URL url, atv atv) {
        this.c = (URL) gwb.I((Object) url);
        this.d = null;
        this.b = (atv) gwb.I((Object) atv);
    }

    public atu(String str, atv atv) {
        this.c = null;
        this.d = gwb.l(str);
        this.b = (atv) gwb.I((Object) atv);
    }

    public String b() {
        return e();
    }

    private String e() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                str = this.c.toString();
            }
            this.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.e;
    }

    public Map<String, String> c() {
        return this.b.a();
    }

    public String d() {
        return this.d != null ? this.d : this.c.toString();
    }

    public String toString() {
        return d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof atu)) {
            return false;
        }
        atu atu = (atu) obj;
        if (d().equals(atu.d()) && this.b.equals(atu.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.h == 0) {
            this.h = d().hashCode();
            this.h = (this.h * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public URL a() {
        if (this.f == null) {
            this.f = new URL(e());
        }
        return this.f;
    }

    public void a(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = d().getBytes(a);
        }
        messageDigest.update(this.g);
    }
}
