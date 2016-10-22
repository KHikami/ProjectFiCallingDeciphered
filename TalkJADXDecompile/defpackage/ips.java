package defpackage;

/* renamed from: ips */
final class ips implements ipp<lxs, lxu, lxv, lxw> {
    ips() {
    }

    public /* synthetic */ mbp b(nzf nzf) {
        return a((lxu) nzf);
    }

    private mbp a(lxs lxs) {
        return a(lxs.b, lxs.a);
    }

    private mbp a(lxu lxu) {
        return a(lxu.b, lxu.a);
    }

    private mbp a(lxv lxv, lxw lxw) {
        maw maw = new maw();
        maw.a = lxw.a;
        lzg lzg = new lzg();
        lzg.a = lxv.a;
        lzg.b = lxv.b;
        maw.c = new lzg[]{lzg};
        return ips.a(maw);
    }

    private mbp a(lzj lzj, lxh lxh) {
        maw maw = new maw();
        maw.a = lzj;
        maw.b = new lxh[]{lxh};
        return ips.a(maw);
    }

    private static mbp a(maw maw) {
        mbp mbp = new mbp();
        mbp.f = maw;
        return mbp;
    }
}
