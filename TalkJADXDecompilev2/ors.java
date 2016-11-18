package defpackage;

public final class ors extends nyx<ors> {
    public oqz[] a;
    public oqu b;
    public oqu c;
    public Integer d;
    public Integer e;
    public Integer f;
    public osd g;
    public orc h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ors() {
        d();
    }

    private ors d() {
        this.a = oqz.d();
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null) {
            nyu.b(4, this.c);
        }
        if (this.d != null) {
            nyu.a(6, this.d.intValue());
        }
        if (this.e != null) {
            nyu.a(7, this.e.intValue());
        }
        if (this.f != null) {
            nyu.a(8, this.f.intValue());
        }
        if (this.g != null) {
            nyu.b(9, this.g);
        }
        if (this.h != null) {
            nyu.b(10, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c != null) {
            b += nyu.d(4, this.c);
        }
        if (this.d != null) {
            b += nyu.f(6, this.d.intValue());
        }
        if (this.e != null) {
            b += nyu.f(7, this.e.intValue());
        }
        if (this.f != null) {
            b += nyu.f(8, this.f.intValue());
        }
        if (this.g != null) {
            b += nyu.d(9, this.g);
        }
        if (this.h != null) {
            return b + nyu.d(10, this.h);
        }
        return b;
    }

    private ors b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new oqz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqz();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new oqu();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    if (this.c == null) {
                        this.c = new oqu();
                    }
                    nyt.a(this.c);
                    continue;
                case 48:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 56:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 64:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 74:
                    if (this.g == null) {
                        this.g = new osd();
                    }
                    nyt.a(this.g);
                    continue;
                case 82:
                    if (this.h == null) {
                        this.h = new orc();
                    }
                    nyt.a(this.h);
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
