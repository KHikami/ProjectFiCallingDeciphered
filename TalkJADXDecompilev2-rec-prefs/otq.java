package p000;

import org.chromium.base.JavaHandlerThread;

public final class otq implements Runnable {
    final /* synthetic */ long f34274a;
    final /* synthetic */ long f34275b;
    final /* synthetic */ JavaHandlerThread f34276c;

    public otq(JavaHandlerThread javaHandlerThread, long j, long j2) {
        this.f34276c = javaHandlerThread;
        this.f34274a = j;
        this.f34275b = j2;
    }

    public void run() {
        JavaHandlerThread.a(this.f34276c, this.f34274a, this.f34275b);
    }
}
