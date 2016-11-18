package defpackage;

import java.util.Collection;
import java.util.List;

public final class oja<T> {
    private final List<onc<T>> a;
    private final List<onc<Collection<T>>> b;

    oja(int i, int i2) {
        this.a = gwb.H(i);
        this.b = gwb.H(i2);
    }

    public oja<T> a(onc<? extends T> onc__extends_T) {
        this.a.add(onc__extends_T);
        return this;
    }

    public oiy<T> a() {
        return new oiy(this.a, this.b);
    }
}
