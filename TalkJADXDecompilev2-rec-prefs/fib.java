package p000;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fib implements Runnable {
    final /* synthetic */ PendingIntent f13103a;
    final /* synthetic */ int f13104b;

    public fib(PendingIntent pendingIntent, int i) {
        this.f13103a = pendingIntent;
        this.f13104b = i;
    }

    public void run() {
        try {
            this.f13103a.send();
            synchronized (RealTimeChatService.f6754k) {
                RealTimeChatService.f6754k.put(this.f13104b, Long.valueOf(glj.m17963b()));
            }
        } catch (CanceledException e) {
        }
    }
}
