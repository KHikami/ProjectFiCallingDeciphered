package p000;

public final class kyg extends nyx<kyg> {
    public Integer f24018a;
    public Integer f24019b;
    public Float f24020c;
    public Float f24021d;
    public String f24022e;
    public String f24023f;
    public String f24024g;
    public String f24025h;
    public kyh f24026i;
    public String f24027j;
    public String f24028k;
    public String f24029l;
    public String f24030m;
    public Boolean f24031n;
    public Double f24032o;
    public Boolean f24033p;
    public String f24034q;
    public kyn[] f24035r;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28054b(nyt);
    }

    public kyg() {
        m28055d();
    }

    private kyg m28055d() {
        this.f24018a = null;
        this.f24019b = null;
        this.f24020c = null;
        this.f24021d = null;
        this.f24022e = null;
        this.f24023f = null;
        this.f24024g = null;
        this.f24025h = null;
        this.f24026i = null;
        this.f24027j = null;
        this.f24028k = null;
        this.f24029l = null;
        this.f24030m = null;
        this.f24031n = null;
        this.f24032o = null;
        this.f24033p = null;
        this.f24034q = null;
        this.f24035r = kyn.m28093d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24020c != null) {
            nyu.a(1, this.f24020c.floatValue());
        }
        if (this.f24021d != null) {
            nyu.a(2, this.f24021d.floatValue());
        }
        if (this.f24022e != null) {
            nyu.a(3, this.f24022e);
        }
        if (this.f24023f != null) {
            nyu.a(4, this.f24023f);
        }
        if (this.f24024g != null) {
            nyu.a(5, this.f24024g);
        }
        if (this.f24025h != null) {
            nyu.a(6, this.f24025h);
        }
        if (this.f24026i != null) {
            nyu.b(7, this.f24026i);
        }
        if (this.f24027j != null) {
            nyu.a(8, this.f24027j);
        }
        if (this.f24028k != null) {
            nyu.a(9, this.f24028k);
        }
        if (this.f24029l != null) {
            nyu.a(10, this.f24029l);
        }
        if (this.f24030m != null) {
            nyu.a(11, this.f24030m);
        }
        if (this.f24031n != null) {
            nyu.a(12, this.f24031n.booleanValue());
        }
        if (this.f24032o != null) {
            nyu.a(13, this.f24032o.doubleValue());
        }
        if (this.f24018a != null) {
            nyu.a(14, this.f24018a.intValue());
        }
        if (this.f24019b != null) {
            nyu.a(15, this.f24019b.intValue());
        }
        if (this.f24033p != null) {
            nyu.a(16, this.f24033p.booleanValue());
        }
        if (this.f24034q != null) {
            nyu.a(17, this.f24034q);
        }
        if (this.f24035r != null && this.f24035r.length > 0) {
            for (nzf nzf : this.f24035r) {
                if (nzf != null) {
                    nyu.b(18, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24020c != null) {
            this.f24020c.floatValue();
            b += nyu.h(1) + 4;
        }
        if (this.f24021d != null) {
            this.f24021d.floatValue();
            b += nyu.h(2) + 4;
        }
        if (this.f24022e != null) {
            b += nyu.b(3, this.f24022e);
        }
        if (this.f24023f != null) {
            b += nyu.b(4, this.f24023f);
        }
        if (this.f24024g != null) {
            b += nyu.b(5, this.f24024g);
        }
        if (this.f24025h != null) {
            b += nyu.b(6, this.f24025h);
        }
        if (this.f24026i != null) {
            b += nyu.d(7, this.f24026i);
        }
        if (this.f24027j != null) {
            b += nyu.b(8, this.f24027j);
        }
        if (this.f24028k != null) {
            b += nyu.b(9, this.f24028k);
        }
        if (this.f24029l != null) {
            b += nyu.b(10, this.f24029l);
        }
        if (this.f24030m != null) {
            b += nyu.b(11, this.f24030m);
        }
        if (this.f24031n != null) {
            this.f24031n.booleanValue();
            b += nyu.h(12) + 1;
        }
        if (this.f24032o != null) {
            this.f24032o.doubleValue();
            b += nyu.h(13) + 8;
        }
        if (this.f24018a != null) {
            b += nyu.f(14, this.f24018a.intValue());
        }
        if (this.f24019b != null) {
            b += nyu.f(15, this.f24019b.intValue());
        }
        if (this.f24033p != null) {
            this.f24033p.booleanValue();
            b += nyu.h(16) + 1;
        }
        if (this.f24034q != null) {
            b += nyu.b(17, this.f24034q);
        }
        if (this.f24035r == null || this.f24035r.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24035r) {
            if (nzf != null) {
                i += nyu.d(18, nzf);
            }
        }
        return i;
    }

    private kyg m28054b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f24020c = Float.valueOf(nyt.c());
                    continue;
                case 21:
                    this.f24021d = Float.valueOf(nyt.c());
                    continue;
                case wi.dx /*26*/:
                    this.f24022e = nyt.j();
                    continue;
                case 34:
                    this.f24023f = nyt.j();
                    continue;
                case 42:
                    this.f24024g = nyt.j();
                    continue;
                case 50:
                    this.f24025h = nyt.j();
                    continue;
                case 58:
                    if (this.f24026i == null) {
                        this.f24026i = new kyh();
                    }
                    nyt.a(this.f24026i);
                    continue;
                case 66:
                    this.f24027j = nyt.j();
                    continue;
                case 74:
                    this.f24028k = nyt.j();
                    continue;
                case 82:
                    this.f24029l = nyt.j();
                    continue;
                case 90:
                    this.f24030m = nyt.j();
                    continue;
                case 96:
                    this.f24031n = Boolean.valueOf(nyt.i());
                    continue;
                case 105:
                    this.f24032o = Double.valueOf(nyt.b());
                    continue;
                case 112:
                    this.f24018a = Integer.valueOf(nyt.f());
                    continue;
                case 120:
                    this.f24019b = Integer.valueOf(nyt.f());
                    continue;
                case 128:
                    this.f24033p = Boolean.valueOf(nyt.i());
                    continue;
                case 138:
                    this.f24034q = nyt.j();
                    continue;
                case 146:
                    int b = nzl.b(nyt, 146);
                    if (this.f24035r == null) {
                        a = 0;
                    } else {
                        a = this.f24035r.length;
                    }
                    Object obj = new kyn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24035r, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kyn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kyn();
                    nyt.a(obj[a]);
                    this.f24035r = obj;
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
