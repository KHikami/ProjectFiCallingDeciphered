package defpackage;

/* renamed from: bme */
final class bme implements bop {
    final /* synthetic */ int a;
    final /* synthetic */ bnp b;
    final /* synthetic */ bot c;
    final /* synthetic */ bmd d;

    bme(bmd bmd, int i, bnp bnp, bot bot) {
        this.d = bmd;
        this.a = i;
        this.b = bnp;
        this.c = bot;
    }

    public final void a() {
        this.d.a.post(new bmf(this));
    }
}
