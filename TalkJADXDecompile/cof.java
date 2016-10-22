import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cof extends fjy<coh> {
    public cof(coh coh) {
        super(coh);
    }

    protected euj a(Context context, int i, int i2) {
        return new cog(context, i, i2, (coh) this.a);
    }

    protected void a(Context context, int i, fdo fdo) {
        bko e = fde.e(i);
        if (fdo.c() == 113) {
            String str = "Babel";
            String str2 = "Conversation not found for ";
            String valueOf = String.valueOf(((coh) this.a).d());
            glk.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            RealTimeChatService.f(e, ((coh) this.a).d());
            return;
        }
        RealTimeChatService.a(e, ((coh) this.a).d(), ((coh) this.a).c(), fdo.c());
        ((ect) jyn.a(context, ect.class)).d(e.g(), true);
    }

    public String K_() {
        return "event_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        boolean a = super.a(context, eaf, fdo);
        if (fdo.c() == 101 || fdo.c() == 102 || fdo.c() == 103) {
            return false;
        }
        return a;
    }

    public long b() {
        return gwb.a(gwb.H(), "babel_pending_message_failure_duration", 1200000);
    }

    public boolean c() {
        return false;
    }

    public boolean d() {
        return true;
    }

    public boolean a(String str) {
        return false;
    }

    public boolean a(ead ead) {
        return false;
    }
}
