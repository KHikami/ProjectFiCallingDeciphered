final class ioh implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ iny b;

    ioh(iny iny, boolean z) {
        this.b = iny;
        this.a = z;
    }

    public void run() {
        if (this.b.h != null) {
            this.b.h.a(this.a);
        }
        this.b.m();
    }
}
