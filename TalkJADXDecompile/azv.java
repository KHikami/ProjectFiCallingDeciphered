public abstract class azv<Z> extends azx {
    private final int a;
    private final int b;

    public azv() {
        this(nzf.UNSET_ENUM_VALUE, nzf.UNSET_ENUM_VALUE);
    }

    private azv(int i, int i2) {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.b = nzf.UNSET_ENUM_VALUE;
    }

    public final void a(azw azw) {
        if (baq.a(this.a, this.b)) {
            azw.a(this.a, this.b);
            return;
        }
        int i = this.a;
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + this.b + ", either provide dimensions in the constructor or call override()");
    }
}
