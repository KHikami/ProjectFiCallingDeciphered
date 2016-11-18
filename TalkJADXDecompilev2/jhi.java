package defpackage;

public final class jhi extends jpj {
    private int k;
    private int l;

    public void a(int i, jpf jpf, int i2, int i3, int i4) {
        super.a(i, jpf, 0, i2, i2, i3, null, null);
        this.l = i4;
        this.k = 0;
    }

    public int b() {
        return this.l;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jhi)) {
            return false;
        }
        if (this.l != ((jhi) obj).l) {
            return false;
        }
        return super.equals(obj);
    }

    public int hashCode() {
        if (this.k == 0) {
            this.k = gwb.f(this.l, super.hashCode());
        }
        return this.k;
    }

    protected String c() {
        String c = super.c();
        switch (this.l) {
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

    public int a() {
        return this.d;
    }
}
