package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cof extends fjy<coh> {
    public cof(coh coh) {
        super(coh);
    }

    protected euj mo1013a(Context context, int i, int i2) {
        return new cog(context, i, i2, (coh) this.a);
    }

    protected void mo1014a(Context context, int i, fdo fdo) {
        bko e = fde.m15018e(i);
        if (fdo.m15084c() == 113) {
            String str = "Babel";
            String str2 = "Conversation not found for ";
            String valueOf = String.valueOf(((coh) this.a).m8158d());
            glk.m17981d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            RealTimeChatService.m9112f(e, ((coh) this.a).m8158d());
            return;
        }
        RealTimeChatService.m9022a(e, ((coh) this.a).m8158d(), ((coh) this.a).m8157c(), fdo.m15084c());
        ((ect) jyn.m25426a(context, ect.class)).mo1838d(e.m5638g(), true);
    }

    public String K_() {
        return "event_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        boolean a = super.mo1008a(context, eaf, fdo);
        if (fdo.m15084c() == 101 || fdo.m15084c() == 102 || fdo.m15084c() == 103) {
            return false;
        }
        return a;
    }

    public long mo1017b() {
        return gwb.m1519a(gwb.m1400H(), "babel_pending_message_failure_duration", 1200000);
    }

    public boolean mo1018c() {
        return false;
    }

    public boolean mo1019d() {
        return true;
    }

    public boolean mo1016a(String str) {
        return false;
    }

    public boolean mo1015a(ead ead) {
        return false;
    }
}
