package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class kgp implements Iterator<T> {
    final int a = Array.getLength(this.c.a);
    int b = 0;
    final /* synthetic */ kgo c;

    kgp(kgo kgo) {
        this.c = kgo;
    }

    public boolean hasNext() {
        return this.b < this.a;
    }

    public T next() {
        if (hasNext()) {
            Object obj = this.c.a;
            int i = this.b;
            this.b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
