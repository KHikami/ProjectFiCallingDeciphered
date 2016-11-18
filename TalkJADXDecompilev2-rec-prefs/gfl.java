package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class gfl extends fip {
    final /* synthetic */ gfj f15165a;

    gfl(gfj gfj) {
        this.f15165a = gfj;
    }

    public void mo2256a(int i, String str) {
        if (i == this.f15165a.f15150j) {
            String str2 = "Babel_telephony";
            String str3 = "TeleWifiCall.onHandoffNumberReceived, handoffNumber: ";
            String valueOf = String.valueOf(gwb.m1397G(str));
            glk.m17979c(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3), new Object[0]);
            this.f15165a.f15150j = 0;
            if (this.f15165a.f15143c != null) {
                this.f15165a.f15143c.m16945a(str);
            }
            RealTimeChatService.m9077b((fip) this);
            if (this.f15165a.f15149i == this) {
                this.f15165a.f15149i = null;
            }
        }
    }
}
