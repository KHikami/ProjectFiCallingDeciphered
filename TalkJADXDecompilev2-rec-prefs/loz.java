package p000;

public final class loz extends nyx<loz> {
    public Integer f25963a;
    public lqs f25964b;
    public Long f25965c;
    public String f25966d;
    public String f25967e;
    public lsh[] f25968f;
    public lpk f25969g;
    public lse f25970h;
    public Integer f25971i;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29834b(nyt);
    }

    public loz() {
        m29835d();
    }

    private loz m29835d() {
        this.requestHeader = null;
        this.f25964b = null;
        this.f25965c = null;
        this.f25966d = null;
        this.f25967e = null;
        this.f25968f = lsh.m30303d();
        this.f25969g = null;
        this.f25970h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f25963a != null) {
            nyu.a(2, this.f25963a.intValue());
        }
        if (this.f25965c != null) {
            nyu.a(3, this.f25965c.longValue());
        }
        if (this.f25966d != null) {
            nyu.a(4, this.f25966d);
        }
        if (this.f25968f != null && this.f25968f.length > 0) {
            for (nzf nzf : this.f25968f) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f25969g != null) {
            nyu.b(11, this.f25969g);
        }
        if (this.f25970h != null) {
            nyu.b(12, this.f25970h);
        }
        if (this.f25964b != null) {
            nyu.b(13, this.f25964b);
        }
        if (this.f25967e != null) {
            nyu.a(14, this.f25967e);
        }
        if (this.f25971i != null) {
            nyu.a(15, this.f25971i.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f25963a != null) {
            b += nyu.f(2, this.f25963a.intValue());
        }
        if (this.f25965c != null) {
            b += nyu.e(3, this.f25965c.longValue());
        }
        if (this.f25966d != null) {
            b += nyu.b(4, this.f25966d);
        }
        if (this.f25968f != null && this.f25968f.length > 0) {
            int i = b;
            for (nzf nzf : this.f25968f) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f25969g != null) {
            b += nyu.d(11, this.f25969g);
        }
        if (this.f25970h != null) {
            b += nyu.d(12, this.f25970h);
        }
        if (this.f25964b != null) {
            b += nyu.d(13, this.f25964b);
        }
        if (this.f25967e != null) {
            b += nyu.b(14, this.f25967e);
        }
        if (this.f25971i != null) {
            return b + nyu.f(15, this.f25971i.intValue());
        }
        return b;
    }

    private loz m29834b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25963a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f25965c = Long.valueOf(nyt.d());
                    continue;
                case 34:
                    this.f25966d = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f25968f == null) {
                        a = 0;
                    } else {
                        a = this.f25968f.length;
                    }
                    Object obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25968f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.f25968f = obj;
                    continue;
                case 90:
                    if (this.f25969g == null) {
                        this.f25969g = new lpk();
                    }
                    nyt.a(this.f25969g);
                    continue;
                case 98:
                    if (this.f25970h == null) {
                        this.f25970h = new lse();
                    }
                    nyt.a(this.f25970h);
                    continue;
                case 106:
                    if (this.f25964b == null) {
                        this.f25964b = new lqs();
                    }
                    nyt.a(this.f25964b);
                    continue;
                case 114:
                    this.f25967e = nyt.j();
                    continue;
                case 120:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25971i = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
