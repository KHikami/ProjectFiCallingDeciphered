package defpackage;

import java.io.InputStream;

/* renamed from: awu */
public final class awu implements awt {
    private final InputStream a;

    public awu(InputStream inputStream) {
        this.a = inputStream;
    }

    public int a() {
        return ((this.a.read() << 8) & 65280) | (this.a.read() & 255);
    }

    public short b() {
        return (short) (this.a.read() & 255);
    }

    public long a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.a.skip(j2);
            if (skip <= 0) {
                if (this.a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }

    public int a(byte[] bArr, int i) {
        int i2 = i;
        while (i2 > 0) {
            int read = this.a.read(bArr, i - i2, i2);
            if (read == -1) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    public int c() {
        return this.a.read();
    }
}
