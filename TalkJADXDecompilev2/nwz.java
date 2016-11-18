package defpackage;

import java.util.AbstractList;
import java.util.List;

public final class nwz<F, T> extends AbstractList<T> {
    private final List<F> a;
    private final nxa<F, T> b;

    public T get(int i) {
        return this.b.a(this.a.get(i));
    }

    public int size() {
        return this.a.size();
    }
}
