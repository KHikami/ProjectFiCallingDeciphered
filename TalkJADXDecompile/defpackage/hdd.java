package defpackage;

/* renamed from: hdd */
final class hdd implements Runnable {
    final /* synthetic */ hdc a;

    hdd(hdc hdc) {
        this.a = hdc;
    }

    public void run() {
        synchronized (this.a.g) {
            if (this.a.h <= this.a.e.b() && this.a.k != null) {
                this.a.k.d();
                this.a.k = null;
            }
        }
    }
}
