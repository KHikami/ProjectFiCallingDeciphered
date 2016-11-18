package p000;

public final class fuv implements kcm, kcq {
    private final jwi f14051a;
    private final int f14052b;
    private final jch f14053c;

    fuv(jwi jwi, int i, jch jch) {
        this.f14051a = jwi;
        this.f14052b = i;
        this.f14053c = jch;
    }

    public void R_() {
        int f = ((fuz) jyn.m25426a(this.f14051a.m5166x(), fuz.class)).m16298f(this.f14052b);
        String a = this.f14053c.mo3435a("chat_notification_sound_key", "ANY_RINGTONE_NOT_SILENT");
        boolean a2 = this.f14053c.mo3439a("chat_notification_vibrate_bool_key", true);
        switch (f) {
            case 10:
                f = bc.hK;
                break;
            case wi.dz /*25*/:
                if (a == null) {
                    if (!a2) {
                        f = bc.hM;
                        break;
                    } else {
                        f = bc.hP;
                        break;
                    }
                } else if (!a2) {
                    f = bc.hN;
                    break;
                } else {
                    f = bc.hO;
                    break;
                }
            default:
                if (a == null) {
                    if (!a2) {
                        f = bc.hF;
                        break;
                    } else {
                        f = bc.hI;
                        break;
                    }
                } else if (!a2) {
                    f = bc.hG;
                    break;
                } else {
                    f = bc.hH;
                    break;
                }
        }
        this.f14051a.m5150h(f);
    }
}
