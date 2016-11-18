package p000;

final class iqf implements ipp<mai, mak, mal, mam> {
    iqf() {
    }

    public /* synthetic */ mbp mo3371b(nzf nzf) {
        return m22930a((mak) nzf);
    }

    private mbp m22929a(mai mai) {
        return m22928a(mai.f27108b, mai.f27107a == null ? mai.f27109c : new mab[]{mai.f27107a});
    }

    private mbp m22930a(mak mak) {
        return m22928a(mak.f27114b, mak.f27113a == null ? mak.f27115c : new mab[]{mak.f27113a});
    }

    private mbp m22931a(mal mal, mam mam) {
        mbm mbm = new mbm();
        mbm.f27228a = mam.f27121a;
        lzi[] lziArr = new lzi[mal.f27120e.length];
        for (int i = 0; i < mal.f27120e.length; i++) {
            lziArr[i] = new lzi();
            lziArr[i].f26999a = mal.f27116a;
            lziArr[i].f27000b = mal.f27117b;
            lziArr[i].f27001c = mal.f27120e[i];
        }
        mbm.f27230c = lziArr;
        return iqf.m22932a(mbm);
    }

    private mbp m22928a(lzj lzj, mab[] mabArr) {
        mbm mbm = new mbm();
        mbm.f27228a = lzj;
        mbm.f27229b = mabArr;
        return iqf.m22932a(mbm);
    }

    private static mbp m22932a(mbm mbm) {
        mbp mbp = new mbp();
        mbp.f27245e = mbm;
        return mbp;
    }
}
