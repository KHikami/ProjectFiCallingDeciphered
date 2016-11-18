package p000;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class bcn implements Serializable {
    private static final long serialVersionUID = 2;
    private final fbw f3042a;
    private String f3043b;
    private final String f3044c;
    private String f3045d;
    private List<String> f3046e;
    private List<String> f3047f;
    private String f3048g;

    public bcn(bco bco) {
        iil.m21875b("Expected non-null", bco.f3049a);
        this.f3042a = bco.f3049a;
        this.f3043b = bco.f3050b;
        this.f3044c = bco.f3051c;
        this.f3045d = bco.f3052d;
    }

    public boolean m4892a() {
        return this.f3042a != null;
    }

    public fbw m4893b() {
        return this.f3042a;
    }

    public boolean m4894c() {
        return !TextUtils.isEmpty(this.f3043b);
    }

    public String m4895d() {
        return this.f3043b;
    }

    public boolean m4896e() {
        return !TextUtils.isEmpty(this.f3044c);
    }

    public String m4897f() {
        return this.f3044c;
    }

    public String m4898g() {
        return this.f3045d;
    }

    public static bcn m4887a(bjg bjg, fbw fbw) {
        bcn a = bcn.m4888a(fbw, bjg.mo571e(), bjg.mo572f());
        Collection<bje> d = bjg.mo570d();
        Collection<bjo> b = bjg.mo568b();
        if (d != null) {
            for (bje c : d) {
                a.m4890b(c.m5365c());
            }
        }
        if (b != null) {
            for (bjo c2 : b) {
                a.m4891c(c2.m5473c());
            }
        }
        a.m4889a(bjg.m5379A());
        return a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcn)) {
            return false;
        }
        return this.f3042a.equals(((bcn) obj).f3042a);
    }

    public int hashCode() {
        return this.f3042a.hashCode();
    }

    public edk m4899h() {
        if (!this.f3042a.m14935a(gwb.m1400H())) {
            return gwb.m1601a(this.f3042a.m14936b(gwb.m1400H()), this.f3043b, this.f3043b, this.f3042a.f12670e, this.f3045d, null);
        }
        return gwb.m1599a(gwb.m1400H(), this.f3042a.f12669d, gwb.au(), !TextUtils.isEmpty(this.f3043b), this.f3045d, this.f3043b, 0);
    }

    public String m4900i() {
        String valueOf = String.valueOf(m4893b());
        String valueOf2 = String.valueOf(m4895d());
        String valueOf3 = String.valueOf(m4897f());
        String valueOf4 = String.valueOf(m4898g());
        return new StringBuilder((((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("[Person] ").append(valueOf).append(" ").append(valueOf2).append(" ").append(valueOf3).append(" ").append(valueOf4).toString();
    }

    private void m4889a(String str) {
        this.f3048g = str;
    }

    private void m4890b(String str) {
        if (this.f3047f == null) {
            this.f3047f = new ArrayList();
        }
        this.f3047f.add(str);
    }

    private void m4891c(String str) {
        if (this.f3046e == null) {
            this.f3046e = new ArrayList();
        }
        this.f3046e.add(str);
    }

    public List<String> m4901j() {
        return this.f3047f;
    }

    public List<String> m4902k() {
        return this.f3046e;
    }

    public String m4903l() {
        return this.f3048g;
    }

    public static bcn m4888a(fbw fbw, String str, String str2) {
        bco newBuilder = bcn.newBuilder();
        newBuilder.m4905a(fbw);
        newBuilder.m4906a(str);
        newBuilder.m4907b(str2);
        return newBuilder.m4904a();
    }

    public String toString() {
        String valueOf = String.valueOf(glk.m17974b(this.f3043b));
        String valueOf2 = String.valueOf(this.f3042a);
        String valueOf3 = String.valueOf(glk.m17974b(this.f3044c));
        return new StringBuilder(((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Person {name: ").append(valueOf).append(" | inviteeId: ").append(valueOf2).append(" | email: ").append(valueOf3).append("}").toString();
    }

    public static bco newBuilder() {
        return new bco();
    }
}
