package defpackage;

final class cnd {
    public gol a = null;
    public gkt b = null;
    final /* synthetic */ cnb c;

    cnd(cnb cnb) {
        this.c = cnb;
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
