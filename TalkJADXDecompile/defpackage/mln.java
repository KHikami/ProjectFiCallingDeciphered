package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: mln */
final class mln implements Iterator<Object> {
    mln() {
    }

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        gwb.c(false);
    }
}
