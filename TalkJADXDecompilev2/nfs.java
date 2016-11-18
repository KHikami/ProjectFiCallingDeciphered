package defpackage;

public final class nfs extends nyx<nfs> {
    private static volatile nfs[] l;
    public Integer a;
    public nhx b;
    public String c;
    public String d;
    public Boolean e;
    public Integer f;
    public nfp g;
    public String h;
    public nft i;
    public nhx j;
    public ndu[] k;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nfs[] d() {
        if (l == null) {
            synchronized (nzc.c) {
                if (l == null) {
                    l = new nfs[0];
                }
            }
        }
        return l;
    }

    public nfs() {
        g();
    }

    private nfs g() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = ndu.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d);
        }
        if (this.e != null) {
            nyu.a(5, this.e.booleanValue());
        }
        if (this.f != null) {
            nyu.a(6, this.f.intValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        if (this.i != null) {
            nyu.b(9, this.i);
        }
        if (this.j != null) {
            nyu.b(10, this.j);
        }
        if (this.k != null && this.k.length > 0) {
            for (nzf nzf : this.k) {
                if (nzf != null) {
                    nyu.b(11, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.b(4, this.d);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.f != null) {
            b += nyu.f(6, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            b += nyu.b(8, this.h);
        }
        if (this.i != null) {
            b += nyu.d(9, this.i);
        }
        if (this.j != null) {
            b += nyu.d(10, this.j);
        }
        if (this.k == null || this.k.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.k) {
            if (nzf != null) {
                i += nyu.d(11, nzf);
            }
        }
        return i;
    }

    private nfs b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nhx();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.d = nyt.j();
                    continue;
                case 40:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.g == null) {
                        this.g = new nfp();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    this.h = nyt.j();
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new nft();
                    }
                    nyt.a(this.i);
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new nhx();
                    }
                    nyt.a(this.j);
                    continue;
                case 90:
                    int b = nzl.b(nyt, 90);
                    if (this.k == null) {
                        a = 0;
                    } else {
                        a = this.k.length;
                    }
                    Object obj = new ndu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ndu();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ndu();
                    nyt.a(obj[a]);
                    this.k = obj;
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
