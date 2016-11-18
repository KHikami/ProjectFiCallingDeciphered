package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fia implements Runnable {
    final /* synthetic */ String f13101a;
    final /* synthetic */ String f13102b;

    public fia(String str, String str2) {
        this.f13101a = str;
        this.f13102b = str2;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            ((fip) it.next()).mo927a(this.f13101a, this.f13102b);
        }
    }
}
