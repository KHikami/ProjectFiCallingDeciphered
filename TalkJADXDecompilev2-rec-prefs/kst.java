package p000;

public final class kst extends nyx<kst> {
    private static volatile kst[] f23149f;
    public String f23150a;
    public String f23151b;
    public Boolean f23152c;
    public Boolean f23153d;
    public Boolean f23154e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27367b(nyt);
    }

    public static kst[] m27368d() {
        if (f23149f == null) {
            synchronized (nzc.c) {
                if (f23149f == null) {
                    f23149f = new kst[0];
                }
            }
        }
        return f23149f;
    }

    public kst() {
        m27369g();
    }

    private kst m27369g() {
        this.f23150a = null;
        this.f23151b = null;
        this.f23152c = null;
        this.f23153d = null;
        this.f23154e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23150a);
        nyu.a(2, this.f23151b);
        if (this.f23152c != null) {
            nyu.a(3, this.f23152c.booleanValue());
        }
        if (this.f23153d != null) {
            nyu.a(4, this.f23153d.booleanValue());
        }
        if (this.f23154e != null) {
            nyu.a(5, this.f23154e.booleanValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = (super.mo147b() + nyu.b(1, this.f23150a)) + nyu.b(2, this.f23151b);
        if (this.f23152c != null) {
            this.f23152c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f23153d != null) {
            this.f23153d.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f23154e == null) {
            return b;
        }
        this.f23154e.booleanValue();
        return b + (nyu.h(5) + 1);
    }

    private kst m27367b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23150a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23151b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f23152c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f23153d = Boolean.valueOf(nyt.i());
                    continue;
                case 40:
                    this.f23154e = Boolean.valueOf(nyt.i());
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
