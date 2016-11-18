package defpackage;

public final class luz extends nyx<luz> {
    public Integer a;
    public lsz[] b;
    public lqg c;
    public lom d;
    public Long e;
    public String f;
    public byte[] g;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luz() {
        d();
    }

    private luz d() {
        this.responseHeader = null;
        this.b = lsz.d();
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.e != null) {
            nyu.a(2, this.e.longValue());
        }
        if (this.f != null) {
            nyu.a(3, this.f);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.g != null) {
            nyu.a(5, this.g);
        }
        if (this.c != null) {
            nyu.b(6, this.c);
        }
        if (this.d != null) {
            nyu.b(7, this.d);
        }
        if (this.a != null) {
            nyu.a(8, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.e != null) {
            b += nyu.e(2, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.b(3, this.f);
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.g != null) {
            b += nyu.b(5, this.g);
        }
        if (this.c != null) {
            b += nyu.d(6, this.c);
        }
        if (this.d != null) {
            b += nyu.d(7, this.d);
        }
        if (this.a != null) {
            return b + nyu.f(8, this.a.intValue());
        }
        return b;
    }

    private luz b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case 16:
                    this.e = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.f = nyt.j();
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new lsz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsz();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 42:
                    this.g = nyt.k();
                    continue;
                case 50:
                    if (this.c == null) {
                        this.c = new lqg();
                    }
                    nyt.a(this.c);
                    continue;
                case 58:
                    if (this.d == null) {
                        this.d = new lom();
                    }
                    nyt.a(this.d);
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
                        case 7:
                        case 8:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
