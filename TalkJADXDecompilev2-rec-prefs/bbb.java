package p000;

final class bbb extends bba {
    private volatile boolean f2747a;

    public void mo439b() {
        if (this.f2747a) {
            throw new IllegalStateException("Already released");
        }
    }

    public void mo438a(boolean z) {
        this.f2747a = z;
    }

    bbb() {
    }
}
