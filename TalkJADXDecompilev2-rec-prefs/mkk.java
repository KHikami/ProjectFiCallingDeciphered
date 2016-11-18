package p000;

import java.io.Serializable;

final class mkk<K> implements Serializable {
    private static final long serialVersionUID = 0;
    final mjx<K, ?> f27852a;

    mkk(mjx<K, ?> mjx_K__) {
        this.f27852a = mjx_K__;
    }

    Object readResolve() {
        return this.f27852a.mo3874g();
    }
}
