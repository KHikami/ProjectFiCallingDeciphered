package p000;

import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class eur extends euo {
    private static final long serialVersionUID = 1;
    public final long f12312c;
    public final String[] f12313d;

    public eur(String str, long j, String[] strArr) {
        super(str);
        this.f12312c = j;
        this.f12313d = strArr;
    }

    public nzf mo1944a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 41).append("Delete conversation ").append(str2).append(" ").append(this.f12312c);
        }
        nzf lpi = new lpi();
        lpi.requestHeader = euk.m14556a(str, i, i2, this.i);
        lpi.f26000b = euk.m14555a(this.e);
        if (this.f12313d != null) {
            lpi.f26002d = this.f12313d;
            lpi.f25999a = Integer.valueOf(2);
        } else {
            lpi.f26001c = Long.valueOf(this.f12312c);
            lpi.f25999a = Integer.valueOf(1);
        }
        return lpi;
    }

    public String mo1947g() {
        return "conversations/deleteconversation";
    }

    public String K_() {
        return "event_queue";
    }

    public boolean mo1008a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public void mo1945a(Context context, bko bko, fdo fdo) {
        if (glk.m17973a("BabelClient", 3)) {
            String str = "BabelClient";
            String str2 = "DeleteConversationRequest: expired for ";
            String valueOf = String.valueOf(this.e);
            glk.m17976b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        super.mo1945a(context, bko, fdo);
        if (!this.f) {
            RealTimeChatService.m9028a(bko, this.e, this.f12313d);
        }
    }
}
