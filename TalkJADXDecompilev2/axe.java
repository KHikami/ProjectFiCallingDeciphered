package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class axe implements any<Integer> {
    private final ByteBuffer a = ByteBuffer.allocate(4);

    axe() {
    }

    private void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
        }
    }
}