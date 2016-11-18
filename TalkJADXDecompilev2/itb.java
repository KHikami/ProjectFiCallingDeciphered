package defpackage;

final class itb extends itg {
    final /* synthetic */ isy a;

    itb(isy isy) {
        this.a = isy;
    }

    public void d(itl itl) {
        boolean e = itl.e();
        if ((itl.a().equals(this.a.a) || (itl.f() && "localParticipant".equals(this.a.a))) && this.a.d != e) {
            this.a.d = e;
            if (this.a.b != null) {
                gwb.b(this.a.f);
                if (this.a.d) {
                    this.a.f.run();
                } else {
                    gwb.a(this.a.f, 100);
                }
            }
        }
    }
}
