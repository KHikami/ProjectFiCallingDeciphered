package p000;

public abstract class azv<Z> extends azx {
    private final int f2516a;
    private final int f2517b;

    public azv() {
        this(nzf.UNSET_ENUM_VALUE, nzf.UNSET_ENUM_VALUE);
    }

    private azv(int i, int i2) {
        this.f2516a = nzf.UNSET_ENUM_VALUE;
        this.f2517b = nzf.UNSET_ENUM_VALUE;
    }

    public final void mo263a(azw azw) {
        if (baq.m4686a(this.f2516a, this.f2517b)) {
            azw.mo418a(this.f2516a, this.f2517b);
            return;
        }
        int i = this.f2516a;
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + this.f2517b + ", either provide dimensions in the constructor or call override()");
    }
}
