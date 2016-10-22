package defpackage;

/* renamed from: mts */
final class mts extends mrz<Void> implements Runnable {
    private final Runnable a;

    public mts(Runnable runnable) {
        this.a = (Runnable) bm.a((Object) runnable);
    }

    public void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            a(th);
            RuntimeException c = mfw.c(th);
        }
    }
}
