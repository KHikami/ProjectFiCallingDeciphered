package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class gfl extends fip {
    final /* synthetic */ gfj a;

    gfl(gfj gfj) {
        this.a = gfj;
    }

    public void a(int i, String str) {
        if (i == this.a.j) {
            String str2 = "Babel_telephony";
            String str3 = "TeleWifiCall.onHandoffNumberReceived, handoffNumber: ";
            String valueOf = String.valueOf(gwb.G(str));
            glk.c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            this.a.j = 0;
            if (this.a.c != null) {
                this.a.c.a(str);
            }
            RealTimeChatService.b((fip) this);
            if (this.a.i == this) {
                this.a.i = null;
            }
        }
    }
}