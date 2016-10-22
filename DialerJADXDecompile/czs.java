import java.io.Serializable;

/* compiled from: PG */
class czs extends cze implements Serializable {
    private static final long serialVersionUID = 0;
    private Object a;
    private Object b;

    czs(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
