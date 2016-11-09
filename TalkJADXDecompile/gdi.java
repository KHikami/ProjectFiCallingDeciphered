import android.telecom.PhoneAccountHandle;

// prepares account handoff from wifi to cellular?
final class gdi implements gcl {
    final /* synthetic */ PhoneAccountHandle a;
    final /* synthetic */ gdg b;

    gdi(gdg gdg, PhoneAccountHandle phoneAccountHandle) {
        this.b = gdg;
        this.a = phoneAccountHandle;
    }

    public void a(gcm gcm) {
        if (gcm.a()) {
            String valueOf = String.valueOf(gcm);
            glk.c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 61).append("TeleHandoffWifiToCellular.startHandoff, no cellular service, ").append(valueOf).toString(), new Object[0]);
            this.b.b.a(false, 210);
        } else if (get.a(this.b.a) == 2) {
            this.b.a(this.a);
        } else {
            gdg gdg = this.b;
            PhoneAccountHandle phoneAccountHandle = this.a;
            glk.c("Babel_telephony", "TeleHandoffWifiToCellular.prepareForHandoffUsingUpdateHandoffNumber", new Object[0]);
            gcq a = gdg.b.a();
            ((bhl) jyn.a(gdg.a, bhl.class)).a(new gfd(fde.e(a.p()), a.q(), a.s(), gwb.M(gdg.a)));
            gdg.a(phoneAccountHandle);
        }
    }
}
