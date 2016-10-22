import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class fib implements Runnable {
    final /* synthetic */ PendingIntent a;
    final /* synthetic */ int b;

    public fib(PendingIntent pendingIntent, int i) {
        this.a = pendingIntent;
        this.b = i;
    }

    public void run() {
        try {
            this.a.send();
            synchronized (RealTimeChatService.k) {
                RealTimeChatService.k.put(this.b, Long.valueOf(glj.b()));
            }
        } catch (CanceledException e) {
        }
    }
}
