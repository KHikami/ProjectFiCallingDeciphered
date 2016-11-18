package p000;

final class ipw implements ipp<lyc, nzf, lyd, lye> {
    ipw() {
    }

    private mbp m22886a(lyc lyc) {
        mba mba = new mba();
        mba.f27194a = lyc.f26852b;
        mba.f27195b = lyc.f26851a == null ? lyc.f26853c : new lya[]{lyc.f26851a};
        return ipw.m22888a(mba);
    }

    public mbp mo3371b(nzf nzf) {
        iil.m21870a("Common announcement modification operation is not supported");
        return null;
    }

    private mbp m22887a(lyd lyd, lye lye) {
        mba mba = new mba();
        mba.f27194a = lye.f26858a;
        maz[] mazArr = new maz[lyd.f26857d.length];
        for (int i = 0; i < lyd.f26857d.length; i++) {
            mazArr[i] = new maz();
            mazArr[i].f27189a = lyd.f26854a;
            mazArr[i].f27190b = lyd.f26857d[i];
        }
        mba.f27196c = mazArr;
        return ipw.m22888a(mba);
    }

    private static mbp m22888a(mba mba) {
        mbp mbp = new mbp();
        mbp.f27248h = mba;
        return mbp;
    }
}
