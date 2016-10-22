package defpackage;

/* compiled from: PG */
/* renamed from: dee */
public final class dee {
    final byte[] a;
    int b;
    public int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    public static dee a(byte[] bArr) {
        return new dee(bArr, 0, bArr.length);
    }

    public final int a() {
        int i;
        if (this.f == this.d) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            this.g = 0;
            return 0;
        }
        this.g = e();
        if (this.g != 0) {
            return this.g;
        }
        throw cku.d();
    }

    private void e(int i) {
        if (this.g != i) {
            throw cku.e();
        }
    }

    public final boolean a(int i) {
        switch (i & 7) {
            case rl.c /*0*/:
                e();
                return true;
            case rq.b /*1*/:
                h();
                return true;
            case rq.c /*2*/:
                f(e());
                return true;
            case rl.e /*3*/:
                break;
            case rl.f /*4*/:
                return false;
            case rl.g /*5*/:
                g();
                return true;
            default:
                throw cku.f();
        }
        int a;
        do {
            a = a();
            if (a != 0) {
            }
            e(((i >>> 3) << 3) | 4);
            return true;
        } while (a(a));
        e(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int b() {
        return e();
    }

    public final boolean c() {
        return e() != 0;
    }

    public final String d() {
        int e = e();
        if (e < 0) {
            throw cku.b();
        } else if (e > this.d - this.f) {
            throw cku.a();
        } else {
            String str = new String(this.a, this.f, e, del.a);
            this.f = e + this.f;
            return str;
        }
    }

    public final void a(dem dem) {
        int e = e();
        if (this.i >= this.j) {
            throw cku.g();
        }
        e = b(e);
        this.i++;
        dem.a(this);
        e(0);
        this.i--;
        c(e);
    }

    public final int e() {
        byte l = l();
        if (l >= null) {
            return l;
        }
        int i = l & 127;
        byte l2 = l();
        if (l2 >= null) {
            return i | (l2 << 7);
        }
        i |= (l2 & 127) << 7;
        l2 = l();
        if (l2 >= null) {
            return i | (l2 << 14);
        }
        i |= (l2 & 127) << 14;
        l2 = l();
        if (l2 >= null) {
            return i | (l2 << 21);
        }
        i |= (l2 & 127) << 21;
        l2 = l();
        i |= l2 << 28;
        if (l2 >= null) {
            return i;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            if (l() >= null) {
                return i;
            }
        }
        throw cku.c();
    }

    public final long f() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = l();
            j |= ((long) (l & 127)) << i;
            if ((l & 128) == 0) {
                return j;
            }
        }
        throw cku.c();
    }

    public final int g() {
        return (((l() & 255) | ((l() & 255) << 8)) | ((l() & 255) << 16)) | ((l() & 255) << 24);
    }

    public final long h() {
        byte l = l();
        byte l2 = l();
        return ((((((((((long) l2) & 255) << 8) | (((long) l) & 255)) | ((((long) l()) & 255) << 16)) | ((((long) l()) & 255) << 24)) | ((((long) l()) & 255) << 32)) | ((((long) l()) & 255) << 40)) | ((((long) l()) & 255) << 48)) | ((((long) l()) & 255) << 56);
    }

    private dee(byte[] bArr, int i, int i2) {
        this.h = Integer.MAX_VALUE;
        this.j = 64;
        this.c = 67108864;
        this.a = bArr;
        this.b = i;
        this.d = i + i2;
        this.f = i;
    }

    public final int b(int i) {
        if (i < 0) {
            throw cku.b();
        }
        int i2 = this.f + i;
        int i3 = this.h;
        if (i2 > i3) {
            throw cku.a();
        }
        this.h = i2;
        k();
        return i3;
    }

    private final void k() {
        this.d += this.e;
        int i = this.d;
        if (i > this.h) {
            this.e = i - this.h;
            this.d -= this.e;
            return;
        }
        this.e = 0;
    }

    public final void c(int i) {
        this.h = i;
        k();
    }

    public final int i() {
        if (this.h == Integer.MAX_VALUE) {
            return -1;
        }
        return this.h - this.f;
    }

    public final int j() {
        return this.f - this.b;
    }

    public final void d(int i) {
        if (i > this.f - this.b) {
            throw new IllegalArgumentException("Position " + i + " is beyond current " + (this.f - this.b));
        } else if (i < 0) {
            throw new IllegalArgumentException("Bad position " + i);
        } else {
            this.f = this.b + i;
        }
    }

    private byte l() {
        if (this.f == this.d) {
            throw cku.a();
        }
        byte[] bArr = this.a;
        int i = this.f;
        this.f = i + 1;
        return bArr[i];
    }

    private void f(int i) {
        if (i < 0) {
            throw cku.b();
        } else if (this.f + i > this.h) {
            f(this.h - this.f);
            throw cku.a();
        } else if (i <= this.d - this.f) {
            this.f += i;
        } else {
            throw cku.a();
        }
    }
}
