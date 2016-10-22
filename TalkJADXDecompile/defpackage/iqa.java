package defpackage;

/* renamed from: iqa */
final class iqa implements ipq<lyi, lyj, lyk, lyl, lyz, lza> {
    private final ijh a;

    public /* synthetic */ void b(nzf nzf, ijl ijl) {
        a((lyk) nzf, ijl);
    }

    public /* synthetic */ void c(nzf nzf, ijl ijl) {
        a((lyz) nzf, ijl);
    }

    iqa(ijh ijh) {
        this.a = ijh;
    }

    private void a(lyi lyi, ijl<lyj> ijl_lyj) {
        this.a.a("hangouts/add", lyi, lyj.class, ijl_lyj);
    }

    private void a(lyk lyk, ijl<lyl> ijl_lyl) {
        this.a.a("hangouts/modify", lyk, lyl.class, ijl_lyl);
    }

    private void a(lyz lyz, ijl<lza> ijl_lza) {
        this.a.a("hangouts/remove", lyz, lza.class, ijl_lza);
    }
}
