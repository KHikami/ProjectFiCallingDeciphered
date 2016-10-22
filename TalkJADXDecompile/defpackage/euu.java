package defpackage;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

/* renamed from: euu */
public abstract class euu extends euo {
    private static final long serialVersionUID = 1;
    public final String k;

    public euu(String str, String str2) {
        super(str);
        this.k = str2;
    }

    public void a(Context context, bko bko, fdo fdo) {
        if (a) {
            String valueOf = String.valueOf(this);
            String str = this.e;
            String str2 = this.k;
            new StringBuilder(((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()) + String.valueOf(str2).length()).append("onFailed ").append(valueOf).append(" ").append(str).append(" ").append(str2);
        }
        super.a(context, bko, fdo);
        if (!this.f) {
            RealTimeChatService.a(bko, this.e, this.k, fdo != null ? fdo.c() : 0);
            ((ect) jyn.a(context, ect.class)).d(bko.g(), true);
        }
    }

    public String K_() {
        return "event_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        boolean a = super.a(context, eaf, fdo);
        if (fdo.c() != 101 && fdo.c() != 102) {
            return a;
        }
        if (glk.a("BabelClient", 3)) {
            glk.a("BabelClient", "Do not retry for EventRequest if network is not available.", new Object[0]);
        }
        return false;
    }
}
