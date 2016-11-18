package defpackage;

import java.util.logging.Level;

final class nvz extends nvy {
    private final byte[] d;
    private final int e;
    private final int f;
    private int g;

    public final void b(int i, int i2) {
        a(i, 0);
        a(i2);
    }

    public final void c(int i, int i2) {
        a(i, 0);
        b(i2);
    }

    public final void d(int i, int i2) {
        a(i, 5);
        c(i2);
    }

    public final void a(int i, long j) {
        a(i, 0);
        a(j);
    }

    public final void b(int i, long j) {
        a(i, 1);
        b(j);
    }

    public final void a(int i, boolean z) {
        int i2 = 0;
        a(i, 0);
        if (z) {
            i2 = 1;
        }
        a((byte) i2);
    }

    public final void a(int i, String str) {
        a(i, 2);
        a(str);
    }

    public final void a(int i, nvn nvn) {
        a(i, 2);
        a(nvn);
    }

    public final void a(nvn nvn) {
        b(nvn.b());
        nvn.a(this);
    }

    public final void b(byte[] bArr, int i, int i2) {
        b(i2);
        c(bArr, 0, i2);
    }

    public final void a(int i, nxi nxi) {
        a(i, 2);
        a(nxi);
    }

    public final void b(int i, nxi nxi) {
        a(1, 3);
        c(2, i);
        a(3, nxi);
        a(1, 4);
    }

    public final void a(nxi nxi) {
        b(nxi.l());
        nxi.a(this);
    }

    public final void a(byte b) {
        try {
            byte[] bArr = this.d;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = b;
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void a(int i) {
        if (i >= 0) {
            b(i);
        } else {
            a((long) i);
        }
    }

    public final void c(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.g;
            this.g = i2 + 1;
            bArr[i2] = (byte) i;
            bArr = this.d;
            i2 = this.g;
            this.g = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            bArr = this.d;
            i2 = this.g;
            this.g = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            bArr = this.d;
            i2 = this.g;
            this.g = i2 + 1;
            bArr[i2] = (byte) (i >>> 24);
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    public final void b(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) j);
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 8));
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 16));
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 24));
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
        }
    }

    private void c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.d, this.g, i2);
            this.g += i2;
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)}), e);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        c(bArr, i, i2);
    }

    public final void a(String str) {
        int i = this.g;
        try {
            int f = nvy.f(str.length() * 3);
            int f2 = nvy.f(str.length());
            if (f2 == f) {
                this.g = i + f2;
                f = nyb.a(str, this.d, this.g, h());
                this.g = i;
                b((f - i) - f2);
                this.g = f;
                return;
            }
            b(nyb.a((CharSequence) str));
            this.g = nyb.a(str, this.d, this.g, h());
        } catch (Throwable e) {
            this.g = i;
            nvy.a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(nwv.a);
            try {
                b(bytes.length);
                a(bytes, 0, bytes.length);
            } catch (Throwable e2) {
                throw new nwa(e2);
            } catch (nwa e3) {
                throw e3;
            }
        } catch (Throwable e22) {
            throw new nwa(e22);
        }
    }

    public final int h() {
        return this.f - this.g;
    }

    nvz(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if (((i | i2) | (bArr.length - (i + i2))) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else {
            this.d = bArr;
            this.e = i;
            this.g = i;
            this.f = i + i2;
        }
    }

    public final void a(int i, int i2) {
        b((i << 3) | i2);
    }

    public final void b(int i) {
        if (!nvy.b || h() < 10) {
            byte[] bArr;
            int i2;
            while ((i & -128) != 0) {
                try {
                    bArr = this.d;
                    i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (Throwable e) {
                    throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.d;
            i2 = this.g;
            this.g = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        long j = nvy.c + ((long) this.g);
        while ((i & -128) != 0) {
            long j2 = 1 + j;
            nxz.a(this.d, j, (byte) ((i & 127) | 128));
            this.g++;
            i >>>= 7;
            j = j2;
        }
        nxz.a(this.d, j, (byte) i);
        this.g++;
    }

    public final void a(long j) {
        if (!nvy.b || h() < 10) {
            byte[] bArr;
            int i;
            while ((j & -128) != 0) {
                try {
                    bArr = this.d;
                    i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (Throwable e) {
                    throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.d;
            i = this.g;
            this.g = i + 1;
            bArr[i] = (byte) ((int) j);
            return;
        }
        long j2 = nvy.c + ((long) this.g);
        while ((j & -128) != 0) {
            long j3 = 1 + j2;
            nxz.a(this.d, j2, (byte) ((((int) j) & 127) | 128));
            this.g++;
            j >>>= 7;
            j2 = j3;
        }
        nxz.a(this.d, j2, (byte) ((int) j));
        this.g++;
    }
}
