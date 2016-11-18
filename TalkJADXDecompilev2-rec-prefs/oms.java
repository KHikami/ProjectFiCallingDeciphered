package p000;

final class oms<RespT> extends mrz<RespT> {
    private final ojo<?, RespT> f33251a;

    oms(ojo<?, RespT> ojo___RespT) {
        this.f33251a = ojo___RespT;
    }

    protected void m38763b() {
        this.f33251a.mo4151a("GrpcFuture was cancelled", null);
    }

    protected boolean m38764b(RespT respT) {
        return super.b(respT);
    }

    protected boolean m38762a(Throwable th) {
        return super.a(th);
    }
}
