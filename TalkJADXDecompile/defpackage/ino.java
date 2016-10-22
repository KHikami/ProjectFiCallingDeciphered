package defpackage;

/* renamed from: ino */
final class ino implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ inj b;

    ino(inj inj, int i) {
        this.b = inj;
        this.a = i;
    }

    public void run() {
        this.b.f = this.a;
        this.b.l();
        if (this.b.b != null) {
            this.b.b.d(this.b.f);
        }
    }
}
