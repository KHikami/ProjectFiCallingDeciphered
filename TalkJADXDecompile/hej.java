final class hej {
    final /* synthetic */ heg a;

    hej(heg heg) {
        this.a = heg;
    }

    protected void finalize() {
        heg.b(this.a.l);
        super.finalize();
    }
}
