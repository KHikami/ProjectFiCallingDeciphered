package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhh implements Runnable {
    final /* synthetic */ bko f13057a;
    final /* synthetic */ long f13058b;

    public fhh(bko bko, long j) {
        this.f13057a = bko;
        this.f13058b = j;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo1923a(this.f13057a, this.f13058b);
        }
    }
}
