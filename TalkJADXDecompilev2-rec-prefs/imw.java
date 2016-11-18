package p000;

final class imw implements Runnable {
    final /* synthetic */ iuc f18086a;
    final /* synthetic */ ikz f18087b;
    final /* synthetic */ imv f18088c;

    imw(imv imv, iuc iuc, ikz ikz) {
        this.f18088c = imv;
        this.f18086a = iuc;
        this.f18087b = ikz;
    }

    public void run() {
        itx.m23282a("vclib", "Releasing surface of size: %s x %s", Integer.valueOf(this.f18086a.f19032a), Integer.valueOf(this.f18086a.f19033b));
        this.f18087b.m22219c();
    }
}
