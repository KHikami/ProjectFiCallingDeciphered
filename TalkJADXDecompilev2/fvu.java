package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class fvu implements jwm {
    final /* synthetic */ fzw a;
    final /* synthetic */ fvt b;

    fvu(fvt fvt, fzw fzw) {
        this.b = fvt;
        this.a = fzw;
    }

    public boolean a(jwi jwi, Object obj) {
        int i;
        boolean b = gwb.b((Boolean) obj);
        if (b) {
            RealTimeChatService.d();
        } else {
            RealTimeChatService.e();
        }
        this.a.a(b);
        iie b2 = this.b.a.b();
        if (b) {
            i = 2814;
        } else {
            i = 2815;
        }
        b2.c(i);
        return true;
    }
}
