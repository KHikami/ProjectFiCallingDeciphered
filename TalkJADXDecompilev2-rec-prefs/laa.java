package p000;

public final class laa extends nyx<laa> {
    private static volatile laa[] f24322j;
    public String f24323a;
    public String f24324b;
    public Boolean f24325c;
    public Boolean f24326d;
    public String f24327e;
    public String f24328f;
    public String f24329g;
    public lab f24330h;
    public Boolean f24331i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28319b(nyt);
    }

    public static laa[] m28320d() {
        if (f24322j == null) {
            synchronized (nzc.c) {
                if (f24322j == null) {
                    f24322j = new laa[0];
                }
            }
        }
        return f24322j;
    }

    public laa() {
        this.f24323a = null;
        this.f24324b = null;
        this.f24325c = null;
        this.f24326d = null;
        this.f24327e = null;
        this.f24328f = null;
        this.f24329g = null;
        this.f24331i = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24323a);
        nyu.a(2, this.f24324b);
        nyu.a(3, this.f24325c.booleanValue());
        nyu.a(4, this.f24326d.booleanValue());
        if (this.f24327e != null) {
            nyu.a(5, this.f24327e);
        }
        if (this.f24328f != null) {
            nyu.a(6, this.f24328f);
        }
        if (this.f24329g != null) {
            nyu.a(7, this.f24329g);
        }
        if (this.f24330h != null) {
            nyu.b(8, this.f24330h);
        }
        if (this.f24331i != null) {
            nyu.a(9, this.f24331i.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f24323a)) + nyu.b(2, this.f24324b);
        this.f24325c.booleanValue();
        b += nyu.h(3) + 1;
        this.f24326d.booleanValue();
        b += nyu.h(4) + 1;
        if (this.f24327e != null) {
            b += nyu.b(5, this.f24327e);
        }
        if (this.f24328f != null) {
            b += nyu.b(6, this.f24328f);
        }
        if (this.f24329g != null) {
            b += nyu.b(7, this.f24329g);
        }
        if (this.f24330h != null) {
            b += nyu.d(8, this.f24330h);
        }
        if (this.f24331i == null) {
            return b;
        }
        this.f24331i.booleanValue();
        return b + (nyu.h(9) + 1);
    }

    private laa m28319b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24323a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24324b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24325c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f24326d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f24327e = nyt.j();
                    continue;
                case 50:
                    this.f24328f = nyt.j();
                    continue;
                case 58:
                    this.f24329g = nyt.j();
                    continue;
                case 66:
                    if (this.f24330h == null) {
                        this.f24330h = new lab();
                    }
                    nyt.a(this.f24330h);
                    continue;
                case 72:
                    this.f24331i = Boolean.valueOf(nyt.i());
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
