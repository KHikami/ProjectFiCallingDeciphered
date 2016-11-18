package p000;

public final class ldm extends nyx<ldm> {
    private static volatile ldm[] f24680j;
    public String f24681a;
    public String f24682b;
    public Boolean f24683c;
    public Boolean f24684d;
    public String f24685e;
    public String f24686f;
    public String f24687g;
    public ldn f24688h;
    public Boolean f24689i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28751b(nyt);
    }

    public static ldm[] m28752d() {
        if (f24680j == null) {
            synchronized (nzc.c) {
                if (f24680j == null) {
                    f24680j = new ldm[0];
                }
            }
        }
        return f24680j;
    }

    public ldm() {
        m28753g();
    }

    private ldm m28753g() {
        this.f24681a = null;
        this.f24682b = null;
        this.f24683c = null;
        this.f24684d = null;
        this.f24685e = null;
        this.f24686f = null;
        this.f24687g = null;
        this.f24688h = null;
        this.f24689i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24681a);
        nyu.a(2, this.f24682b);
        nyu.a(3, this.f24683c.booleanValue());
        nyu.a(4, this.f24684d.booleanValue());
        if (this.f24685e != null) {
            nyu.a(5, this.f24685e);
        }
        if (this.f24686f != null) {
            nyu.a(6, this.f24686f);
        }
        if (this.f24687g != null) {
            nyu.a(7, this.f24687g);
        }
        if (this.f24688h != null) {
            nyu.b(8, this.f24688h);
        }
        if (this.f24689i != null) {
            nyu.a(9, this.f24689i.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f24681a)) + nyu.b(2, this.f24682b);
        this.f24683c.booleanValue();
        b += nyu.h(3) + 1;
        this.f24684d.booleanValue();
        b += nyu.h(4) + 1;
        if (this.f24685e != null) {
            b += nyu.b(5, this.f24685e);
        }
        if (this.f24686f != null) {
            b += nyu.b(6, this.f24686f);
        }
        if (this.f24687g != null) {
            b += nyu.b(7, this.f24687g);
        }
        if (this.f24688h != null) {
            b += nyu.d(8, this.f24688h);
        }
        if (this.f24689i == null) {
            return b;
        }
        this.f24689i.booleanValue();
        return b + (nyu.h(9) + 1);
    }

    private ldm m28751b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24681a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24682b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24683c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f24684d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f24685e = nyt.j();
                    continue;
                case 50:
                    this.f24686f = nyt.j();
                    continue;
                case 58:
                    this.f24687g = nyt.j();
                    continue;
                case 66:
                    if (this.f24688h == null) {
                        this.f24688h = new ldn();
                    }
                    nyt.a(this.f24688h);
                    continue;
                case 72:
                    this.f24689i = Boolean.valueOf(nyt.i());
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
