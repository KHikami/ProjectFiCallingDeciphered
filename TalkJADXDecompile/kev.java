public abstract class kev {
    private final int a;
    @Deprecated
    public final byte b;
    public final byte c;
    public final int d;
    private final int e;
    private final int f;

    abstract void a(byte[] bArr, int i, int i2, kew kew);

    protected abstract boolean a(byte b);

    protected kev(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, (byte) 61);
    }

    private kev(int i, int i2, int i3, int i4, byte b) {
        int i5 = 0;
        this.b = (byte) 61;
        this.a = i;
        this.e = i2;
        int i6 = (i3 <= 0 || i4 <= 0) ? 0 : 1;
        if (i6 != 0) {
            i5 = (i3 / i2) * i2;
        }
        this.d = i5;
        this.f = i4;
        this.c = (byte) 61;
    }

    int a(kew kew) {
        return kew.c != null ? kew.d - kew.e : 0;
    }

    protected byte[] a(int i, kew kew) {
        if (kew.c != null && kew.c.length >= kew.d + i) {
            return kew.c;
        }
        if (kew.c == null) {
            kew.c = new byte[8192];
            kew.d = 0;
            kew.e = 0;
        } else {
            Object obj = new byte[(kew.c.length << 1)];
            System.arraycopy(kew.c, 0, obj, 0, kew.c.length);
            kew.c = obj;
        }
        return kew.c;
    }

    int b(byte[] bArr, int i, int i2, kew kew) {
        if (kew.c == null) {
            return kew.f ? -1 : 0;
        } else {
            int min = Math.min(a(kew), i2);
            System.arraycopy(kew.c, kew.e, bArr, 0, min);
            kew.e += min;
            if (kew.e < kew.d) {
                return min;
            }
            kew.c = null;
            return min;
        }
    }

    public byte[] c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        kew kew = new kew();
        a(bArr, 0, bArr.length, kew);
        a(bArr, 0, -1, kew);
        bArr = new byte[(kew.d - kew.e)];
        b(bArr, 0, bArr.length, kew);
        return bArr;
    }

    protected boolean d(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.c == b || a(b)) {
                return true;
            }
        }
        return false;
    }

    public long e(byte[] bArr) {
        long length = ((long) (((bArr.length + this.a) - 1) / this.a)) * ((long) this.e);
        if (this.d > 0) {
            return length + ((((((long) this.d) + length) - 1) / ((long) this.d)) * ((long) this.f));
        }
        return length;
    }
}
