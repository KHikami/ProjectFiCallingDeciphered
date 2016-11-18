package p000;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

public final class fhs implements Runnable {
    final /* synthetic */ String f13074a;
    final /* synthetic */ bko f13075b;
    final /* synthetic */ Runnable f13076c;

    public fhs(String str, bko bko, Runnable runnable) {
        this.f13074a = str;
        this.f13075b = bko;
        this.f13076c = runnable;
    }

    public void run() {
        Iterator it = RealTimeChatService.f6749f.iterator();
        while (it.hasNext()) {
            fip fip = (fip) it.next();
            String valueOf = String.valueOf(fip);
            String str = this.f13074a;
            new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(str).length()).append("notifyRequestConversationClose : ").append(valueOf).append(", convId: ").append(str);
            Throwable th = new Throwable();
            fip.mo925a(this.f13075b, this.f13074a, this.f13076c);
        }
    }
}
