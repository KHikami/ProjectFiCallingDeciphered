package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fht implements Runnable {
    final /* synthetic */ String f13077a;
    final /* synthetic */ edo f13078b;
    final /* synthetic */ boolean f13079c;

    public fht(String str, edo edo, boolean z) {
        this.f13077a = str;
        this.f13078b = edo;
        this.f13079c = z;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo926a(this.f13077a, this.f13078b, this.f13079c);
        }
    }
}
