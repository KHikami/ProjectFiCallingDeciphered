package defpackage;

public final class oyl extends nyx<oyl> {
    public oyq[] a;
    public Long b;
    public oyk c;
    public Integer d;
    public oym e;
    public oyn f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oyl() {
        d();
    }

    private oyl d() {
        this.a = oyq.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.f = null;
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
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.f != null) {
            nyu.b(5, this.f);
        }
        if (this.e != null) {
            nyu.b(6, this.e);
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
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.f != null) {
            b += nyu.d(5, this.f);
        }
        if (this.e != null) {
            return b + nyu.d(6, this.e);
        }
        return b;
    }

    private oyl b(nyt nyt) {
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
                    Object obj = new oyq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oyq();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new oyk();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    if (this.f == null) {
                        this.f = new oyn();
                    }
                    nyt.a(this.f);
                    continue;
                case 50:
                    if (this.e == null) {
                        this.e = new oym();
                    }
                    nyt.a(this.e);
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
