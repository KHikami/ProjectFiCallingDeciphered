package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: cge */
final class cge implements kcj, kcm, kcq {
    final /* synthetic */ cdr a;

    cge(cdr cdr) {
        this.a = cdr;
    }

    public void T_() {
        if (this.a.i.a().a != null) {
            this.a.ba.removeCallbacks(this.a.c);
            this.a.c = null;
            this.a.ba.removeCallbacks(this.a.bF);
            this.a.bg = false;
            cdr cdr = this.a;
            for (edk a : cdr.i.k().b()) {
                cdr.aY.a(a);
            }
            this.a.aJ = null;
            if (RealTimeChatService.a) {
                String valueOf = String.valueOf(RealTimeChatService.e);
                String str = RealTimeChatService.d;
                new StringBuilder((String.valueOf(valueOf).length() + 39) + String.valueOf(str).length()).append("unsetFocusedConversation from ").append(valueOf).append(" account:").append(str);
            }
            synchronized (RealTimeChatService.c) {
                RealTimeChatService.d = null;
                RealTimeChatService.e = null;
            }
            this.a.W();
            if (this.a.M() == null) {
                this.a.a(this.a.ab());
            }
        }
    }

    public void R_() {
        boolean z = true;
        this.a.bg = true;
        this.a.bh = 3;
        this.a.aV.b();
        this.a.U();
        if (!this.a.af()) {
            cdr cdr = this.a;
            cdr.a(new cez(cdr));
            fzr fzr = cdr.f;
            if (cdr.i.e() == 1) {
                z = false;
            }
            fzr.b(z, false);
            cdr.aV.a();
            cdr cdr2 = this.a;
            if (cdr2.T()) {
                cdr2.a(new cfa(cdr2));
                cdr2.ba.removeCallbacks(cdr2.bF);
                cdr2.ba.postDelayed(cdr2.bF, (long) gwb.a(cdr2.context, "babel_focusrenewperiodmillis", 270000));
            }
        }
        this.a.c = new cgf(this);
        this.a.ba.post(this.a.c);
        if (this.a.bf != null) {
            this.a.a(this.a.bf, this.a.av);
        }
        this.a.an();
    }
}
