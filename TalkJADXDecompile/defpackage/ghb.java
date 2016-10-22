package defpackage;

/* renamed from: ghb */
public class ghb {
    public final /* synthetic */ geu a;

    public void a() {
        glk.c("Babel_telephony", "TeleSetupController.onGoogleVoiceEnableCallingSucceeded", new Object[0]);
        if (this.a.f != null) {
            this.a.f = null;
            this.a.m();
        }
    }

    public void b() {
        glk.c("Babel_telephony", "TeleSetupController.onGoogleVoiceEnableCallingFailed", new Object[0]);
        if (this.a.f != null) {
            this.a.f = null;
            this.a.b(gwb.vu);
        }
    }

    public ghb(geu geu) {
        this.a = geu;
    }
}
