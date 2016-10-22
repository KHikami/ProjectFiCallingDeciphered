import java.io.Serializable;

/* compiled from: PG */
public final class cyz implements cwm, Serializable {
    private static final long serialVersionUID = 0;
    private Object a;

    public cyz(Object obj) {
        this.a = obj;
    }

    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyz)) {
            return false;
        }
        return cob.a(this.a, ((cyz) obj).a);
    }

    public final int hashCode() {
        return cob.a(this.a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 22).append("Suppliers.ofInstance(").append(valueOf).append(")").toString();
    }
}
