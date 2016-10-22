package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: mlh */
final class mlh<E> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super E> a;
    final Object[] b;

    public mlh(Comparator<? super E> comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        return new mlg(this.a).c(this.b).b();
    }
}
