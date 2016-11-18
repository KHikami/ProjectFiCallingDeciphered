package defpackage;

final class oju extends ojn {
    private final ojn a;
    private final ojq b;

    oju(ojn ojn, ojq ojq) {
        this.a = ojn;
        this.b = (ojq) bm.a(ojq, "interceptor");
    }

    public <ReqT, RespT> ojo<ReqT, RespT> a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm) {
        return this.b.a(olh_ReqT__RespT, ojm, this.a);
    }

    public String a() {
        return this.a.a();
    }
}
