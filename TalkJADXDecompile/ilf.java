final class ilf implements Runnable {
    final /* synthetic */ iok a;
    final /* synthetic */ ild b;

    ilf(ild ild, iok iok) {
        this.b = ild;
        this.a = iok;
    }

    public void run() {
        ilj ilj = (ilj) this.b.a.remove(this.a);
        if (ilj != null) {
            itx.a(3, "vclib", "Destroying output renderer for source %s", this.a);
            ilj.a();
        }
    }
}
