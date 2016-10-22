public final class fuv implements kcm, kcq {
    private final jwi a;
    private final int b;
    private final jch c;

    fuv(jwi jwi, int i, jch jch) {
        this.a = jwi;
        this.b = i;
        this.c = jch;
    }

    public void R_() {
        int f = ((fuz) jyn.a(this.a.x(), fuz.class)).f(this.b);
        String a = this.c.a("chat_notification_sound_key", "ANY_RINGTONE_NOT_SILENT");
        boolean a2 = this.c.a("chat_notification_vibrate_bool_key", true);
        switch (f) {
            case wi.dr /*10*/:
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
        this.a.h(f);
    }
}
