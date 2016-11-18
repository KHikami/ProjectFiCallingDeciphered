package p000;

import java.util.concurrent.Executor;

final class lgo implements Runnable {
    final /* synthetic */ Executor f24966a;
    final /* synthetic */ Runnable f24967b;
    final /* synthetic */ mtt f24968c;
    final /* synthetic */ lgl f24969d;

    lgo(lgl lgl, Executor executor, Runnable runnable, mtt mtt) {
        this.f24969d = lgl;
        this.f24966a = executor;
        this.f24967b = runnable;
        this.f24968c = mtt;
    }

    public void run() {
        this.f24966a.execute(new lgp(this));
    }
}
