package p000;

import java.util.logging.Level;

final class nvz extends nvy {
    private final byte[] f31156d;
    private final int f31157e;
    private final int f31158f;
    private int f31159g;

    public final void mo4029b(int i, int i2) {
        mo4018a(i, 0);
        mo4017a(i2);
    }

    public final void mo4035c(int i, int i2) {
        mo4018a(i, 0);
        mo4028b(i2);
    }

    public final void mo4036d(int i, int i2) {
        mo4018a(i, 5);
        mo4034c(i2);
    }

    public final void mo4019a(int i, long j) {
        mo4018a(i, 0);
        mo4024a(j);
    }

    public final void mo4030b(int i, long j) {
        mo4018a(i, 1);
        mo4032b(j);
    }

    public final void mo4023a(int i, boolean z) {
        int i2 = 0;
        mo4018a(i, 0);
        if (z) {
            i2 = 1;
        }
        mo4016a((byte) i2);
    }

    public final void mo4020a(int i, String str) {
        mo4018a(i, 2);
        mo4025a(str);
    }

    public final void mo4021a(int i, nvn nvn) {
        mo4018a(i, 2);
        mo4026a(nvn);
    }

    public final void mo4026a(nvn nvn) {
        mo4028b(nvn.b());
        nvn.a(this);
    }

    public final void mo4033b(byte[] bArr, int i, int i2) {
        mo4028b(i2);
        m36888c(bArr, 0, i2);
    }

    public final void mo4022a(int i, nxi nxi) {
        mo4018a(i, 2);
        mo4027a(nxi);
    }

    public final void mo4031b(int i, nxi nxi) {
        mo4018a(1, 3);
        mo4035c(2, i);
        mo4022a(3, nxi);
        mo4018a(1, 4);
    }

    public final void mo4027a(nxi nxi) {
        mo4028b(nxi.l());
        nxi.a(this);
    }

    public final void mo4016a(byte b) {
        try {
            byte[] bArr = this.f31156d;
            int i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = b;
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31159g), Integer.valueOf(this.f31158f), Integer.valueOf(1)}), e);
        }
    }

    public final void mo4017a(int i) {
        if (i >= 0) {
            mo4028b(i);
        } else {
            mo4024a((long) i);
        }
    }

    public final void mo4034c(int i) {
        try {
            byte[] bArr = this.f31156d;
            int i2 = this.f31159g;
            this.f31159g = i2 + 1;
            bArr[i2] = (byte) i;
            bArr = this.f31156d;
            i2 = this.f31159g;
            this.f31159g = i2 + 1;
            bArr[i2] = (byte) (i >> 8);
            bArr = this.f31156d;
            i2 = this.f31159g;
            this.f31159g = i2 + 1;
            bArr[i2] = (byte) (i >> 16);
            bArr = this.f31156d;
            i2 = this.f31159g;
            this.f31159g = i2 + 1;
            bArr[i2] = (byte) (i >>> 24);
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31159g), Integer.valueOf(this.f31158f), Integer.valueOf(1)}), e);
        }
    }

    public final void mo4032b(long j) {
        try {
            byte[] bArr = this.f31156d;
            int i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) j);
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 8));
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 16));
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 24));
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 32));
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 40));
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 48));
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) (j >> 56));
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31159g), Integer.valueOf(this.f31158f), Integer.valueOf(1)}), e);
        }
    }

    private void m36888c(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f31156d, this.f31159g, i2);
            this.f31159g += i2;
        } catch (Throwable e) {
            throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31159g), Integer.valueOf(this.f31158f), Integer.valueOf(i2)}), e);
        }
    }

    public final void mo4015a(byte[] bArr, int i, int i2) {
        m36888c(bArr, i, i2);
    }

    public final void mo4025a(String str) {
        int i = this.f31159g;
        try {
            int f = nvy.m36852f(str.length() * 3);
            int f2 = nvy.m36852f(str.length());
            if (f2 == f) {
                this.f31159g = i + f2;
                f = nyb.m37064a(str, this.f31156d, this.f31159g, mo4037h());
                this.f31159g = i;
                mo4028b((f - i) - f2);
                this.f31159g = f;
                return;
            }
            mo4028b(nyb.m37063a((CharSequence) str));
            this.f31159g = nyb.m37064a(str, this.f31156d, this.f31159g, mo4037h());
        } catch (Throwable e) {
            this.f31159g = i;
            nvy.f31153a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e);
            byte[] bytes = str.getBytes(nwv.f31198a);
            try {
                mo4028b(bytes.length);
                mo4015a(bytes, 0, bytes.length);
            } catch (Throwable e2) {
                throw new nwa(e2);
            } catch (nwa e3) {
                throw e3;
            }
        } catch (Throwable e22) {
            throw new nwa(e22);
        }
    }

    public final int mo4037h() {
        return this.f31158f - this.f31159g;
    }

    nvz(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        } else if (((i | i2) | (bArr.length - (i + i2))) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        } else {
            this.f31156d = bArr;
            this.f31157e = i;
            this.f31159g = i;
            this.f31158f = i + i2;
        }
    }

    public final void mo4018a(int i, int i2) {
        mo4028b((i << 3) | i2);
    }

    public final void mo4028b(int i) {
        if (!nvy.f31154b || mo4037h() < 10) {
            byte[] bArr;
            int i2;
            while ((i & -128) != 0) {
                try {
                    bArr = this.f31156d;
                    i2 = this.f31159g;
                    this.f31159g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (Throwable e) {
                    throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31159g), Integer.valueOf(this.f31158f), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f31156d;
            i2 = this.f31159g;
            this.f31159g = i2 + 1;
            bArr[i2] = (byte) i;
            return;
        }
        long j = nvy.f31155c + ((long) this.f31159g);
        while ((i & -128) != 0) {
            long j2 = 1 + j;
            nxz.m37055a(this.f31156d, j, (byte) ((i & 127) | 128));
            this.f31159g++;
            i >>>= 7;
            j = j2;
        }
        nxz.m37055a(this.f31156d, j, (byte) i);
        this.f31159g++;
    }

    public final void mo4024a(long j) {
        if (!nvy.f31154b || mo4037h() < 10) {
            byte[] bArr;
            int i;
            while ((j & -128) != 0) {
                try {
                    bArr = this.f31156d;
                    i = this.f31159g;
                    this.f31159g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (Throwable e) {
                    throw new nwa(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f31159g), Integer.valueOf(this.f31158f), Integer.valueOf(1)}), e);
                }
            }
            bArr = this.f31156d;
            i = this.f31159g;
            this.f31159g = i + 1;
            bArr[i] = (byte) ((int) j);
            return;
        }
        long j2 = nvy.f31155c + ((long) this.f31159g);
        while ((j & -128) != 0) {
            long j3 = 1 + j2;
            nxz.m37055a(this.f31156d, j2, (byte) ((((int) j) & 127) | 128));
            this.f31159g++;
            j >>>= 7;
            j2 = j3;
        }
        nxz.m37055a(this.f31156d, j2, (byte) ((int) j));
        this.f31159g++;
    }
}
