package defpackage;

public final class lvg extends nyx<lvg> {
    public loi[] a;
    public lpn b;
    public Boolean c;
    public Integer d;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lvg() {
        d();
    }

    private lvg d() {
        this.requestHeader = null;
        this.a = loi.d();
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null) {
            nyu.a(4, this.c.booleanValue());
        }
        if (this.d != null) {
            nyu.a(5, this.d.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null && this.a.length > 0) {
            int i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.d != null) {
            return b + nyu.f(5, this.d.intValue());
        }
        return b;
    }

    private lvg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new loi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loi();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loi();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new lpn();
                    }
                    nyt.a(this.b);
                    continue;
                case 32:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
