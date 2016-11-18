package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhx implements Runnable {
    final /* synthetic */ bko f13089a;
    final /* synthetic */ exz f13090b;

    public fhx(bko bko, exz exz) {
        this.f13089a = bko;
        this.f13090b = exz;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo1491a(this.f13090b);
        }
    }
}
