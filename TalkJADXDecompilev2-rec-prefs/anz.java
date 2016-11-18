package p000;

import java.security.MessageDigest;
import java.util.Map.Entry;

public final class anz implements anv {
    private final ky<anw<?>, Object> f1951b = new ky();

    public void m3529a(anz anz) {
        this.f1951b.m28015a(anz.f1951b);
    }

    public <T> anz m3527a(anw<T> anw_T, T t) {
        this.f1951b.put(anw_T, t);
        return this;
    }

    public <T> T m3528a(anw<T> anw_T) {
        return this.f1951b.containsKey(anw_T) ? this.f1951b.get(anw_T) : anw_T.m3523a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof anz)) {
            return false;
        }
        return this.f1951b.equals(((anz) obj).f1951b);
    }

    public int hashCode() {
        return this.f1951b.hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        for (Entry entry : this.f1951b.entrySet()) {
            ((anw) entry.getKey()).m3524a(entry.getValue(), messageDigest);
        }
    }

    public String toString() {
        String valueOf = String.valueOf(this.f1951b);
        return new StringBuilder(String.valueOf(valueOf).length() + 16).append("Options{values=").append(valueOf).append("}").toString();
    }
}
