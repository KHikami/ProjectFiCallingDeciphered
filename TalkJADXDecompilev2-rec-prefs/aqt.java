package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class aqt implements anv {
    private static final ban<Class<?>, byte[]> f2169b = new ban(50);
    private final anv f2170c;
    private final anv f2171d;
    private final int f2172e;
    private final int f2173f;
    private final Class<?> f2174g;
    private final anz f2175h;
    private final aoc<?> f2176i;

    public aqt(anv anv, anv anv2, int i, int i2, aoc<?> aoc_, Class<?> cls, anz anz) {
        this.f2170c = anv;
        this.f2171d = anv2;
        this.f2172e = i;
        this.f2173f = i2;
        this.f2176i = aoc_;
        this.f2174g = cls;
        this.f2175h = anz;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aqt)) {
            return false;
        }
        aqt aqt = (aqt) obj;
        if (this.f2173f == aqt.f2173f && this.f2172e == aqt.f2172e && baq.m4687a(this.f2176i, aqt.f2176i) && this.f2174g.equals(aqt.f2174g) && this.f2170c.equals(aqt.f2170c) && this.f2171d.equals(aqt.f2171d) && this.f2175h.equals(aqt.f2175h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.f2170c.hashCode() * 31) + this.f2171d.hashCode()) * 31) + this.f2172e) * 31) + this.f2173f;
        if (this.f2176i != null) {
            hashCode = (hashCode * 31) + this.f2176i.hashCode();
        }
        return (((hashCode * 31) + this.f2174g.hashCode()) * 31) + this.f2175h.hashCode();
    }

    public void mo308a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.f2172e).putInt(this.f2173f).array();
        this.f2171d.mo308a(messageDigest);
        this.f2170c.mo308a(messageDigest);
        messageDigest.update(array);
        if (this.f2176i != null) {
            this.f2176i.mo308a(messageDigest);
        }
        this.f2175h.mo308a(messageDigest);
        array = (byte[]) f2169b.m3912b(this.f2174g);
        if (array == null) {
            array = this.f2174g.getName().getBytes(a);
            f2169b.m3913b(this.f2174g, array);
        }
        messageDigest.update(array);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f2170c);
        String valueOf2 = String.valueOf(this.f2171d);
        int i = this.f2172e;
        int i2 = this.f2173f;
        String valueOf3 = String.valueOf(this.f2174g);
        String valueOf4 = String.valueOf(this.f2176i);
        String valueOf5 = String.valueOf(this.f2175h);
        return new StringBuilder(((((String.valueOf(valueOf).length() + 131) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("ResourceCacheKey{sourceKey=").append(valueOf).append(", signature=").append(valueOf2).append(", width=").append(i).append(", height=").append(i2).append(", decodedResourceClass=").append(valueOf3).append(", transformation='").append(valueOf4).append("', options=").append(valueOf5).append("}").toString();
    }
}
