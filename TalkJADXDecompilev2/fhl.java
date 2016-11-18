package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhl implements Runnable {
    final /* synthetic */ fok a;
    final /* synthetic */ bko b;
    final /* synthetic */ fdo c;

    public fhl(fok fok, bko bko, fdo fdo) {
        this.a = fok;
        this.b = bko;
        this.c = fdo;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a.L_(), this.b, this.a, this.c);
        }
        RealTimeChatService.a(this.b, this.c);
    }
}
