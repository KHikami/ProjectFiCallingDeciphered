package p000;

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class kdi extends InputStream {
    private final ByteBuffer f21411a;
    private int f21412b = 0;

    public kdi(ByteBuffer byteBuffer) {
        this.f21411a = byteBuffer;
    }

    public int read() {
        if (this.f21411a.hasRemaining()) {
            return this.f21411a.get() & 255;
        }
        return -1;
    }

    public void mark(int i) {
        this.f21412b = this.f21411a.position();
    }

    public boolean markSupported() {
        return true;
    }

    public int available() {
        return this.f21411a.remaining();
    }

    public long skip(long j) {
        int min = (int) Math.min(j, (long) this.f21411a.remaining());
        this.f21411a.position(this.f21411a.position() + min);
        return (long) min;
    }

    public void reset() {
        this.f21411a.position(this.f21412b);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.f21411a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(this.f21411a.remaining(), i2);
        this.f21411a.get(bArr, i, min);
        return min;
    }
}
