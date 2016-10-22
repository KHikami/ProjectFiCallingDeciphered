package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: czw */
final class czw implements Serializable {
    private static final long serialVersionUID = 0;
    private Object[] a;

    czw(Object[] objArr) {
        this.a = objArr;
    }

    final Object readResolve() {
        return czt.a(this.a);
    }
}
