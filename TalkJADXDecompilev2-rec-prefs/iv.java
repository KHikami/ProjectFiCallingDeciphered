package p000;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.Callable;

class iv<Params, Result> implements Callable<Result> {
    Params[] f19084a;
    final /* synthetic */ io f19085b;

    iv() {
    }

    iv(io ioVar) {
        this.f19085b = ioVar;
        this();
    }

    public Result call() {
        this.f19085b.f17408g.set(true);
        Result result = null;
        try {
            Process.setThreadPriority(10);
            result = this.f19085b.mo3026a(this.f19084a);
            Binder.flushPendingCommands();
            return result;
        } finally {
            this.f19085b.m21128c(result);
        }
    }
}
