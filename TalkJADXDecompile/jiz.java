import java.io.InputStream;
import java.nio.ByteBuffer;

final class jiz extends InputStream {
    private ByteBuffer a;

    public jiz(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public int read() {
        if (this.a.hasRemaining()) {
            return this.a.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, this.a.remaining());
        this.a.get(bArr, i, min);
        return min;
    }
}
