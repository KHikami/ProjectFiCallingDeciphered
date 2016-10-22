final class cnd {
    public gol a;
    public gkt b;
    final /* synthetic */ cnb c;

    cnd(cnb cnb) {
        this.c = cnb;
        this.a = null;
        this.b = null;
    }

    public void a() {
        if (this.b != null) {
            this.b.b();
            this.b = null;
        }
        if (this.a != null) {
            this.a.c();
            this.a = null;
        }
    }
}
