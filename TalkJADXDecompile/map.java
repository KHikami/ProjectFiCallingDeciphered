public final class map extends nyx<map> {
    private static volatile map[] c;
    public String a;
    public int[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static map[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new map[0];
                }
            }
        }
        return c;
    }

    public map() {
        g();
    }

    private map g() {
        this.a = null;
        this.b = nzl.a;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (int c : this.b) {
                nyu.c(2, c);
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        int i2 = 0;
        while (i < this.b.length) {
            i2 += nyu.j(this.b[i]);
            i++;
        }
        return (b + i2) + (this.b.length * 1);
    }

    private map b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dI /*16*/:
                    b = nzl.b(nyt, 16);
                    a = this.b == null ? 0 : this.b.length;
                    Object obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.l();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.l();
                    this.b = obj;
                    continue;
                case wi.dH /*18*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.l();
                        a++;
                    }
                    nyt.f(b);
                    b = this.b == null ? 0 : this.b.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.l();
                        b++;
                    }
                    this.b = obj2;
                    nyt.e(d);
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
