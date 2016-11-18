package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhp implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bko b;

    public fhp(String str, bko bko) {
        this.a = str;
        this.b = bko;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            fip fip = (fip) it.next();
            String valueOf = String.valueOf(fip);
            String str = this.a;
            new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(str).length()).append("notifyConversationDeleted : ").append(valueOf).append(", convId: ").append(str);
            fip.a(this.b, this.a);
        }
    }
}
