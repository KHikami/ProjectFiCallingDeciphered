package defpackage;

import java.io.Serializable;

/* renamed from: mko */
final class mko<V> implements Serializable {
    private static final long serialVersionUID = 0;
    final mjx<?, V> a;

    mko(mjx<?, V> mjx___V) {
        this.a = mjx___V;
    }

    Object readResolve() {
        return this.a.c();
    }
}
