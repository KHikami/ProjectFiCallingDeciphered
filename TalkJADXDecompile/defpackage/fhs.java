package defpackage;

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;

/* renamed from: fhs */
public final class fhs implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bko b;
    final /* synthetic */ Runnable c;

    public fhs(String str, bko bko, Runnable runnable) {
        this.a = str;
        this.b = bko;
        this.c = runnable;
    }

    public void run() {
        Iterator it = RealTimeChatService.f.iterator();
        while (it.hasNext()) {
            fip fip = (fip) it.next();
            String valueOf = String.valueOf(fip);
            String str = this.a;
            new StringBuilder((String.valueOf(valueOf).length() + 43) + String.valueOf(str).length()).append("notifyRequestConversationClose : ").append(valueOf).append(", convId: ").append(str);
            Throwable th = new Throwable();
            fip.a(this.b, this.a, this.c);
        }
    }
}
