package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

public final class baf implements anv {
    private final String f2720b;
    private final long f2721c;
    private final int f2722d;

    public baf(String str, long j, int i) {
        this.f2720b = str;
        this.f2721c = j;
        this.f2722d = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        baf baf = (baf) obj;
        if (this.f2721c != baf.f2721c) {
            return false;
        }
        if (this.f2722d != baf.f2722d) {
            return false;
        }
        if (baq.m4687a(this.f2720b, baf.f2720b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f2720b != null ? this.f2720b.hashCode() : 0) * 31) + ((int) (this.f2721c ^ (this.f2721c >>> 32)))) * 31) + this.f2722d;
    }

    public void mo308a(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(this.f2721c).putInt(this.f2722d).array());
        messageDigest.update(this.f2720b.getBytes(a));
    }
}
