package defpackage;

/* renamed from: bfk */
final class bfk implements bet {
    final /* synthetic */ dw a;
    final /* synthetic */ bfj b;

    bfk(bfj bfj, dw dwVar) {
        this.b = bfj;
        this.a = dwVar;
    }

    public void a(beq beq) {
        this.a.runOnUiThread(new bfl(this, beq));
    }
}
