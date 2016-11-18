package p000;

public final class orl extends nyx<orl> {
    private static volatile orl[] f34029d;
    public String f34030a;
    public orm[] f34031b;
    public Boolean f34032c;

    public /* synthetic */ nzf m39440a(nyt nyt) {
        return m39437b(nyt);
    }

    public static orl[] m39438d() {
        if (f34029d == null) {
            synchronized (nzc.f31309c) {
                if (f34029d == null) {
                    f34029d = new orl[0];
                }
            }
        }
        return f34029d;
    }

    public orl() {
        m39439g();
    }

    private orl m39439g() {
        this.f34030a = null;
        this.f34031b = orm.m39444d();
        this.f34032c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39441a(nyu nyu) {
        if (this.f34030a != null) {
            nyu.m37170a(1, this.f34030a);
        }
        if (this.f34031b != null && this.f34031b.length > 0) {
            for (nzf nzf : this.f34031b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34032c != null) {
            nyu.m37172a(3, this.f34032c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39442b() {
        int b = super.b();
        if (this.f34030a != null) {
            b += nyu.m37137b(1, this.f34030a);
        }
        if (this.f34031b != null && this.f34031b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34031b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34032c == null) {
            return b;
        }
        this.f34032c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private orl m39437b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34030a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34031b == null) {
                        a = 0;
                    } else {
                        a = this.f34031b.length;
                    }
                    Object obj = new orm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34031b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new orm();
                    nyt.m37101a(obj[a]);
                    this.f34031b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f34032c = Boolean.valueOf(nyt.m37116i());
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
