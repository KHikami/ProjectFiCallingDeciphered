package p000;

final class iqc implements ipp<lyq, lys, lyt, lyu> {
    iqc() {
    }

    public /* synthetic */ mbp mo3371b(nzf nzf) {
        return m22915a((lys) nzf);
    }

    private mbp m22914a(lyq lyq) {
        return m22917a(lyq.f26941b, lyq.f26940a == null ? lyq.f26943d : new lym[]{lyq.f26940a});
    }

    private mbp m22915a(lys lys) {
        return m22917a(lys.f26948b, lys.f26947a == null ? lys.f26949c : new lym[]{lys.f26947a});
    }

    private mbp m22916a(lyt lyt, lyu lyu) {
        mbf mbf = new mbf();
        mbf.f27208a = lyu.f26956a;
        mbf.f27213f = Integer.valueOf(gwb.m1508a(lyu.f26957b, 1));
        lzh[] lzhArr = new lzh[lyt.f26954e.length];
        for (int i = 0; i < lyt.f26954e.length; i++) {
            lzhArr[i] = new lzh();
            lzhArr[i].f26996a = lyt.f26950a;
            lzhArr[i].f26997b = lyt.f26954e[i];
        }
        mbf.f27210c = lzhArr;
        return iqc.m22918a(mbf);
    }

    private mbp m22917a(lzj lzj, lym[] lymArr) {
        mbf mbf = new mbf();
        mbf.f27208a = lzj;
        mbf.f27209b = lymArr;
        return iqc.m22918a(mbf);
    }

    private static mbp m22918a(mbf mbf) {
        mbp mbp = new mbp();
        mbp.f27241a = mbf;
        return mbp;
    }
}
