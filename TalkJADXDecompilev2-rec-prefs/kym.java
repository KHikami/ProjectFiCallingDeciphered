package p000;

public final class kym extends nyx<kym> {
    private static volatile kym[] f24079j;
    public String f24080a;
    public String f24081b;
    public Boolean f24082c;
    public Boolean f24083d;
    public String f24084e;
    public String f24085f;
    public String f24086g;
    public ldn f24087h;
    public Boolean f24088i;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28086b(nyt);
    }

    public static kym[] m28087d() {
        if (f24079j == null) {
            synchronized (nzc.c) {
                if (f24079j == null) {
                    f24079j = new kym[0];
                }
            }
        }
        return f24079j;
    }

    public kym() {
        m28088g();
    }

    private kym m28088g() {
        this.f24080a = null;
        this.f24081b = null;
        this.f24082c = null;
        this.f24083d = null;
        this.f24084e = null;
        this.f24085f = null;
        this.f24086g = null;
        this.f24087h = null;
        this.f24088i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f24080a);
        nyu.a(2, this.f24081b);
        nyu.a(3, this.f24082c.booleanValue());
        nyu.a(4, this.f24083d.booleanValue());
        if (this.f24084e != null) {
            nyu.a(5, this.f24084e);
        }
        if (this.f24085f != null) {
            nyu.a(6, this.f24085f);
        }
        if (this.f24086g != null) {
            nyu.a(7, this.f24086g);
        }
        if (this.f24087h != null) {
            nyu.b(8, this.f24087h);
        }
        if (this.f24088i != null) {
            nyu.a(9, this.f24088i.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f24080a)) + nyu.b(2, this.f24081b);
        this.f24082c.booleanValue();
        b += nyu.h(3) + 1;
        this.f24083d.booleanValue();
        b += nyu.h(4) + 1;
        if (this.f24084e != null) {
            b += nyu.b(5, this.f24084e);
        }
        if (this.f24085f != null) {
            b += nyu.b(6, this.f24085f);
        }
        if (this.f24086g != null) {
            b += nyu.b(7, this.f24086g);
        }
        if (this.f24087h != null) {
            b += nyu.d(8, this.f24087h);
        }
        if (this.f24088i == null) {
            return b;
        }
        this.f24088i.booleanValue();
        return b + (nyu.h(9) + 1);
    }

    private kym m28086b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24080a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24081b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f24082c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f24083d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f24084e = nyt.j();
                    continue;
                case 50:
                    this.f24085f = nyt.j();
                    continue;
                case 58:
                    this.f24086g = nyt.j();
                    continue;
                case 66:
                    if (this.f24087h == null) {
                        this.f24087h = new ldn();
                    }
                    nyt.a(this.f24087h);
                    continue;
                case 72:
                    this.f24088i = Boolean.valueOf(nyt.i());
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
