package p000;

public final class osc extends nyx<osc> {
    private static volatile osc[] f34110f;
    public oox f34111a;
    public oqv[] f34112b;
    public oqv f34113c;
    public String f34114d;
    public String f34115e;

    public /* synthetic */ nzf m39532a(nyt nyt) {
        return m39529b(nyt);
    }

    public static osc[] m39530d() {
        if (f34110f == null) {
            synchronized (nzc.f31309c) {
                if (f34110f == null) {
                    f34110f = new osc[0];
                }
            }
        }
        return f34110f;
    }

    public osc() {
        m39531g();
    }

    private osc m39531g() {
        this.f34111a = null;
        this.f34112b = oqv.m39246d();
        this.f34113c = null;
        this.f34114d = null;
        this.f34115e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39533a(nyu nyu) {
        if (this.f34111a != null) {
            nyu.m37182b(1, this.f34111a);
        }
        if (this.f34112b != null && this.f34112b.length > 0) {
            for (nzf nzf : this.f34112b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f34113c != null) {
            nyu.m37182b(3, this.f34113c);
        }
        if (this.f34114d != null) {
            nyu.m37170a(4, this.f34114d);
        }
        if (this.f34115e != null) {
            nyu.m37170a(5, this.f34115e);
        }
        super.a(nyu);
    }

    protected int m39534b() {
        int b = super.b();
        if (this.f34111a != null) {
            b += nyu.m37145d(1, this.f34111a);
        }
        if (this.f34112b != null && this.f34112b.length > 0) {
            int i = b;
            for (nzf nzf : this.f34112b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f34113c != null) {
            b += nyu.m37145d(3, this.f34113c);
        }
        if (this.f34114d != null) {
            b += nyu.m37137b(4, this.f34114d);
        }
        if (this.f34115e != null) {
            return b + nyu.m37137b(5, this.f34115e);
        }
        return b;
    }

    private osc m39529b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34111a == null) {
                        this.f34111a = new oox();
                    }
                    nyt.m37101a(this.f34111a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f34112b == null) {
                        a = 0;
                    } else {
                        a = this.f34112b.length;
                    }
                    Object obj = new oqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f34112b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqv();
                    nyt.m37101a(obj[a]);
                    this.f34112b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f34113c == null) {
                        this.f34113c = new oqv();
                    }
                    nyt.m37101a(this.f34113c);
                    continue;
                case 34:
                    this.f34114d = nyt.m37117j();
                    continue;
                case 42:
                    this.f34115e = nyt.m37117j();
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
