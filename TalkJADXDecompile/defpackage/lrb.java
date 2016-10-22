package defpackage;

import nyt;
import nyu;

/* renamed from: lrb */
public final class lrb extends nyx<lrb> {
    public low a;
    public Boolean b;
    public Boolean c;
    public lqk d;
    public lqk e;
    public Integer f;
    public Integer g;
    public Boolean h;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lrb() {
        d();
    }

    private lrb d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(4, this.c.booleanValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.d != null) {
            nyu.b(7, this.d);
        }
        if (this.h != null) {
            nyu.a(8, this.h.booleanValue());
        }
        if (this.g != null) {
            nyu.a(9, this.g.intValue());
        }
        if (this.e != null) {
            nyu.b(11, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.d != null) {
            b += nyu.d(7, this.d);
        }
        if (this.h != null) {
            this.h.booleanValue();
            b += nyu.h(8) + 1;
        }
        if (this.g != null) {
            b += nyu.f(9, this.g.intValue());
        }
        if (this.e != null) {
            return b + nyu.d(11, this.e);
        }
        return b;
    }

    private lrb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new low();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dA /*24*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 58:
                    if (this.d == null) {
                        this.d = new lqk();
                    }
                    nyt.a(this.d);
                    continue;
                case 64:
                    this.h = Boolean.valueOf(nyt.i());
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 90:
                    if (this.e == null) {
                        this.e = new lqk();
                    }
                    nyt.a(this.e);
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
