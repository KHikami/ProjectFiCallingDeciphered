package defpackage;

/* renamed from: ipz */
final class ipz implements ipp<lyj, lyl, lyz, lza> {
    ipz() {
    }

    public /* synthetic */ mbp b(nzf nzf) {
        return a((lyl) nzf);
    }

    private mbp a(lyj lyj) {
        return a(lyj.c, lyj.a == null ? lyj.d : new lyh[]{lyj.a});
    }

    private mbp a(lyl lyl) {
        return a(lyl.b, lyl.a == null ? lyl.c : new lyh[]{lyl.a});
    }

    private mbp a(lyz lyz, lza lza) {
        mbh mbh = new mbh();
        mbh.a = lza.a;
        mbe[] mbeArr = new mbe[lyz.c.length];
        for (int i = 0; i < lyz.c.length; i++) {
            mbeArr[i] = new mbe();
            mbeArr[i].a = lyz.a;
        }
        mbh.c = mbeArr;
        return ipz.a(mbh);
    }

    private mbp a(lzj lzj, lyh[] lyhArr) {
        mbh mbh = new mbh();
        mbh.a = lzj;
        mbh.b = lyhArr;
        return ipz.a(mbh);
    }

    private static mbp a(mbh mbh) {
        mbp mbp = new mbp();
        mbp.g = mbh;
        return mbp;
    }
}
