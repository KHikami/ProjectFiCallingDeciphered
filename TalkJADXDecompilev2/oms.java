package defpackage;

final class oms<RespT> extends mrz<RespT> {
    private final ojo<?, RespT> a;

    oms(ojo<?, RespT> ojo___RespT) {
        this.a = ojo___RespT;
    }

    protected void b() {
        this.a.a("GrpcFuture was cancelled", null);
    }

    protected boolean b(RespT respT) {
        return super.b(respT);
    }

    protected boolean a(Throwable th) {
        return super.a(th);
    }
}
