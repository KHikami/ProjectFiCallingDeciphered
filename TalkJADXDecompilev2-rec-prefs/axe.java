package p000;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class axe implements any<Integer> {
    private final ByteBuffer f2475a = ByteBuffer.allocate(4);

    axe() {
    }

    private void m4256a(byte[] bArr, Integer num, MessageDigest messageDigest) {
        if (num != null) {
            messageDigest.update(bArr);
            synchronized (this.f2475a) {
                this.f2475a.position(0);
                messageDigest.update(this.f2475a.putInt(num.intValue()).array());
            }
        }
    }
}
