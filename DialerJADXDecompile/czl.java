import java.io.Serializable;

/* compiled from: PG */
final class czl implements Serializable {
    private static final long serialVersionUID = 0;
    private czp a;

    czl(czp czp) {
        this.a = czp;
    }

    final Object readResolve() {
        return this.a.c();
    }
}
