package defpackage;

import java.util.HashMap;

public final class ojh {
    public static final ojh b = new ojh();
    final HashMap<ojj<?>, Object> a = new HashMap();

    ojh() {
    }

    public <T> T a(ojj<T> ojj_T) {
        return this.a.get(ojj_T);
    }

    public static oji newBuilder() {
        return new oji();
    }

    public String toString() {
        return this.a.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mez.b(this.a, ((ojh) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
