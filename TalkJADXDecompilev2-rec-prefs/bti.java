package p000;

public final class bti {
    public int f4413a;
    public long f4414b;
    public int f4415c;
    public long f4416d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bti bti = (bti) obj;
        if (gwb.m2223g(Integer.valueOf(this.f4413a), Integer.valueOf(bti.f4413a)) && gwb.m2223g(Long.valueOf(this.f4414b), Long.valueOf(bti.f4414b)) && gwb.m2223g(Integer.valueOf(this.f4415c), Integer.valueOf(bti.f4415c)) && gwb.m2223g(Long.valueOf(this.f4416d), Long.valueOf(bti.f4416d))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.m2074c(Integer.valueOf(this.f4413a), Long.valueOf(this.f4414b), Integer.valueOf(this.f4415c), Long.valueOf(this.f4416d));
    }
}
