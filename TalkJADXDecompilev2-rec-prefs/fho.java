package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fho implements Runnable {
    final /* synthetic */ fiu f13068a;
    final /* synthetic */ int f13069b;
    final /* synthetic */ bko f13070c;

    public fho(fiu fiu, int i, bko bko) {
        this.f13068a = fiu;
        this.f13069b = i;
        this.f13070c = bko;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            fip fip = (fip) it.next();
            String valueOf = String.valueOf(fip);
            String valueOf2 = String.valueOf(this.f13068a);
            new StringBuilder((String.valueOf(valueOf).length() + 35) + String.valueOf(valueOf2).length()).append("notifyResponseReceived : ").append(valueOf).append(", result: ").append(valueOf2);
            fip.mo610a(this.f13069b, this.f13070c, this.f13068a);
        }
    }
}
