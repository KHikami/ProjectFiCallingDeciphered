package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fie implements Runnable {
    final /* synthetic */ bko f13108a;

    public fie(bko bko) {
        this.f13108a = bko;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo2098b(this.f13108a);
        }
    }
}
