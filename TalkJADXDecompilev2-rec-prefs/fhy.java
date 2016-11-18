package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhy implements Runnable {
    final /* synthetic */ ewa f13091a;

    public fhy(ewa ewa) {
        this.f13091a = ewa;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo2256a(this.f13091a.m8127b(), this.f13091a.m14700k());
        }
    }
}
