package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

class eem implements eei, ffw {
    private final Context a;

    public eem(Context context) {
        this.a = context;
    }

    public void c(int i) {
        glk.a("Babel", "setPeerToPeerAcknowledged", new Object[0]);
        RealTimeChatService.a(((fmf) jyn.a(this.a, fmf.class)).a(-1), i, 31, false);
        ((jcf) jyn.a(this.a, jcf.class)).b(i).b("peer_to_peer_acknowledgment_needed", false).d();
    }

    public void a(jck jck, eyc eyc) {
        glk.a("Babel", "Setting isPeerToPeerAcknowledgmentNeeded from selfInfoResponse: %s", Boolean.valueOf(eyc.n().t));
        jck.c("peer_to_peer_acknowledgment_needed", r0);
    }

    public boolean a(int i) {
        return eem.a(this.a, i);
    }

    public dq b(int i) {
        if (!a(i)) {
            return null;
        }
        dq eej = new eej();
        eej.a(i);
        eej.a(this);
        return eej;
    }

    static boolean a(Context context, int i) {
        glk.a("Babel", "isPeerToPeerAcknowledgementNeeded: %s", Boolean.valueOf(((jcf) jyn.a(context, jcf.class)).a(i).c("peer_to_peer_acknowledgment_needed")));
        return ((jcf) jyn.a(context, jcf.class)).a(i).c("peer_to_peer_acknowledgment_needed");
    }
}
