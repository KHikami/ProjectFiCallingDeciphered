package defpackage;

/* renamed from: bnk */
final class bnk implements Runnable {
    private /* synthetic */ boolean a;
    private /* synthetic */ bni b;

    bnk(bni bni, boolean z) {
        this.b = bni;
        this.a = z;
    }

    public final void run() {
        this.b.a.l();
    }
}
