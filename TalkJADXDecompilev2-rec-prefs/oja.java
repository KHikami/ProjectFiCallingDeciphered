package p000;

import java.util.Collection;
import java.util.List;

public final class oja<T> {
    private final List<onc<T>> f33057a;
    private final List<onc<Collection<T>>> f33058b;

    oja(int i, int i2) {
        this.f33057a = gwb.H(i);
        this.f33058b = gwb.H(i2);
    }

    public oja<T> m38531a(onc<? extends T> onc__extends_T) {
        this.f33057a.add(onc__extends_T);
        return this;
    }

    public oiy<T> m38530a() {
        return new oiy(this.f33057a, this.f33058b);
    }
}
