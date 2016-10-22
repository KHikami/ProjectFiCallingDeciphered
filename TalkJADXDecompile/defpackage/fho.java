package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fho */
public final class fho implements Runnable {
    final /* synthetic */ fiu a;
    final /* synthetic */ int b;
    final /* synthetic */ bko c;

    public fho(fiu fiu, int i, bko bko) {
        this.a = fiu;
        this.b = i;
        this.c = bko;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            fip fip = (fip) it.next();
            String valueOf = String.valueOf(fip);
            String valueOf2 = String.valueOf(this.a);
            new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()).append("notifyResponseReceived : ").append(valueOf).append(", result: ").append(valueOf2);
            fip.a(this.b, this.c, this.a);
        }
    }
}
