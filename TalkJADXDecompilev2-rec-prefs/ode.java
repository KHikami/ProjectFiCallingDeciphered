package p000;

public final class ode extends nyx<ode> {
    private static volatile ode[] f32371F;
    public Float f32372A;
    public Float f32373B;
    public Float f32374C;
    public Float f32375D;
    public byte[] f32376E;
    public odf f32377a;
    public odf f32378b;
    public Integer f32379c;
    public Integer f32380d;
    public odh[] f32381e;
    public odg[] f32382f;
    public Float f32383g;
    public Float f32384h;
    public Float f32385i;
    public Float f32386j;
    public Float f32387k;
    public Float f32388l;
    public Float f32389m;
    public Float f32390n;
    public Float f32391o;
    public Float f32392p;
    public Float f32393q;
    public Float f32394r;
    public Float f32395s;
    public Float f32396t;
    public Float f32397u;
    public Float f32398v;
    public Float f32399w;
    public Float f32400x;
    public Float f32401y;
    public Float f32402z;

    public /* synthetic */ nzf m37836a(nyt nyt) {
        return m37834b(nyt);
    }

    public static ode[] m37835d() {
        if (f32371F == null) {
            synchronized (nzc.f31309c) {
                if (f32371F == null) {
                    f32371F = new ode[0];
                }
            }
        }
        return f32371F;
    }

    public ode() {
        this.f32379c = null;
        this.f32380d = null;
        this.f32381e = odh.m37849d();
        this.f32382f = odg.m37844d();
        this.f32383g = null;
        this.f32384h = null;
        this.f32385i = null;
        this.f32386j = null;
        this.f32387k = null;
        this.f32388l = null;
        this.f32389m = null;
        this.f32390n = null;
        this.f32391o = null;
        this.f32392p = null;
        this.f32393q = null;
        this.f32394r = null;
        this.f32395s = null;
        this.f32396t = null;
        this.f32397u = null;
        this.f32398v = null;
        this.f32399w = null;
        this.f32400x = null;
        this.f32401y = null;
        this.f32402z = null;
        this.f32372A = null;
        this.f32373B = null;
        this.f32374C = null;
        this.f32375D = null;
        this.f32376E = null;
        this.cachedSize = -1;
    }

    public void m37837a(nyu nyu) {
        int i = 0;
        if (this.f32377a != null) {
            nyu.m37182b(1, this.f32377a);
        }
        if (this.f32378b != null) {
            nyu.m37182b(2, this.f32378b);
        }
        if (this.f32379c != null) {
            nyu.m37168a(3, this.f32379c.intValue());
        }
        if (this.f32380d != null) {
            nyu.m37168a(4, this.f32380d.intValue());
        }
        if (this.f32381e != null && this.f32381e.length > 0) {
            for (nzf nzf : this.f32381e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        if (this.f32382f != null && this.f32382f.length > 0) {
            while (i < this.f32382f.length) {
                nzf nzf2 = this.f32382f[i];
                if (nzf2 != null) {
                    nyu.m37182b(6, nzf2);
                }
                i++;
            }
        }
        if (this.f32383g != null) {
            nyu.m37167a(7, this.f32383g.floatValue());
        }
        if (this.f32384h != null) {
            nyu.m37167a(8, this.f32384h.floatValue());
        }
        if (this.f32385i != null) {
            nyu.m37167a(9, this.f32385i.floatValue());
        }
        if (this.f32386j != null) {
            nyu.m37167a(10, this.f32386j.floatValue());
        }
        if (this.f32387k != null) {
            nyu.m37167a(11, this.f32387k.floatValue());
        }
        if (this.f32388l != null) {
            nyu.m37167a(12, this.f32388l.floatValue());
        }
        if (this.f32389m != null) {
            nyu.m37167a(13, this.f32389m.floatValue());
        }
        if (this.f32390n != null) {
            nyu.m37167a(14, this.f32390n.floatValue());
        }
        if (this.f32391o != null) {
            nyu.m37167a(15, this.f32391o.floatValue());
        }
        if (this.f32392p != null) {
            nyu.m37167a(16, this.f32392p.floatValue());
        }
        if (this.f32393q != null) {
            nyu.m37167a(17, this.f32393q.floatValue());
        }
        if (this.f32394r != null) {
            nyu.m37167a(18, this.f32394r.floatValue());
        }
        if (this.f32395s != null) {
            nyu.m37167a(19, this.f32395s.floatValue());
        }
        if (this.f32396t != null) {
            nyu.m37167a(20, this.f32396t.floatValue());
        }
        if (this.f32397u != null) {
            nyu.m37167a(21, this.f32397u.floatValue());
        }
        if (this.f32398v != null) {
            nyu.m37167a(22, this.f32398v.floatValue());
        }
        if (this.f32375D != null) {
            nyu.m37167a(23, this.f32375D.floatValue());
        }
        if (this.f32399w != null) {
            nyu.m37167a(24, this.f32399w.floatValue());
        }
        if (this.f32400x != null) {
            nyu.m37167a(25, this.f32400x.floatValue());
        }
        if (this.f32401y != null) {
            nyu.m37167a(26, this.f32401y.floatValue());
        }
        if (this.f32402z != null) {
            nyu.m37167a(27, this.f32402z.floatValue());
        }
        if (this.f32372A != null) {
            nyu.m37167a(28, this.f32372A.floatValue());
        }
        if (this.f32373B != null) {
            nyu.m37167a(29, this.f32373B.floatValue());
        }
        if (this.f32374C != null) {
            nyu.m37167a(30, this.f32374C.floatValue());
        }
        if (this.f32376E != null) {
            nyu.m37173a(31, this.f32376E);
        }
        super.a(nyu);
    }

    protected int m37838b() {
        int i = 0;
        int b = super.b();
        if (this.f32377a != null) {
            b += nyu.m37145d(1, this.f32377a);
        }
        if (this.f32378b != null) {
            b += nyu.m37145d(2, this.f32378b);
        }
        if (this.f32379c != null) {
            b += nyu.m37147f(3, this.f32379c.intValue());
        }
        if (this.f32380d != null) {
            b += nyu.m37147f(4, this.f32380d.intValue());
        }
        if (this.f32381e != null && this.f32381e.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f32381e) {
                if (nzf != null) {
                    i2 += nyu.m37145d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f32382f != null && this.f32382f.length > 0) {
            while (i < this.f32382f.length) {
                nzf nzf2 = this.f32382f[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(6, nzf2);
                }
                i++;
            }
        }
        if (this.f32383g != null) {
            this.f32383g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f32384h != null) {
            this.f32384h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f32385i != null) {
            this.f32385i.floatValue();
            b += nyu.m37154h(9) + 4;
        }
        if (this.f32386j != null) {
            this.f32386j.floatValue();
            b += nyu.m37154h(10) + 4;
        }
        if (this.f32387k != null) {
            this.f32387k.floatValue();
            b += nyu.m37154h(11) + 4;
        }
        if (this.f32388l != null) {
            this.f32388l.floatValue();
            b += nyu.m37154h(12) + 4;
        }
        if (this.f32389m != null) {
            this.f32389m.floatValue();
            b += nyu.m37154h(13) + 4;
        }
        if (this.f32390n != null) {
            this.f32390n.floatValue();
            b += nyu.m37154h(14) + 4;
        }
        if (this.f32391o != null) {
            this.f32391o.floatValue();
            b += nyu.m37154h(15) + 4;
        }
        if (this.f32392p != null) {
            this.f32392p.floatValue();
            b += nyu.m37154h(16) + 4;
        }
        if (this.f32393q != null) {
            this.f32393q.floatValue();
            b += nyu.m37154h(17) + 4;
        }
        if (this.f32394r != null) {
            this.f32394r.floatValue();
            b += nyu.m37154h(18) + 4;
        }
        if (this.f32395s != null) {
            this.f32395s.floatValue();
            b += nyu.m37154h(19) + 4;
        }
        if (this.f32396t != null) {
            this.f32396t.floatValue();
            b += nyu.m37154h(20) + 4;
        }
        if (this.f32397u != null) {
            this.f32397u.floatValue();
            b += nyu.m37154h(21) + 4;
        }
        if (this.f32398v != null) {
            this.f32398v.floatValue();
            b += nyu.m37154h(22) + 4;
        }
        if (this.f32375D != null) {
            this.f32375D.floatValue();
            b += nyu.m37154h(23) + 4;
        }
        if (this.f32399w != null) {
            this.f32399w.floatValue();
            b += nyu.m37154h(24) + 4;
        }
        if (this.f32400x != null) {
            this.f32400x.floatValue();
            b += nyu.m37154h(25) + 4;
        }
        if (this.f32401y != null) {
            this.f32401y.floatValue();
            b += nyu.m37154h(26) + 4;
        }
        if (this.f32402z != null) {
            this.f32402z.floatValue();
            b += nyu.m37154h(27) + 4;
        }
        if (this.f32372A != null) {
            this.f32372A.floatValue();
            b += nyu.m37154h(28) + 4;
        }
        if (this.f32373B != null) {
            this.f32373B.floatValue();
            b += nyu.m37154h(29) + 4;
        }
        if (this.f32374C != null) {
            this.f32374C.floatValue();
            b += nyu.m37154h(30) + 4;
        }
        if (this.f32376E != null) {
            return b + nyu.m37139b(31, this.f32376E);
        }
        return b;
    }

    private ode m37834b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32377a == null) {
                        this.f32377a = new odf();
                    }
                    nyt.m37101a(this.f32377a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32378b == null) {
                        this.f32378b = new odf();
                    }
                    nyt.m37101a(this.f32378b);
                    continue;
                case wi.dA /*24*/:
                    this.f32379c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f32380d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f32381e == null) {
                        a = 0;
                    } else {
                        a = this.f32381e.length;
                    }
                    obj = new odh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32381e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odh();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odh();
                    nyt.m37101a(obj[a]);
                    this.f32381e = obj;
                    continue;
                case 50:
                    b = nzl.m37265b(nyt, 50);
                    if (this.f32382f == null) {
                        a = 0;
                    } else {
                        a = this.f32382f.length;
                    }
                    obj = new odg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f32382f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new odg();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new odg();
                    nyt.m37101a(obj[a]);
                    this.f32382f = obj;
                    continue;
                case 61:
                    this.f32383g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f32384h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f32385i = Float.valueOf(nyt.m37106c());
                    continue;
                case 85:
                    this.f32386j = Float.valueOf(nyt.m37106c());
                    continue;
                case 93:
                    this.f32387k = Float.valueOf(nyt.m37106c());
                    continue;
                case 101:
                    this.f32388l = Float.valueOf(nyt.m37106c());
                    continue;
                case 109:
                    this.f32389m = Float.valueOf(nyt.m37106c());
                    continue;
                case 117:
                    this.f32390n = Float.valueOf(nyt.m37106c());
                    continue;
                case 125:
                    this.f32391o = Float.valueOf(nyt.m37106c());
                    continue;
                case 133:
                    this.f32392p = Float.valueOf(nyt.m37106c());
                    continue;
                case 141:
                    this.f32393q = Float.valueOf(nyt.m37106c());
                    continue;
                case 149:
                    this.f32394r = Float.valueOf(nyt.m37106c());
                    continue;
                case 157:
                    this.f32395s = Float.valueOf(nyt.m37106c());
                    continue;
                case 165:
                    this.f32396t = Float.valueOf(nyt.m37106c());
                    continue;
                case 173:
                    this.f32397u = Float.valueOf(nyt.m37106c());
                    continue;
                case 181:
                    this.f32398v = Float.valueOf(nyt.m37106c());
                    continue;
                case 189:
                    this.f32375D = Float.valueOf(nyt.m37106c());
                    continue;
                case 197:
                    this.f32399w = Float.valueOf(nyt.m37106c());
                    continue;
                case 205:
                    this.f32400x = Float.valueOf(nyt.m37106c());
                    continue;
                case 213:
                    this.f32401y = Float.valueOf(nyt.m37106c());
                    continue;
                case 221:
                    this.f32402z = Float.valueOf(nyt.m37106c());
                    continue;
                case 229:
                    this.f32372A = Float.valueOf(nyt.m37106c());
                    continue;
                case 237:
                    this.f32373B = Float.valueOf(nyt.m37106c());
                    continue;
                case 245:
                    this.f32374C = Float.valueOf(nyt.m37106c());
                    continue;
                case 250:
                    this.f32376E = nyt.m37118k();
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
