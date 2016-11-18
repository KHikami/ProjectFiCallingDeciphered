package defpackage;

import java.security.MessageDigest;

final class apc implements anv {
    private final anv b;
    private final anv c;

    public apc(anv anv, anv anv2) {
        this.b = anv;
        this.c = anv2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof apc)) {
            return false;
        }
        apc apc = (apc) obj;
        if (this.b.equals(apc.b) && this.c.equals(apc.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("DataCacheKey{sourceKey=").append(valueOf).append(", signature=").append(valueOf2).append("}").toString();
    }

    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }
}
