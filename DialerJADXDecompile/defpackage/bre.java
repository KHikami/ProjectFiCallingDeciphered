package defpackage;

/* renamed from: bre */
final class bre implements Runnable {
    private /* synthetic */ brc a;
    private /* synthetic */ brd b;

    bre(brd brd, brc brc) {
        this.b = brd;
        this.a = brc;
    }

    public final void run() {
        de deVar = null;
        brd brd = this.b;
        if (!deVar.isFinishing()) {
            brd = this.b;
            if (!deVar.d().e()) {
                brd = this.b;
                brd brd2 = this.b;
                brd.a(brs.b(deVar), this.a);
            }
        }
    }
}
