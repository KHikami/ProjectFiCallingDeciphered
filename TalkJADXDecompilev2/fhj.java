package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhj implements Runnable {
    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a();
        }
    }
}
