package p000;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

final class bai extends InputStream {
    private final ByteBuffer f2725a;
    private int f2726b = -1;

    public bai(ByteBuffer byteBuffer) {
        this.f2725a = byteBuffer;
    }

    public int available() {
        return this.f2725a.remaining();
    }

    public int read() {
        if (this.f2725a.hasRemaining()) {
            return this.f2725a.get();
        }
        return -1;
    }

    public synchronized void mark(int i) {
        this.f2726b = this.f2725a.position();
    }

    public boolean markSupported() {
        return true;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (!this.f2725a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.f2725a.get(bArr, i, min);
        return min;
    }

    public synchronized void reset() {
        if (this.f2726b == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f2725a.position(this.f2726b);
    }

    public long skip(long j) {
        if (!this.f2725a.hasRemaining()) {
            return -1;
        }
        long min = Math.min(j, (long) available());
        this.f2725a.position((int) (((long) this.f2725a.position()) + min));
        return min;
    }
}
