package p000;

import java.io.Serializable;

final class mjg implements Serializable {
    private static final long serialVersionUID = 0;
    final mjk<?> f27820a;

    mjg(mjk<?> mjk_) {
        this.f27820a = mjk_;
    }

    Object readResolve() {
        return this.f27820a.mo3807f();
    }
}
