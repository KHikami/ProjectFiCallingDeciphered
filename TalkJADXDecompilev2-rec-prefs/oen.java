package p000;

public final class oen extends nyx<oen> {
    public odb[] f32470a;
    public odb[] f32471b;
    public boolean[] f32472c;

    public /* synthetic */ nzf m37967a(nyt nyt) {
        return m37966b(nyt);
    }

    public oen() {
        this.f32470a = odb.m37821d();
        this.f32471b = odb.m37821d();
        this.f32472c = nzl.f31331e;
        this.cachedSize = -1;
    }

    public void m37968a(nyu nyu) {
        int i = 0;
        if (this.f32470a != null && this.f32470a.length > 0) {
            for (nzf nzf : this.f32470a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f32471b != null && this.f32471b.length > 0) {
            for (nzf nzf2 : this.f32471b) {
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
            }
        }
        if (this.f32472c != null && this.f32472c.length > 0) {
            while (i < this.f32472c.length) {
                nyu.m37172a(3, this.f32472c[i]);
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m37969b() {
        int i = 0;
        int b = super.b();
        if (this.f32470a != null && this.f32470a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f32470a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f32471b != null && this.f32471b.length > 0) {
            while (i < this.f32471b.length) {
                nzf nzf2 = this.f32471b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        if (this.f32472c == null || this.f32472c.length <= 0) {
            return b;
        }
        return (b + (this.f32472c.length * 1)) + (this.f32472c.length * 1);
    }

    private oen m37966b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f32470a == null) {
                        a = 0;
                    } else {
                        a = this.f32470a.length;
                    }
                    obj = new odb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32470a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odb();
                    nyt.m37101a(obj[a]);
                    this.f32470a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f32471b == null) {
                        a = 0;
                    } else {
                        a = this.f32471b.length;
                    }
                    obj = new odb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32471b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odb();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odb();
                    nyt.m37101a(obj[a]);
                    this.f32471b = obj;
                    continue;
                case wi.dA /*24*/:
                    b = nzl.m37265b(nyt, 24);
                    a = this.f32472c == null ? 0 : this.f32472c.length;
                    obj = new boolean[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32472c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37116i();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37116i();
                    this.f32472c = obj;
                    continue;
                case wi.dx /*26*/:
                    int d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37116i();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f32472c == null ? 0 : this.f32472c.length;
                    Object obj2 = new boolean[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f32472c, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37116i();
                        b++;
                    }
                    this.f32472c = obj2;
                    nyt.m37111e(d);
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
