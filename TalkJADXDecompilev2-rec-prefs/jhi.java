package p000;

public final class jhi extends jpj {
    private int f20083k;
    private int f20084l;

    public void m24227a(int i, jpf jpf, int i2, int i3, int i4) {
        super.m24218a(i, jpf, 0, i2, i2, i3, null, null);
        this.f20084l = i4;
        this.f20083k = 0;
    }

    public int m24228b() {
        return this.f20084l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jhi)) {
            return false;
        }
        if (this.f20084l != ((jhi) obj).f20084l) {
            return false;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        if (this.f20083k == 0) {
            this.f20083k = gwb.m2188f(this.f20084l, super.hashCode());
        }
        return this.f20083k;
    }

    protected String mo3508c() {
        String c = super.mo3508c();
        switch (this.f20084l) {
            case 0:
                return String.valueOf(c).concat("-normal");
            case 1:
                return String.valueOf(c).concat("-rounded");
            case 2:
                return String.valueOf(c).concat("-roundedcorners");
            default:
                return c;
        }
    }

    public int m24226a() {
        return this.f20076d;
    }
}
