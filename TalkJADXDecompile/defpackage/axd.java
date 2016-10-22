package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: axd */
final class axd implements any<Long> {
    private final ByteBuffer a;

    axd() {
        this.a = ByteBuffer.allocate(8);
    }

    private void a(byte[] bArr, Long l, MessageDigest messageDigest) {
        messageDigest.update(bArr);
        synchronized (this.a) {
            this.a.position(0);
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }
}
