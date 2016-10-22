package defpackage;

import java.io.Serializable;

/* renamed from: mkw */
final class mkw implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    mkw(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return mks.a(this.a);
    }
}
