package p000;

public final class llb extends nyx<llb> {
    private static volatile llb[] f25311c;
    public Integer f25312a;
    public Integer f25313b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29310b(nyt);
    }

    public static llb[] m29311d() {
        if (f25311c == null) {
            synchronized (nzc.c) {
                if (f25311c == null) {
                    f25311c = new llb[0];
                }
            }
        }
        return f25311c;
    }

    public llb() {
        m29312g();
    }

    private llb m29312g() {
        this.f25312a = null;
        this.f25313b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25312a != null) {
            nyu.a(1, this.f25312a.intValue());
        }
        if (this.f25313b != null) {
            nyu.a(2, this.f25313b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25312a != null) {
            b += nyu.f(1, this.f25312a.intValue());
        }
        if (this.f25313b != null) {
            return b + nyu.f(2, this.f25313b.intValue());
        }
        return b;
    }

    private llb m29310b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25312a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25313b = Integer.valueOf(nyt.f());
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
