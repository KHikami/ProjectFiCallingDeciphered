package defpackage;

public final class bti {
    public int a;
    public long b;
    public int c;
    public long d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bti bti = (bti) obj;
        if (gwb.g(Integer.valueOf(this.a), Integer.valueOf(bti.a)) && gwb.g(Long.valueOf(this.b), Long.valueOf(bti.b)) && gwb.g(Integer.valueOf(this.c), Integer.valueOf(bti.c)) && gwb.g(Long.valueOf(this.d), Long.valueOf(bti.d))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.c(Integer.valueOf(this.a), Long.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d));
    }
}
