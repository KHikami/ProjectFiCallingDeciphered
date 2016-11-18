package p000;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bin implements Runnable {
    final /* synthetic */ ConcurrentService f3438a;
    private final bho f3439b;

    public bin(ConcurrentService concurrentService, bho bho) {
        this.f3438a = concurrentService;
        this.f3439b = bho;
    }

    public void run() {
        if (this.f3439b.m5259a(this.f3438a.f5967e)) {
            String str = "Babel_ConcService";
            String str2 = "BackgroundScheduler schedules task ";
            String valueOf = String.valueOf(this.f3439b.m5258a());
            glk.m17979c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.f3438a.m8234b(this.f3439b);
    }
}
