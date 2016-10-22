import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Iterator;

final class lhe implements UncaughtExceptionHandler {
    final /* synthetic */ UncaughtExceptionHandler a;
    final /* synthetic */ lhd b;

    lhe(lhd lhd, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.b = lhd;
        this.a = uncaughtExceptionHandler;
    }

    public void uncaughtException(Thread thread, Throwable th) {
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            it.next();
        }
        this.a.uncaughtException(thread, th);
    }
}
