package defpackage;

public final class mrk extends nyx<mrk> {
    public static final nyy<ozn, mrk> a = nyy.a(11, mrk.class, 126976418);
    private static final mrk[] c = new mrk[0];
    public mrn b;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private int o;
    private int p;
    private int q;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mrk() {
        d();
    }

    private mrk d() {
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.i = -1;
        this.j = -1;
        this.k = 0;
        this.l = -1;
        this.m = false;
        this.n = 0;
        this.b = null;
        this.o = -1;
        this.p = 0;
        this.q = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mrk)) {
            return false;
        }
        mrk mrk = (mrk) obj;
        if ((this.d & 1) != (mrk.d & 1) || this.e != mrk.e) {
            return false;
        }
        if ((this.d & 2) != (mrk.d & 2) || this.f != mrk.f) {
            return false;
        }
        if ((this.d & 4) != (mrk.d & 4) || this.g != mrk.g) {
            return false;
        }
        if ((this.d & 8) != (mrk.d & 8) || this.h != mrk.h) {
            return false;
        }
        if ((this.d & 16) != (mrk.d & 16) || this.i != mrk.i) {
            return false;
        }
        if ((this.d & 32) != (mrk.d & 32) || this.j != mrk.j) {
            return false;
        }
        if ((this.d & 64) != (mrk.d & 64) || this.k != mrk.k) {
            return false;
        }
        if ((this.d & 128) != (mrk.d & 128) || this.l != mrk.l) {
            return false;
        }
        if ((this.d & 256) != (mrk.d & 256) || this.m != mrk.m) {
            return false;
        }
        if ((this.d & 512) != (mrk.d & 512) || this.n != mrk.n) {
            return false;
        }
        if (this.b == null) {
            if (mrk.b != null) {
                return false;
            }
        } else if (!this.b.equals(mrk.b)) {
            return false;
        }
        if ((this.d & 1024) != (mrk.d & 1024) || this.o != mrk.o) {
            return false;
        }
        if ((this.d & 2048) != (mrk.d & 2048) || this.p != mrk.p) {
            return false;
        }
        if ((this.d & 4096) != (mrk.d & 4096) || this.q != mrk.q) {
            return false;
        }
        if (this.unknownFieldData != null && !this.unknownFieldData.b()) {
            return this.unknownFieldData.equals(mrk.unknownFieldData);
        }
        if (mrk.unknownFieldData == null || mrk.unknownFieldData.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = ((((this.m ? 1231 : 1237) + ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31) + ((int) (this.n ^ (this.n >>> 32)))) * 31;
        if (this.b == null) {
            i = 0;
        } else {
            i = this.b.hashCode();
        }
        i = (((((((i + hashCode) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31;
        if (!(this.unknownFieldData == null || this.unknownFieldData.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return i + i2;
    }

    public void a(nyu nyu) {
        if ((this.d & 1) != 0) {
            nyu.a(1, this.e);
        }
        if ((this.d & 4) != 0) {
            nyu.a(2, this.g);
        }
        if ((this.d & 2048) != 0) {
            nyu.a(3, this.p);
        }
        if ((this.d & 4096) != 0) {
            nyu.a(4, this.q);
        }
        if ((this.d & 16) != 0) {
            nyu.a(5, this.i);
        }
        if ((this.d & 32) != 0) {
            nyu.a(6, this.j);
        }
        if ((this.d & 64) != 0) {
            nyu.a(7, this.k);
        }
        if ((this.d & 8) != 0) {
            nyu.a(8, this.h);
        }
        if ((this.d & 128) != 0) {
            nyu.a(9, this.l);
        }
        if ((this.d & 256) != 0) {
            nyu.a(10, this.m);
        }
        if ((this.d & 2) != 0) {
            nyu.a(11, this.f);
        }
        if ((this.d & 512) != 0) {
            nyu.c(12, this.n);
        }
        if (this.b != null) {
            nyu.b(13, this.b);
        }
        if ((this.d & 1024) != 0) {
            nyu.a(14, this.o);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if ((this.d & 1) != 0) {
            b += nyu.f(1, this.e);
        }
        if ((this.d & 4) != 0) {
            b += nyu.f(2, this.g);
        }
        if ((this.d & 2048) != 0) {
            b += nyu.f(3, this.p);
        }
        if ((this.d & 4096) != 0) {
            b += nyu.f(4, this.q);
        }
        if ((this.d & 16) != 0) {
            b += nyu.f(5, this.i);
        }
        if ((this.d & 32) != 0) {
            b += nyu.f(6, this.j);
        }
        if ((this.d & 64) != 0) {
            b += nyu.f(7, this.k);
        }
        if ((this.d & 8) != 0) {
            b += nyu.f(8, this.h);
        }
        if ((this.d & 128) != 0) {
            b += nyu.f(9, this.l);
        }
        if ((this.d & 256) != 0) {
            boolean z = this.m;
            b += nyu.h(10) + 1;
        }
        if ((this.d & 2) != 0) {
            b += nyu.f(11, this.f);
        }
        if ((this.d & 512) != 0) {
            long j = this.n;
            b += nyu.h(12) + 8;
        }
        if (this.b != null) {
            b += nyu.d(13, this.b);
        }
        if ((this.d & 1024) != 0) {
            return b + nyu.f(14, this.o);
        }
        return b;
    }

    private mrk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.e = nyt.f();
                    this.d |= 1;
                    continue;
                case 16:
                    this.g = nyt.f();
                    this.d |= 4;
                    continue;
                case wi.dA /*24*/:
                    this.p = nyt.f();
                    this.d |= 2048;
                    continue;
                case 32:
                    this.q = nyt.f();
                    this.d |= 4096;
                    continue;
                case 40:
                    this.i = nyt.f();
                    this.d |= 16;
                    continue;
                case 48:
                    this.j = nyt.f();
                    this.d |= 32;
                    continue;
                case 56:
                    this.k = nyt.f();
                    this.d |= 64;
                    continue;
                case 64:
                    this.h = nyt.f();
                    this.d |= 8;
                    continue;
                case 72:
                    this.l = nyt.f();
                    this.d |= 128;
                    continue;
                case 80:
                    this.m = nyt.i();
                    this.d |= 256;
                    continue;
                case 88:
                    this.f = nyt.f();
                    this.d |= 2;
                    continue;
                case 97:
                    this.n = nyt.g();
                    this.d |= 512;
                    continue;
                case 106:
                    if (this.b == null) {
                        this.b = new mrn();
                    }
                    nyt.a(this.b);
                    continue;
                case 112:
                    this.o = nyt.f();
                    this.d |= 1024;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
