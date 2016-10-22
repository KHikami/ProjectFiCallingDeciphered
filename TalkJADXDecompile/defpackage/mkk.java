package defpackage;

import java.io.Serializable;

/* renamed from: mkk */
final class mkk<K> implements Serializable {
    private static final long serialVersionUID = 0;
    final mjx<K, ?> a;

    mkk(mjx<K, ?> mjx_K__) {
        this.a = mjx_K__;
    }

    Object readResolve() {
        return this.a.g();
    }
}
