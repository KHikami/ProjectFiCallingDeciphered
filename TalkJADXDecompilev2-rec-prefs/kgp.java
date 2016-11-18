package p000;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class kgp implements Iterator<T> {
    final int f21656a = Array.getLength(this.f21658c.f21655a);
    int f21657b = 0;
    final /* synthetic */ kgo f21658c;

    kgp(kgo kgo) {
        this.f21658c = kgo;
    }

    public boolean hasNext() {
        return this.f21657b < this.f21656a;
    }

    public T next() {
        if (hasNext()) {
            Object obj = this.f21658c.f21655a;
            int i = this.f21657b;
            this.f21657b = i + 1;
            return Array.get(obj, i);
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
