package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: bma */
final class bma extends Thread {
    CountDownLatch a;
    boolean b;
    private WeakReference c;
    private long d;

    public bma(bly bly, long j) {
        this.c = new WeakReference(bly);
        this.d = j;
        this.a = new CountDownLatch(1);
        this.b = false;
        start();
    }

    private final void a() {
        bly bly = (bly) this.c.get();
        if (bly != null) {
            bly.a();
            this.b = true;
        }
    }

    public final void run() {
        try {
            if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                a();
            }
        } catch (InterruptedException e) {
            a();
        }
    }
}
