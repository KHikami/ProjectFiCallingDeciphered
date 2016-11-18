package defpackage;

public final class oqc extends nyx<oqc> {
    public oso a;
    public oqa[] b;
    public osi c;
    public oqu d;
    public oos e;
    public osd f;
    public orc g;
    public String h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oqc() {
        d();
    }

    private oqc d() {
        this.a = null;
        this.b = oqa.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.a != null) {
            nyu.b(3, this.a);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.a != null) {
            b += nyu.d(3, this.a);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            return b + nyu.b(8, this.h);
        }
        return b;
    }

    private oqc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new oqa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqa();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new osi();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.a == null) {
                        this.a = new oso();
                    }
                    nyt.a(this.a);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new oqu();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new oos();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new osd();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new orc();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    this.h = nyt.j();
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
