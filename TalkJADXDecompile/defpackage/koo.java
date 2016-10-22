package defpackage;

import nyt;
import nyu;

/* renamed from: koo */
public final class koo extends nyx<koo> {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public Boolean i;
    public Integer j;
    public Integer k;
    public Boolean l;
    public Boolean m;
    public Boolean n;
    public kom o;
    public Boolean p;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public koo() {
        d();
    }

    private koo d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.booleanValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h.booleanValue());
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        if (this.j != null) {
            nyu.a(10, this.j.intValue());
        }
        if (this.k != null) {
            nyu.a(11, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(12, this.l.booleanValue());
        }
        if (this.m != null) {
            nyu.a(13, this.m.booleanValue());
        }
        if (this.n != null) {
            nyu.a(14, this.n.booleanValue());
        }
        if (this.o != null) {
            nyu.b(15, this.o);
        }
        if (this.p != null) {
            nyu.a(16, this.p.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            this.a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.d != null) {
            this.d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g != null) {
            this.g.booleanValue();
            b += nyu.h(7) + 1;
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.i != null) {
            this.i.booleanValue();
            b += nyu.h(9) + 1;
        }
        if (this.j != null) {
            b += nyu.f(10, this.j.intValue());
        }
        if (this.k != null) {
            b += nyu.f(11, this.k.intValue());
        }
        if (this.l != null) {
            this.l.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.m != null) {
            this.m.booleanValue();
            b += nyu.h(13) + 1;
        }
        if (this.n != null) {
            this.n.booleanValue();
            b += nyu.h(14) + 1;
        }
        if (this.o != null) {
            b += nyu.d(15, this.o);
        }
        if (this.p == null) {
            return b;
        }
        this.p.booleanValue();
        return b + (nyu.h(16) + 1);
    }

    private koo b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    this.a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dI /*16*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
                    continue;
                case 64:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
                    continue;
                case 80:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.j = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 88:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                        case wi.z /*3*/:
                            this.k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 96:
                    this.l = Boolean.valueOf(nyt.i());
                    continue;
                case 104:
                    this.m = Boolean.valueOf(nyt.i());
                    continue;
                case 112:
                    this.n = Boolean.valueOf(nyt.i());
                    continue;
                case 122:
                    if (this.o == null) {
                        this.o = new kom();
                    }
                    nyt.a(this.o);
                    continue;
                case 128:
                    this.p = Boolean.valueOf(nyt.i());
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
