import java.io.Serializable;

/* compiled from: PG */
final class dan implements Serializable {
    private static final long serialVersionUID = 0;
    private czy a;

    dan(czy czy) {
        this.a = czy;
    }

    final Object readResolve() {
        return this.a.b();
    }
}
