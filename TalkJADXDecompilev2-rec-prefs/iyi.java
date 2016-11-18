package p000;

import java.util.concurrent.Callable;

final class iyi implements Callable<V> {
    final /* synthetic */ Callable f19397a;
    final /* synthetic */ iyg f19398b;

    iyi(iyg iyg, Callable callable) {
        this.f19398b = iyg;
        this.f19397a = callable;
    }

    public V call() {
        return this.f19397a.call();
    }
}
