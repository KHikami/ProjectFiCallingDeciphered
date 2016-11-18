package defpackage;

import java.security.MessageDigest;
import java.util.Map.Entry;

public final class anz implements anv {
    private final ky<anw<?>, Object> b = new ky();

    public void a(anz anz) {
        this.b.a(anz.b);
    }

    public <T> anz a(anw<T> anw_T, T t) {
        this.b.put(anw_T, t);
        return this;
    }

    public <T> T a(anw<T> anw_T) {
        return this.b.containsKey(anw_T) ? this.b.get(anw_T) : anw_T.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof anz)) {
            return false;
        }
        return this.b.equals(((anz) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        for (Entry entry : this.b.entrySet()) {
            ((anw) entry.getKey()).a(entry.getValue(), messageDigest);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 16).append("Options{values=").append(valueOf).append("}").toString();
    }
}
