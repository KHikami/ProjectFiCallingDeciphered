package p000;

import java.util.NoSuchElementException;

final class mlk extends mnz<Object> {
    mlk() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public boolean hasPrevious() {
        return false;
    }

    public Object previous() {
        throw new NoSuchElementException();
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }
}
