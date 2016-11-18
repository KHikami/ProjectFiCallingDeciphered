package defpackage;

import org.chromium.base.JavaHandlerThread;

public final class otq implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ long b;
    final /* synthetic */ JavaHandlerThread c;

    public otq(JavaHandlerThread javaHandlerThread, long j, long j2) {
        this.c = javaHandlerThread;
        this.a = j;
        this.b = j2;
    }

    public void run() {
        JavaHandlerThread.a(this.c, this.a, this.b);
    }
}
