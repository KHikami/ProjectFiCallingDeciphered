package defpackage;

public final class ori extends nyx<ori> {
    public oso a;
    public orh[] b;
    public Integer c;
    public Integer d;
    public oqu e;
    public osd f;
    public orc g;
    public orf h;
    public orj i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ori() {
        d();
    }

    private ori d() {
        this.a = null;
        this.b = orh.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
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
            nyu.b(60, this.h);
        }
        if (this.i != null) {
            nyu.b(61, this.i);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
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
            b += nyu.d(60, this.h);
        }
        if (this.i != null) {
            return b + nyu.d(61, this.i);
        }
        return b;
    }

    private ori b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new oso();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new orh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new orh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new orh();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new oqu();
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
                case 482:
                    if (this.h == null) {
                        this.h = new orf();
                    }
                    nyt.a(this.h);
                    continue;
                case 490:
                    if (this.i == null) {
                        this.i = new orj();
                    }
                    nyt.a(this.i);
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
