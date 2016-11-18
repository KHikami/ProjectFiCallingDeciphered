package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

class dse implements drx, ffw {
    dsf a;
    private final bbm b;
    private final Context c;
    private final fzw d;

    dse(Context context) {
        this.b = (bbm) jyn.a(context, bbm.class);
        this.d = (fzw) jyn.a(context, fzw.class);
        this.c = context;
    }

    public boolean a(int i) {
        this.a = new dsf(i);
        return (!fdq.h.b(i) || !czj.i() || this.b.p(i) || !this.b.k(i) || this.d.a(i) || c(i) || this.a.a()) ? false : true;
    }

    void a(int i, boolean z) {
        glk.a("Babel", "setInviteHappyStatePromoSeen", new Object[0]);
        RealTimeChatService.a(((fmf) jyn.a(this.c, fmf.class)).a(-1), i, 36, true);
        ((jcf) jyn.a(this.c, jcf.class)).b(i).b("invite_happy_state_promo_seen", true).d();
    }

    void b(int i) {
        glk.a("Babel", "updateUserSettingsToHappyState", new Object[0]);
        this.a.b();
        a(i, true);
    }

    boolean c(int i) {
        glk.a("Babel", "hasUserSeenInviteHappyStatePromo: %s", Boolean.valueOf(((jcf) jyn.a(this.c, jcf.class)).a(i).c("invite_happy_state_promo_seen")));
        return ((jcf) jyn.a(this.c, jcf.class)).a(i).c("invite_happy_state_promo_seen");
    }

    public void a(ed edVar, int i) {
        if (a(i)) {
            dry dry = new dry();
            dry.a(this);
            dry.a(edVar, null);
        }
    }

    public void a(jck jck, eyc eyc) {
        glk.a("Babel", "Setting hasInviteHappyStatePromoBeenSeen from selfInfoResponse: %s", Boolean.valueOf(eyc.n().u));
        jck.c("invite_happy_state_promo_seen", r0);
    }
}
