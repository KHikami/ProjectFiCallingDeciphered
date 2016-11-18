package p000;

public abstract class okn<ReqT, RespT> extends ojo<ReqT, RespT> {
    protected abstract ojo<ReqT, RespT> mo4153b();

    public void mo4152a(ojp<RespT> ojp_RespT, okw okw) {
        mo4153b().mo4152a((ojp) ojp_RespT, okw);
    }

    public void mo4149a(int i) {
        mo4153b().mo4149a(i);
    }

    public void mo4151a(String str, Throwable th) {
        mo4153b().mo4151a(str, th);
    }

    public void mo4148a() {
        mo4153b().mo4148a();
    }

    public void mo4150a(ReqT reqT) {
        mo4153b().mo4150a((Object) reqT);
    }
}
