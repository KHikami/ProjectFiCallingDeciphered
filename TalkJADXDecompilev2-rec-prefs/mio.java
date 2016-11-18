package p000;

import java.util.ListIterator;

final class mio extends mim implements ListIterator<V> {
    final /* synthetic */ min f27797d;

    mio(min min) {
        this.f27797d = min;
        super(min);
    }

    public mio(min min, int i) {
        this.f27797d = min;
        super(min, min.m32206g().listIterator(i));
    }

    public void add(V v) {
        boolean isEmpty = this.f27797d.isEmpty();
        ((ListIterator) m32213b()).add(v);
        this.f27797d.f27789g.f27769b = this.f27797d.f27789g.f27769b + 1;
        if (isEmpty) {
            this.f27797d.m32203d();
        }
    }

    public boolean hasPrevious() {
        return ((ListIterator) m32213b()).hasPrevious();
    }

    public V previous() {
        return ((ListIterator) m32213b()).previous();
    }

    public int nextIndex() {
        return ((ListIterator) m32213b()).nextIndex();
    }

    public int previousIndex() {
        return ((ListIterator) m32213b()).previousIndex();
    }

    public void set(V v) {
        ((ListIterator) m32213b()).set(v);
    }
}
