package defpackage;

/* renamed from: fvf */
public final class fvf implements kcm, kcq {
    private final jwi a;
    private final jch b;
    private final String c;
    private final String d;
    private final String e;

    public fvf(jwi jwi, jch jch, String str, String str2, String str3) {
        this.a = jwi;
        this.b = jch;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public void R_() {
        boolean a;
        int i;
        if (this.c != null) {
            a = this.b.a(this.c, true);
        } else {
            a = true;
        }
        String a2 = this.b.a(this.e, "ANY_RINGTONE_NOT_SILENT");
        boolean a3 = this.b.a(this.d, true);
        if (!a) {
            i = bc.hK;
        } else if (a2 != null && a3) {
            i = bc.iq;
        } else if (a2 != null) {
            i = bc.ir;
        } else if (a3) {
            i = bc.tS;
        } else {
            i = bc.ki;
        }
        this.a.h(i);
    }
}
