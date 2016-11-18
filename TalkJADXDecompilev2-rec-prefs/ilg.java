package p000;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

final class ilg extends Thread {
    Handler f17978a;
    volatile boolean f17979b;
    final /* synthetic */ ild f17980c;
    private final CountDownLatch f17981d = new CountDownLatch(1);
    private ird f17982e;

    ilg(ild ild) {
        this.f17980c = ild;
        super("GLThread.vclib");
    }

    Handler m22237a() {
        try {
            this.f17981d.await();
        } catch (InterruptedException e) {
            itx.m23277a(5, "vclib", "Failed to initialize gl thread handler before getting interrupted");
        }
        return this.f17978a;
    }

    boolean m22238b() {
        return this.f17982e.mo3381b() == 0;
    }

    void m22239c() {
        this.f17978a.sendEmptyMessage(2);
    }

    boolean m22240d() {
        return this.f17979b;
    }

    public void run() {
        this.f17980c.f17972b.mo3378a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(gwb.av());
        this.f17982e = this.f17980c.f17972b.mo3377a(surfaceTexture);
        Looper.prepare();
        this.f17978a = new ilh(this);
        try {
            if (!m22238b()) {
                gwb.m1457V("eglMakeCurrent failed");
            }
            this.f17981d.countDown();
            Looper.loop();
            for (ilj a : this.f17980c.f17971a.values()) {
                a.m22242a();
            }
            this.f17980c.f17971a.clear();
            this.f17982e.mo3380a();
            surfaceTexture.release();
            this.f17980c.f17972b.mo3379b();
        } catch (Throwable th) {
            Throwable th2 = th;
            for (ilj a2 : this.f17980c.f17971a.values()) {
                a2.m22242a();
            }
            this.f17980c.f17971a.clear();
            this.f17982e.mo3380a();
            surfaceTexture.release();
            this.f17980c.f17972b.mo3379b();
        }
    }
}
