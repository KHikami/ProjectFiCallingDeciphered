public final class kvd extends nyx<kvd> {
    private static volatile kvd[] d;
    public Double a;
    public String b;
    public kvf[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kvd[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new kvd[0];
                }
            }
        }
        return d;
    }

    public kvd() {
        this.a = null;
        this.b = null;
        this.c = kvf.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.doubleValue());
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        this.a.doubleValue();
        b += nyu.h(1) + 8;
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private kvd b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.n /*9*/:
                    this.a = Double.valueOf(nyt.b());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new kvf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kvf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kvf();
                    nyt.a(obj[a]);
                    this.c = obj;
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
