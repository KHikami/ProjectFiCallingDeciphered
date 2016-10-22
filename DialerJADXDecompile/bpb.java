public abstract class bpb extends bno {
    private boolean a;

    public bpb(bnp bnp) {
        super(bnp);
    }

    public abstract void a();

    public final boolean n() {
        return this.a;
    }

    public final void o() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        a();
        this.a = true;
    }
}
