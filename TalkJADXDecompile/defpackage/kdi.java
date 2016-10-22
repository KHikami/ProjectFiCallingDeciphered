package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: kdi */
public final class kdi extends InputStream {
    private final ByteBuffer a;
    private int b;

    public kdi(ByteBuffer byteBuffer) {
        this.b = 0;
        this.a = byteBuffer;
    }

    public int read() {
        if (this.a.hasRemaining()) {
            return this.a.get() & 255;
        }
        return -1;
    }

    public void mark(int i) {
        this.b = this.a.position();
    }

    public boolean markSupported() {
        return true;
    }

    public int available() {
        return this.a.remaining();
    }

    public long skip(long j) {
        int min = (int) Math.min(j, (long) this.a.remaining());
        this.a.position(this.a.position() + min);
        return (long) min;
    }

    public void reset() {
        this.a.position(this.b);
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(this.a.remaining(), i2);
        this.a.get(bArr, i, min);
        return min;
    }
}
