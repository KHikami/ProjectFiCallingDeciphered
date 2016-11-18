package defpackage;

import java.security.MessageDigest;

public final class bag implements anv {
    private final Object b;

    public bag(Object obj) {
        this.b = gwb.I(obj);
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        return new StringBuilder(String.valueOf(valueOf).length() + 18).append("ObjectKey{object=").append(valueOf).append("}").toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof bag)) {
            return false;
        }
        return this.b.equals(((bag) obj).b);
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(a));
    }
}
