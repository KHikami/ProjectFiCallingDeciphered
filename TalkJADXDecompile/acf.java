final class acf {
    public aer a;
    public aer b;
    public int c;
    public int d;
    public int e;
    public int f;

    private acf(aer aer, aer aer2) {
        this.a = aer;
        this.b = aer2;
    }

    acf(aer aer, aer aer2, int i, int i2, int i3, int i4) {
        this(aer, aer2);
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public String toString() {
        return "ChangeInfo{oldHolder=" + this.a + ", newHolder=" + this.b + ", fromX=" + this.c + ", fromY=" + this.d + ", toX=" + this.e + ", toY=" + this.f + '}';
    }
}
