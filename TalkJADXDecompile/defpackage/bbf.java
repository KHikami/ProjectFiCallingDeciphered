package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: bbf */
public final class bbf extends nyx<bbf> {
    public Integer a;
    public Integer b;
    public int[] c;
    public Integer d;
    public Boolean e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public bbf() {
        d();
    }

    private bbf d() {
        this.a = null;
        this.b = null;
        this.c = nzl.a;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (int a : this.c) {
                nyu.a(3, a);
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            while (i < this.c.length) {
                i2 += nyu.g(this.c[i]);
                i++;
            }
            b = (b + i2) + (this.c.length * 1);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e == null) {
            return b;
        }
        this.e.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private bbf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dI /*16*/:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    b = nzl.b(nyt, 24);
                    a = this.c == null ? 0 : this.c.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.f();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.f();
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.f();
                        a++;
                    }
                    nyt.f(b);
                    b = this.c == null ? 0 : this.c.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.f();
                        b++;
                    }
                    this.c = obj2;
                    nyt.e(d);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                        case wi.h /*4*/:
                        case wi.p /*5*/:
                        case wi.s /*6*/:
                        case wi.q /*7*/:
                        case wi.m /*8*/:
                        case wi.n /*9*/:
                        case wi.dr /*10*/:
                        case wi.dB /*11*/:
                        case wi.dM /*12*/:
                        case wi.dD /*13*/:
                        case wi.g /*14*/:
                        case wi.dJ /*15*/:
                        case wi.dI /*16*/:
                        case wi.dK /*17*/:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
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
