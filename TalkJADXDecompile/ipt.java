final class ipt implements ipq<lxr, lxs, lxt, lxu, lxv, lxw> {
    private final ijh a;

    public /* synthetic */ void b(nzf nzf, ijl ijl) {
        a((lxt) nzf, ijl);
    }

    public /* synthetic */ void c(nzf nzf, ijl ijl) {
        a((lxv) nzf, ijl);
    }

    ipt(ijh ijh) {
        this.a = ijh;
    }

    private void a(lxr lxr, ijl<lxs> ijl_lxs) {
        this.a.a("broadcasts/add", lxr, lxs.class, ijl_lxs);
    }

    private void a(lxt lxt, ijl<lxu> ijl_lxu) {
        this.a.a("broadcasts/modify", lxt, lxu.class, ijl_lxu);
    }

    private void a(lxv lxv, ijl<lxw> ijl_lxw) {
        this.a.a("broadcasts/remove", lxv, lxw.class, ijl_lxw);
    }
}
