package defpackage;

final class iqc implements ipp<lyq, lys, lyt, lyu> {
    iqc() {
    }

    public /* synthetic */ mbp b(nzf nzf) {
        return a((lys) nzf);
    }

    private mbp a(lyq lyq) {
        return a(lyq.b, lyq.a == null ? lyq.d : new lym[]{lyq.a});
    }

    private mbp a(lys lys) {
        return a(lys.b, lys.a == null ? lys.c : new lym[]{lys.a});
    }

    private mbp a(lyt lyt, lyu lyu) {
        mbf mbf = new mbf();
        mbf.a = lyu.a;
        mbf.f = Integer.valueOf(gwb.a(lyu.b, 1));
        lzh[] lzhArr = new lzh[lyt.e.length];
        for (int i = 0; i < lyt.e.length; i++) {
            lzhArr[i] = new lzh();
            lzhArr[i].a = lyt.a;
            lzhArr[i].b = lyt.e[i];
        }
        mbf.c = lzhArr;
        return iqc.a(mbf);
    }

    private mbp a(lzj lzj, lym[] lymArr) {
        mbf mbf = new mbf();
        mbf.a = lzj;
        mbf.b = lymArr;
        return iqc.a(mbf);
    }

    private static mbp a(mbf mbf) {
        mbp mbp = new mbp();
        mbp.a = mbf;
        return mbp;
    }
}
