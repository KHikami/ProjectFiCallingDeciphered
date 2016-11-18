package defpackage;

import java.util.concurrent.Callable;

final class eab implements Callable<dzz> {
    final /* synthetic */ dzy a;
    final /* synthetic */ eag b;
    final /* synthetic */ dzz c;

    eab(dzz dzz, dzy dzy, eag eag) {
        this.c = dzz;
        this.a = dzy;
        this.b = eag;
    }

    public /* synthetic */ Object call() {
        return a();
    }

    private dzz a() {
        return this.c.c(this.a, this.b);
    }
}
