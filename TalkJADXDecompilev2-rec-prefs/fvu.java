package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fvu implements jwm {
    final /* synthetic */ fzw f14120a;
    final /* synthetic */ fvt f14121b;

    fvu(fvt fvt, fzw fzw) {
        this.f14121b = fvt;
        this.f14120a = fzw;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        int i;
        boolean b = gwb.m2061b((Boolean) obj);
        if (b) {
            RealTimeChatService.m9096d();
        } else {
            RealTimeChatService.m9106e();
        }
        this.f14120a.mo2145a(b);
        iie b2 = this.f14121b.f14116a.mo1693b();
        if (b) {
            i = 2814;
        } else {
            i = 2815;
        }
        b2.mo1714c(i);
        return true;
    }
}
