package defpackage;

import nyt;
import nyu;
import nzl;

/* renamed from: lko */
public final class lko extends nyx<lko> {
    public String a;
    public String b;
    public Integer c;
    public Integer d;
    public Long e;
    public Long f;
    public String g;
    public String h;
    public lkq[] i;
    public Boolean j;
    public Integer k;
    public Integer l;
    public String m;
    public Integer n;
    public String o;
    public Integer p;
    public lkp q;
    public Long r;
    public lkv[] s;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lko() {
        d();
    }

    private lko d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = lkq.d();
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
        this.s = lkv.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        nyu.a(3, this.c.intValue());
        if (this.g != null) {
            nyu.a(4, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    nyu.a(5, nzf);
                }
            }
        }
        if (this.j != null) {
            nyu.a(28, this.j.booleanValue());
        }
        if (this.k != null) {
            nyu.a(29, this.k.intValue());
        }
        if (this.l != null) {
            nyu.a(30, this.l.intValue());
        }
        if (this.r != null) {
            nyu.b(42, this.r.longValue());
        }
        if (this.h != null) {
            nyu.a(43, this.h);
        }
        if (this.s != null && this.s.length > 0) {
            while (i < this.s.length) {
                nzf nzf2 = this.s[i];
                if (nzf2 != null) {
                    nyu.b(52, nzf2);
                }
                i++;
            }
        }
        if (this.p != null) {
            nyu.a(68, this.p.intValue());
        }
        if (this.q != null) {
            nyu.b(69, this.q);
        }
        if (this.o != null) {
            nyu.a(100, this.o);
        }
        if (this.f != null) {
            nyu.b(104, this.f.longValue());
        }
        if (this.d != null) {
            nyu.a(105, this.d.intValue());
        }
        if (this.n != null) {
            nyu.a(106, this.n.intValue());
        }
        if (this.e != null) {
            nyu.b(107, this.e.longValue());
        }
        if (this.m != null) {
            nyu.a(112, this.m);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = ((super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b)) + nyu.f(3, this.c.intValue());
        if (this.g != null) {
            b += nyu.b(4, this.g);
        }
        if (this.i != null && this.i.length > 0) {
            int i2 = b;
            for (nzf nzf : this.i) {
                if (nzf != null) {
                    i2 += nyu.c(5, nzf);
                }
            }
            b = i2;
        }
        if (this.j != null) {
            this.j.booleanValue();
            b += nyu.h(28) + 1;
        }
        if (this.k != null) {
            b += nyu.f(29, this.k.intValue());
        }
        if (this.l != null) {
            b += nyu.f(30, this.l.intValue());
        }
        if (this.r != null) {
            b += nyu.f(42, this.r.longValue());
        }
        if (this.h != null) {
            b += nyu.b(43, this.h);
        }
        if (this.s != null && this.s.length > 0) {
            while (i < this.s.length) {
                nzf nzf2 = this.s[i];
                if (nzf2 != null) {
                    b += nyu.d(52, nzf2);
                }
                i++;
            }
        }
        if (this.p != null) {
            b += nyu.f(68, this.p.intValue());
        }
        if (this.q != null) {
            b += nyu.d(69, this.q);
        }
        if (this.o != null) {
            b += nyu.b(100, this.o);
        }
        if (this.f != null) {
            b += nyu.f(104, this.f.longValue());
        }
        if (this.d != null) {
            b += nyu.f(105, this.d.intValue());
        }
        if (this.n != null) {
            b += nyu.f(106, this.n.intValue());
        }
        if (this.e != null) {
            b += nyu.f(107, this.e.longValue());
        }
        if (this.m != null) {
            return b + nyu.b(112, this.m);
        }
        return b;
    }

    private lko b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.g = nyt.j();
                    continue;
                case 43:
                    b = nzl.b(nyt, 43);
                    if (this.i == null) {
                        a = 0;
                    } else {
                        a = this.i.length;
                    }
                    obj = new lkq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.i, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkq();
                        nyt.a(obj[a], 5);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkq();
                    nyt.a(obj[a], 5);
                    this.i = obj;
                    continue;
                case 224:
                    this.j = Boolean.valueOf(nyt.i());
                    continue;
                case 232:
                    this.k = Integer.valueOf(nyt.f());
                    continue;
                case 240:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 336:
                    this.r = Long.valueOf(nyt.e());
                    continue;
                case 346:
                    this.h = nyt.j();
                    continue;
                case 418:
                    b = nzl.b(nyt, 418);
                    if (this.s == null) {
                        a = 0;
                    } else {
                        a = this.s.length;
                    }
                    obj = new lkv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.s, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lkv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lkv();
                    nyt.a(obj[a]);
                    this.s = obj;
                    continue;
                case 544:
                    this.p = Integer.valueOf(nyt.f());
                    continue;
                case 554:
                    if (this.q == null) {
                        this.q = new lkp();
                    }
                    nyt.a(this.q);
                    continue;
                case 802:
                    this.o = nyt.j();
                    continue;
                case 832:
                    this.f = Long.valueOf(nyt.e());
                    continue;
                case 840:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
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
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 848:
                    this.n = Integer.valueOf(nyt.f());
                    continue;
                case 856:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 898:
                    this.m = nyt.j();
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
