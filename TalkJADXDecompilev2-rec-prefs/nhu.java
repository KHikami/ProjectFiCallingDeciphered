package p000;

public final class nhu extends nyx<nhu> {
    private static volatile nhu[] f29847c;
    public Integer f29848a;
    public nhv[] f29849b;

    public /* synthetic */ nzf m35013a(nyt nyt) {
        return m35010b(nyt);
    }

    public static nhu[] m35011d() {
        if (f29847c == null) {
            synchronized (nzc.f31309c) {
                if (f29847c == null) {
                    f29847c = new nhu[0];
                }
            }
        }
        return f29847c;
    }

    public nhu() {
        m35012g();
    }

    private nhu m35012g() {
        this.f29849b = nhv.m35017d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35014a(nyu nyu) {
        if (this.f29848a != null) {
            nyu.m37168a(2, this.f29848a.intValue());
        }
        if (this.f29849b != null && this.f29849b.length > 0) {
            for (nzf nzf : this.f29849b) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35015b() {
        int b = super.b();
        if (this.f29848a != null) {
            b += nyu.m37147f(2, this.f29848a.intValue());
        }
        if (this.f29849b == null || this.f29849b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f29849b) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private nhu m35010b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f29848a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f29849b == null) {
                        a = 0;
                    } else {
                        a = this.f29849b.length;
                    }
                    Object obj = new nhv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f29849b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nhv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nhv();
                    nyt.m37101a(obj[a]);
                    this.f29849b = obj;
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
