package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: cyp */
final class cyp implements cyn, Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;

    cyp(Object obj) {
        this.a = obj;
    }

    public final boolean a(Object obj) {
        return this.a.equals(obj);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cyp)) {
            return false;
        }
        return this.a.equals(((cyp) obj).a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 20).append("Predicates.equalTo(").append(valueOf).append(")").toString();
    }
}
