package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: aol */
public final class aol extends FilterInputStream {
    private static final byte[] a;
    private static final int b;
    private static final int c;
    private final byte d;
    private int e;

    static {
        byte[] bArr = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
        a = bArr;
        int length = bArr.length;
        b = length;
        c = length + 2;
    }

    public aol(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.d = (byte) i;
    }

    public boolean markSupported() {
        return false;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public int read() {
        int read;
        if (this.e < 2 || this.e > c) {
            read = super.read();
        } else if (this.e == c) {
            read = this.d;
        } else {
            read = a[this.e - 2] & 255;
        }
        if (read != -1) {
            this.e++;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read;
        if (this.e > c) {
            read = super.read(bArr, i, i2);
        } else if (this.e == c) {
            bArr[i] = this.d;
            read = 1;
        } else if (this.e < 2) {
            read = super.read(bArr, i, 2 - this.e);
        } else {
            read = Math.min(c - this.e, i2);
            System.arraycopy(a, this.e - 2, bArr, i, read);
        }
        if (read > 0) {
            this.e += read;
        }
        return read;
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.e = (int) (((long) this.e) + skip);
        }
        return skip;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
