package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

public class atu implements anv {
    private final atv f2327b;
    private final URL f2328c;
    private final String f2329d;
    private String f2330e;
    private URL f2331f;
    private volatile byte[] f2332g;
    private int f2333h;

    public atu(URL url) {
        this(url, atv.f2335b);
    }

    public atu(String str) {
        this(str, atv.f2335b);
    }

    private atu(URL url, atv atv) {
        this.f2328c = (URL) gwb.m1404I((Object) url);
        this.f2329d = null;
        this.f2327b = (atv) gwb.m1404I((Object) atv);
    }

    public atu(String str, atv atv) {
        this.f2328c = null;
        this.f2329d = gwb.m2289l(str);
        this.f2327b = (atv) gwb.m1404I((Object) atv);
    }

    public String m4019b() {
        return m4016e();
    }

    private String m4016e() {
        if (TextUtils.isEmpty(this.f2330e)) {
            String str = this.f2329d;
            if (TextUtils.isEmpty(str)) {
                str = this.f2328c.toString();
            }
            this.f2330e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
        }
        return this.f2330e;
    }

    public Map<String, String> m4020c() {
        return this.f2327b.mo390a();
    }

    public String m4021d() {
        return this.f2329d != null ? this.f2329d : this.f2328c.toString();
    }

    public String toString() {
        return m4021d();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof atu)) {
            return false;
        }
        atu atu = (atu) obj;
        if (m4021d().equals(atu.m4021d()) && this.f2327b.equals(atu.f2327b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f2333h == 0) {
            this.f2333h = m4021d().hashCode();
            this.f2333h = (this.f2333h * 31) + this.f2327b.hashCode();
        }
        return this.f2333h;
    }

    public URL m4017a() {
        if (this.f2331f == null) {
            this.f2331f = new URL(m4016e());
        }
        return this.f2331f;
    }

    public void mo308a(MessageDigest messageDigest) {
        if (this.f2332g == null) {
            this.f2332g = m4021d().getBytes(a);
        }
        messageDigest.update(this.f2332g);
    }
}
