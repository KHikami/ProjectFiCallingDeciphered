package p000;

final class ioh implements Runnable {
    final /* synthetic */ boolean f18579a;
    final /* synthetic */ iny f18580b;

    ioh(iny iny, boolean z) {
        this.f18580b = iny;
        this.f18579a = z;
    }

    public void run() {
        if (this.f18580b.f18214h != null) {
            this.f18580b.f18214h.mo1314a(this.f18579a);
        }
        this.f18580b.m22446m();
    }
}
