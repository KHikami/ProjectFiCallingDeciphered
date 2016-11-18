package p000;

class ewu extends evz {
    private static final long serialVersionUID = 1;
    public final String f12405h;
    public final long f12406i;

    public ewu(nzf nzf, luq luq, long j, long j2, String str) {
        super(nzf, luq, j);
        this.f12405h = str;
        this.f12406i = j2;
    }

    public void mo1047a(blo blo, fhc fhc) {
        String str;
        super.mo1047a(blo, fhc);
        if (glk.m17973a("Babel", 3)) {
            int i = this.c.f12529b;
            str = this.c.f12528a;
            glk.m17976b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
        String str2 = ((euu) this.b).f12300k;
        str = ((euu) this.b).e;
        if (!(str2 == null || this.f12405h == null)) {
            blo.m5958a();
            try {
                blo.m5993a(str2, str, this.f12405h, this.d, this.f12406i);
                blo.m6015b();
            } finally {
                blo.m6028c();
            }
        }
        blo.m6060g(str, this.d);
        ((ect) jyn.m25426a(gwb.m1400H(), ect.class)).mo1838d(blo.m6056g().m5638g(), true);
    }
}
