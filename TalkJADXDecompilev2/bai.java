package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class bai extends InputStream {
    private final ByteBuffer a;
    private int b = -1;

    public bai(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    public int available() {
        return this.a.remaining();
    }

    public int read() {
        if (this.a.hasRemaining()) {
            return this.a.get();
        }
        return -1;
    }

    public synchronized void mark(int i) {
        this.b = this.a.position();
    }

    public boolean markSupported() {
        return true;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.a.get(bArr, i, min);
        return min;
    }

    public synchronized void reset() {
        if (this.b == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.a.position(this.b);
    }

    public long skip(long j) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) available());
        this.a.position((int) (((long) this.a.position()) + min));
        return min;
    }
}
