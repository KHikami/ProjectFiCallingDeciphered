package p000;

final class itb extends itg {
    final /* synthetic */ isy f18931a;

    itb(isy isy) {
        this.f18931a = isy;
    }

    public void mo1549d(itl itl) {
        boolean e = itl.m23240e();
        if ((itl.m23229a().equals(this.f18931a.f18914a) || (itl.m23242f() && "localParticipant".equals(this.f18931a.f18914a))) && this.f18931a.f18917d != e) {
            this.f18931a.f18917d = e;
            if (this.f18931a.f18915b != null) {
                gwb.m2042b(this.f18931a.f18919f);
                if (this.f18931a.f18917d) {
                    this.f18931a.f18919f.run();
                } else {
                    gwb.m1864a(this.f18931a.f18919f, 100);
                }
            }
        }
    }
}
