package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhz implements Runnable {
    final /* synthetic */ ewi a;

    public fhz(ewi ewi) {
        this.a = ewi;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).d(this.a.k());
        }
    }
}
