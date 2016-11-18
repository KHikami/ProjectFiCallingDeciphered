package p000;

import java.io.Serializable;

final class mkw implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] f27866a;

    mkw(Object[] objArr) {
        this.f27866a = objArr;
    }

    Object readResolve() {
        return mks.m32258a(this.f27866a);
    }
}
