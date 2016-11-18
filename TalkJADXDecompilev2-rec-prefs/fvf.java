package p000;

public final class fvf implements kcm, kcq {
    private final jwi f14085a;
    private final jch f14086b;
    private final String f14087c;
    private final String f14088d;
    private final String f14089e;

    public fvf(jwi jwi, jch jch, String str, String str2, String str3) {
        this.f14085a = jwi;
        this.f14086b = jch;
        this.f14087c = str;
        this.f14088d = str2;
        this.f14089e = str3;
    }

    public void R_() {
        boolean a;
        int i;
        if (this.f14087c != null) {
            a = this.f14086b.mo3439a(this.f14087c, true);
        } else {
            a = true;
        }
        String a2 = this.f14086b.mo3435a(this.f14089e, "ANY_RINGTONE_NOT_SILENT");
        boolean a3 = this.f14086b.mo3439a(this.f14088d, true);
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
        this.f14085a.m5150h(i);
    }
}
