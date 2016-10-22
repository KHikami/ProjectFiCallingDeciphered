public final class btj {
    public long a;
    public int b;
    public long c;
    public String d;
    public String e;
    public String f;
    public String g;
    public int h;
    public int i;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        btj btj = (btj) obj;
        if (gwb.g(Long.valueOf(this.a), Long.valueOf(btj.a)) && gwb.g(Integer.valueOf(this.b), Integer.valueOf(btj.b)) && gwb.g(Long.valueOf(this.c), Long.valueOf(btj.c)) && gwb.g(this.d, btj.d) && gwb.g(this.e, btj.e) && gwb.g(this.f, btj.f) && gwb.g(this.g, btj.g) && gwb.g(Integer.valueOf(this.h), Integer.valueOf(btj.h)) && gwb.g(Integer.valueOf(this.i), Integer.valueOf(btj.i))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return gwb.c(Long.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, this.f, this.g, Integer.valueOf(this.h), Integer.valueOf(this.i));
    }
}
