package p000;

import android.telecom.PhoneAccountHandle;

final class gdi implements gcl {
    final /* synthetic */ PhoneAccountHandle f14752a;
    final /* synthetic */ gdg f14753b;

    gdi(gdg gdg, PhoneAccountHandle phoneAccountHandle) {
        this.f14753b = gdg;
        this.f14752a = phoneAccountHandle;
    }

    public void mo2190a(gcm gcm) {
        if (gcm.m16929a()) {
            String valueOf = String.valueOf(gcm);
            glk.m17979c("Babel_telephony", new StringBuilder(String.valueOf(valueOf).length() + 61).append("TeleHandoffWifiToCellular.startHandoff, no cellular service, ").append(valueOf).toString(), new Object[0]);
            this.f14753b.f14748b.m17028a(false, 210);
        } else if (get.m17420a(this.f14753b.f14747a) == 2) {
            this.f14753b.m17037a(this.f14752a);
        } else {
            gdg gdg = this.f14753b;
            PhoneAccountHandle phoneAccountHandle = this.f14752a;
            glk.m17979c("Babel_telephony", "TeleHandoffWifiToCellular.prepareForHandoffUsingUpdateHandoffNumber", new Object[0]);
            gcq a = gdg.f14748b.m17024a();
            ((bhl) jyn.m25426a(gdg.f14747a, bhl.class)).mo550a(new gfd(fde.m15018e(a.m16969p()), a.m16970q(), a.m16972s(), gwb.m1425M(gdg.f14747a)));
            gdg.m17037a(phoneAccountHandle);
        }
    }
}
