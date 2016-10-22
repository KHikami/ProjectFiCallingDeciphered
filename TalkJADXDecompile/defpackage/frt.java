package defpackage;

/* renamed from: frt */
final class frt implements Runnable {
    frt() {
    }

    public void run() {
        synchronized (frq.g) {
            if (frq.b.c()) {
                frq.b = null;
            }
        }
    }
}
