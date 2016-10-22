import java.util.concurrent.Executor;

final class msr {
    final Runnable a;
    final Executor b;
    msr c;

    msr(Runnable runnable, Executor executor, msr msr) {
        this.a = runnable;
        this.b = executor;
        this.c = msr;
    }
}
