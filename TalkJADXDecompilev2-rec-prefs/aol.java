package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class aol extends FilterInputStream {
    private static final byte[] f1959a;
    private static final int f1960b;
    private static final int f1961c;
    private final byte f1962d;
    private int f1963e;

    static {
        byte[] bArr = new byte[]{(byte) -1, (byte) -31, (byte) 0, (byte) 28, (byte) 69, (byte) 120, (byte) 105, (byte) 102, (byte) 0, (byte) 0, (byte) 77, (byte) 77, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 0, (byte) 8, (byte) 0, (byte) 1, (byte) 1, (byte) 18, (byte) 0, (byte) 2, (byte) 0, (byte) 0, (byte) 0, (byte) 1, (byte) 0};
        f1959a = bArr;
        int length = bArr.length;
        f1960b = length;
        f1961c = length + 2;
    }

    public aol(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
        }
        this.f1962d = (byte) i;
    }

    public boolean markSupported() {
        return false;
    }

    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    public int read() {
        int read;
        if (this.f1963e < 2 || this.f1963e > f1961c) {
            read = super.read();
        } else if (this.f1963e == f1961c) {
            read = this.f1962d;
        } else {
            read = f1959a[this.f1963e - 2] & 255;
        }
        if (read != -1) {
            this.f1963e++;
        }
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int read;
        if (this.f1963e > f1961c) {
            read = super.read(bArr, i, i2);
        } else if (this.f1963e == f1961c) {
            bArr[i] = this.f1962d;
            read = 1;
        } else if (this.f1963e < 2) {
            read = super.read(bArr, i, 2 - this.f1963e);
        } else {
            read = Math.min(f1961c - this.f1963e, i2);
            System.arraycopy(f1959a, this.f1963e - 2, bArr, i, read);
        }
        if (read > 0) {
            this.f1963e += read;
        }
        return read;
    }

    public long skip(long j) {
        long skip = super.skip(j);
        if (skip > 0) {
            this.f1963e = (int) (((long) this.f1963e) + skip);
        }
        return skip;
    }

    public void reset() {
        throw new UnsupportedOperationException();
    }
}
