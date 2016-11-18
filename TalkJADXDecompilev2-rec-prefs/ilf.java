package p000;

final class ilf implements Runnable {
    final /* synthetic */ iok f17976a;
    final /* synthetic */ ild f17977b;

    ilf(ild ild, iok iok) {
        this.f17977b = ild;
        this.f17976a = iok;
    }

    public void run() {
        ilj ilj = (ilj) this.f17977b.f17971a.remove(this.f17976a);
        if (ilj != null) {
            itx.m23279a(3, "vclib", "Destroying output renderer for source %s", this.f17976a);
            ilj.m22242a();
        }
    }
}
