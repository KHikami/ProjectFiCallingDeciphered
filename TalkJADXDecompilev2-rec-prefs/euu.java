package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class euu extends euo {
    private static final long serialVersionUID = 1;
    public final String f12300k;

    public euu(String str, String str2) {
        super(str);
        this.f12300k = str2;
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        if (a) {
            String valueOf = String.valueOf(this);
            String str = this.e;
            String str2 = this.f12300k;
            new StringBuilder(((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("onFailed ").append(valueOf).append(" ").append(str).append(" ").append(str2);
        }
        super.mo1945a(context, bko, fdo);
        if (!this.f) {
            RealTimeChatService.m9022a(bko, this.e, this.f12300k, fdo != null ? fdo.m15084c() : 0);
            ((ect) jyn.m25426a(context, ect.class)).mo1838d(bko.m5638g(), true);
        }
    }

    public String K_() {
        return "event_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        boolean a = super.mo1008a(context, eaf, fdo);
        if (fdo.m15084c() != 101 && fdo.m15084c() != 102) {
            return a;
        }
        if (glk.m17973a("BabelClient", 3)) {
            glk.m17970a("BabelClient", "Do not retry for EventRequest if network is not available.", new Object[0]);
        }
        return false;
    }
}
