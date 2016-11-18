package p000;

public final class nus extends nyx<nus> {
    public Float f30982a;
    public Float f30983b;
    public Float f30984c;
    public Float f30985d;
    public Float f30986e;
    public Float f30987f;
    public Float f30988g;
    public Float f30989h;
    public Boolean f30990i;
    public Boolean f30991j;
    public Boolean f30992k;
    public Float f30993l;

    public /* synthetic */ nzf m36639a(nyt nyt) {
        return m36637b(nyt);
    }

    public nus() {
        m36638d();
    }

    private nus m36638d() {
        this.f30982a = null;
        this.f30983b = null;
        this.f30984c = null;
        this.f30985d = null;
        this.f30986e = null;
        this.f30987f = null;
        this.f30988g = null;
        this.f30989h = null;
        this.f30990i = null;
        this.f30991j = null;
        this.f30992k = null;
        this.f30993l = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m36640a(nyu nyu) {
        if (this.f30982a != null) {
            nyu.m37167a(1, this.f30982a.floatValue());
        }
        if (this.f30983b != null) {
            nyu.m37167a(2, this.f30983b.floatValue());
        }
        if (this.f30984c != null) {
            nyu.m37167a(3, this.f30984c.floatValue());
        }
        if (this.f30988g != null) {
            nyu.m37167a(7, this.f30988g.floatValue());
        }
        if (this.f30989h != null) {
            nyu.m37167a(8, this.f30989h.floatValue());
        }
        if (this.f30986e != null) {
            nyu.m37167a(9, this.f30986e.floatValue());
        }
        if (this.f30985d != null) {
            nyu.m37167a(10, this.f30985d.floatValue());
        }
        if (this.f30987f != null) {
            nyu.m37167a(11, this.f30987f.floatValue());
        }
        if (this.f30990i != null) {
            nyu.m37172a(12, this.f30990i.booleanValue());
        }
        if (this.f30991j != null) {
            nyu.m37172a(13, this.f30991j.booleanValue());
        }
        if (this.f30992k != null) {
            nyu.m37172a(14, this.f30992k.booleanValue());
        }
        if (this.f30993l != null) {
            nyu.m37167a(15, this.f30993l.floatValue());
        }
        super.a(nyu);
    }

    protected int m36641b() {
        int b = super.b();
        if (this.f30982a != null) {
            this.f30982a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f30983b != null) {
            this.f30983b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f30984c != null) {
            this.f30984c.floatValue();
            b += nyu.m37154h(3) + 4;
        }
        if (this.f30988g != null) {
            this.f30988g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f30989h != null) {
            this.f30989h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f30986e != null) {
            this.f30986e.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f30985d != null) {
            this.f30985d.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f30987f != null) {
            this.f30987f.floatValue();
            b += nyu.m37154h(11) + 4;
        }
        if (this.f30990i != null) {
            this.f30990i.booleanValue();
            b += nyu.m37154h(12) + 1;
        }
        if (this.f30991j != null) {
            this.f30991j.booleanValue();
            b += nyu.m37154h(13) + 1;
        }
        if (this.f30992k != null) {
            this.f30992k.booleanValue();
            b += nyu.m37154h(14) + 1;
        }
        if (this.f30993l == null) {
            return b;
        }
        this.f30993l.floatValue();
        return b + (nyu.m37154h(15) + 4);
    }

    private nus m36637b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f30982a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f30983b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f30984c = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f30988g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f30989h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f30986e = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f30985d = Float.valueOf(nyt.m37106c());
                    continue;
                case 93:
                    this.f30987f = Float.valueOf(nyt.m37106c());
                    continue;
                case 96:
                    this.f30990i = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 104:
                    this.f30991j = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 112:
                    this.f30992k = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 125:
                    this.f30993l = Float.valueOf(nyt.m37106c());
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
