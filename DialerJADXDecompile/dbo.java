import java.util.ListIterator;

/* compiled from: PG */
public abstract class dbo extends dbn implements ListIterator {
    protected dbo() {
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
