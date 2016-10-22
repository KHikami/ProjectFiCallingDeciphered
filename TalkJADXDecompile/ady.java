import android.view.ViewGroup;

public abstract class ady<VH extends aer> {
    public boolean a;
    private final adz b;

    public abstract int a();

    public abstract VH a(ViewGroup viewGroup, int i);

    public abstract void a(VH vh, int i);

    public ady() {
        this.b = new adz();
        this.a = false;
    }

    public void b(aer aer, int i) {
        a(aer, i);
    }

    public int a(int i) {
        return 0;
    }

    public long b(int i) {
        return -1;
    }

    public void a(VH vh) {
    }

    public void b(VH vh) {
    }

    public void a(aea aea) {
        this.b.registerObserver(aea);
    }

    public void b(aea aea) {
        this.b.unregisterObserver(aea);
    }

    public final void a_(int i) {
        this.b.a(i, 1);
    }

    public final void a(int i, Object obj) {
        this.b.a(i, 1, obj);
    }

    public final void a(int i, int i2) {
        this.b.a(i, i2);
    }

    public final void d(int i) {
        this.b.b(i, 1);
    }

    public final void b(int i, int i2) {
        this.b.d(i, i2);
    }

    public final void c(int i, int i2) {
        this.b.b(i, i2);
    }

    public final void e(int i) {
        this.b.c(i, 1);
    }

    public final void d(int i, int i2) {
        this.b.c(i, i2);
    }

    public void a(boolean z) {
        if (this.b.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.a = z;
    }
}
