package p000;

import java.io.Serializable;

final class mkh<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final mjx<K, V> f27848a;

    mkh(mjx<K, V> mjx_K__V) {
        this.f27848a = mjx_K__V;
    }

    Object readResolve() {
        return this.f27848a.mo3873e();
    }
}
