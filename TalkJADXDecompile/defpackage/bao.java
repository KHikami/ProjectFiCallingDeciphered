package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bao */
public final class bao extends FilterInputStream {
    private int a;

    public bao(InputStream inputStream) {
        super(inputStream);
        this.a = nzf.UNSET_ENUM_VALUE;
    }

    public void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    public int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int a = (int) a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        b((long) read);
        return read;
    }

    public void reset() {
        super.reset();
        this.a = nzf.UNSET_ENUM_VALUE;
    }

    public long skip(long j) {
        long a = a(j);
        if (a == -1) {
            return -1;
        }
        long skip = super.skip(a);
        b(skip);
        return skip;
    }

    public int available() {
        if (this.a == nzf.UNSET_ENUM_VALUE) {
            return super.available();
        }
        return Math.min(this.a, super.available());
    }

    private long a(long j) {
        if (this.a == 0) {
            return -1;
        }
        if (this.a == nzf.UNSET_ENUM_VALUE || j <= ((long) this.a)) {
            return j;
        }
        return (long) this.a;
    }

    private void b(long j) {
        if (this.a != nzf.UNSET_ENUM_VALUE && j != -1) {
            this.a = (int) (((long) this.a) - j);
        }
    }
}
