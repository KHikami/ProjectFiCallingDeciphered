package defpackage;

final class bbb extends bba {
    private volatile boolean a;

    public void b() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }

    public void a(boolean z) {
        this.a = z;
    }

    bbb() {
    }
}
