package defpackage;

import org.chromium.base.JavaHandlerThread;

public final class otr implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ boolean c;
    final /* synthetic */ JavaHandlerThread d;

    public otr(JavaHandlerThread javaHandlerThread, long j, long j2, boolean z) {
        this.d = javaHandlerThread;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public void run() {
        JavaHandlerThread.b(this.d, this.a, this.b);
        if (!this.c) {
            this.d.a.quit();
        }
    }
}
