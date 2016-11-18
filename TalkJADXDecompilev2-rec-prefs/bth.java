package p000;

public final class bth {
    public boolean f4411a;
    public boolean f4412b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bth bth = (bth) obj;
        if (gwb.m2223g(Boolean.valueOf(this.f4411a), Boolean.valueOf(bth.f4411a)) && gwb.m2223g(Boolean.valueOf(this.f4412b), Boolean.valueOf(bth.f4412b))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.m2074c(Boolean.valueOf(this.f4411a), Boolean.valueOf(this.f4412b));
    }
}
