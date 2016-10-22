package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: dat */
final class dat extends dbo {
    dat() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final boolean hasPrevious() {
        return false;
    }

    public final Object previous() {
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return 0;
    }

    public final int previousIndex() {
        return -1;
    }
}
