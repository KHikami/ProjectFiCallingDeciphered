package p000;

public final class nvc extends nyx<nvc> {
    public Float f31107a;
    public Float f31108b;
    public Float f31109c;
    public Float f31110d;
    public Float f31111e;
    public Float f31112f;
    public Float f31113g;
    public Float f31114h;
    public Float f31115i;

    public /* synthetic */ nzf m36690a(nyt nyt) {
        return m36688b(nyt);
    }

    public nvc() {
        m36689d();
    }

    private nvc m36689d() {
        this.f31107a = null;
        this.f31108b = null;
        this.f31109c = null;
        this.f31110d = null;
        this.f31111e = null;
        this.f31112f = null;
        this.f31113g = null;
        this.f31114h = null;
        this.f31115i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36691a(nyu nyu) {
        nyu.m37167a(1, this.f31107a.floatValue());
        nyu.m37167a(2, this.f31108b.floatValue());
        nyu.m37167a(3, this.f31109c.floatValue());
        nyu.m37167a(4, this.f31110d.floatValue());
        nyu.m37167a(5, this.f31111e.floatValue());
        nyu.m37167a(6, this.f31112f.floatValue());
        nyu.m37167a(7, this.f31113g.floatValue());
        nyu.m37167a(8, this.f31114h.floatValue());
        nyu.m37167a(9, this.f31115i.floatValue());
        super.a(nyu);
    }

    protected int m36692b() {
        int b = super.b();
        this.f31107a.floatValue();
        b += nyu.m37154h(1) + 4;
        this.f31108b.floatValue();
        b += nyu.m37154h(2) + 4;
        this.f31109c.floatValue();
        b += nyu.m37154h(3) + 4;
        this.f31110d.floatValue();
        b += nyu.m37154h(4) + 4;
        this.f31111e.floatValue();
        b += nyu.m37154h(5) + 4;
        this.f31112f.floatValue();
        b += nyu.m37154h(6) + 4;
        this.f31113g.floatValue();
        b += nyu.m37154h(7) + 4;
        this.f31114h.floatValue();
        b += nyu.m37154h(8) + 4;
        this.f31115i.floatValue();
        return b + (nyu.m37154h(9) + 4);
    }

    private nvc m36688b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f31107a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f31108b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f31109c = Float.valueOf(nyt.m37106c());
                    continue;
                case 37:
                    this.f31110d = Float.valueOf(nyt.m37106c());
                    continue;
                case 45:
                    this.f31111e = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f31112f = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f31113g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f31114h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f31115i = Float.valueOf(nyt.m37106c());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
