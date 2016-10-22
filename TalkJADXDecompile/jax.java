import java.io.Serializable;

public final class jax implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean a;
    private int b;
    private boolean c;
    private long d;
    private boolean e;
    private String f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private String l;
    private boolean m;
    private jay n;
    private boolean o;
    private String p;

    public jax() {
        this.b = 0;
        this.d = 0;
        this.f = "";
        this.h = false;
        this.j = 1;
        this.l = "";
        this.p = "";
        this.n = jay.FROM_NUMBER_WITH_PLUS_SIGN;
    }

    private boolean m() {
        return this.a;
    }

    public int a() {
        return this.b;
    }

    public jax a(int i) {
        this.a = true;
        this.b = i;
        return this;
    }

    private boolean n() {
        return this.c;
    }

    public long b() {
        return this.d;
    }

    public jax a(long j) {
        this.c = true;
        this.d = j;
        return this;
    }

    public boolean c() {
        return this.e;
    }

    public String d() {
        return this.f;
    }

    public jax a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.e = true;
        this.f = str;
        return this;
    }

    public jax e() {
        this.e = false;
        this.f = "";
        return this;
    }

    private boolean o() {
        return this.g;
    }

    public boolean f() {
        return this.h;
    }

    public jax a(boolean z) {
        this.g = true;
        this.h = z;
        return this;
    }

    private boolean p() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public jax b(int i) {
        this.i = true;
        this.j = i;
        return this;
    }

    public boolean h() {
        return this.k;
    }

    public String i() {
        return this.l;
    }

    public jax b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.k = true;
        this.l = str;
        return this;
    }

    public jax j() {
        this.k = false;
        this.l = "";
        return this;
    }

    private boolean q() {
        return this.m;
    }

    private jay r() {
        return this.n;
    }

    public jax a(jay jay) {
        if (jay == null) {
            throw new NullPointerException();
        }
        this.m = true;
        this.n = jay;
        return this;
    }

    public jax k() {
        this.m = false;
        this.n = jay.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }

    private boolean s() {
        return this.o;
    }

    private String t() {
        return this.p;
    }

    public jax c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.o = true;
        this.p = str;
        return this;
    }

    public jax l() {
        this.o = false;
        this.p = "";
        return this;
    }

    public jax a(jax jax) {
        if (jax.m()) {
            a(jax.a());
        }
        if (jax.n()) {
            a(jax.b());
        }
        if (jax.c()) {
            a(jax.d());
        }
        if (jax.o()) {
            a(jax.f());
        }
        if (jax.p()) {
            b(jax.g());
        }
        if (jax.h()) {
            b(jax.i());
        }
        if (jax.q()) {
            a(jax.r());
        }
        if (jax.s()) {
            c(jax.t());
        }
        return this;
    }

    public boolean b(jax jax) {
        if (jax == null) {
            return false;
        }
        if (this == jax) {
            return true;
        }
        if (this.b == jax.b && this.d == jax.d && this.f.equals(jax.f) && this.h == jax.h && this.j == jax.j && this.l.equals(jax.l) && this.n == jax.n && this.p.equals(jax.p) && s() == jax.s()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jax) && b((jax) obj);
    }

    public int hashCode() {
        int i = 1231;
        int a = ((((((((((f() ? 1231 : 1237) + ((((((a() + 2173) * 53) + Long.valueOf(b()).hashCode()) * 53) + d().hashCode()) * 53)) * 53) + g()) * 53) + i().hashCode()) * 53) + r().hashCode()) * 53) + t().hashCode()) * 53;
        if (!s()) {
            i = 1237;
        }
        return a + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country Code: ").append(this.b);
        stringBuilder.append(" National Number: ").append(this.d);
        if (o() && f()) {
            stringBuilder.append(" Leading Zero(s): true");
        }
        if (p()) {
            stringBuilder.append(" Number of leading zeros: ").append(this.j);
        }
        if (c()) {
            stringBuilder.append(" Extension: ").append(this.f);
        }
        if (q()) {
            stringBuilder.append(" Country Code Source: ").append(this.n);
        }
        if (s()) {
            stringBuilder.append(" Preferred Domestic Carrier Code: ").append(this.p);
        }
        return stringBuilder.toString();
    }
}
