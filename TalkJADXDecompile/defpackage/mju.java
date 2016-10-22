package defpackage;

import java.io.Serializable;

/* renamed from: mju */
final class mju implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    mju(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return mjq.a(this.a);
    }
}
