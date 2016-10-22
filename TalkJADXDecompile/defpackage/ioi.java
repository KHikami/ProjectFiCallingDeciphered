package defpackage;

/* renamed from: ioi */
final class ioi implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ iny b;

    ioi(iny iny, boolean z) {
        this.b = iny;
        this.a = z;
    }

    public void run() {
        this.b.d.set(this.a);
        this.b.m();
    }
}
