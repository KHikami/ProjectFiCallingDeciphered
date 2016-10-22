package defpackage;

/* renamed from: bfe */
final class bfe implements bet {
    final /* synthetic */ bfc a;
    final /* synthetic */ bfd b;

    bfe(bfd bfd, bfc bfc) {
        this.b = bfd;
        this.a = bfc;
    }

    public void a(beq beq) {
        this.b.b.runOnUiThread(new bff(this, beq));
    }
}
