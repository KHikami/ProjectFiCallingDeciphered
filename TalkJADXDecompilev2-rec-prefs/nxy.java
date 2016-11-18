package p000;

import java.util.Arrays;

public final class nxy {
    static final nxy f28721a = new nxy(0, new int[0], new Object[0], false);
    private int f28722b;
    private int[] f28723c;
    private Object[] f28724d;
    private int f28725e;
    private boolean f28726f;

    static nxy m33453a(nxy nxy, nxy nxy2) {
        int i = nxy.f28722b + nxy2.f28722b;
        Object copyOf = Arrays.copyOf(nxy.f28723c, i);
        System.arraycopy(nxy2.f28723c, 0, copyOf, nxy.f28722b, nxy2.f28722b);
        Object copyOf2 = Arrays.copyOf(nxy.f28724d, i);
        System.arraycopy(nxy2.f28724d, 0, copyOf2, nxy.f28722b, nxy2.f28722b);
        return new nxy(i, copyOf, copyOf2, true);
    }

    nxy() {
        this(0, new int[8], new Object[8], true);
    }

    private nxy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f28725e = -1;
        this.f28722b = i;
        this.f28723c = iArr;
        this.f28724d = objArr;
        this.f28726f = z;
    }

    public void m33457a() {
        this.f28726f = false;
    }

    private void m33455c() {
        if (!this.f28726f) {
            throw new UnsupportedOperationException();
        }
    }

    public void m33459a(nvy nvy) {
        for (int i = 0; i < this.f28722b; i++) {
            int i2 = this.f28723c[i];
            int i3 = i2 >>> 3;
            switch (i2 & 7) {
                case 0:
                    nvy.a(i3, ((Long) this.f28724d[i]).longValue());
                    break;
                case 1:
                    nvy.b(i3, ((Long) this.f28724d[i]).longValue());
                    break;
                case 2:
                    nvy.a(i3, (nvn) this.f28724d[i]);
                    break;
                case 3:
                    nvy.a(i3, 3);
                    ((nxy) this.f28724d[i]).m33459a(nvy);
                    nvy.a(i3, 4);
                    break;
                case 5:
                    nvy.d(i3, ((Integer) this.f28724d[i]).intValue());
                    break;
                default:
                    throw nxc.c();
            }
        }
    }

    public int m33461b() {
        int i = this.f28725e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.f28722b; i2++) {
                int i3 = this.f28723c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case 0:
                        i += nvy.d(i4, ((Long) this.f28724d[i2]).longValue());
                        break;
                    case 1:
                        i += nvy.e(i4, ((Long) this.f28724d[i2]).longValue());
                        break;
                    case 2:
                        i += nvy.b(i4, (nvn) this.f28724d[i2]);
                        break;
                    case 3:
                        i += ((nxy) this.f28724d[i2]).m33461b() + (nvy.d(i4) << 1);
                        break;
                    case 5:
                        i += nvy.g(i4, ((Integer) this.f28724d[i2]).intValue());
                        break;
                    default:
                        throw new IllegalStateException(nxc.c());
                }
            }
            this.f28725e = i;
        }
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof nxy)) {
            return false;
        }
        nxy nxy = (nxy) obj;
        if (this.f28722b == nxy.f28722b && Arrays.equals(this.f28723c, nxy.f28723c) && Arrays.deepEquals(this.f28724d, nxy.f28724d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f28722b + 527) * 31) + Arrays.hashCode(this.f28723c)) * 31) + Arrays.deepHashCode(this.f28724d);
    }

    public final void m33458a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.f28722b; i2++) {
            gwb.m1873a(stringBuilder, i, String.valueOf(this.f28723c[i2] >>> 3), this.f28724d[i2]);
        }
    }

    boolean m33460a(int i, nvw nvw) {
        m33455c();
        int i2 = i >>> 3;
        switch (i & 7) {
            case 0:
                m33454a(i, Long.valueOf(nvw.e()));
                return true;
            case 1:
                m33454a(i, Long.valueOf(nvw.g()));
                return true;
            case 2:
                m33454a(i, nvw.l());
                return true;
            case 3:
                Object nxy = new nxy();
                int a;
                do {
                    a = nvw.a();
                    if (a != 0) {
                    }
                    nvw.a((i2 << 3) | 4);
                    m33454a(i, nxy);
                    return true;
                } while (nxy.m33460a(a, nvw));
                nvw.a((i2 << 3) | 4);
                m33454a(i, nxy);
                return true;
            case 4:
                return false;
            case 5:
                m33454a(i, Integer.valueOf(nvw.h()));
                return true;
            default:
                throw nxc.c();
        }
    }

    nxy m33456a(int i, int i2) {
        m33455c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        m33454a(0 | (i << 3), Long.valueOf((long) i2));
        return this;
    }

    private void m33454a(int i, Object obj) {
        if (this.f28722b == this.f28723c.length) {
            int i2 = (this.f28722b < 4 ? 8 : this.f28722b >> 1) + this.f28722b;
            this.f28723c = Arrays.copyOf(this.f28723c, i2);
            this.f28724d = Arrays.copyOf(this.f28724d, i2);
        }
        this.f28723c[this.f28722b] = i;
        this.f28724d[this.f28722b] = obj;
        this.f28722b++;
    }
}
