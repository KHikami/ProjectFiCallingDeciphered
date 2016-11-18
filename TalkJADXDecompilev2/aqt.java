package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class aqt implements anv {
    private static final ban<Class<?>, byte[]> b = new ban(50);
    private final anv c;
    private final anv d;
    private final int e;
    private final int f;
    private final Class<?> g;
    private final anz h;
    private final aoc<?> i;

    public aqt(anv anv, anv anv2, int i, int i2, aoc<?> aoc_, Class<?> cls, anz anz) {
        this.c = anv;
        this.d = anv2;
        this.e = i;
        this.f = i2;
        this.i = aoc_;
        this.g = cls;
        this.h = anz;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof aqt)) {
            return false;
        }
        aqt aqt = (aqt) obj;
        if (this.f == aqt.f && this.e == aqt.e && baq.a(this.i, aqt.i) && this.g.equals(aqt.g) && this.c.equals(aqt.c) && this.d.equals(aqt.d) && this.h.equals(aqt.h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        if (this.i != null) {
            hashCode = (hashCode * 31) + this.i.hashCode();
        }
        return (((hashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public void a(MessageDigest messageDigest) {
        byte[] array = ByteBuffer.allocate(8).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(array);
        if (this.i != null) {
            this.i.a(messageDigest);
        }
        this.h.a(messageDigest);
        array = (byte[]) b.b(this.g);
        if (array == null) {
            array = this.g.getName().getBytes(a);
            b.b(this.g, array);
        }
        messageDigest.update(array);
    }

    public String toString() {
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        int i = this.e;
        int i2 = this.f;
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.h);
        return new StringBuilder(((((String.valueOf(valueOf).length() + 131) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("ResourceCacheKey{sourceKey=").append(valueOf).append(", signature=").append(valueOf2).append(", width=").append(i).append(", height=").append(i2).append(", decodedResourceClass=").append(valueOf3).append(", transformation='").append(valueOf4).append("', options=").append(valueOf5).append("}").toString();
    }
}
