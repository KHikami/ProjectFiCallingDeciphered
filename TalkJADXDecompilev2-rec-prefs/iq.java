package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class iq extends FutureTask<Result> {
    final /* synthetic */ io f18694a;

    iq(io ioVar, Callable callable) {
        this.f18694a = ioVar;
        super(callable);
    }

    protected void done() {
        try {
            Object obj = get();
            io ioVar = this.f18694a;
            if (!ioVar.f17408g.get()) {
                ioVar.m21128c(obj);
            }
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
        } catch (CancellationException e3) {
            io ioVar2 = this.f18694a;
            if (!ioVar2.f17408g.get()) {
                ioVar2.m21128c(null);
            }
        } catch (Throwable th) {
            RuntimeException runtimeException = new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
