import java.util.concurrent.atomic.AtomicReference;

public final class omx implements ojq {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ AtomicReference b;

    public omx(AtomicReference atomicReference, AtomicReference atomicReference2) {
        this.a = atomicReference;
        this.b = atomicReference2;
    }

    public <ReqT, RespT> ojo<ReqT, RespT> a(olh<ReqT, RespT> olh_ReqT__RespT, ojm ojm, ojn ojn) {
        return new omy(this, ojn.a(olh_ReqT__RespT, ojm));
    }
}
