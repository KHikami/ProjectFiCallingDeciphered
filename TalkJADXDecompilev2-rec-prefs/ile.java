package p000;

final class ile implements Runnable {
    final /* synthetic */ iok f17974a;
    final /* synthetic */ ild f17975b;

    ile(ild ild, iok iok) {
        this.f17975b = ild;
        this.f17974a = iok;
    }

    public void run() {
        itx.m23282a("vclib", "Creating output renderer for source %s", this.f17974a);
        this.f17975b.f17971a.put(this.f17974a, new ilj(this.f17975b, this.f17974a));
    }
}
