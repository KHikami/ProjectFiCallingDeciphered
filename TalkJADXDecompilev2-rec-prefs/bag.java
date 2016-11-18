package p000;

import java.security.MessageDigest;

public final class bag implements anv {
    private final Object f2723b;

    public bag(Object obj) {
        this.f2723b = gwb.m1404I(obj);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2723b);
        return new StringBuilder(String.valueOf(valueOf).length() + 18).append("ObjectKey{object=").append(valueOf).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bag)) {
            return false;
        }
        return this.f2723b.equals(((bag) obj).f2723b);
    }

    public int hashCode() {
        return this.f2723b.hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(this.f2723b.toString().getBytes(a));
    }
}
