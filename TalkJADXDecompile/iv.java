import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

class iv<Params, Result> implements Callable<Result> {
    Params[] a;
    final /* synthetic */ io b;

    iv() {
    }

    iv(io ioVar) {
        this.b = ioVar;
        this();
    }

    public Result call() {
        this.b.g.set(true);
        Result result = null;
        try {
            Process.setThreadPriority(10);
            result = this.b.a(this.a);
            Binder.flushPendingCommands();
            return result;
        } finally {
            this.b.c(result);
        }
    }
}
