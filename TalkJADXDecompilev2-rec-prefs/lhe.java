package p000;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Iterator;

final class lhe implements UncaughtExceptionHandler {
    final /* synthetic */ UncaughtExceptionHandler f24997a;
    final /* synthetic */ lhd f24998b;

    lhe(lhd lhd, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f24998b = lhd;
        this.f24997a = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Iterator it = this.f24998b.f24996a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.f24997a.uncaughtException(thread, th);
    }
}
