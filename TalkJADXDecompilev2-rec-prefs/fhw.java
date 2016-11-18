package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhw implements Runnable {
    final /* synthetic */ fqj f13088a;

    public fhw(fqj fqj) {
        this.f13088a = fqj;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo930c();
        }
    }
}
