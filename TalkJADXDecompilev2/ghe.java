package defpackage;

public class ghe {
    public final /* synthetic */ geu a;

    public void a() {
        glk.c("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateSucceeded", new Object[0]);
        if (this.a.e != null) {
            this.a.e = null;
            this.a.m();
        }
    }

    public void b() {
        glk.c("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateFailed", new Object[0]);
        if (this.a.e != null) {
            this.a.e = null;
            if (this.a.d()) {
                this.a.a(false);
                this.a.m();
                return;
            }
            this.a.b(gwb.vz);
        }
    }

    public ghe(geu geu) {
        this.a = geu;
    }
}
