package p000;

public final class ksg extends nyx<ksg> {
    private static volatile ksg[] f23017o;
    public String f23018a;
    public String f23019b;
    public String f23020c;
    public kxh f23021d;
    public kxa f23022e;
    public ofv f23023f;
    public String f23024g;
    public Long f23025h;
    public Long f23026i;
    public ksu f23027j;
    public Integer f23028k;
    public Integer f23029l;
    public String f23030m;
    public kva f23031n;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27297b(nyt);
    }

    public static ksg[] m27298d() {
        if (f23017o == null) {
            synchronized (nzc.c) {
                if (f23017o == null) {
                    f23017o = new ksg[0];
                }
            }
        }
        return f23017o;
    }

    public ksg() {
        m27299g();
    }

    private ksg m27299g() {
        this.f23018a = null;
        this.f23019b = null;
        this.f23020c = null;
        this.f23021d = null;
        this.f23022e = null;
        this.f23023f = null;
        this.f23024g = null;
        this.f23025h = null;
        this.f23026i = null;
        this.f23027j = null;
        this.f23030m = null;
        this.f23031n = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f23018a);
        nyu.a(2, this.f23019b);
        nyu.a(3, this.f23024g);
        if (this.f23027j != null) {
            nyu.b(4, this.f23027j);
        }
        if (this.f23028k != null) {
            nyu.a(5, this.f23028k.intValue());
        }
        if (this.f23029l != null) {
            nyu.a(6, this.f23029l.intValue());
        }
        if (this.f23030m != null) {
            nyu.a(7, this.f23030m);
        }
        if (this.f23031n != null) {
            nyu.b(8, this.f23031n);
        }
        if (this.f23020c != null) {
            nyu.a(9, this.f23020c);
        }
        if (this.f23025h != null) {
            nyu.b(10, this.f23025h.longValue());
        }
        if (this.f23026i != null) {
            nyu.b(11, this.f23026i.longValue());
        }
        if (this.f23021d != null) {
            nyu.b(12, this.f23021d);
        }
        if (this.f23022e != null) {
            nyu.b(13, this.f23022e);
        }
        if (this.f23023f != null) {
            nyu.b(14, this.f23023f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = ((super.mo147b() + nyu.b(1, this.f23018a)) + nyu.b(2, this.f23019b)) + nyu.b(3, this.f23024g);
        if (this.f23027j != null) {
            b += nyu.d(4, this.f23027j);
        }
        if (this.f23028k != null) {
            b += nyu.f(5, this.f23028k.intValue());
        }
        if (this.f23029l != null) {
            b += nyu.f(6, this.f23029l.intValue());
        }
        if (this.f23030m != null) {
            b += nyu.b(7, this.f23030m);
        }
        if (this.f23031n != null) {
            b += nyu.d(8, this.f23031n);
        }
        if (this.f23020c != null) {
            b += nyu.b(9, this.f23020c);
        }
        if (this.f23025h != null) {
            b += nyu.f(10, this.f23025h.longValue());
        }
        if (this.f23026i != null) {
            b += nyu.f(11, this.f23026i.longValue());
        }
        if (this.f23021d != null) {
            b += nyu.d(12, this.f23021d);
        }
        if (this.f23022e != null) {
            b += nyu.d(13, this.f23022e);
        }
        if (this.f23023f != null) {
            return b + nyu.d(14, this.f23023f);
        }
        return b;
    }

    private ksg m27297b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23018a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23019b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f23024g = nyt.j();
                    continue;
                case 34:
                    if (this.f23027j == null) {
                        this.f23027j = new ksu();
                    }
                    nyt.a(this.f23027j);
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23028k = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f23029l = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    this.f23030m = nyt.j();
                    continue;
                case 66:
                    if (this.f23031n == null) {
                        this.f23031n = new kva();
                    }
                    nyt.a(this.f23031n);
                    continue;
                case 74:
                    this.f23020c = nyt.j();
                    continue;
                case 80:
                    this.f23025h = Long.valueOf(nyt.e());
                    continue;
                case 88:
                    this.f23026i = Long.valueOf(nyt.e());
                    continue;
                case 98:
                    if (this.f23021d == null) {
                        this.f23021d = new kxh();
                    }
                    nyt.a(this.f23021d);
                    continue;
                case 106:
                    if (this.f23022e == null) {
                        this.f23022e = new kxa();
                    }
                    nyt.a(this.f23022e);
                    continue;
                case 114:
                    if (this.f23023f == null) {
                        this.f23023f = new ofv();
                    }
                    nyt.a(this.f23023f);
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
