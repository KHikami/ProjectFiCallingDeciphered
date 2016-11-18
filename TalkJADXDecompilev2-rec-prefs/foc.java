package p000;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;

public final class foc extends Thread {
    public Handler f13556a;
    final /* synthetic */ RequestWriter f13557b;
    private final Object f13558c = new Object();

    public foc(RequestWriter requestWriter) {
        this.f13557b = requestWriter;
    }

    public void start() {
        super.start();
        synchronized (this.f13558c) {
            while (this.f13556a == null) {
                try {
                    this.f13558c.wait();
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public void run() {
        Looper.prepare();
        Handler fod = new fod(this.f13557b);
        synchronized (this.f13558c) {
            this.f13556a = fod;
            this.f13558c.notify();
        }
        Looper.loop();
    }
}
