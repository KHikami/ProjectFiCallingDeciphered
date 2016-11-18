package defpackage;

public final class ezq extends evz {
    private static final long serialVersionUID = 1;
    private byte[][] g;

    ezq(lvf lvf) {
        int i = 0;
        super(lvf, lvf.responseHeader, -1);
        if (evz.a) {
            String valueOf = String.valueOf(lvf);
            new StringBuilder(String.valueOf(valueOf).length() + 31).append("SetCallerIdConfigResponse from:").append(valueOf);
        }
        this.g = new byte[lvf.a.length][];
        loa[] loaArr = lvf.a;
        int length = loaArr.length;
        int i2 = 0;
        while (i < length) {
            this.g[i2] = nzf.a(loaArr[i]);
            i2++;
            i++;
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        glk.c("Babel", "SetCallerIdConfigResponse", new Object[0]);
        loa[] loaArr = new loa[this.g.length];
        int i = 0;
        while (i < this.g.length) {
            try {
                loaArr[i] = (loa) nzf.a(new loa(), this.g[i]);
                i++;
            } catch (nzd e) {
                ((bem) jyn.a(gwb.H(), bem.class)).a(1);
                return;
            }
        }
        for (fed a : jyn.c(gwb.H(), fed.class)) {
            a.a(blo.g().g(), loaArr);
        }
        ((bem) jyn.a(gwb.H(), bem.class)).a(0);
    }
}
