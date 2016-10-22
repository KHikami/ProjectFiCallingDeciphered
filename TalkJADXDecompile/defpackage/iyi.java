package defpackage;

import java.util.concurrent.Callable;

/* renamed from: iyi */
final class iyi implements Callable<V> {
    final /* synthetic */ Callable a;
    final /* synthetic */ iyg b;

    iyi(iyg iyg, Callable callable) {
        this.b = iyg;
        this.a = callable;
    }

    public V call() {
        return this.a.call();
    }
}
