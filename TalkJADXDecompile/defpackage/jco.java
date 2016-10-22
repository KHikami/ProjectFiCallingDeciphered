package defpackage;

/* renamed from: jco */
public final class jco {
    private final String a;
    private final int b;
    private final boolean c;

    jco(jcp jcp) {
        this.a = jcp.a;
        this.b = jcp.b;
        this.c = jcp.c;
    }

    public String a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jco jco = (jco) obj;
        if (this.c == jco.c && gwb.g(this.a, jco.a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.c ? 1 : 0) + (this.a.hashCode() * 31);
    }
}
