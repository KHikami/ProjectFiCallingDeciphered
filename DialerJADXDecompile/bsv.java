import java.lang.ref.WeakReference;

final class bsv extends btd {
    private WeakReference a;

    bsv(bsq bsq) {
        this.a = new WeakReference(bsq);
    }

    public final void a() {
        bsq bsq = (bsq) this.a.get();
        if (bsq != null) {
            bsq.b(bsq);
        }
    }
}
