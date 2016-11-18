package p000;

public final class ezq extends evz {
    private static final long serialVersionUID = 1;
    private byte[][] f12559g;

    ezq(lvf lvf) {
        int i = 0;
        super(lvf, lvf.responseHeader, -1);
        if (evz.f5798a) {
            String valueOf = String.valueOf(lvf);
            new StringBuilder(String.valueOf(valueOf).length() + 31).append("SetCallerIdConfigResponse from:").append(valueOf);
        }
        this.f12559g = new byte[lvf.f26582a.length][];
        loa[] loaArr = lvf.f26582a;
        int length = loaArr.length;
        int i2 = 0;
        while (i < length) {
            this.f12559g[i2] = nzf.m1029a(loaArr[i]);
            i2++;
            i++;
        }
    }

    public void mo1047a(blo blo, fhc fhc) {
        super.mo1047a(blo, fhc);
        glk.m17979c("Babel", "SetCallerIdConfigResponse", new Object[0]);
        loa[] loaArr = new loa[this.f12559g.length];
        int i = 0;
        while (i < this.f12559g.length) {
            try {
                loaArr[i] = (loa) nzf.m1027a(new loa(), this.f12559g[i]);
                i++;
            } catch (nzd e) {
                ((bem) jyn.m25426a(gwb.m1400H(), bem.class)).mo505a(1);
                return;
            }
        }
        for (fed a : jyn.m25438c(gwb.m1400H(), fed.class)) {
            a.mo535a(blo.m6056g().m5638g(), loaArr);
        }
        ((bem) jyn.m25426a(gwb.m1400H(), bem.class)).mo505a(0);
    }
}
