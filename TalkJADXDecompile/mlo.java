import java.util.Iterator;

final class mlo extends mny<T> {
    final /* synthetic */ Iterator a;

    mlo(Iterator it) {
        this.a = it;
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public T next() {
        return this.a.next();
    }
}
