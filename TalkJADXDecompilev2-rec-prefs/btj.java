package p000;

public final class btj {
    public long f4417a;
    public int f4418b;
    public long f4419c;
    public String f4420d;
    public String f4421e;
    public String f4422f;
    public String f4423g;
    public int f4424h;
    public int f4425i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        btj btj = (btj) obj;
        if (gwb.m2223g(Long.valueOf(this.f4417a), Long.valueOf(btj.f4417a)) && gwb.m2223g(Integer.valueOf(this.f4418b), Integer.valueOf(btj.f4418b)) && gwb.m2223g(Long.valueOf(this.f4419c), Long.valueOf(btj.f4419c)) && gwb.m2223g(this.f4420d, btj.f4420d) && gwb.m2223g(this.f4421e, btj.f4421e) && gwb.m2223g(this.f4422f, btj.f4422f) && gwb.m2223g(this.f4423g, btj.f4423g) && gwb.m2223g(Integer.valueOf(this.f4424h), Integer.valueOf(btj.f4424h)) && gwb.m2223g(Integer.valueOf(this.f4425i), Integer.valueOf(btj.f4425i))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.m2074c(Long.valueOf(this.f4417a), Integer.valueOf(this.f4418b), Long.valueOf(this.f4419c), this.f4420d, this.f4421e, this.f4422f, this.f4423g, Integer.valueOf(this.f4424h), Integer.valueOf(this.f4425i));
    }
}
