package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

class eem implements eei, ffw {
    private final Context f11314a;

    public eem(Context context) {
        this.f11314a = context;
    }

    public void m13728c(int i) {
        glk.m17970a("Babel", "setPeerToPeerAcknowledged", new Object[0]);
        RealTimeChatService.m9043a(((fmf) jyn.m25426a(this.f11314a, fmf.class)).mo2036a(-1), i, 31, false);
        ((jcf) jyn.m25426a(this.f11314a, jcf.class)).mo3464b(i).m23881b("peer_to_peer_acknowledgment_needed", false).m23891d();
    }

    public void mo536a(jck jck, eyc eyc) {
        glk.m17970a("Babel", "Setting isPeerToPeerAcknowledgmentNeeded from selfInfoResponse: %s", Boolean.valueOf(eyc.m14773n().f3656t));
        jck.mo3447c("peer_to_peer_acknowledgment_needed", r0);
    }

    public boolean mo1854a(int i) {
        return eem.m13724a(this.f11314a, i);
    }

    public dq mo1855b(int i) {
        if (!mo1854a(i)) {
            return null;
        }
        dq eej = new eej();
        eej.m13718a(i);
        eej.m13719a(this);
        return eej;
    }

    static boolean m13724a(Context context, int i) {
        glk.m17970a("Babel", "isPeerToPeerAcknowledgementNeeded: %s", Boolean.valueOf(((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3448c("peer_to_peer_acknowledgment_needed")));
        return ((jcf) jyn.m25426a(context, jcf.class)).mo3456a(i).mo3448c("peer_to_peer_acknowledgment_needed");
    }
}
