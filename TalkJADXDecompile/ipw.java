final class ipw implements ipp<lyc, nzf, lyd, lye> {
    ipw() {
    }

    private mbp a(lyc lyc) {
        mba mba = new mba();
        mba.a = lyc.b;
        mba.b = lyc.a == null ? lyc.c : new lya[]{lyc.a};
        return a(mba);
    }

    public mbp b(nzf nzf) {
        iil.a("Common announcement modification operation is not supported");
        return null;
    }

    private mbp a(lyd lyd, lye lye) {
        mba mba = new mba();
        mba.a = lye.a;
        maz[] mazArr = new maz[lyd.d.length];
        for (int i = 0; i < lyd.d.length; i++) {
            mazArr[i] = new maz();
            mazArr[i].a = lyd.a;
            mazArr[i].b = lyd.d[i];
        }
        mba.c = mazArr;
        return a(mba);
    }

    private static mbp a(mba mba) {
        mbp mbp = new mbp();
        mbp.h = mba;
        return mbp;
    }
}
