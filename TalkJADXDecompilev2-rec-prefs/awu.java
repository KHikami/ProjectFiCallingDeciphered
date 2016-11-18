package p000;

import java.io.InputStream;

public final class awu implements awt {
    private final InputStream f2448a;

    public awu(InputStream inputStream) {
        this.f2448a = inputStream;
    }

    public int mo402a() {
        return ((this.f2448a.read() << 8) & 65280) | (this.f2448a.read() & 255);
    }

    public short mo405b() {
        return (short) (this.f2448a.read() & 255);
    }

    public long mo404a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.f2448a.skip(j2);
            if (skip <= 0) {
                if (this.f2448a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }

    public int mo403a(byte[] bArr, int i) {
        int i2 = i;
        while (i2 > 0) {
            int read = this.f2448a.read(bArr, i - i2, i2);
            if (read == -1) {
                break;
            }
            i2 -= read;
        }
        return i - i2;
    }

    public int mo406c() {
        return this.f2448a.read();
    }
}
