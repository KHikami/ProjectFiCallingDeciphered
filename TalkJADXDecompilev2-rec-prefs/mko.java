package p000;

import java.io.Serializable;

final class mko<V> implements Serializable {
    private static final long serialVersionUID = 0;
    final mjx<?, V> f27858a;

    mko(mjx<?, V> mjx___V) {
        this.f27858a = mjx___V;
    }

    Object readResolve() {
        return this.f27858a.mo3833c();
    }
}
