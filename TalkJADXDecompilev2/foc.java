package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class foc extends Thread {
    public Handler a;
    final /* synthetic */ RequestWriter b;
    private final Object c = new Object();

    public foc(RequestWriter requestWriter) {
        this.b = requestWriter;
    }

    public void start() {
        super.start();
        synchronized (this.c) {
            while (this.a == null) {
                try {
                    this.c.wait();
                } catch (InterruptedException e) {
                }
            }
        }
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
