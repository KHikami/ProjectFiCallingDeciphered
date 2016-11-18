package p000;

import java.util.AbstractList;
import java.util.List;

public final class nwz<F, T> extends AbstractList<T> {
    private final List<F> f31203a;
    private final nxa<F, T> f31204b;

    public T get(int i) {
        return this.f31204b.mo4246a(this.f31203a.get(i));
    }

    public int size() {
        return this.f31203a.size();
    }
}
