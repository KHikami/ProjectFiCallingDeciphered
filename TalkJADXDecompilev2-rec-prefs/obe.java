package p000;

public final class obe extends nyx<obe> {
    public oay f31914a;
    public oap[] f31915b;
    public oap f31916c;
    public Integer f31917d;

    public /* synthetic */ nzf m37605a(nyt nyt) {
        return m37603b(nyt);
    }

    public obe() {
        m37604d();
    }

    private obe m37604d() {
        this.f31914a = null;
        this.f31915b = oap.f31672b;
        this.f31916c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37606a(nyu nyu) {
        if (this.f31914a != null) {
            nyu.m37182b(1, this.f31914a);
        }
        if (this.f31915b != null && this.f31915b.length > 0) {
            for (nzf nzf : this.f31915b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f31916c != null) {
            nyu.m37182b(3, this.f31916c);
        }
        if (this.f31917d != null) {
            nyu.m37168a(4, this.f31917d.intValue());
        }
        super.a(nyu);
    }

    protected int m37607b() {
        int b = super.b();
        if (this.f31914a != null) {
            b += nyu.m37145d(1, this.f31914a);
        }
        if (this.f31915b != null && this.f31915b.length > 0) {
            int i = b;
            for (nzf nzf : this.f31915b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f31916c != null) {
            b += nyu.m37145d(3, this.f31916c);
        }
        if (this.f31917d != null) {
            return b + nyu.m37147f(4, this.f31917d.intValue());
        }
        return b;
    }

    private obe m37603b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31914a == null) {
                        this.f31914a = new oay();
                    }
                    nyt.m37101a(this.f31914a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f31915b == null) {
                        a = 0;
                    } else {
                        a = this.f31915b.length;
                    }
                    Object obj = new oap[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31915b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oap();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oap();
                    nyt.m37101a(obj[a]);
                    this.f31915b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f31916c == null) {
                        this.f31916c = new oap();
                    }
                    nyt.m37101a(this.f31916c);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f31917d = Integer.valueOf(a);
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
