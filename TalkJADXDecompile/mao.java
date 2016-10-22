public final class mao extends nyx<mao> {
    public int[] a;
    public map[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mao() {
        d();
    }

    private mao d() {
        this.a = nzl.a;
        this.b = map.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (int c : this.a) {
                nyu.c(1, c);
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf = this.b[i];
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            for (int j : this.a) {
                i3 += nyu.j(j);
            }
            i = (b + i3) + (this.a.length * 1);
        }
        if (this.b != null && this.b.length > 0) {
            while (i2 < this.b.length) {
                nzf nzf = this.b[i2];
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private mao b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    b = nzl.b(nyt, 8);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.l();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.l();
                    this.a = obj;
                    continue;
                case wi.dr /*10*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.l();
                        a++;
                    }
                    nyt.f(b);
                    b = this.a == null ? 0 : this.a.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.a, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.l();
                        b++;
                    }
                    this.a = obj2;
                    nyt.e(d);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new map[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new map();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new map();
                    nyt.a(obj[a]);
                    this.b = obj;
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
