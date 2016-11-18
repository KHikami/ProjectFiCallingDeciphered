package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;

final class jiz extends InputStream {
    private ByteBuffer f20167a;

    public jiz(ByteBuffer byteBuffer) {
        this.f20167a = byteBuffer;
    }

    public int read() {
        if (this.f20167a.hasRemaining()) {
            return this.f20167a.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.f20167a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.f20167a.remaining());
        this.f20167a.get(bArr, i, min);
        return min;
    }
}
