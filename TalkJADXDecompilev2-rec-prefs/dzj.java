package p000;

import java.util.concurrent.Callable;

final class dzj implements Callable<Void> {
    final /* synthetic */ dzi f10915a;

    dzj(dzi dzi) {
        this.f10915a = dzi;
    }

    public /* synthetic */ Object call() {
        return m13168a();
    }

    private Void m13168a() {
        synchronized (this.f10915a) {
            if (this.f10915a.f10904c == null) {
            } else {
                this.f10915a.m13166c();
                if (this.f10915a.m13165b()) {
                    this.f10915a.m13162a();
                    this.f10915a.f10905d = 0;
                }
            }
        }
        return null;
    }
}
