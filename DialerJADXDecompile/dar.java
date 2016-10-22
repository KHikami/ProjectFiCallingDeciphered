import java.io.Serializable;

/* compiled from: PG */
final class dar implements Serializable {
    private static final long serialVersionUID = 0;
    private Object[] a;

    dar(Object[] objArr) {
        this.a = objArr;
    }

    final Object readResolve() {
        return dao.a(this.a);
    }
}
