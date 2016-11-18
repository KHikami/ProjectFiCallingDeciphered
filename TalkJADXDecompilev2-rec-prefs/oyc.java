package p000;

public final class oyc extends nyx<oyc> {
    private static volatile oyc[] f34576k;
    public Float f34577a;
    public Float f34578b;
    public Float f34579c;
    public Boolean f34580d;
    public Float f34581e;
    public Float f34582f;
    public Float f34583g;
    public Float f34584h;
    public Float f34585i;
    public Float f34586j;

    public /* synthetic */ nzf m39874a(nyt nyt) {
        return m39871b(nyt);
    }

    public static oyc[] m39872d() {
        if (f34576k == null) {
            synchronized (nzc.f31309c) {
                if (f34576k == null) {
                    f34576k = new oyc[0];
                }
            }
        }
        return f34576k;
    }

    public oyc() {
        m39873g();
    }

    private oyc m39873g() {
        this.f34577a = null;
        this.f34578b = null;
        this.f34579c = null;
        this.f34580d = null;
        this.f34581e = null;
        this.f34582f = null;
        this.f34583g = null;
        this.f34584h = null;
        this.f34585i = null;
        this.f34586j = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39875a(nyu nyu) {
        if (this.f34577a != null) {
            nyu.m37167a(1, this.f34577a.floatValue());
        }
        if (this.f34578b != null) {
            nyu.m37167a(2, this.f34578b.floatValue());
        }
        if (this.f34579c != null) {
            nyu.m37167a(3, this.f34579c.floatValue());
        }
        if (this.f34580d != null) {
            nyu.m37172a(4, this.f34580d.booleanValue());
        }
        if (this.f34581e != null) {
            nyu.m37167a(5, this.f34581e.floatValue());
        }
        if (this.f34582f != null) {
            nyu.m37167a(6, this.f34582f.floatValue());
        }
        if (this.f34583g != null) {
            nyu.m37167a(7, this.f34583g.floatValue());
        }
        if (this.f34584h != null) {
            nyu.m37167a(8, this.f34584h.floatValue());
        }
        if (this.f34585i != null) {
            nyu.m37167a(9, this.f34585i.floatValue());
        }
        if (this.f34586j != null) {
            nyu.m37167a(10, this.f34586j.floatValue());
        }
        super.a(nyu);
    }

    protected int m39876b() {
        int b = super.b();
        if (this.f34577a != null) {
            this.f34577a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f34578b != null) {
            this.f34578b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f34579c != null) {
            this.f34579c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f34580d != null) {
            this.f34580d.booleanValue();
            b += nyu.m37154h(4) + 1;
        }
        if (this.f34581e != null) {
            this.f34581e.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f34582f != null) {
            this.f34582f.floatValue();
            b += nyu.m37154h(6) + 4;
        }
        if (this.f34583g != null) {
            this.f34583g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f34584h != null) {
            this.f34584h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f34585i != null) {
            this.f34585i.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f34586j == null) {
            return b;
        }
        this.f34586j.floatValue();
        return b + (nyu.m37154h(10) + 4);
    }

    private oyc m39871b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f34577a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f34578b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f34579c = Float.valueOf(nyt.m37106c());
                    continue;
                case 32:
                    this.f34580d = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 45:
                    this.f34581e = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f34582f = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f34583g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f34584h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f34585i = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f34586j = Float.valueOf(nyt.m37106c());
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
