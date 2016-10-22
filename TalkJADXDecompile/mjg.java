import java.io.Serializable;

final class mjg implements Serializable {
    private static final long serialVersionUID = 0;
    final mjk<?> a;

    mjg(mjk<?> mjk_) {
        this.a = mjk_;
    }

    Object readResolve() {
        return this.a.f();
    }
}
