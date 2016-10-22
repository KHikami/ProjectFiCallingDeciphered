import java.util.Map.Entry;

/* compiled from: PG */
final class czz extends dbn {
    private /* synthetic */ dbn a;

    czz(czy czy, dbn dbn) {
        this.a = dbn;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return ((Entry) this.a.next()).getKey();
    }
}
