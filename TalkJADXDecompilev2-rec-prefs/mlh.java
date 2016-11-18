package p000;

import java.io.Serializable;
import java.util.Comparator;

final class mlh<E> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super E> f27880a;
    final Object[] f27881b;

    public mlh(Comparator<? super E> comparator, Object[] objArr) {
        this.f27880a = comparator;
        this.f27881b = objArr;
    }

    Object readResolve() {
        return new mlg(this.f27880a).m32456c(this.f27881b).m32454b();
    }
}
