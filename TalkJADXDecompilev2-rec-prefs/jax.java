package p000;

import java.io.Serializable;

public final class jax implements Serializable {
    private static final long serialVersionUID = 1;
    private boolean f19645a;
    private int f19646b = 0;
    private boolean f19647c;
    private long f19648d = 0;
    private boolean f19649e;
    private String f19650f = "";
    private boolean f19651g;
    private boolean f19652h = false;
    private boolean f19653i;
    private int f19654j = 1;
    private boolean f19655k;
    private String f19656l = "";
    private boolean f19657m;
    private jay f19658n = jay.FROM_NUMBER_WITH_PLUS_SIGN;
    private boolean f19659o;
    private String f19660p = "";

    private boolean m23711m() {
        return this.f19645a;
    }

    public int m23719a() {
        return this.f19646b;
    }

    public jax m23720a(int i) {
        this.f19645a = true;
        this.f19646b = i;
        return this;
    }

    private boolean m23712n() {
        return this.f19647c;
    }

    public long m23726b() {
        return this.f19648d;
    }

    public jax m23721a(long j) {
        this.f19647c = true;
        this.f19648d = j;
        return this;
    }

    public boolean m23731c() {
        return this.f19649e;
    }

    public String m23732d() {
        return this.f19650f;
    }

    public jax m23722a(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f19649e = true;
        this.f19650f = str;
        return this;
    }

    public jax m23733e() {
        this.f19649e = false;
        this.f19650f = "";
        return this;
    }

    private boolean m23713o() {
        return this.f19651g;
    }

    public boolean m23734f() {
        return this.f19652h;
    }

    public jax m23725a(boolean z) {
        this.f19651g = true;
        this.f19652h = z;
        return this;
    }

    private boolean m23714p() {
        return this.f19653i;
    }

    public int m23735g() {
        return this.f19654j;
    }

    public jax m23727b(int i) {
        this.f19653i = true;
        this.f19654j = i;
        return this;
    }

    public boolean m23736h() {
        return this.f19655k;
    }

    public String m23737i() {
        return this.f19656l;
    }

    public jax m23728b(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f19655k = true;
        this.f19656l = str;
        return this;
    }

    public jax m23738j() {
        this.f19655k = false;
        this.f19656l = "";
        return this;
    }

    private boolean m23715q() {
        return this.f19657m;
    }

    private jay m23716r() {
        return this.f19658n;
    }

    public jax m23724a(jay jay) {
        if (jay == null) {
            throw new NullPointerException();
        }
        this.f19657m = true;
        this.f19658n = jay;
        return this;
    }

    public jax m23739k() {
        this.f19657m = false;
        this.f19658n = jay.FROM_NUMBER_WITH_PLUS_SIGN;
        return this;
    }

    private boolean m23717s() {
        return this.f19659o;
    }

    private String m23718t() {
        return this.f19660p;
    }

    public jax m23730c(String str) {
        if (str == null) {
            throw new NullPointerException();
        }
        this.f19659o = true;
        this.f19660p = str;
        return this;
    }

    public jax m23740l() {
        this.f19659o = false;
        this.f19660p = "";
        return this;
    }

    public jax m23723a(jax jax) {
        if (jax.m23711m()) {
            m23720a(jax.m23719a());
        }
        if (jax.m23712n()) {
            m23721a(jax.m23726b());
        }
        if (jax.m23731c()) {
            m23722a(jax.m23732d());
        }
        if (jax.m23713o()) {
            m23725a(jax.m23734f());
        }
        if (jax.m23714p()) {
            m23727b(jax.m23735g());
        }
        if (jax.m23736h()) {
            m23728b(jax.m23737i());
        }
        if (jax.m23715q()) {
            m23724a(jax.m23716r());
        }
        if (jax.m23717s()) {
            m23730c(jax.m23718t());
        }
        return this;
    }

    public boolean m23729b(jax jax) {
        if (jax == null) {
            return false;
        }
        if (this == jax) {
            return true;
        }
        if (this.f19646b == jax.f19646b && this.f19648d == jax.f19648d && this.f19650f.equals(jax.f19650f) && this.f19652h == jax.f19652h && this.f19654j == jax.f19654j && this.f19656l.equals(jax.f19656l) && this.f19658n == jax.f19658n && this.f19660p.equals(jax.f19660p) && m23717s() == jax.m23717s()) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jax) && m23729b((jax) obj);
    }

    public int hashCode() {
        int i = 1231;
        int a = ((((((((((m23734f() ? 1231 : 1237) + ((((((m23719a() + 2173) * 53) + Long.valueOf(m23726b()).hashCode()) * 53) + m23732d().hashCode()) * 53)) * 53) + m23735g()) * 53) + m23737i().hashCode()) * 53) + m23716r().hashCode()) * 53) + m23718t().hashCode()) * 53;
        if (!m23717s()) {
            i = 1237;
        }
        return a + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Country Code: ").append(this.f19646b);
        stringBuilder.append(" National Number: ").append(this.f19648d);
        if (m23713o() && m23734f()) {
            stringBuilder.append(" Leading Zero(s): true");
        }
        if (m23714p()) {
            stringBuilder.append(" Number of leading zeros: ").append(this.f19654j);
        }
        if (m23731c()) {
            stringBuilder.append(" Extension: ").append(this.f19650f);
        }
        if (m23715q()) {
            stringBuilder.append(" Country Code Source: ").append(this.f19658n);
        }
        if (m23717s()) {
            stringBuilder.append(" Preferred Domestic Carrier Code: ").append(this.f19660p);
        }
        return stringBuilder.toString();
    }
}
