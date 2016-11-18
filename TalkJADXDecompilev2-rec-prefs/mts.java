package p000;

final class mts extends mrz<Void> implements Runnable {
    private final Runnable f28296a;

    public mts(Runnable runnable) {
        this.f28296a = (Runnable) bm.m6122a((Object) runnable);
    }

    public void run() {
        try {
            this.f28296a.run();
        } catch (Throwable th) {
            mo3941a(th);
            RuntimeException c = mfw.m32014c(th);
        }
    }
}
