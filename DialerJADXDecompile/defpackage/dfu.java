package defpackage;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: dfu */
final class dfu implements Runnable {
    private /* synthetic */ TimeoutException a;
    private /* synthetic */ dft b;

    dfu(dft dft, TimeoutException timeoutException) {
        this.b = dft;
        this.a = timeoutException;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
