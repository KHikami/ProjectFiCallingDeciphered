package p000;

final class czk extends fip {
    final /* synthetic */ czj f9380a;

    czk(czj czj) {
        this.f9380a = czj;
    }

    public void mo610a(int i, bko bko, fiu fiu) {
        evz c = fiu.m15392c();
        synchronized (this.f9380a.f9350c) {
            if (i == this.f9380a.f9348a && this.f9380a.mo1482e().isInstance(c)) {
                int i2 = c.f5801c.f12529b;
                if (i2 == 1 || i2 == 0) {
                    this.f9380a.mo1887a(fiu);
                } else {
                    this.f9380a.mo1888a(new czm());
                }
            }
        }
    }

    public void mo640a(int i, bko bko, fok fok, fdo fdo) {
        synchronized (this.f9380a.f9350c) {
            if (i == this.f9380a.f9348a && this.f9380a.mo1481d().isInstance(fok)) {
                this.f9380a.mo1888a((Exception) fdo);
            }
        }
    }
}
