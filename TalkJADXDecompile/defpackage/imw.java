package defpackage;

/* renamed from: imw */
final class imw implements Runnable {
    final /* synthetic */ iuc a;
    final /* synthetic */ ikz b;
    final /* synthetic */ imv c;

    imw(imv imv, iuc iuc, ikz ikz) {
        this.c = imv;
        this.a = iuc;
        this.b = ikz;
    }

    public void run() {
        itx.a("vclib", "Releasing surface of size: %s x %s", Integer.valueOf(this.a.a), Integer.valueOf(this.a.b));
        this.b.c();
    }
}
