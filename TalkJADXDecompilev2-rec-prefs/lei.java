package p000;

public final class lei extends nyx<lei> {
    private static volatile lei[] f24823e;
    public Integer f24824a;
    public String f24825b;
    public String f24826c;
    public Boolean f24827d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28865b(nyt);
    }

    public static lei[] m28866d() {
        if (f24823e == null) {
            synchronized (nzc.c) {
                if (f24823e == null) {
                    f24823e = new lei[0];
                }
            }
        }
        return f24823e;
    }

    public lei() {
        m28867g();
    }

    private lei m28867g() {
        this.f24824a = null;
        this.f24825b = null;
        this.f24826c = null;
        this.f24827d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24824a != null) {
            nyu.a(1, this.f24824a.intValue());
        }
        if (this.f24825b != null) {
            nyu.a(2, this.f24825b);
        }
        nyu.a(3, this.f24826c);
        if (this.f24827d != null) {
            nyu.a(4, this.f24827d.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24824a != null) {
            b += nyu.f(1, this.f24824a.intValue());
        }
        if (this.f24825b != null) {
            b += nyu.b(2, this.f24825b);
        }
        b += nyu.b(3, this.f24826c);
        if (this.f24827d == null) {
            return b;
        }
        this.f24827d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private lei m28865b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24824a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f24825b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24826c = nyt.j();
                    continue;
                case 32:
                    this.f24827d = Boolean.valueOf(nyt.i());
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
