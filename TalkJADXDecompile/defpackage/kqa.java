package defpackage;

import nyt;
import nyu;
import opy;

/* renamed from: kqa */
public final class kqa extends nyx<kqa> {
    public kpy a;
    public kqk b;
    public kpa c;
    public String d;
    public Integer e;
    public opy f;
    public Integer g;
    public kny h;
    public kqb i;
    public Boolean j;
    public kyx k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kqa() {
        d();
    }

    private kqa d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.f = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.e != null) {
            nyu.a(6, this.e.intValue());
        }
        if (this.f != null) {
            nyu.b(8, this.f);
        }
        if (this.g != null) {
            nyu.a(9, this.g.intValue());
        }
        if (this.h != null) {
            nyu.b(10, this.h);
        }
        if (this.i != null) {
            nyu.b(11, this.i);
        }
        if (this.j != null) {
            nyu.a(12, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.b(13, this.k);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c != null) {
            b += nyu.d(4, this.c);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.d(8, this.f);
        }
        if (this.g != null) {
            b += nyu.f(9, this.g.intValue());
        }
        if (this.h != null) {
            b += nyu.d(10, this.h);
        }
        if (this.i != null) {
            b += nyu.d(11, this.i);
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.k != null) {
            return b + nyu.d(13, this.k);
        }
        return b;
    }

    private kqa b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    if (this.a == null) {
                        this.a = new kpy();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new kqk();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new kpa();
                    }
                    nyt.a(this.c);
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 66:
                    if (this.f == null) {
                        this.f = new opy();
                    }
                    nyt.a(this.f);
                    continue;
                case 72:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 82:
                    if (this.h == null) {
                        this.h = new kny();
                    }
                    nyt.a(this.h);
                    continue;
                case 90:
                    if (this.i == null) {
                        this.i = new kqb();
                    }
                    nyt.a(this.i);
                    continue;
                case 96:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 106:
                    if (this.k == null) {
                        this.k = new kyx();
                    }
                    nyt.a(this.k);
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
