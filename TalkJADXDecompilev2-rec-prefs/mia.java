package p000;

import java.util.NoSuchElementException;

abstract class mia<E> extends mnz<E> {
    private final int f27764a;
    private int f27765b;

    protected abstract E mo3853a(int i);

    protected mia(int i, int i2) {
        bm.m6146b(i2, i);
        this.f27764a = i;
        this.f27765b = i2;
    }

    public final boolean hasNext() {
        return this.f27765b < this.f27764a;
    }

    public final E next() {
        if (hasNext()) {
            int i = this.f27765b;
            this.f27765b = i + 1;
            return mo3853a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f27765b;
    }

    public final boolean hasPrevious() {
        return this.f27765b > 0;
    }

    public final E previous() {
        if (hasPrevious()) {
            int i = this.f27765b - 1;
            this.f27765b = i;
            return mo3853a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f27765b - 1;
    }
}
