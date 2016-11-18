package defpackage;

public abstract class okn<ReqT, RespT> extends ojo<ReqT, RespT> {
    protected abstract ojo<ReqT, RespT> b();

    public void a(ojp<RespT> ojp_RespT, okw okw) {
        b().a((ojp) ojp_RespT, okw);
    }

    public void a(int i) {
        b().a(i);
    }

    public void a(String str, Throwable th) {
        b().a(str, th);
    }

    public void a() {
        b().a();
    }

    public void a(ReqT reqT) {
        b().a((Object) reqT);
    }
}
