package p000;

public final class llk extends nyx<llk> {
    public Boolean f25369a;
    public Integer f25370b;
    public Integer f25371c;
    public Integer f25372d;
    public Integer f25373e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29356b(nyt);
    }

    public llk() {
        m29357d();
    }

    private llk m29357d() {
        this.f25369a = null;
        this.f25370b = null;
        this.f25371c = null;
        this.f25372d = null;
        this.f25373e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25369a != null) {
            nyu.a(1, this.f25369a.booleanValue());
        }
        if (this.f25370b != null) {
            nyu.a(2, this.f25370b.intValue());
        }
        if (this.f25371c != null) {
            nyu.a(3, this.f25371c.intValue());
        }
        if (this.f25372d != null) {
            nyu.a(4, this.f25372d.intValue());
        }
        if (this.f25373e != null) {
            nyu.a(5, this.f25373e.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25369a != null) {
            this.f25369a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f25370b != null) {
            b += nyu.f(2, this.f25370b.intValue());
        }
        if (this.f25371c != null) {
            b += nyu.f(3, this.f25371c.intValue());
        }
        if (this.f25372d != null) {
            b += nyu.f(4, this.f25372d.intValue());
        }
        if (this.f25373e != null) {
            return b + nyu.f(5, this.f25373e.intValue());
        }
        return b;
    }

    private llk m29356b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25369a = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.f25370b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25371c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.f25372d = Integer.valueOf(nyt.f());
                    continue;
                case 40:
                    this.f25373e = Integer.valueOf(nyt.f());
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
