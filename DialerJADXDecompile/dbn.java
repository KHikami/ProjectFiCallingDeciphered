import java.util.Iterator;

/* compiled from: PG */
public abstract class dbn implements Iterator {
    protected dbn() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
