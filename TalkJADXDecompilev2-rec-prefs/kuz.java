package p000;

public final class kuz extends nyx<kuz> {
    private static volatile kuz[] f23527f;
    public String f23528a;
    public String f23529b;
    public String f23530c;
    public String f23531d;
    public String f23532e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27646b(nyt);
    }

    public static kuz[] m27647d() {
        if (f23527f == null) {
            synchronized (nzc.c) {
                if (f23527f == null) {
                    f23527f = new kuz[0];
                }
            }
        }
        return f23527f;
    }

    public kuz() {
        m27648g();
    }

    private kuz m27648g() {
        this.f23528a = null;
        this.f23529b = null;
        this.f23530c = null;
        this.f23531d = null;
        this.f23532e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23528a);
        nyu.a(2, this.f23529b);
        if (this.f23530c != null) {
            nyu.a(3, this.f23530c);
        }
        if (this.f23531d != null) {
            nyu.a(4, this.f23531d);
        }
        if (this.f23532e != null) {
            nyu.a(5, this.f23532e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23528a)) + nyu.b(2, this.f23529b);
        if (this.f23530c != null) {
            b += nyu.b(3, this.f23530c);
        }
        if (this.f23531d != null) {
            b += nyu.b(4, this.f23531d);
        }
        if (this.f23532e != null) {
            return b + nyu.b(5, this.f23532e);
        }
        return b;
    }

    private kuz m27646b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23528a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23529b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23530c = nyt.j();
                    continue;
                case 34:
                    this.f23531d = nyt.j();
                    continue;
                case 42:
                    this.f23532e = nyt.j();
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
