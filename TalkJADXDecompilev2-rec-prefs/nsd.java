package p000;

public final class nsd extends nyx<nsd> {
    public Integer f30673a;
    public Integer f30674b;
    public Integer f30675c;
    public Integer f30676d;
    public Integer f30677e;
    public Integer f30678f;
    public Float f30679g;
    public Float f30680h;
    public Float f30681i;

    public /* synthetic */ nzf m36342a(nyt nyt) {
        return m36341b(nyt);
    }

    public nsd() {
        this.f30673a = null;
        this.f30674b = null;
        this.f30675c = null;
        this.f30676d = null;
        this.f30677e = null;
        this.f30678f = null;
        this.f30679g = null;
        this.f30680h = null;
        this.f30681i = null;
        this.cachedSize = -1;
    }

    public void m36343a(nyu nyu) {
        if (this.f30673a != null) {
            nyu.m37168a(1, this.f30673a.intValue());
        }
        if (this.f30674b != null) {
            nyu.m37168a(2, this.f30674b.intValue());
        }
        if (this.f30675c != null) {
            nyu.m37168a(3, this.f30675c.intValue());
        }
        if (this.f30676d != null) {
            nyu.m37168a(4, this.f30676d.intValue());
        }
        if (this.f30677e != null) {
            nyu.m37168a(5, this.f30677e.intValue());
        }
        if (this.f30678f != null) {
            nyu.m37168a(6, this.f30678f.intValue());
        }
        if (this.f30679g != null) {
            nyu.m37167a(7, this.f30679g.floatValue());
        }
        if (this.f30680h != null) {
            nyu.m37167a(8, this.f30680h.floatValue());
        }
        if (this.f30681i != null) {
            nyu.m37167a(9, this.f30681i.floatValue());
        }
        super.a(nyu);
    }

    protected int m36344b() {
        int b = super.b();
        if (this.f30673a != null) {
            b += nyu.m37147f(1, this.f30673a.intValue());
        }
        if (this.f30674b != null) {
            b += nyu.m37147f(2, this.f30674b.intValue());
        }
        if (this.f30675c != null) {
            b += nyu.m37147f(3, this.f30675c.intValue());
        }
        if (this.f30676d != null) {
            b += nyu.m37147f(4, this.f30676d.intValue());
        }
        if (this.f30677e != null) {
            b += nyu.m37147f(5, this.f30677e.intValue());
        }
        if (this.f30678f != null) {
            b += nyu.m37147f(6, this.f30678f.intValue());
        }
        if (this.f30679g != null) {
            this.f30679g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f30680h != null) {
            this.f30680h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f30681i == null) {
            return b;
        }
        this.f30681i.floatValue();
        return b + (nyu.m37154h(9) + 4);
    }

    private nsd m36341b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30673a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f30674b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f30675c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f30676d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f30677e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f30678f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 61:
                    this.f30679g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f30680h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f30681i = Float.valueOf(nyt.m37106c());
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
