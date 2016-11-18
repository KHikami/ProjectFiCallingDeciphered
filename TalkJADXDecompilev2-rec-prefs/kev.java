package p000;

public abstract class kev {
    private final int f21518a;
    @Deprecated
    public final byte f21519b;
    public final byte f21520c;
    public final int f21521d;
    private final int f21522e;
    private final int f21523f;

    abstract void mo3668a(byte[] bArr, int i, int i2, kew kew);

    protected abstract boolean mo3669a(byte b);

    protected kev(int i, int i2, int i3, int i4) {
        this(3, 4, i3, i4, (byte) 61);
    }

    private kev(int i, int i2, int i3, int i4, byte b) {
        int i5 = 0;
        this.f21519b = (byte) 61;
        this.f21518a = i;
        this.f21522e = i2;
        int i6 = (i3 <= 0 || i4 <= 0) ? 0 : 1;
        if (i6 != 0) {
            i5 = (i3 / i2) * i2;
        }
        this.f21521d = i5;
        this.f21523f = i4;
        this.f21520c = (byte) 61;
    }

    int m25681a(kew kew) {
        return kew.f21535c != null ? kew.f21536d - kew.f21537e : 0;
    }

    protected byte[] m25684a(int i, kew kew) {
        if (kew.f21535c != null && kew.f21535c.length >= kew.f21536d + i) {
            return kew.f21535c;
        }
        if (kew.f21535c == null) {
            kew.f21535c = new byte[8192];
            kew.f21536d = 0;
            kew.f21537e = 0;
        } else {
            Object obj = new byte[(kew.f21535c.length << 1)];
            System.arraycopy(kew.f21535c, 0, obj, 0, kew.f21535c.length);
            kew.f21535c = obj;
        }
        return kew.f21535c;
    }

    int m25685b(byte[] bArr, int i, int i2, kew kew) {
        if (kew.f21535c == null) {
            return kew.f21538f ? -1 : 0;
        } else {
            int min = Math.min(m25681a(kew), i2);
            System.arraycopy(kew.f21535c, kew.f21537e, bArr, 0, min);
            kew.f21537e += min;
            if (kew.f21537e < kew.f21536d) {
                return min;
            }
            kew.f21535c = null;
            return min;
        }
    }

    public byte[] m25686c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        kew kew = new kew();
        mo3668a(bArr, 0, bArr.length, kew);
        mo3668a(bArr, 0, -1, kew);
        bArr = new byte[(kew.f21536d - kew.f21537e)];
        m25685b(bArr, 0, bArr.length, kew);
        return bArr;
    }

    protected boolean m25687d(byte[] bArr) {
        if (bArr == null) {
            return false;
        }
        for (byte b : bArr) {
            if (this.f21520c == b || mo3669a(b)) {
                return true;
            }
        }
        return false;
    }

    public long m25688e(byte[] bArr) {
        long length = ((long) (((bArr.length + this.f21518a) - 1) / this.f21518a)) * ((long) this.f21522e);
        if (this.f21521d > 0) {
            return length + ((((((long) this.f21521d) + length) - 1) / ((long) this.f21521d)) * ((long) this.f21523f));
        }
        return length;
    }
}
