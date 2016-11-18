package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class bak extends FilterInputStream {
    private final long a;
    private int b;

    public bak(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public synchronized int available() {
        return (int) Math.max(this.a - ((long) this.b), (long) this.in.available());
    }

    public synchronized int read() {
        return a(super.read());
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public synchronized int read(byte[] bArr, int i, int i2) {
        return a(super.read(bArr, i, i2));
    }

    private int a(int i) {
        if (i >= 0) {
            this.b += i;
        } else if (this.a - ((long) this.b) > 0) {
            long j = this.a;
            throw new IOException("Failed to read all expected data, expected: " + j + ", but read: " + this.b);
        }
        return i;
    }
}
