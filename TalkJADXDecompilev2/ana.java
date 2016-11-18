package defpackage;

import java.util.concurrent.Callable;

final class ana implements Callable<Void> {
    final /* synthetic */ amz a;

    ana(amz amz) {
        this.a = amz;
    }

    public /* synthetic */ Object call() {
        return a();
    }

    private Void a() {
        synchronized (this.a) {
            if (this.a.c == null) {
            } else {
                this.a.c();
                if (this.a.b()) {
                    this.a.a();
                    this.a.d = 0;
                }
            }
        }
        return null;
    }
}
