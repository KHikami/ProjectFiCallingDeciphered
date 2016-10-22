package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: ixr */
final class ixr implements UncaughtExceptionHandler {
    final /* synthetic */ ixm a;
    private final UncaughtExceptionHandler b;

    ixr(ixm ixm, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = ixm;
        this.b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.a.b) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.a.g() && this.a.f.a()) {
            iwm.a(this.a.c, this.a.a, this.a.f).a(this.b).uncaughtException(thread, th);
        } else if (this.b != null) {
            this.b.uncaughtException(thread, th);
        }
    }
}
