package defpackage;

final class bfl implements Runnable {
    final /* synthetic */ beq a;
    final /* synthetic */ bfk b;

    bfl(bfk bfk, beq beq) {
        this.b = bfk;
        this.a = beq;
    }

    public void run() {
        bfj bfj = this.b.b;
        beq beq = this.a;
        if (beq == null) {
            bfj.e.b(bfj.b.getString(ba.gE));
            bfj.e.a(new bfm(bfj));
            return;
        }
        bfj.e.a_(true);
        bfj.e.b(bfj.b.getString(ba.gF, new Object[]{glq.h(bfj.b, beq.c())}));
        bfj.e.a(new bfo(bfj, beq, gwb.a(bfj.b, bfj.i, bfj, beq.c())));
    }
}
