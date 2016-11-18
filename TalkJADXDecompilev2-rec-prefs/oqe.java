package p000;

public final class oqe extends nyx<oqe> {
    public oso f33715a;
    public oqf[] f33716b;
    public oqu f33717c;
    public int[] f33718d;
    public Integer f33719e;

    public /* synthetic */ nzf m39155a(nyt nyt) {
        return m39153b(nyt);
    }

    public oqe() {
        m39154d();
    }

    private oqe m39154d() {
        this.f33715a = null;
        this.f33716b = oqf.m39159d();
        this.f33717c = null;
        this.f33718d = nzl.f31327a;
        this.f33719e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39156a(nyu nyu) {
        int i = 0;
        if (this.f33715a != null) {
            nyu.m37182b(1, this.f33715a);
        }
        if (this.f33716b != null && this.f33716b.length > 0) {
            for (nzf nzf : this.f33716b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f33717c != null) {
            nyu.m37182b(3, this.f33717c);
        }
        if (this.f33718d != null && this.f33718d.length > 0) {
            while (i < this.f33718d.length) {
                nyu.m37168a(4, this.f33718d[i]);
                i++;
            }
        }
        if (this.f33719e != null) {
            nyu.m37168a(5, this.f33719e.intValue());
        }
        super.a(nyu);
    }

    protected int m39157b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.f33715a != null) {
            b += nyu.m37145d(1, this.f33715a);
        }
        if (this.f33716b != null && this.f33716b.length > 0) {
            i = b;
            for (nzf nzf : this.f33716b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f33717c != null) {
            b += nyu.m37145d(3, this.f33717c);
        }
        if (this.f33718d != null && this.f33718d.length > 0) {
            i = 0;
            while (i2 < this.f33718d.length) {
                i += nyu.m37150g(this.f33718d[i2]);
                i2++;
            }
            b = (b + i) + (this.f33718d.length * 1);
        }
        if (this.f33719e != null) {
            return b + nyu.m37147f(5, this.f33719e.intValue());
        }
        return b;
    }

    private oqe m39153b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33715a == null) {
                        this.f33715a = new oso();
                    }
                    nyt.m37101a(this.f33715a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33716b == null) {
                        a = 0;
                    } else {
                        a = this.f33716b.length;
                    }
                    obj = new oqf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33716b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqf();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqf();
                    nyt.m37101a(obj[a]);
                    this.f33716b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f33717c == null) {
                        this.f33717c = new oqu();
                    }
                    nyt.m37101a(this.f33717c);
                    continue;
                case 32:
                    b = nzl.m37265b(nyt, 32);
                    a = this.f33718d == null ? 0 : this.f33718d.length;
                    obj = new int[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33718d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37112f();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37112f();
                    this.f33718d = obj;
                    continue;
                case 34:
                    int d = nyt.m37108d(nyt.m37125r());
                    b = nyt.m37128u();
                    a = 0;
                    while (nyt.m37126s() > 0) {
                        nyt.m37112f();
                        a++;
                    }
                    nyt.m37113f(b);
                    b = this.f33718d == null ? 0 : this.f33718d.length;
                    Object obj2 = new int[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f33718d, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.m37112f();
                        b++;
                    }
                    this.f33718d = obj2;
                    nyt.m37111e(d);
                    continue;
                case 40:
                    this.f33719e = Integer.valueOf(nyt.m37112f());
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
