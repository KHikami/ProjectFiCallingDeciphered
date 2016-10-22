package defpackage;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bcn */
public final class bcn implements Serializable {
    private static final long serialVersionUID = 2;
    private final fbw a;
    private String b;
    private final String c;
    private String d;
    private List<String> e;
    private List<String> f;
    private String g;

    public bcn(bco bco) {
        iil.b("Expected non-null", bco.a);
        this.a = bco.a;
        this.b = bco.b;
        this.c = bco.c;
        this.d = bco.d;
    }

    public boolean a() {
        return this.a != null;
    }

    public fbw b() {
        return this.a;
    }

    public boolean c() {
        return !TextUtils.isEmpty(this.b);
    }

    public String d() {
        return this.b;
    }

    public boolean e() {
        return !TextUtils.isEmpty(this.c);
    }

    public String f() {
        return this.c;
    }

    public String g() {
        return this.d;
    }

    public static bcn a(bjg bjg, fbw fbw) {
        bcn a = bcn.a(fbw, bjg.e(), bjg.f());
        Collection<bje> d = bjg.d();
        Collection<bjo> b = bjg.b();
        if (d != null) {
            for (bje c : d) {
                a.b(c.c());
            }
        }
        if (b != null) {
            for (bjo c2 : b) {
                a.c(c2.c());
            }
        }
        a.a(bjg.A());
        return a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcn)) {
            return false;
        }
        return this.a.equals(((bcn) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public edk h() {
        if (!this.a.a(gwb.H())) {
            return gwb.a(this.a.b(gwb.H()), this.b, this.b, this.a.e, this.d, null);
        }
        return gwb.a(gwb.H(), this.a.d, gwb.au(), !TextUtils.isEmpty(this.b), this.d, this.b, 0);
    }

    public String i() {
        String valueOf = String.valueOf(b());
        String valueOf2 = String.valueOf(d());
        String valueOf3 = String.valueOf(f());
        String valueOf4 = String.valueOf(g());
        return new StringBuilder((((String.valueOf(valueOf).length() + 12) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()).append("[Person] ").append(valueOf).append(" ").append(valueOf2).append(" ").append(valueOf3).append(" ").append(valueOf4).toString();
    }

    private void a(String str) {
        this.g = str;
    }

    private void b(String str) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(str);
    }

    private void c(String str) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(str);
    }

    public List<String> j() {
        return this.f;
    }

    public List<String> k() {
        return this.e;
    }

    public String l() {
        return this.g;
    }

    public static bcn a(fbw fbw, String str, String str2) {
        bco newBuilder = bcn.newBuilder();
        newBuilder.a(fbw);
        newBuilder.a(str);
        newBuilder.b(str2);
        return newBuilder.a();
    }

    public String toString() {
        String valueOf = String.valueOf(glk.b(this.b));
        String valueOf2 = String.valueOf(this.a);
        String valueOf3 = String.valueOf(glk.b(this.c));
        return new StringBuilder(((String.valueOf(valueOf).length() + 39) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append("Person {name: ").append(valueOf).append(" | inviteeId: ").append(valueOf2).append(" | email: ").append(valueOf3).append("}").toString();
    }

    public static bco newBuilder() {
        return new bco();
    }
}
