package defpackage;

/* renamed from: bnn */
final class bnn implements Runnable {
    private /* synthetic */ bop a;
    private /* synthetic */ bni b;

    bnn(bni bni, bop bop) {
        this.b = bni;
        this.a = bop;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
