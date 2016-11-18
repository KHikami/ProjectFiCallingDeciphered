package p000;

public final class nfs extends nyx<nfs> {
    private static volatile nfs[] f29716l;
    public Integer f29717a;
    public nhx f29718b;
    public String f29719c;
    public String f29720d;
    public Boolean f29721e;
    public Integer f29722f;
    public nfp f29723g;
    public String f29724h;
    public nft f29725i;
    public nhx f29726j;
    public ndu[] f29727k;

    public /* synthetic */ nzf m34730a(nyt nyt) {
        return m34727b(nyt);
    }

    public static nfs[] m34728d() {
        if (f29716l == null) {
            synchronized (nzc.f31309c) {
                if (f29716l == null) {
                    f29716l = new nfs[0];
                }
            }
        }
        return f29716l;
    }

    public nfs() {
        m34729g();
    }

    private nfs m34729g() {
        this.f29718b = null;
        this.f29719c = null;
        this.f29720d = null;
        this.f29721e = null;
        this.f29723g = null;
        this.f29724h = null;
        this.f29725i = null;
        this.f29726j = null;
        this.f29727k = ndu.m34471d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34731a(nyu nyu) {
        if (this.f29717a != null) {
            nyu.m37168a(1, this.f29717a.intValue());
        }
        if (this.f29718b != null) {
            nyu.m37182b(2, this.f29718b);
        }
        if (this.f29719c != null) {
            nyu.m37170a(3, this.f29719c);
        }
        if (this.f29720d != null) {
            nyu.m37170a(4, this.f29720d);
        }
        if (this.f29721e != null) {
            nyu.m37172a(5, this.f29721e.booleanValue());
        }
        if (this.f29722f != null) {
            nyu.m37168a(6, this.f29722f.intValue());
        }
        if (this.f29723g != null) {
            nyu.m37182b(7, this.f29723g);
        }
        if (this.f29724h != null) {
            nyu.m37170a(8, this.f29724h);
        }
        if (this.f29725i != null) {
            nyu.m37182b(9, this.f29725i);
        }
        if (this.f29726j != null) {
            nyu.m37182b(10, this.f29726j);
        }
        if (this.f29727k != null && this.f29727k.length > 0) {
            for (nzf nzf : this.f29727k) {
                if (nzf != null) {
                    nyu.m37182b(11, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m34732b() {
        int b = super.b();
        if (this.f29717a != null) {
            b += nyu.m37147f(1, this.f29717a.intValue());
        }
        if (this.f29718b != null) {
            b += nyu.m37145d(2, this.f29718b);
        }
        if (this.f29719c != null) {
            b += nyu.m37137b(3, this.f29719c);
        }
        if (this.f29720d != null) {
            b += nyu.m37137b(4, this.f29720d);
        }
        if (this.f29721e != null) {
            this.f29721e.booleanValue();
            b += nyu.m37154h(5) + 1;
        }
        if (this.f29722f != null) {
            b += nyu.m37147f(6, this.f29722f.intValue());
        }
        if (this.f29723g != null) {
            b += nyu.m37145d(7, this.f29723g);
        }
        if (this.f29724h != null) {
            b += nyu.m37137b(8, this.f29724h);
        }
        if (this.f29725i != null) {
            b += nyu.m37145d(9, this.f29725i);
        }
        if (this.f29726j != null) {
            b += nyu.m37145d(10, this.f29726j);
        }
        if (this.f29727k == null || this.f29727k.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29727k) {
            if (nzf != null) {
                i += nyu.m37145d(11, nzf);
            }
        }
        return i;
    }

    private nfs m34727b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f29717a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f29718b == null) {
                        this.f29718b = new nhx();
                    }
                    nyt.m37101a(this.f29718b);
                    continue;
                case wi.dx /*26*/:
                    this.f29719c = nyt.m37117j();
                    continue;
                case 34:
                    this.f29720d = nyt.m37117j();
                    continue;
                case 40:
                    this.f29721e = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29722f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.f29723g == null) {
                        this.f29723g = new nfp();
                    }
                    nyt.m37101a(this.f29723g);
                    continue;
                case 66:
                    this.f29724h = nyt.m37117j();
                    continue;
                case 74:
                    if (this.f29725i == null) {
                        this.f29725i = new nft();
                    }
                    nyt.m37101a(this.f29725i);
                    continue;
                case 82:
                    if (this.f29726j == null) {
                        this.f29726j = new nhx();
                    }
                    nyt.m37101a(this.f29726j);
                    continue;
                case 90:
                    int b = nzl.m37265b(nyt, 90);
                    if (this.f29727k == null) {
                        a = 0;
                    } else {
                        a = this.f29727k.length;
                    }
                    Object obj = new ndu[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29727k, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ndu();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ndu();
                    nyt.m37101a(obj[a]);
                    this.f29727k = obj;
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
