package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class bao extends FilterInputStream {
    private int f2736a = nzf.UNSET_ENUM_VALUE;

    public bao(InputStream inputStream) {
        super(inputStream);
    }

    public void mark(int i) {
        super.mark(i);
        this.f2736a = i;
    }

    public int read() {
        if (m4676a(1) == -1) {
            return -1;
        }
        int read = super.read();
        m4677b(1);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) {
        int a = (int) m4676a((long) i2);
        if (a == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a);
        m4677b((long) read);
        return read;
    }

    public void reset() {
        super.reset();
        this.f2736a = nzf.UNSET_ENUM_VALUE;
    }

    public long skip(long j) {
        long a = m4676a(j);
        if (a == -1) {
            return -1;
        }
        long skip = super.skip(a);
        m4677b(skip);
        return skip;
    }

    public int available() {
        if (this.f2736a == nzf.UNSET_ENUM_VALUE) {
            return super.available();
        }
        return Math.min(this.f2736a, super.available());
    }

    private long m4676a(long j) {
        if (this.f2736a == 0) {
            return -1;
        }
        if (this.f2736a == nzf.UNSET_ENUM_VALUE || j <= ((long) this.f2736a)) {
            return j;
        }
        return (long) this.f2736a;
    }

    private void m4677b(long j) {
        if (this.f2736a != nzf.UNSET_ENUM_VALUE && j != -1) {
            this.f2736a = (int) (((long) this.f2736a) - j);
        }
    }
}
