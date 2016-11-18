package p000;

final class omu<RespT> extends ojp<RespT> {
    private final oms<RespT> f33253a;
    private RespT f33254b;

    public omu(oms<RespT> oms_RespT) {
        this.f33253a = oms_RespT;
    }

    public void mo4161a(okw okw) {
    }

    public void mo4160a(RespT respT) {
        if (this.f33254b != null) {
            throw olv.p.a("More than one value received for unary call").e();
        }
        this.f33254b = respT;
    }

    public void mo4162a(olv olv, okw okw) {
        if (olv.d()) {
            if (this.f33254b == null) {
                this.f33253a.m38762a(olv.p.a("No value received for unary call").a(okw));
            }
            this.f33253a.m38764b(this.f33254b);
            return;
        }
        this.f33253a.m38762a(olv.a(okw));
    }
}
