import java.io.Serializable;

/* compiled from: PG */
final class dag implements Serializable {
    private static final long serialVersionUID = 0;
    private czy a;

    dag(czy czy) {
        this.a = czy;
    }

    final Object readResolve() {
        return this.a.c();
    }
}
