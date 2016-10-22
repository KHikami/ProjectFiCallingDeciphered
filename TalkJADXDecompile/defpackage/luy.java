package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: luy */
public final class luy extends nyx<luy> {
    public lqm a;
    public lqj[] b;
    public loc[] c;
    public lsh d;
    public ltb e;
    public lqn f;
    public lsq g;
    public lqt h;
    public lwj i;
    public lud j;
    public byte[] k;
    public Long l;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luy() {
        d();
    }

    private luy d() {
        this.requestHeader = null;
        this.a = null;
        this.b = lqj.d();
        this.c = loc.d();
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.k != null) {
            nyu.a(2, this.k);
        }
        if (this.l != null) {
            nyu.a(3, this.l.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.e != null) {
            nyu.b(6, this.e);
        }
        if (this.f != null) {
            nyu.b(7, this.f);
        }
        if (this.a != null) {
            nyu.b(8, this.a);
        }
        if (this.d != null) {
            nyu.b(9, this.d);
        }
        if (this.g != null) {
            nyu.b(10, this.g);
        }
        if (this.h != null) {
            nyu.b(11, this.h);
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf2 = this.c[i];
                if (nzf2 != null) {
                    nyu.b(12, nzf2);
                }
                i++;
            }
        }
        if (this.i != null) {
            nyu.b(13, this.i);
        }
        if (this.j != null) {
            nyu.b(14, this.j);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.k != null) {
            b += nyu.b(2, this.k);
        }
        if (this.l != null) {
            b += nyu.e(3, this.l.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.e != null) {
            b += nyu.d(6, this.e);
        }
        if (this.f != null) {
            b += nyu.d(7, this.f);
        }
        if (this.a != null) {
            b += nyu.d(8, this.a);
        }
        if (this.d != null) {
            b += nyu.d(9, this.d);
        }
        if (this.g != null) {
            b += nyu.d(10, this.g);
        }
        if (this.h != null) {
            b += nyu.d(11, this.h);
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf2 = this.c[i];
                if (nzf2 != null) {
                    b += nyu.d(12, nzf2);
                }
                i++;
            }
        }
        if (this.i != null) {
            b += nyu.d(13, this.i);
        }
        if (this.j != null) {
            return b + nyu.d(14, this.j);
        }
        return b;
    }

    private luy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
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
                    this.k = nyt.k();
                    continue;
                case wi.dA /*24*/:
                    this.l = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new lqj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqj();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new ltb();
                    }
                    nyt.a(this.e);
                    continue;
                case 58:
                    if (this.f == null) {
                        this.f = new lqn();
                    }
                    nyt.a(this.f);
                    continue;
                case 66:
                    if (this.a == null) {
                        this.a = new lqm();
                    }
                    nyt.a(this.a);
                    continue;
                case 74:
                    if (this.d == null) {
                        this.d = new lsh();
                    }
                    nyt.a(this.d);
                    continue;
                case 82:
                    if (this.g == null) {
                        this.g = new lsq();
                    }
                    nyt.a(this.g);
                    continue;
                case 90:
                    if (this.h == null) {
                        this.h = new lqt();
                    }
                    nyt.a(this.h);
                    continue;
                case 98:
                    b = nzl.b(nyt, 98);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new loc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loc();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case 106:
                    if (this.i == null) {
                        this.i = new lwj();
                    }
                    nyt.a(this.i);
                    continue;
                case 114:
                    if (this.j == null) {
                        this.j = new lud();
                    }
                    nyt.a(this.j);
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
