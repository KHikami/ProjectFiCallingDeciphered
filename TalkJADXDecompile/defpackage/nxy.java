package defpackage;

import java.util.Arrays;
import nvw;
import nvy;
import nxc;

/* renamed from: nxy */
public final class nxy {
    static final nxy a;
    private int b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    static {
        a = new nxy(0, new int[0], new Object[0], false);
    }

    static nxy a(nxy nxy, nxy nxy2) {
        int i = nxy.b + nxy2.b;
        Object copyOf = Arrays.copyOf(nxy.c, i);
        System.arraycopy(nxy2.c, 0, copyOf, nxy.b, nxy2.b);
        Object copyOf2 = Arrays.copyOf(nxy.d, i);
        System.arraycopy(nxy2.d, 0, copyOf2, nxy.b, nxy2.b);
        return new nxy(i, copyOf, copyOf2, true);
    }

    nxy() {
        this(0, new int[8], new Object[8], true);
    }

    private nxy(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public void a() {
        this.f = false;
    }

    private void c() {
        if (!this.f) {
            throw new UnsupportedOperationException();
        }
    }

    public void a(nvy nvy) {
        for (int i = 0; i < this.b; i++) {
            int i2 = this.c[i];
            int i3 = i2 >>> 3;
            switch (i2 & 7) {
                case wi.w /*0*/:
                    nvy.a(i3, ((Long) this.d[i]).longValue());
                    break;
                case wi.j /*1*/:
                    nvy.b(i3, ((Long) this.d[i]).longValue());
                    break;
                case wi.l /*2*/:
                    nvy.a(i3, (nvn) this.d[i]);
                    break;
                case wi.z /*3*/:
                    nvy.a(i3, 3);
                    ((nxy) this.d[i]).a(nvy);
                    nvy.a(i3, 4);
                    break;
                case wi.p /*5*/:
                    nvy.d(i3, ((Integer) this.d[i]).intValue());
                    break;
                default:
                    throw nxc.c();
            }
        }
    }

    public int b() {
        int i = this.e;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < this.b; i2++) {
                int i3 = this.c[i2];
                int i4 = i3 >>> 3;
                switch (i3 & 7) {
                    case wi.w /*0*/:
                        i += nvy.d(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case wi.j /*1*/:
                        i += nvy.e(i4, ((Long) this.d[i2]).longValue());
                        break;
                    case wi.l /*2*/:
                        i += nvy.b(i4, (nvn) this.d[i2]);
                        break;
                    case wi.z /*3*/:
                        i += ((nxy) this.d[i2]).b() + (nvy.d(i4) << 1);
                        break;
                    case wi.p /*5*/:
                        i += nvy.g(i4, ((Integer) this.d[i2]).intValue());
                        break;
                    default:
                        throw new IllegalStateException(nxc.c());
                }
            }
            this.e = i;
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
        if (this.b == nxy.b && Arrays.equals(this.c, nxy.c) && Arrays.deepEquals(this.d, nxy.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.b + 527) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.deepHashCode(this.d);
    }

    public final void a(StringBuilder stringBuilder, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            gwb.a(stringBuilder, i, String.valueOf(this.c[i2] >>> 3), this.d[i2]);
        }
    }

    boolean a(int i, nvw nvw) {
        c();
        int i2 = i >>> 3;
        switch (i & 7) {
            case wi.w /*0*/:
                a(i, Long.valueOf(nvw.e()));
                return true;
            case wi.j /*1*/:
                a(i, Long.valueOf(nvw.g()));
                return true;
            case wi.l /*2*/:
                a(i, nvw.l());
                return true;
            case wi.z /*3*/:
                Object nxy = new nxy();
                int a;
                do {
                    a = nvw.a();
                    if (a != 0) {
                    }
                    nvw.a((i2 << 3) | 4);
                    a(i, nxy);
                    return true;
                } while (nxy.a(a, nvw));
                nvw.a((i2 << 3) | 4);
                a(i, nxy);
                return true;
            case wi.h /*4*/:
                return false;
            case wi.p /*5*/:
                a(i, Integer.valueOf(nvw.h()));
                return true;
            default:
                throw nxc.c();
        }
    }

    nxy a(int i, int i2) {
        c();
        if (i == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        a(0 | (i << 3), Long.valueOf((long) i2));
        return this;
    }

    private void a(int i, Object obj) {
        if (this.b == this.c.length) {
            int i2 = (this.b < 4 ? 8 : this.b >> 1) + this.b;
            this.c = Arrays.copyOf(this.c, i2);
            this.d = Arrays.copyOf(this.d, i2);
        }
        this.c[this.b] = i;
        this.d[this.b] = obj;
        this.b++;
    }
}
