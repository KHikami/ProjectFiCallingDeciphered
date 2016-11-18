package p000;

import android.view.ViewGroup;

public abstract class ady<VH extends aer> {
    public boolean f362a = false;
    private final adz f363b = new adz();

    public abstract int mo736a();

    public abstract VH mo738a(ViewGroup viewGroup, int i);

    public abstract void mo740a(VH vh, int i);

    public void m748b(aer aer, int i) {
        mo740a(aer, i);
    }

    public int mo737a(int i) {
        return 0;
    }

    public long mo741b(int i) {
        return -1;
    }

    public void mo739a(VH vh) {
    }

    public void mo742b(VH vh) {
    }

    public void m740a(aea aea) {
        this.f363b.registerObserver(aea);
    }

    public void m746b(aea aea) {
        this.f363b.unregisterObserver(aea);
    }

    public final void a_(int i) {
        this.f363b.m753a(i, 1);
    }

    public final void m739a(int i, Object obj) {
        this.f363b.m754a(i, 1, obj);
    }

    public final void m738a(int i, int i2) {
        this.f363b.m753a(i, i2);
    }

    public final void m750d(int i) {
        this.f363b.m756b(i, 1);
    }

    public final void m745b(int i, int i2) {
        this.f363b.m758d(i, i2);
    }

    public final void m749c(int i, int i2) {
        this.f363b.m756b(i, i2);
    }

    public final void m752e(int i) {
        this.f363b.m757c(i, 1);
    }

    public final void m751d(int i, int i2) {
        this.f363b.m757c(i, i2);
    }

    public void m743a(boolean z) {
        if (this.f363b.m755a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f362a = z;
    }
}
