package p000;

final class iuh extends iuk {
    final /* synthetic */ iug f19044a;

    iuh(iug iug) {
        this.f19044a = iug;
    }

    public void mo3399a(long j) {
        if (!this.f19044a.m23305a(this.f19044a.f19038a) && !this.f19044a.f19038a.isStarted()) {
            if (this.f19044a.f19039b != null) {
                this.f19044a.f19039b.run();
            }
            this.f19044a.f19038a.start();
        }
    }
}
