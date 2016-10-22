import java.util.Map.Entry;

/* compiled from: PG */
final class dal extends dbn {
    private dbn a;
    private /* synthetic */ dak b;

    dal(dak dak) {
        this.b = dak;
        this.a = this.b.a.c().b();
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final Object next() {
        return ((Entry) this.a.next()).getValue();
    }
}
