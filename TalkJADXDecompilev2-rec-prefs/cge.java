package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class cge implements kcj, kcm, kcq {
    final /* synthetic */ cdr f5240a;

    cge(cdr cdr) {
        this.f5240a = cdr;
    }

    public void T_() {
        if (this.f5240a.f5106i.mo931a().f4146a != null) {
            this.f5240a.ba.removeCallbacks(this.f5240a.f5101c);
            this.f5240a.f5101c = null;
            this.f5240a.ba.removeCallbacks(this.f5240a.bF);
            this.f5240a.bg = false;
            cdr cdr = this.f5240a;
            for (edk a : cdr.f5106i.mo954k().m5590b()) {
                cdr.aY.m9573a(a);
            }
            this.f5240a.aJ = null;
            if (RealTimeChatService.f6744a) {
                String valueOf = String.valueOf(RealTimeChatService.f6748e);
                String str = RealTimeChatService.f6747d;
                new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("unsetFocusedConversation from ").append(valueOf).append(" account:").append(str);
            }
            synchronized (RealTimeChatService.f6746c) {
                RealTimeChatService.f6747d = null;
                RealTimeChatService.f6748e = null;
            }
            this.f5240a.m7368W();
            if (this.f5240a.m7360M() == null) {
                this.f5240a.m7378a(this.f5240a.ab());
            }
        }
    }

    public void R_() {
        boolean z = true;
        this.f5240a.bg = true;
        this.f5240a.bh = 3;
        this.f5240a.aV.m7263b();
        this.f5240a.m7367U();
        if (!this.f5240a.af()) {
            cdr cdr = this.f5240a;
            cdr.m7381a(new cez(cdr));
            fzr fzr = cdr.f5103f;
            if (cdr.f5106i.mo947e() == 1) {
                z = false;
            }
            fzr.m16724b(z, false);
            cdr.aV.m7257a();
            cdr cdr2 = this.f5240a;
            if (cdr2.m7366T()) {
                cdr2.m7381a(new cfa(cdr2));
                cdr2.ba.removeCallbacks(cdr2.bF);
                cdr2.ba.postDelayed(cdr2.bF, (long) gwb.m1492a(cdr2.context, "babel_focusrenewperiodmillis", 270000));
            }
        }
        this.f5240a.f5101c = new cgf(this);
        this.f5240a.ba.post(this.f5240a.f5101c);
        if (this.f5240a.bf != null) {
            this.f5240a.m7376a(this.f5240a.bf, this.f5240a.av);
        }
        this.f5240a.an();
    }
}
