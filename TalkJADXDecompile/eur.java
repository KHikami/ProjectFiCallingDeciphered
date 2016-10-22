import android.content.Context;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class eur extends euo {
    private static final long serialVersionUID = 1;
    public final long c;
    public final String[] d;

    public eur(String str, long j, String[] strArr) {
        super(str);
        this.c = j;
        this.d = strArr;
    }

    public nzf a(String str, int i, int i2) {
        if (a) {
            String str2 = this.e;
            new StringBuilder(String.valueOf(str2).length() + 41).append("Delete conversation ").append(str2).append(" ").append(this.c);
        }
        nzf lpi = new lpi();
        lpi.requestHeader = euk.a(str, i, i2, this.i);
        lpi.b = euk.a(this.e);
        if (this.d != null) {
            lpi.d = this.d;
            lpi.a = Integer.valueOf(2);
        } else {
            lpi.c = Long.valueOf(this.c);
            lpi.a = Integer.valueOf(1);
        }
        return lpi;
    }

    public String g() {
        return "conversations/deleteconversation";
    }

    public String K_() {
        return "event_queue";
    }

    public boolean a(Context context, eaf eaf, fdo fdo) {
        return false;
    }

    public void a(Context context, bko bko, fdo fdo) {
        if (glk.a("BabelClient", 3)) {
            String str = "BabelClient";
            String str2 = "DeleteConversationRequest: expired for ";
            String valueOf = String.valueOf(this.e);
            glk.b(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        super.a(context, bko, fdo);
        if (!this.f) {
            RealTimeChatService.a(bko, this.e, this.d);
        }
    }
}
