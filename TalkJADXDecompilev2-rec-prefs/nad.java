package p000;

public final class nad extends nyx<nad> {
    private static volatile nad[] f29329p;
    public Integer f29330a;
    public Integer f29331b;
    public Integer f29332c;
    public Integer f29333d;
    public Float f29334e;
    public Float f29335f;
    public Float f29336g;
    public Float f29337h;
    public Float f29338i;
    public Float f29339j;
    public Float f29340k;
    public Integer f29341l;
    public Float f29342m;
    public Float f29343n;
    public Float f29344o;

    public /* synthetic */ nzf m34022a(nyt nyt) {
        return m34019b(nyt);
    }

    public static nad[] m34020d() {
        if (f29329p == null) {
            synchronized (nzc.f31309c) {
                if (f29329p == null) {
                    f29329p = new nad[0];
                }
            }
        }
        return f29329p;
    }

    public nad() {
        m34021g();
    }

    private nad m34021g() {
        this.f29330a = null;
        this.f29331b = null;
        this.f29332c = null;
        this.f29333d = null;
        this.f29334e = null;
        this.f29335f = null;
        this.f29336g = null;
        this.f29337h = null;
        this.f29338i = null;
        this.f29339j = null;
        this.f29340k = null;
        this.f29341l = null;
        this.f29342m = null;
        this.f29343n = null;
        this.f29344o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34023a(nyu nyu) {
        if (this.f29330a != null) {
            nyu.m37168a(1, this.f29330a.intValue());
        }
        if (this.f29331b != null) {
            nyu.m37168a(2, this.f29331b.intValue());
        }
        if (this.f29332c != null) {
            nyu.m37168a(3, this.f29332c.intValue());
        }
        if (this.f29333d != null) {
            nyu.m37168a(4, this.f29333d.intValue());
        }
        if (this.f29334e != null) {
            nyu.m37167a(5, this.f29334e.floatValue());
        }
        if (this.f29335f != null) {
            nyu.m37167a(6, this.f29335f.floatValue());
        }
        if (this.f29336g != null) {
            nyu.m37167a(7, this.f29336g.floatValue());
        }
        if (this.f29337h != null) {
            nyu.m37167a(8, this.f29337h.floatValue());
        }
        if (this.f29338i != null) {
            nyu.m37167a(9, this.f29338i.floatValue());
        }
        if (this.f29339j != null) {
            nyu.m37167a(10, this.f29339j.floatValue());
        }
        if (this.f29340k != null) {
            nyu.m37167a(11, this.f29340k.floatValue());
        }
        if (this.f29341l != null) {
            nyu.m37168a(12, this.f29341l.intValue());
        }
        if (this.f29342m != null) {
            nyu.m37167a(13, this.f29342m.floatValue());
        }
        if (this.f29343n != null) {
            nyu.m37167a(14, this.f29343n.floatValue());
        }
        if (this.f29344o != null) {
            nyu.m37167a(15, this.f29344o.floatValue());
        }
        super.a(nyu);
    }

    protected int m34024b() {
        int b = super.b();
        if (this.f29330a != null) {
            b += nyu.m37147f(1, this.f29330a.intValue());
        }
        if (this.f29331b != null) {
            b += nyu.m37147f(2, this.f29331b.intValue());
        }
        if (this.f29332c != null) {
            b += nyu.m37147f(3, this.f29332c.intValue());
        }
        if (this.f29333d != null) {
            b += nyu.m37147f(4, this.f29333d.intValue());
        }
        if (this.f29334e != null) {
            this.f29334e.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f29335f != null) {
            this.f29335f.floatValue();
            b += nyu.m37154h(6) + 4;
        }
        if (this.f29336g != null) {
            this.f29336g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f29337h != null) {
            this.f29337h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f29338i != null) {
            this.f29338i.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f29339j != null) {
            this.f29339j.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f29340k != null) {
            this.f29340k.floatValue();
            b += nyu.m37154h(11) + 4;
        }
        if (this.f29341l != null) {
            b += nyu.m37147f(12, this.f29341l.intValue());
        }
        if (this.f29342m != null) {
            this.f29342m.floatValue();
            b += nyu.m37154h(13) + 4;
        }
        if (this.f29343n != null) {
            this.f29343n.floatValue();
            b += nyu.m37154h(14) + 4;
        }
        if (this.f29344o == null) {
            return b;
        }
        this.f29344o.floatValue();
        return b + (nyu.m37154h(15) + 4);
    }

    private nad m34019b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29330a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29331b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f29332c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f29333d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 45:
                    this.f29334e = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f29335f = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f29336g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f29337h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f29338i = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f29339j = Float.valueOf(nyt.m37106c());
                    continue;
                case 93:
                    this.f29340k = Float.valueOf(nyt.m37106c());
                    continue;
                case 96:
                    this.f29341l = Integer.valueOf(nyt.m37112f());
                    continue;
                case 109:
                    this.f29342m = Float.valueOf(nyt.m37106c());
                    continue;
                case 117:
                    this.f29343n = Float.valueOf(nyt.m37106c());
                    continue;
                case 125:
                    this.f29344o = Float.valueOf(nyt.m37106c());
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
