package p000;

public final class mrk extends nyx<mrk> {
    public static final nyy<ozn, mrk> f28153a = nyy.a(11, mrk.class, 126976418);
    private static final mrk[] f28154c = new mrk[0];
    public mrn f28155b;
    private int f28156d;
    private int f28157e;
    private int f28158f;
    private int f28159g;
    private int f28160h;
    private int f28161i;
    private int f28162j;
    private int f28163k;
    private int f28164l;
    private boolean f28165m;
    private long f28166n;
    private int f28167o;
    private int f28168p;
    private int f28169q;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32758b(nyt);
    }

    public mrk() {
        m32759d();
    }

    private mrk m32759d() {
        this.f28156d = 0;
        this.f28157e = -1;
        this.f28158f = -1;
        this.f28159g = 0;
        this.f28160h = 0;
        this.f28161i = -1;
        this.f28162j = -1;
        this.f28163k = 0;
        this.f28164l = -1;
        this.f28165m = false;
        this.f28166n = 0;
        this.f28155b = null;
        this.f28167o = -1;
        this.f28168p = 0;
        this.f28169q = 0;
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
        if ((this.f28156d & 1) != (mrk.f28156d & 1) || this.f28157e != mrk.f28157e) {
            return false;
        }
        if ((this.f28156d & 2) != (mrk.f28156d & 2) || this.f28158f != mrk.f28158f) {
            return false;
        }
        if ((this.f28156d & 4) != (mrk.f28156d & 4) || this.f28159g != mrk.f28159g) {
            return false;
        }
        if ((this.f28156d & 8) != (mrk.f28156d & 8) || this.f28160h != mrk.f28160h) {
            return false;
        }
        if ((this.f28156d & 16) != (mrk.f28156d & 16) || this.f28161i != mrk.f28161i) {
            return false;
        }
        if ((this.f28156d & 32) != (mrk.f28156d & 32) || this.f28162j != mrk.f28162j) {
            return false;
        }
        if ((this.f28156d & 64) != (mrk.f28156d & 64) || this.f28163k != mrk.f28163k) {
            return false;
        }
        if ((this.f28156d & 128) != (mrk.f28156d & 128) || this.f28164l != mrk.f28164l) {
            return false;
        }
        if ((this.f28156d & 256) != (mrk.f28156d & 256) || this.f28165m != mrk.f28165m) {
            return false;
        }
        if ((this.f28156d & 512) != (mrk.f28156d & 512) || this.f28166n != mrk.f28166n) {
            return false;
        }
        if (this.f28155b == null) {
            if (mrk.f28155b != null) {
                return false;
            }
        } else if (!this.f28155b.equals(mrk.f28155b)) {
            return false;
        }
        if ((this.f28156d & 1024) != (mrk.f28156d & 1024) || this.f28167o != mrk.f28167o) {
            return false;
        }
        if ((this.f28156d & 2048) != (mrk.f28156d & 2048) || this.f28168p != mrk.f28168p) {
            return false;
        }
        if ((this.f28156d & 4096) != (mrk.f28156d & 4096) || this.f28169q != mrk.f28169q) {
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
        int hashCode = ((((this.f28165m ? 1231 : 1237) + ((((((((((((((((((getClass().getName().hashCode() + 527) * 31) + this.f28157e) * 31) + this.f28158f) * 31) + this.f28159g) * 31) + this.f28160h) * 31) + this.f28161i) * 31) + this.f28162j) * 31) + this.f28163k) * 31) + this.f28164l) * 31)) * 31) + ((int) (this.f28166n ^ (this.f28166n >>> 32)))) * 31;
        if (this.f28155b == null) {
            i = 0;
        } else {
            i = this.f28155b.hashCode();
        }
        i = (((((((i + hashCode) * 31) + this.f28167o) * 31) + this.f28168p) * 31) + this.f28169q) * 31;
        if (!(this.unknownFieldData == null || this.unknownFieldData.b())) {
            i2 = this.unknownFieldData.hashCode();
        }
        return i + i2;
    }

    public void mo146a(nyu nyu) {
        if ((this.f28156d & 1) != 0) {
            nyu.a(1, this.f28157e);
        }
        if ((this.f28156d & 4) != 0) {
            nyu.a(2, this.f28159g);
        }
        if ((this.f28156d & 2048) != 0) {
            nyu.a(3, this.f28168p);
        }
        if ((this.f28156d & 4096) != 0) {
            nyu.a(4, this.f28169q);
        }
        if ((this.f28156d & 16) != 0) {
            nyu.a(5, this.f28161i);
        }
        if ((this.f28156d & 32) != 0) {
            nyu.a(6, this.f28162j);
        }
        if ((this.f28156d & 64) != 0) {
            nyu.a(7, this.f28163k);
        }
        if ((this.f28156d & 8) != 0) {
            nyu.a(8, this.f28160h);
        }
        if ((this.f28156d & 128) != 0) {
            nyu.a(9, this.f28164l);
        }
        if ((this.f28156d & 256) != 0) {
            nyu.a(10, this.f28165m);
        }
        if ((this.f28156d & 2) != 0) {
            nyu.a(11, this.f28158f);
        }
        if ((this.f28156d & 512) != 0) {
            nyu.c(12, this.f28166n);
        }
        if (this.f28155b != null) {
            nyu.b(13, this.f28155b);
        }
        if ((this.f28156d & 1024) != 0) {
            nyu.a(14, this.f28167o);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if ((this.f28156d & 1) != 0) {
            b += nyu.f(1, this.f28157e);
        }
        if ((this.f28156d & 4) != 0) {
            b += nyu.f(2, this.f28159g);
        }
        if ((this.f28156d & 2048) != 0) {
            b += nyu.f(3, this.f28168p);
        }
        if ((this.f28156d & 4096) != 0) {
            b += nyu.f(4, this.f28169q);
        }
        if ((this.f28156d & 16) != 0) {
            b += nyu.f(5, this.f28161i);
        }
        if ((this.f28156d & 32) != 0) {
            b += nyu.f(6, this.f28162j);
        }
        if ((this.f28156d & 64) != 0) {
            b += nyu.f(7, this.f28163k);
        }
        if ((this.f28156d & 8) != 0) {
            b += nyu.f(8, this.f28160h);
        }
        if ((this.f28156d & 128) != 0) {
            b += nyu.f(9, this.f28164l);
        }
        if ((this.f28156d & 256) != 0) {
            boolean z = this.f28165m;
            b += nyu.h(10) + 1;
        }
        if ((this.f28156d & 2) != 0) {
            b += nyu.f(11, this.f28158f);
        }
        if ((this.f28156d & 512) != 0) {
            long j = this.f28166n;
            b += nyu.h(12) + 8;
        }
        if (this.f28155b != null) {
            b += nyu.d(13, this.f28155b);
        }
        if ((this.f28156d & 1024) != 0) {
            return b + nyu.f(14, this.f28167o);
        }
        return b;
    }

    private mrk m32758b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f28157e = nyt.f();
                    this.f28156d |= 1;
                    continue;
                case 16:
                    this.f28159g = nyt.f();
                    this.f28156d |= 4;
                    continue;
                case wi.dA /*24*/:
                    this.f28168p = nyt.f();
                    this.f28156d |= 2048;
                    continue;
                case 32:
                    this.f28169q = nyt.f();
                    this.f28156d |= 4096;
                    continue;
                case 40:
                    this.f28161i = nyt.f();
                    this.f28156d |= 16;
                    continue;
                case 48:
                    this.f28162j = nyt.f();
                    this.f28156d |= 32;
                    continue;
                case 56:
                    this.f28163k = nyt.f();
                    this.f28156d |= 64;
                    continue;
                case 64:
                    this.f28160h = nyt.f();
                    this.f28156d |= 8;
                    continue;
                case 72:
                    this.f28164l = nyt.f();
                    this.f28156d |= 128;
                    continue;
                case 80:
                    this.f28165m = nyt.i();
                    this.f28156d |= 256;
                    continue;
                case 88:
                    this.f28158f = nyt.f();
                    this.f28156d |= 2;
                    continue;
                case 97:
                    this.f28166n = nyt.g();
                    this.f28156d |= 512;
                    continue;
                case 106:
                    if (this.f28155b == null) {
                        this.f28155b = new mrn();
                    }
                    nyt.a(this.f28155b);
                    continue;
                case 112:
                    this.f28167o = nyt.f();
                    this.f28156d |= 1024;
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
