package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class nxr implements Iterator<Object> {
    nxr() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
