package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

class dse implements drx, ffw {
    dsf f10430a;
    private final bbm f10431b;
    private final Context f10432c;
    private final fzw f10433d;

    dse(Context context) {
        this.f10431b = (bbm) jyn.m25426a(context, bbm.class);
        this.f10433d = (fzw) jyn.m25426a(context, fzw.class);
        this.f10432c = context;
    }

    public boolean m12605a(int i) {
        this.f10430a = new dsf(i);
        return (!fdq.f12792h.m14370b(i) || !czj.m11296i() || this.f10431b.mo456p(i) || !this.f10431b.mo451k(i) || this.f10433d.mo2146a(i) || m12607c(i) || this.f10430a.m12608a()) ? false : true;
    }

    void m12602a(int i, boolean z) {
        glk.m17970a("Babel", "setInviteHappyStatePromoSeen", new Object[0]);
        RealTimeChatService.m9043a(((fmf) jyn.m25426a(this.f10432c, fmf.class)).mo2036a(-1), i, 36, true);
        ((jcf) jyn.m25426a(this.f10432c, jcf.class)).mo3464b(i).m23881b("invite_happy_state_promo_seen", true).m23891d();
    }

    void m12606b(int i) {
        glk.m17970a("Babel", "updateUserSettingsToHappyState", new Object[0]);
        this.f10430a.m12609b();
        m12602a(i, true);
    }

    boolean m12607c(int i) {
        glk.m17970a("Babel", "hasUserSeenInviteHappyStatePromo: %s", Boolean.valueOf(((jcf) jyn.m25426a(this.f10432c, jcf.class)).mo3456a(i).mo3448c("invite_happy_state_promo_seen")));
        return ((jcf) jyn.m25426a(this.f10432c, jcf.class)).mo3456a(i).mo3448c("invite_happy_state_promo_seen");
    }

    public void mo1659a(ed edVar, int i) {
        if (m12605a(i)) {
            dry dry = new dry();
            dry.m12587a(this);
            dry.mo2341a(edVar, null);
        }
    }

    public void mo536a(jck jck, eyc eyc) {
        glk.m17970a("Babel", "Setting hasInviteHappyStatePromoBeenSeen from selfInfoResponse: %s", Boolean.valueOf(eyc.m14773n().f3657u));
        jck.mo3447c("invite_happy_state_promo_seen", r0);
    }
}
