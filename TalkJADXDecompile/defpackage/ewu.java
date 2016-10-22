package defpackage;

/* renamed from: ewu */
class ewu extends evz {
    private static final long serialVersionUID = 1;
    public final String h;
    public final long i;

    public ewu(nzf nzf, luq luq, long j, long j2, String str) {
        super(nzf, luq, j);
        this.h = str;
        this.i = j2;
    }

    public void a(blo blo, fhc fhc) {
        String str;
        super.a(blo, fhc);
        if (glk.a("Babel", 3)) {
            int i = this.c.b;
            str = this.c.a;
            glk.b("Babel", new StringBuilder(String.valueOf(str).length() + 67).append("processEventResponse response status: ").append(i).append(" error description").append(str).toString(), new Object[0]);
        }
        String str2 = ((euu) this.b).k;
        str = ((euu) this.b).e;
        if (!(str2 == null || this.h == null)) {
            blo.a();
            try {
                blo.a(str2, str, this.h, this.d, this.i);
                blo.b();
            } finally {
                blo.c();
            }
        }
        blo.g(str, this.d);
        ((ect) jyn.a(gwb.H(), ect.class)).d(blo.g().g(), true);
    }
}
