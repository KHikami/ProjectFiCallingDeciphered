package p000;

final class oju extends ojn {
    private final ojn f33109a;
    private final ojq f33110b;

    oju(ojn ojn, ojq ojq) {
        this.f33109a = ojn;
        this.f33110b = (ojq) bm.a(ojq, "interceptor");
    }

    public <ReqT, RespT> ojo<ReqT, RespT> mo4155a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm) {
        return this.f33110b.a(olh_ReqT__RespT, ojm, this.f33109a);
    }

    public String mo4154a() {
        return this.f33109a.mo4154a();
    }
}
