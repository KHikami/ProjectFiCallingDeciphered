package p000;

public final class oqg extends nyx<oqg> {
    public oqi[] f33725a;
    public oqi f33726b;
    public String f33727c;
    public String f33728d;
    public String f33729e;
    public String f33730f;
    public String f33731g;
    public String f33732h;
    public String f33733i;
    public String f33734j;
    public String f33735k;
    public String f33736l;
    public oqh f33737m;
    public String f33738n;
    public Boolean f33739o;

    public /* synthetic */ nzf m39166a(nyt nyt) {
        return m39164b(nyt);
    }

    public oqg() {
        m39165d();
    }

    private oqg m39165d() {
        this.f33725a = oqi.m39175d();
        this.f33726b = null;
        this.f33727c = null;
        this.f33728d = null;
        this.f33729e = null;
        this.f33730f = null;
        this.f33731g = null;
        this.f33732h = null;
        this.f33733i = null;
        this.f33734j = null;
        this.f33735k = null;
        this.f33736l = null;
        this.f33737m = null;
        this.f33738n = null;
        this.f33739o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39167a(nyu nyu) {
        if (this.f33725a != null && this.f33725a.length > 0) {
            for (nzf nzf : this.f33725a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33726b != null) {
            nyu.m37182b(2, this.f33726b);
        }
        if (this.f33727c != null) {
            nyu.m37170a(3, this.f33727c);
        }
        if (this.f33728d != null) {
            nyu.m37170a(4, this.f33728d);
        }
        if (this.f33729e != null) {
            nyu.m37170a(11, this.f33729e);
        }
        if (this.f33730f != null) {
            nyu.m37170a(12, this.f33730f);
        }
        if (this.f33731g != null) {
            nyu.m37170a(13, this.f33731g);
        }
        if (this.f33732h != null) {
            nyu.m37170a(14, this.f33732h);
        }
        if (this.f33733i != null) {
            nyu.m37170a(15, this.f33733i);
        }
        if (this.f33734j != null) {
            nyu.m37170a(16, this.f33734j);
        }
        if (this.f33737m != null) {
            nyu.m37182b(17, this.f33737m);
        }
        if (this.f33738n != null) {
            nyu.m37170a(18, this.f33738n);
        }
        if (this.f33739o != null) {
            nyu.m37172a(19, this.f33739o.booleanValue());
        }
        if (this.f33735k != null) {
            nyu.m37170a(20, this.f33735k);
        }
        if (this.f33736l != null) {
            nyu.m37170a(21, this.f33736l);
        }
        super.a(nyu);
    }

    protected int m39168b() {
        int b = super.b();
        if (this.f33725a != null && this.f33725a.length > 0) {
            for (nzf nzf : this.f33725a) {
                if (nzf != null) {
                    b += nyu.m37145d(1, nzf);
                }
            }
        }
        if (this.f33726b != null) {
            b += nyu.m37145d(2, this.f33726b);
        }
        if (this.f33727c != null) {
            b += nyu.m37137b(3, this.f33727c);
        }
        if (this.f33728d != null) {
            b += nyu.m37137b(4, this.f33728d);
        }
        if (this.f33729e != null) {
            b += nyu.m37137b(11, this.f33729e);
        }
        if (this.f33730f != null) {
            b += nyu.m37137b(12, this.f33730f);
        }
        if (this.f33731g != null) {
            b += nyu.m37137b(13, this.f33731g);
        }
        if (this.f33732h != null) {
            b += nyu.m37137b(14, this.f33732h);
        }
        if (this.f33733i != null) {
            b += nyu.m37137b(15, this.f33733i);
        }
        if (this.f33734j != null) {
            b += nyu.m37137b(16, this.f33734j);
        }
        if (this.f33737m != null) {
            b += nyu.m37145d(17, this.f33737m);
        }
        if (this.f33738n != null) {
            b += nyu.m37137b(18, this.f33738n);
        }
        if (this.f33739o != null) {
            this.f33739o.booleanValue();
            b += nyu.m37154h(19) + 1;
        }
        if (this.f33735k != null) {
            b += nyu.m37137b(20, this.f33735k);
        }
        if (this.f33736l != null) {
            return b + nyu.m37137b(21, this.f33736l);
        }
        return b;
    }

    private oqg m39164b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.m37265b(nyt, 10);
                    if (this.f33725a == null) {
                        a = 0;
                    } else {
                        a = this.f33725a.length;
                    }
                    Object obj = new oqi[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33725a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqi();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqi();
                    nyt.m37101a(obj[a]);
                    this.f33725a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f33726b == null) {
                        this.f33726b = new oqi();
                    }
                    nyt.m37101a(this.f33726b);
                    continue;
                case wi.dx /*26*/:
                    this.f33727c = nyt.m37117j();
                    continue;
                case 34:
                    this.f33728d = nyt.m37117j();
                    continue;
                case 90:
                    this.f33729e = nyt.m37117j();
                    continue;
                case 98:
                    this.f33730f = nyt.m37117j();
                    continue;
                case 106:
                    this.f33731g = nyt.m37117j();
                    continue;
                case 114:
                    this.f33732h = nyt.m37117j();
                    continue;
                case 122:
                    this.f33733i = nyt.m37117j();
                    continue;
                case 130:
                    this.f33734j = nyt.m37117j();
                    continue;
                case 138:
                    if (this.f33737m == null) {
                        this.f33737m = new oqh();
                    }
                    nyt.m37101a(this.f33737m);
                    continue;
                case 146:
                    this.f33738n = nyt.m37117j();
                    continue;
                case 152:
                    this.f33739o = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 162:
                    this.f33735k = nyt.m37117j();
                    continue;
                case 170:
                    this.f33736l = nyt.m37117j();
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
