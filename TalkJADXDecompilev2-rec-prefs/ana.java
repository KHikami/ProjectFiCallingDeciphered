package p000;

import java.util.concurrent.Callable;

final class ana implements Callable<Void> {
    final /* synthetic */ amz f1392a;

    ana(amz amz) {
        this.f1392a = amz;
    }

    public /* synthetic */ Object call() {
        return m3006a();
    }

    private Void m3006a() {
        synchronized (this.f1392a) {
            if (this.f1392a.f1379c == null) {
            } else {
                this.f1392a.m3005c();
                if (this.f1392a.m3004b()) {
                    this.f1392a.m3001a();
                    this.f1392a.f1380d = 0;
                }
            }
        }
        return null;
    }
}
