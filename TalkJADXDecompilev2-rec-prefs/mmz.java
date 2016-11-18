package p000;

import java.io.Serializable;

final class mmz<K, V> implements Serializable {
    private static final long serialVersionUID = 1;
    private final mjh<K, V> f27926a;

    mmz(mjh<K, V> mjh_K__V) {
        this.f27926a = mjh_K__V;
    }

    Object readResolve() {
        return this.f27926a.mo3889a();
    }
}
