package defpackage;

/* renamed from: ipx */
final class ipx implements ipq<lyb, lyc, nzf, nzf, lyd, lye> {
    private final ijh a;

    public /* synthetic */ void c(nzf nzf, ijl ijl) {
        a((lyd) nzf, ijl);
    }

    ipx(ijh ijh) {
        this.a = ijh;
    }

    private void a(lyb lyb, ijl<lyc> ijl_lyc) {
        this.a.a("common_announcements/add", lyb, lyc.class, ijl_lyc);
    }

    public void b(nzf nzf, ijl<nzf> ijl_nzf) {
        iil.a("Common announcement modification operation is not supported");
    }

    private void a(lyd lyd, ijl<lye> ijl_lye) {
        this.a.a("common_announcements/remove", lyd, lye.class, ijl_lye);
    }
}
