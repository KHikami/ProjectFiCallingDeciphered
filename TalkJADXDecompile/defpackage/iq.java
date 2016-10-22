package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: iq */
final class iq extends FutureTask<Result> {
    final /* synthetic */ io a;

    iq(io ioVar, Callable callable) {
        this.a = ioVar;
        super(callable);
    }

    protected void done() {
        try {
            Object obj = get();
            io ioVar = this.a;
            if (!ioVar.g.get()) {
                ioVar.c(obj);
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            io ioVar2 = this.a;
            if (!ioVar2.g.get()) {
                ioVar2.c(null);
            }
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
