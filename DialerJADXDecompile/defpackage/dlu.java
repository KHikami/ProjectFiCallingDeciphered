package defpackage;

import java.io.EOFException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* renamed from: dlu */
public final class dlu implements dlv, dlw, Cloneable {
    dme a;
    public long b;

    public final /* synthetic */ dlv b(byte[] bArr) {
        return a(bArr);
    }

    public final /* synthetic */ Object clone() {
        return h();
    }

    public final /* synthetic */ dlv e(int i) {
        return c(i);
    }

    public final /* synthetic */ dlv f(int i) {
        return b(i);
    }

    public final /* synthetic */ dlv g(int i) {
        return a(i);
    }

    public final dlu a() {
        return this;
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final void a(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final byte c() {
        if (this.b == 0) {
            throw new IllegalStateException("size == 0");
        }
        dme dme = this.a;
        int i = dme.b;
        int i2 = dme.c;
        int i3 = i + 1;
        byte b = dme.a[i];
        this.b--;
        if (i3 == i2) {
            this.a = dme.a();
            dmf.a(dme);
        } else {
            dme.b = i3;
        }
        return b;
    }

    public final short d() {
        if (this.b < 2) {
            throw new IllegalStateException("size < 2: " + this.b);
        }
        dme dme = this.a;
        int i = dme.b;
        int i2 = dme.c;
        if (i2 - i < 2) {
            return (short) (((c() & 255) << 8) | (c() & 255));
        }
        byte[] bArr = dme.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.b -= 2;
        if (i4 == i2) {
            this.a = dme.a();
            dmf.a(dme);
        } else {
            dme.b = i4;
        }
        return (short) i;
    }

    public final int e() {
        if (this.b < 4) {
            throw new IllegalStateException("size < 4: " + this.b);
        }
        dme dme = this.a;
        int i = dme.b;
        int i2 = dme.c;
        if (i2 - i < 4) {
            return ((((c() & 255) << 24) | ((c() & 255) << 16)) | ((c() & 255) << 8)) | (c() & 255);
        }
        byte[] bArr = dme.a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        i3 = i4 + 1;
        i |= (bArr[i4] & 255) << 8;
        i4 = i3 + 1;
        i |= bArr[i3] & 255;
        this.b -= 4;
        if (i4 == i2) {
            this.a = dme.a();
            dmf.a(dme);
            return i;
        }
        dme.b = i4;
        return i;
    }

    public final dlx b(long j) {
        return new dlx(c(j));
    }

    public final byte[] f() {
        try {
            return c(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] c(long j) {
        dmk.a(this.b, 0, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[((int) j)];
        c(bArr);
        return bArr;
    }

    private void c(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = a(bArr, i, bArr.length - i);
            if (a == -1) {
                throw new EOFException();
            }
            i += a;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        dmk.a((long) bArr.length, (long) i, (long) i2);
        dme dme = this.a;
        if (dme == null) {
            return -1;
        }
        int min = Math.min(i2, dme.c - dme.b);
        System.arraycopy(dme.a, dme.b, bArr, i, min);
        dme.b += min;
        this.b -= (long) min;
        if (dme.b != dme.c) {
            return min;
        }
        this.a = dme.a();
        dmf.a(dme);
        return min;
    }

    public final void g() {
        try {
            d(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void d(long j) {
        while (j > 0) {
            if (this.a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, (long) (this.a.c - this.a.b));
            this.b -= (long) min;
            j -= (long) min;
            dme dme = this.a;
            dme.b = min + dme.b;
            if (this.a.b == this.a.c) {
                dme dme2 = this.a;
                this.a = dme2.a();
                dmf.a(dme2);
            }
        }
    }

    public final dlu a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final dlu b(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        dmk.a((long) bArr.length, (long) i, (long) i2);
        int i3 = i + i2;
        while (i < i3) {
            dme d = d(1);
            int min = Math.min(i3 - i, 2048 - d.c);
            System.arraycopy(bArr, i, d.a, d.c, min);
            i += min;
            d.c = min + d.c;
        }
        this.b += (long) i2;
        return this;
    }

    public final dlu a(int i) {
        dme d = d(1);
        byte[] bArr = d.a;
        int i2 = d.c;
        d.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    public final dlu b(int i) {
        dme d = d(2);
        byte[] bArr = d.a;
        int i2 = d.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        i2 = i3 + 1;
        bArr[i3] = (byte) i;
        d.c = i2;
        this.b += 2;
        return this;
    }

    public final dlu c(int i) {
        dme d = d(4);
        byte[] bArr = d.a;
        int i2 = d.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        i2 = i3 + 1;
        bArr[i3] = (byte) i;
        d.c = i2;
        this.b += 4;
        return this;
    }

    public final dme d(int i) {
        if (i <= 0 || i > 2048) {
            throw new IllegalArgumentException();
        } else if (this.a == null) {
            this.a = dmf.a();
            dme dme = this.a;
            dme dme2 = this.a;
            r0 = this.a;
            dme2.g = r0;
            dme.f = r0;
            return r0;
        } else {
            r0 = this.a.g;
            if (r0.c + i > 2048 || !r0.e) {
                return r0.a(dmf.a());
            }
            return r0;
        }
    }

    public final void a_(dlu dlu, long j) {
        if (dlu == null) {
            throw new IllegalArgumentException("source == null");
        } else if (dlu == this) {
            throw new IllegalArgumentException("source == this");
        } else {
            dmk.a(dlu.b, 0, j);
            while (j > 0) {
                dme dme;
                dme dme2;
                if (j < ((long) (dlu.a.c - dlu.a.b))) {
                    dme = this.a != null ? this.a.g : null;
                    if (dme != null && dme.e) {
                        if ((((long) dme.c) + j) - ((long) (dme.d ? 0 : dme.b)) <= 2048) {
                            dlu.a.a(dme, (int) j);
                            dlu.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    dme2 = dlu.a;
                    int i = (int) j;
                    if (i <= 0 || i > dme2.c - dme2.b) {
                        throw new IllegalArgumentException();
                    }
                    dme dme3 = new dme(dme2);
                    dme3.c = dme3.b + i;
                    dme2.b = i + dme2.b;
                    dme2.g.a(dme3);
                    dlu.a = dme3;
                }
                dme2 = dlu.a;
                long j2 = (long) (dme2.c - dme2.b);
                dlu.a = dme2.a();
                if (this.a == null) {
                    this.a = dme2;
                    dme2 = this.a;
                    dme = this.a;
                    dme dme4 = this.a;
                    dme.g = dme4;
                    dme2.f = dme4;
                } else {
                    dme = this.a.g.a(dme2);
                    if (dme.g == dme) {
                        throw new IllegalStateException();
                    } else if (dme.g.e) {
                        int i2 = dme.c - dme.b;
                        if (i2 <= (dme.g.d ? 0 : dme.g.b) + (2048 - dme.g.c)) {
                            dme.a(dme.g, i2);
                            dme.a();
                            dmf.a(dme);
                        }
                    }
                }
                dlu.b -= j2;
                this.b += j2;
                j -= j2;
            }
        }
    }

    public final long a(dlu dlu, long j) {
        if (dlu == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.b == 0) {
            return -1;
        } else {
            if (j > this.b) {
                j = this.b;
            }
            dlu.a_(this, j);
            return j;
        }
    }

    public final void flush() {
    }

    public final void close() {
    }

    public final boolean equals(Object obj) {
        long j = 0;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlu)) {
            return false;
        }
        dlu dlu = (dlu) obj;
        if (this.b != dlu.b) {
            return false;
        }
        if (this.b == 0) {
            return true;
        }
        dme dme = this.a;
        dme dme2 = dlu.a;
        int i = dme.b;
        int i2 = dme2.b;
        while (j < this.b) {
            long min = (long) Math.min(dme.c - i, dme2.c - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                byte b = dme.a[i];
                i = i2 + 1;
                if (b != dme2.a[i2]) {
                    return false;
                }
                i3++;
                i2 = i;
                i = i4;
            }
            if (i == dme.c) {
                dme = dme.f;
                i = dme.b;
            }
            if (i2 == dme2.c) {
                dme2 = dme2.f;
                i2 = dme2.b;
            }
            j += min;
        }
        return true;
    }

    public final int hashCode() {
        dme dme = this.a;
        if (dme == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = dme.b;
            while (i2 < dme.c) {
                int i3 = dme.a[i2] + (i * 31);
                i2++;
                i = i3;
            }
            dme = dme.f;
        } while (dme != this.a);
        return i;
    }

    public final String toString() {
        if (this.b == 0) {
            return "Buffer[size=0]";
        }
        if (this.b <= 16) {
            dlx dlx = new dlx(h().f());
            return String.format("Buffer[size=%s data=%s]", new Object[]{Long.valueOf(this.b), dlx.b()});
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(this.a.a, this.a.b, this.a.c - this.a.b);
            for (dme dme = this.a.f; dme != this.a; dme = dme.f) {
                instance.update(dme.a, dme.b, dme.c - dme.b);
            }
            return String.format("Buffer[size=%s md5=%s]", new Object[]{Long.valueOf(this.b), dlx.a(instance.digest()).b()});
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError();
        }
    }

    private dlu h() {
        dlu dlu = new dlu();
        if (this.b == 0) {
            return dlu;
        }
        dlu.a = new dme(this.a);
        dme dme = dlu.a;
        dme dme2 = dlu.a;
        dme dme3 = dlu.a;
        dme2.g = dme3;
        dme.f = dme3;
        for (dme = this.a.f; dme != this.a; dme = dme.f) {
            dlu.a.g.a(new dme(dme));
        }
        dlu.b = this.b;
        return dlu;
    }
}
