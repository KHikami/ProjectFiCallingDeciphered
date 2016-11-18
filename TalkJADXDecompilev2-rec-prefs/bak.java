package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class bak extends FilterInputStream {
    private final long f2730a;
    private int f2731b;

    public bak(InputStream inputStream, long j) {
        super(inputStream);
        this.f2730a = j;
    }

    public synchronized int available() {
        return (int) Math.max(this.f2730a - ((long) this.f2731b), (long) this.in.available());
    }

    public synchronized int read() {
        return m4669a(super.read());
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return m4669a(super.read(bArr, i, i2));
    }

    private int m4669a(int i) {
        if (i >= 0) {
            this.f2731b += i;
        } else if (this.f2730a - ((long) this.f2731b) > 0) {
            long j = this.f2730a;
            throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.f2731b);
        }
        return i;
    }
}
