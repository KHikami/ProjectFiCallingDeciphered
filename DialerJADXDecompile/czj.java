import java.util.Iterator;

/* compiled from: PG */
public class czj implements Iterable {
    final /* synthetic */ Iterable a;
    final /* synthetic */ cyh b;
    private final Iterable c;

    protected czj() {
        this.c = this;
    }

    public String toString() {
        return buf.a(this.c);
    }

    public czj(Iterable iterable, cyh cyh) {
        this.a = iterable;
        this.b = cyh;
        this();
    }

    public Iterator iterator() {
        return das.a(this.a.iterator(), this.b);
    }
}
