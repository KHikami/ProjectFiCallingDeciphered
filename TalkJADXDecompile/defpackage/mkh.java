package defpackage;

import java.io.Serializable;

/* renamed from: mkh */
final class mkh<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final mjx<K, V> a;

    mkh(mjx<K, V> mjx_K__V) {
        this.a = mjx_K__V;
    }

    Object readResolve() {
        return this.a.e();
    }
}
