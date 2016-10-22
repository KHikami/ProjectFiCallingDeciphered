package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fhx */
public final class fhx implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ exz b;

    public fhx(bko bko, exz exz) {
        this.a = bko;
        this.b = exz;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.b);
        }
    }
}
