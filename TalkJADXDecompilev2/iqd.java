package defpackage;

final class iqd implements ipq<lyp, lyq, lyr, lys, lyt, lyu> {
    private final ijh a;

    public /* synthetic */ void b(nzf nzf, ijl ijl) {
        a((lyr) nzf, ijl);
    }

    public /* synthetic */ void c(nzf nzf, ijl ijl) {
        a((lyt) nzf, ijl);
    }

    iqd(ijh ijh) {
        this.a = ijh;
    }

    private void a(lyp lyp, ijl<lyq> ijl_lyq) {
        this.a.a("hangout_participants/add", lyp, lyq.class, ijl_lyq);
    }

    private void a(lyr lyr, ijl<lys> ijl_lys) {
        this.a.a("hangout_participants/modify", lyr, lys.class, ijl_lys);
    }

    private void a(lyt lyt, ijl<lyu> ijl_lyu) {
        this.a.a("hangout_participants/remove", lyt, lyu.class, ijl_lyu);
    }
}
