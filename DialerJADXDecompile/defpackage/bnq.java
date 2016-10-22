package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: bnq */
final class bnq implements UncaughtExceptionHandler {
    private /* synthetic */ bnp a;

    bnq(bnp bnp) {
        this.a = bnp;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        bot bot = this.a.e;
        if (bot != null) {
            bot.e("Job execution failed", th);
        }
    }
}
