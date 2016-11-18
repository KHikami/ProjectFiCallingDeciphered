package p000;

public final class nab extends nyx<nab> {
    private static volatile nab[] f29309p;
    public Integer f29310a;
    public Integer f29311b;
    public Integer f29312c;
    public Integer f29313d;
    public Float f29314e;
    public Float f29315f;
    public Float f29316g;
    public Float f29317h;
    public Float f29318i;
    public Float f29319j;
    public Float f29320k;
    public Integer f29321l;
    public Float f29322m;
    public Float f29323n;
    public Float f29324o;

    public /* synthetic */ nzf m34012a(nyt nyt) {
        return m34010b(nyt);
    }

    public static nab[] m34011d() {
        if (f29309p == null) {
            synchronized (nzc.f31309c) {
                if (f29309p == null) {
                    f29309p = new nab[0];
                }
            }
        }
        return f29309p;
    }

    public nab() {
        this.f29310a = null;
        this.f29311b = null;
        this.f29312c = null;
        this.f29313d = null;
        this.f29314e = null;
        this.f29315f = null;
        this.f29316g = null;
        this.f29317h = null;
        this.f29318i = null;
        this.f29319j = null;
        this.f29320k = null;
        this.f29321l = null;
        this.f29322m = null;
        this.f29323n = null;
        this.f29324o = null;
        this.cachedSize = -1;
    }

    public void m34013a(nyu nyu) {
        if (this.f29310a != null) {
            nyu.m37168a(1, this.f29310a.intValue());
        }
        if (this.f29311b != null) {
            nyu.m37168a(2, this.f29311b.intValue());
        }
        if (this.f29312c != null) {
            nyu.m37168a(3, this.f29312c.intValue());
        }
        if (this.f29313d != null) {
            nyu.m37168a(4, this.f29313d.intValue());
        }
        if (this.f29314e != null) {
            nyu.m37167a(5, this.f29314e.floatValue());
        }
        if (this.f29315f != null) {
            nyu.m37167a(6, this.f29315f.floatValue());
        }
        if (this.f29316g != null) {
            nyu.m37167a(7, this.f29316g.floatValue());
        }
        if (this.f29317h != null) {
            nyu.m37167a(8, this.f29317h.floatValue());
        }
        if (this.f29318i != null) {
            nyu.m37167a(9, this.f29318i.floatValue());
        }
        if (this.f29319j != null) {
            nyu.m37167a(10, this.f29319j.floatValue());
        }
        if (this.f29320k != null) {
            nyu.m37167a(11, this.f29320k.floatValue());
        }
        if (this.f29321l != null) {
            nyu.m37168a(12, this.f29321l.intValue());
        }
        if (this.f29322m != null) {
            nyu.m37167a(13, this.f29322m.floatValue());
        }
        if (this.f29323n != null) {
            nyu.m37167a(14, this.f29323n.floatValue());
        }
        if (this.f29324o != null) {
            nyu.m37167a(15, this.f29324o.floatValue());
        }
        super.a(nyu);
    }

    protected int m34014b() {
        int b = super.b();
        if (this.f29310a != null) {
            b += nyu.m37147f(1, this.f29310a.intValue());
        }
        if (this.f29311b != null) {
            b += nyu.m37147f(2, this.f29311b.intValue());
        }
        if (this.f29312c != null) {
            b += nyu.m37147f(3, this.f29312c.intValue());
        }
        if (this.f29313d != null) {
            b += nyu.m37147f(4, this.f29313d.intValue());
        }
        if (this.f29314e != null) {
            this.f29314e.floatValue();
            b += nyu.m37154h(5) + 4;
        }
        if (this.f29315f != null) {
            this.f29315f.floatValue();
            b += nyu.m37154h(6) + 4;
        }
        if (this.f29316g != null) {
            this.f29316g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f29317h != null) {
            this.f29317h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f29318i != null) {
            this.f29318i.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f29319j != null) {
            this.f29319j.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f29320k != null) {
            this.f29320k.floatValue();
            b += nyu.m37154h(11) + 4;
        }
        if (this.f29321l != null) {
            b += nyu.m37147f(12, this.f29321l.intValue());
        }
        if (this.f29322m != null) {
            this.f29322m.floatValue();
            b += nyu.m37154h(13) + 4;
        }
        if (this.f29323n != null) {
            this.f29323n.floatValue();
            b += nyu.m37154h(14) + 4;
        }
        if (this.f29324o == null) {
            return b;
        }
        this.f29324o.floatValue();
        return b + (nyu.m37154h(15) + 4);
    }

    private nab m34010b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29310a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29311b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f29312c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f29313d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 45:
                    this.f29314e = Float.valueOf(nyt.m37106c());
                    continue;
                case 53:
                    this.f29315f = Float.valueOf(nyt.m37106c());
                    continue;
                case 61:
                    this.f29316g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f29317h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f29318i = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f29319j = Float.valueOf(nyt.m37106c());
                    continue;
                case 93:
                    this.f29320k = Float.valueOf(nyt.m37106c());
                    continue;
                case 96:
                    this.f29321l = Integer.valueOf(nyt.m37112f());
                    continue;
                case 109:
                    this.f29322m = Float.valueOf(nyt.m37106c());
                    continue;
                case 117:
                    this.f29323n = Float.valueOf(nyt.m37106c());
                    continue;
                case 125:
                    this.f29324o = Float.valueOf(nyt.m37106c());
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
