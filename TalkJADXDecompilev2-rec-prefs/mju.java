package p000;

import java.io.Serializable;

final class mju implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] f27839a;

    mju(Object[] objArr) {
        this.f27839a = objArr;
    }

    Object readResolve() {
        return mjq.m32315a(this.f27839a);
    }
}
