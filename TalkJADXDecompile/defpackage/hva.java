package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: hva */
public final class hva<T> implements Iterable<T>, Iterator<T> {
    public boolean hasNext() {
        return false;
    }

    public Iterator<T> iterator() {
        return this;
    }

    public T next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
