package defpackage;

import com.google.android.apps.hangouts.concurrent.impl.ConcurrentService;

public final class bin implements Runnable {
    final /* synthetic */ ConcurrentService a;
    private final bho b;

    public bin(ConcurrentService concurrentService, bho bho) {
        this.a = concurrentService;
        this.b = bho;
    }

    public void run() {
        if (this.b.a(this.a.e)) {
            String str = "Babel_ConcService";
            String str2 = "BackgroundScheduler schedules task ";
            String valueOf = String.valueOf(this.b.a());
            glk.c(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        this.a.b(this.b);
    }
}
