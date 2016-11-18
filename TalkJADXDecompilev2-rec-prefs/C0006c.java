package p000;

public final class C0006c extends nyx<C0006c> {
    public C0053d f4869a;
    public String f4870b;
    public String f4871c;
    public Long f4872d;
    public String f4873e;
    public lma f4874f;
    public llz f4875g;
    public String f4876h;
    public String f4877i;
    public String f4878j;
    public Long f4879k;
    public String f4880l;
    public String f4881m;
    public Long f4882n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m7058b(nyt);
    }

    public C0006c() {
        m7059d();
    }

    private C0006c m7059d() {
        this.f4869a = null;
        this.f4870b = null;
        this.f4871c = null;
        this.f4872d = null;
        this.f4873e = null;
        this.f4874f = null;
        this.f4875g = null;
        this.f4876h = null;
        this.f4877i = null;
        this.f4878j = null;
        this.f4879k = null;
        this.f4880l = null;
        this.f4881m = null;
        this.f4882n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f4869a != null) {
            nyu.b(1, this.f4869a);
        }
        if (this.f4870b != null) {
            nyu.a(2, this.f4870b);
        }
        if (this.f4871c != null) {
            nyu.a(3, this.f4871c);
        }
        if (this.f4872d != null) {
            nyu.b(4, this.f4872d.longValue());
        }
        if (this.f4873e != null) {
            nyu.a(5, this.f4873e);
        }
        if (this.f4874f != null) {
            nyu.b(6, this.f4874f);
        }
        if (this.f4876h != null) {
            nyu.a(7, this.f4876h);
        }
        if (this.f4877i != null) {
            nyu.a(8, this.f4877i);
        }
        if (this.f4878j != null) {
            nyu.a(9, this.f4878j);
        }
        if (this.f4879k != null) {
            nyu.b(10, this.f4879k.longValue());
        }
        if (this.f4880l != null) {
            nyu.a(11, this.f4880l);
        }
        if (this.f4875g != null) {
            nyu.b(12, this.f4875g);
        }
        if (this.f4881m != null) {
            nyu.a(13, this.f4881m);
        }
        if (this.f4882n != null) {
            nyu.a(14, this.f4882n.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f4869a != null) {
            b += nyu.d(1, this.f4869a);
        }
        if (this.f4870b != null) {
            b += nyu.b(2, this.f4870b);
        }
        if (this.f4871c != null) {
            b += nyu.b(3, this.f4871c);
        }
        if (this.f4872d != null) {
            b += nyu.f(4, this.f4872d.longValue());
        }
        if (this.f4873e != null) {
            b += nyu.b(5, this.f4873e);
        }
        if (this.f4874f != null) {
            b += nyu.d(6, this.f4874f);
        }
        if (this.f4876h != null) {
            b += nyu.b(7, this.f4876h);
        }
        if (this.f4877i != null) {
            b += nyu.b(8, this.f4877i);
        }
        if (this.f4878j != null) {
            b += nyu.b(9, this.f4878j);
        }
        if (this.f4879k != null) {
            b += nyu.f(10, this.f4879k.longValue());
        }
        if (this.f4880l != null) {
            b += nyu.b(11, this.f4880l);
        }
        if (this.f4875g != null) {
            b += nyu.d(12, this.f4875g);
        }
        if (this.f4881m != null) {
            b += nyu.b(13, this.f4881m);
        }
        if (this.f4882n != null) {
            return b + nyu.e(14, this.f4882n.longValue());
        }
        return b;
    }

    private C0006c m7058b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f4869a == null) {
                        this.f4869a = new C0053d();
                    }
                    nyt.a(this.f4869a);
                    continue;
                case wi.dH /*18*/:
                    this.f4870b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f4871c = nyt.j();
                    continue;
                case 32:
                    this.f4872d = Long.valueOf(nyt.e());
                    continue;
                case 42:
                    this.f4873e = nyt.j();
                    continue;
                case 50:
                    if (this.f4874f == null) {
                        this.f4874f = new lma();
                    }
                    nyt.a(this.f4874f);
                    continue;
                case 58:
                    this.f4876h = nyt.j();
                    continue;
                case 66:
                    this.f4877i = nyt.j();
                    continue;
                case 74:
                    this.f4878j = nyt.j();
                    continue;
                case 80:
                    this.f4879k = Long.valueOf(nyt.e());
                    continue;
                case 90:
                    this.f4880l = nyt.j();
                    continue;
                case 98:
                    if (this.f4875g == null) {
                        this.f4875g = new llz();
                    }
                    nyt.a(this.f4875g);
                    continue;
                case 106:
                    this.f4881m = nyt.j();
                    continue;
                case 112:
                    this.f4882n = Long.valueOf(nyt.d());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
