import java.util.concurrent.Executor;

final class lgo implements Runnable {
    final /* synthetic */ Executor a;
    final /* synthetic */ Runnable b;
    final /* synthetic */ mtt c;
    final /* synthetic */ lgl d;

    lgo(lgl lgl, Executor executor, Runnable runnable, mtt mtt) {
        this.d = lgl;
        this.a = executor;
        this.b = runnable;
        this.c = mtt;
    }

    public void run() {
        this.a.execute(new lgp(this));
    }
}
