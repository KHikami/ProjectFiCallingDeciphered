package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

/* renamed from: fhu */
public final class fhu implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ List b;

    public fhu(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a, this.b);
        }
    }
}
