package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhz implements Runnable {
    final /* synthetic */ ewi f13092a;

    public fhz(ewi ewi) {
        this.f13092a = ewi;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo1572d(this.f13092a.m14714k());
        }
    }
}
