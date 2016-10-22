package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

/* renamed from: foc */
public final class foc extends Thread {
    public Handler a;
    final /* synthetic */ RequestWriter b;
    private final Object c;

    public foc(RequestWriter requestWriter) {
        this.b = requestWriter;
        this.c = new Object();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
        r2 = this;
        super.start();
        r1 = r2.c;
        monitor-enter(r1);
    L_0x0006:
        r0 = r2.a;	 Catch:{ all -> 0x0014 }
        if (r0 != 0) goto L_0x0012;
    L_0x000a:
        r0 = r2.c;	 Catch:{ InterruptedException -> 0x0010 }
        r0.wait();	 Catch:{ InterruptedException -> 0x0010 }
        goto L_0x0006;
    L_0x0010:
        r0 = move-exception;
        goto L_0x0006;
    L_0x0012:
        monitor-exit(r1);	 Catch:{ all -> 0x0014 }
        return;
    L_0x0014:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0014 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: foc.start():void");
    }

    public void run() {
        Looper.prepare();
        Handler fod = new fod(this.b);
        synchronized (this.c) {
            this.a = fod;
            this.c.notify();
        }
        Looper.loop();
    }
}
