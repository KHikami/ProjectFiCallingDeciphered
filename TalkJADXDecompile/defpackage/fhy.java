package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fhy */
public final class fhy implements Runnable {
    final /* synthetic */ ewa a;

    public fhy(ewa ewa) {
        this.a = ewa;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a.b(), this.a.k());
        }
    }
}
