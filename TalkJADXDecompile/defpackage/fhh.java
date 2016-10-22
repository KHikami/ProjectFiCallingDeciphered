package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fhh */
public final class fhh implements Runnable {
    final /* synthetic */ bko a;
    final /* synthetic */ long b;

    public fhh(bko bko, long j) {
        this.a = bko;
        this.b = j;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a, this.b);
        }
    }
}
