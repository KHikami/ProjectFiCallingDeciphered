package p000;

public final class kzf extends nyx<kzf> {
    private static volatile kzf[] f24185e;
    public String f24186a;
    public String f24187b;
    public Integer f24188c;
    public String f24189d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28211b(nyt);
    }

    public static kzf[] m28212d() {
        if (f24185e == null) {
            synchronized (nzc.c) {
                if (f24185e == null) {
                    f24185e = new kzf[0];
                }
            }
        }
        return f24185e;
    }

    public kzf() {
        m28213g();
    }

    private kzf m28213g() {
        this.f24186a = null;
        this.f24187b = null;
        this.f24189d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24186a != null) {
            nyu.a(1, this.f24186a);
        }
        if (this.f24187b != null) {
            nyu.a(2, this.f24187b);
        }
        if (this.f24188c != null) {
            nyu.a(3, this.f24188c.intValue());
        }
        if (this.f24189d != null) {
            nyu.a(4, this.f24189d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24186a != null) {
            b += nyu.b(1, this.f24186a);
        }
        if (this.f24187b != null) {
            b += nyu.b(2, this.f24187b);
        }
        if (this.f24188c != null) {
            b += nyu.f(3, this.f24188c.intValue());
        }
        if (this.f24189d != null) {
            return b + nyu.b(4, this.f24189d);
        }
        return b;
    }

    private kzf m28211b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24186a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24187b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f24188c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f24189d = nyt.j();
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
