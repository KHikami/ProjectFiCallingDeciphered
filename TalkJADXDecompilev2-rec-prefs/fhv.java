package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhv implements Runnable {
    final /* synthetic */ bko f13082a;
    final /* synthetic */ String f13083b;
    final /* synthetic */ edo f13084c;
    final /* synthetic */ String f13085d;
    final /* synthetic */ long f13086e;
    final /* synthetic */ boolean f13087f;

    public fhv(bko bko, String str, edo edo, String str2, long j, boolean z) {
        this.f13082a = bko;
        this.f13083b = str;
        this.f13084c = edo;
        this.f13085d = str2;
        this.f13086e = j;
        this.f13087f = z;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo924a(this.f13082a, this.f13083b, this.f13084c, this.f13085d, this.f13086e, this.f13087f);
        }
    }
}
