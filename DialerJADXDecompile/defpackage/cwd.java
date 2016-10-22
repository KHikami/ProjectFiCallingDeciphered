package defpackage;

/* compiled from: PG */
/* renamed from: cwd */
final class cwd implements Runnable {
    private /* synthetic */ Runnable a;
    private /* synthetic */ cwc b;

    cwd(cwc cwc, Runnable runnable) {
        this.b = cwc;
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            this.b.a.a(th);
        }
    }
}
