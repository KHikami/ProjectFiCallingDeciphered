package p000;

import java.util.HashMap;

public final class ojh {
    public static final ojh f33081b = new ojh();
    final HashMap<ojj<?>, Object> f33082a = new HashMap();

    ojh() {
    }

    public <T> T m38561a(ojj<T> ojj_T) {
        return this.f33082a.get(ojj_T);
    }

    public static oji newBuilder() {
        return new oji();
    }

    public String toString() {
        return this.f33082a.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mez.b(this.f33082a, ((ojh) obj).f33082a);
    }

    public int hashCode() {
        return this.f33082a.hashCode();
    }
}
