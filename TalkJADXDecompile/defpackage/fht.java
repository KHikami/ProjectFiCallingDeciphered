package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fht */
public final class fht implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ edo b;
    final /* synthetic */ boolean c;

    public fht(String str, edo edo, boolean z) {
        this.a = str;
        this.b = edo;
        this.c = z;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).a(this.a, this.b, this.c);
        }
    }
}
