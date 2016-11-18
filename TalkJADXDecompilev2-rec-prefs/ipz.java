package p000;

final class ipz implements ipp<lyj, lyl, lyz, lza> {
    ipz() {
    }

    public /* synthetic */ mbp mo3371b(nzf nzf) {
        return m22899a((lyl) nzf);
    }

    private mbp m22898a(lyj lyj) {
        return m22901a(lyj.f26897c, lyj.f26895a == null ? lyj.f26898d : new lyh[]{lyj.f26895a});
    }

    private mbp m22899a(lyl lyl) {
        return m22901a(lyl.f26903b, lyl.f26902a == null ? lyl.f26904c : new lyh[]{lyl.f26902a});
    }

    private mbp m22900a(lyz lyz, lza lza) {
        mbh mbh = new mbh();
        mbh.f27216a = lza.f26971a;
        mbe[] mbeArr = new mbe[lyz.f26969c.length];
        for (int i = 0; i < lyz.f26969c.length; i++) {
            mbeArr[i] = new mbe();
            mbeArr[i].f27207a = lyz.f26967a;
        }
        mbh.f27218c = mbeArr;
        return ipz.m22902a(mbh);
    }

    private mbp m22901a(lzj lzj, lyh[] lyhArr) {
        mbh mbh = new mbh();
        mbh.f27216a = lzj;
        mbh.f27217b = lyhArr;
        return ipz.m22902a(mbh);
    }

    private static mbp m22902a(mbh mbh) {
        mbp mbp = new mbp();
        mbp.f27247g = mbh;
        return mbp;
    }
}
