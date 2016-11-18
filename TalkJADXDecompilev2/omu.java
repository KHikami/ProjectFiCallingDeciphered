package defpackage;

final class omu<RespT> extends ojp<RespT> {
    private final oms<RespT> a;
    private RespT b;

    public omu(oms<RespT> oms_RespT) {
        this.a = oms_RespT;
    }

    public void a(okw okw) {
    }

    public void a(RespT respT) {
        if (this.b != null) {
            throw olv.p.a("More than one value received for unary call").e();
        }
        this.b = respT;
    }

    public void a(olv olv, okw okw) {
        if (olv.d()) {
            if (this.b == null) {
                this.a.a(olv.p.a("No value received for unary call").a(okw));
            }
            this.a.b(this.b);
            return;
        }
        this.a.a(olv.a(okw));
    }
}
