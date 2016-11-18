package p000;

import java.security.MessageDigest;

final class apc implements anv {
    private final anv f1999b;
    private final anv f2000c;

    public apc(anv anv, anv anv2) {
        this.f1999b = anv;
        this.f2000c = anv2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof apc)) {
            return false;
        }
        apc apc = (apc) obj;
        if (this.f1999b.equals(apc.f1999b) && this.f2000c.equals(apc.f2000c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f1999b.hashCode() * 31) + this.f2000c.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f1999b);
        String valueOf2 = String.valueOf(this.f2000c);
        return new StringBuilder((String.valueOf(valueOf).length() + 36) + String.valueOf(valueOf2).length()).append("DataCacheKey{sourceKey=").append(valueOf).append(", signature=").append(valueOf2).append("}").toString();
    }

    public void mo308a(MessageDigest messageDigest) {
        this.f1999b.mo308a(messageDigest);
        this.f2000c.mo308a(messageDigest);
    }
}
