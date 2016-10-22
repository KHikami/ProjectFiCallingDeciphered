package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: baf */
public final class baf implements anv {
    private final String b;
    private final long c;
    private final int d;

    public baf(String str, long j, int i) {
        this.b = str;
        this.c = j;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        baf baf = (baf) obj;
        if (this.c != baf.c) {
            return false;
        }
        if (this.d != baf.d) {
            return false;
        }
        if (baq.a(this.b, baf.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.b != null ? this.b.hashCode() : 0) * 31) + ((int) (this.c ^ (this.c >>> 32)))) * 31) + this.d;
    }

    public void a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.c).putInt(this.d).array());
        messageDigest.update(this.b.getBytes(a));
    }
}
