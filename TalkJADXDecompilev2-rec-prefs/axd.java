package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class axd implements any<Long> {
    private final ByteBuffer f2474a = ByteBuffer.allocate(8);

    axd() {
    }

    private void m4254a(byte[] bArr, Long l, MessageDigest messageDigest) {
        messageDigest.update(bArr);
        synchronized (this.f2474a) {
            this.f2474a.position(0);
            messageDigest.update(this.f2474a.putLong(l.longValue()).array());
        }
    }
}
