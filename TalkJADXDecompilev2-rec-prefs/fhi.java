package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhi implements Runnable {
    final /* synthetic */ bko f13059a;
    final /* synthetic */ fpk f13060b;

    public fhi(bko bko, fpk fpk) {
        this.f13059a = bko;
        this.f13060b = fpk;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo923a(this.f13059a, this.f13060b.m15907b(), this.f13060b.m15908c(), this.f13060b.m15905a());
        }
    }
}
