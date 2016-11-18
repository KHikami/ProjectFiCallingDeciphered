package p000;

import java.lang.Thread.UncaughtExceptionHandler;

final class ixr implements UncaughtExceptionHandler {
    final /* synthetic */ ixm f19361a;
    private final UncaughtExceptionHandler f19362b;

    ixr(ixm ixm, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f19361a = ixm;
        this.f19362b = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (!this.f19361a.f19343b) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.f19361a.m23462g() && this.f19361a.f19347f.mo1638a()) {
            iwm.m23399a(this.f19361a.f19344c, this.f19361a.f19342a, this.f19361a.f19347f).m23401a(this.f19362b).uncaughtException(thread, th);
        } else if (this.f19362b != null) {
            this.f19362b.uncaughtException(thread, th);
        }
    }
}
