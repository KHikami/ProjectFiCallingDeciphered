package p000;

public class ghe {
    public final /* synthetic */ geu f15274a;

    public void m17696a() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateSucceeded", new Object[0]);
        if (this.f15274a.f15095e != null) {
            this.f15274a.f15095e = null;
            this.f15274a.m17468m();
        }
    }

    public void m17697b() {
        glk.m17979c("Babel_telephony", "TeleSetupController.onGoogleVoiceAccountInfoUpdateFailed", new Object[0]);
        if (this.f15274a.f15095e != null) {
            this.f15274a.f15095e = null;
            if (this.f15274a.m17459d()) {
                this.f15274a.m17453a(false);
                this.f15274a.m17468m();
                return;
            }
            this.f15274a.m17456b(gwb.vz);
        }
    }

    public ghe(geu geu) {
        this.f15274a = geu;
    }
}
