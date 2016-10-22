final class iqf implements ipp<mai, mak, mal, mam> {
    iqf() {
    }

    public /* synthetic */ mbp b(nzf nzf) {
        return a((mak) nzf);
    }

    private mbp a(mai mai) {
        return a(mai.b, mai.a == null ? mai.c : new mab[]{mai.a});
    }

    private mbp a(mak mak) {
        return a(mak.b, mak.a == null ? mak.c : new mab[]{mak.a});
    }

    private mbp a(mal mal, mam mam) {
        mbm mbm = new mbm();
        mbm.a = mam.a;
        lzi[] lziArr = new lzi[mal.e.length];
        for (int i = 0; i < mal.e.length; i++) {
            lziArr[i] = new lzi();
            lziArr[i].a = mal.a;
            lziArr[i].b = mal.b;
            lziArr[i].c = mal.e[i];
        }
        mbm.c = lziArr;
        return a(mbm);
    }

    private mbp a(lzj lzj, mab[] mabArr) {
        mbm mbm = new mbm();
        mbm.a = lzj;
        mbm.b = mabArr;
        return a(mbm);
    }

    private static mbp a(mbm mbm) {
        mbp mbp = new mbp();
        mbp.e = mbm;
        return mbp;
    }
}
