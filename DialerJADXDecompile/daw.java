import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
final class daw implements Iterator {
    daw() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        buf.e(false);
    }
}
