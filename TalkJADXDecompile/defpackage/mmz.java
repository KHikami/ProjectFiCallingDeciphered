package defpackage;

import java.io.Serializable;

/* renamed from: mmz */
final class mmz<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    private final mjh<K, V> a;

    mmz(mjh<K, V> mjh_K__V) {
        this.a = mjh_K__V;
    }

    Object readResolve() {
        return this.a.a();
    }
}
