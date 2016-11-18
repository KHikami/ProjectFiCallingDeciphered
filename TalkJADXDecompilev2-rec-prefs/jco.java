package p000;

public final class jco {
    private final String f19855a;
    private final int f19856b;
    private final boolean f19857c;

    jco(jcp jcp) {
        this.f19855a = jcp.f19858a;
        this.f19856b = jcp.f19859b;
        this.f19857c = jcp.f19860c;
    }

    public String m23898a() {
        return this.f19855a;
    }

    public int m23899b() {
        return this.f19856b;
    }

    public boolean m23900c() {
        return this.f19857c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jco jco = (jco) obj;
        if (this.f19857c == jco.f19857c && gwb.m2223g(this.f19855a, jco.f19855a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f19857c ? 1 : 0) + (this.f19855a.hashCode() * 31);
    }
}
