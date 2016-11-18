package p000;

public final class lep extends nyx<lep> {
    private static volatile lep[] f24849g;
    public Integer f24850a;
    public String f24851b;
    public String f24852c;
    public Boolean f24853d;
    public String f24854e;
    public String f24855f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28904b(nyt);
    }

    public static lep[] m28905d() {
        if (f24849g == null) {
            synchronized (nzc.c) {
                if (f24849g == null) {
                    f24849g = new lep[0];
                }
            }
        }
        return f24849g;
    }

    public lep() {
        m28906g();
    }

    private lep m28906g() {
        this.f24850a = null;
        this.f24851b = null;
        this.f24852c = null;
        this.f24853d = null;
        this.f24854e = null;
        this.f24855f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24850a != null) {
            nyu.a(1, this.f24850a.intValue());
        }
        if (this.f24851b != null) {
            nyu.a(2, this.f24851b);
        }
        nyu.a(3, this.f24852c);
        if (this.f24853d != null) {
            nyu.a(4, this.f24853d.booleanValue());
        }
        if (this.f24854e != null) {
            nyu.a(5, this.f24854e);
        }
        if (this.f24855f != null) {
            nyu.a(6, this.f24855f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24850a != null) {
            b += nyu.f(1, this.f24850a.intValue());
        }
        if (this.f24851b != null) {
            b += nyu.b(2, this.f24851b);
        }
        b += nyu.b(3, this.f24852c);
        if (this.f24853d != null) {
            this.f24853d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f24854e != null) {
            b += nyu.b(5, this.f24854e);
        }
        if (this.f24855f != null) {
            return b + nyu.b(6, this.f24855f);
        }
        return b;
    }

    private lep m28904b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24850a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f24851b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24852c = nyt.j();
                    continue;
                case 32:
                    this.f24853d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.f24854e = nyt.j();
                    continue;
                case 50:
                    this.f24855f = nyt.j();
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
