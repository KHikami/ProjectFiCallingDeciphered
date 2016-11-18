package defpackage;

final class bnj extends bnf {
    private bbm a;

    public bnj(bbm bbm) {
        super(bnc.PHOTO_SHARING);
        this.a = bbm;
    }

    public boolean a(int i) {
        return !this.a.n(i);
    }
}
