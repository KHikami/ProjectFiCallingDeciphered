package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhp implements Runnable {
    final /* synthetic */ String f13071a;
    final /* synthetic */ bko f13072b;

    public fhp(String str, bko bko) {
        this.f13071a = str;
        this.f13072b = bko;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            fip fip = (fip) it.next();
            String valueOf = String.valueOf(fip);
            String str = this.f13071a;
            new StringBuilder((String.valueOf(valueOf).length() + 38) + String.valueOf(str).length()).append("notifyConversationDeleted : ").append(valueOf).append(", convId: ").append(str);
            fip.mo922a(this.f13072b, this.f13071a);
        }
    }
}
