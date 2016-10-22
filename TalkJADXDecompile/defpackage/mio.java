package defpackage;

import java.util.ListIterator;

/* renamed from: mio */
final class mio extends mim implements ListIterator<V> {
    final /* synthetic */ min d;

    mio(min min) {
        this.d = min;
        super(min);
    }

    public mio(min min, int i) {
        this.d = min;
        super(min, min.g().listIterator(i));
    }

    public void add(V v) {
        boolean isEmpty = this.d.isEmpty();
        ((ListIterator) b()).add(v);
        this.f.b = r2.b + 1;
        if (isEmpty) {
            this.d.d();
        }
    }

    public boolean hasPrevious() {
        return ((ListIterator) b()).hasPrevious();
    }

    public V previous() {
        return ((ListIterator) b()).previous();
    }

    public int nextIndex() {
        return ((ListIterator) b()).nextIndex();
    }

    public int previousIndex() {
        return ((ListIterator) b()).previousIndex();
    }

    public void set(V v) {
        ((ListIterator) b()).set(v);
    }
}
