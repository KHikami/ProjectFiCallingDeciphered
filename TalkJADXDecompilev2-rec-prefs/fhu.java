package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

public final class fhu implements Runnable {
    final /* synthetic */ String f13080a;
    final /* synthetic */ List f13081b;

    public fhu(String str, List list) {
        this.f13080a = str;
        this.f13081b = list;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo928a(this.f13080a, this.f13081b);
        }
    }
}
