package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;

/* renamed from: ilg */
final class ilg extends Thread {
    Handler a;
    volatile boolean b;
    final /* synthetic */ ild c;
    private final CountDownLatch d;
    private ird e;

    ilg(ild ild) {
        this.c = ild;
        super("GLThread.vclib");
        this.d = new CountDownLatch(1);
    }

    Handler a() {
        try {
            this.d.await();
        } catch (InterruptedException e) {
            itx.a(5, "vclib", "Failed to initialize gl thread handler before getting interrupted");
        }
        return this.a;
    }

    boolean b() {
        return this.e.b() == 0;
    }

    void c() {
        this.a.sendEmptyMessage(2);
    }

    boolean d() {
        return this.b;
    }

    public void run() {
        this.c.b.a();
        SurfaceTexture surfaceTexture = new SurfaceTexture(gwb.av());
        this.e = this.c.b.a(surfaceTexture);
        Looper.prepare();
        this.a = new ilh(this);
        try {
            if (!b()) {
                gwb.V("eglMakeCurrent failed");
            }
            this.d.countDown();
            Looper.loop();
            for (ilj a : this.c.a.values()) {
                a.a();
            }
            this.c.a.clear();
            this.e.a();
            surfaceTexture.release();
            this.c.b.b();
        } catch (Throwable th) {
            Throwable th2 = th;
            for (ilj a2 : this.c.a.values()) {
                a2.a();
            }
            this.c.a.clear();
            this.e.a();
            surfaceTexture.release();
            this.c.b.b();
        }
    }
}
