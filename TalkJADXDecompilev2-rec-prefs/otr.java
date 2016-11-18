package p000;

import org.chromium.base.JavaHandlerThread;

public final class otr implements Runnable {
    final /* synthetic */ long f34277a;
    final /* synthetic */ long f34278b;
    final /* synthetic */ boolean f34279c;
    final /* synthetic */ JavaHandlerThread f34280d;

    public otr(JavaHandlerThread javaHandlerThread, long j, long j2, boolean z) {
        this.f34280d = javaHandlerThread;
        this.f34277a = j;
        this.f34278b = j2;
        this.f34279c = z;
    }

    public void run() {
        JavaHandlerThread.b(this.f34280d, this.f34277a, this.f34278b);
        if (!this.f34279c) {
            this.f34280d.a.quit();
        }
    }
}
