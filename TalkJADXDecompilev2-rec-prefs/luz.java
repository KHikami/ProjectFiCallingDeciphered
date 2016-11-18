package p000;

public final class luz extends nyx<luz> {
    public Integer f26565a;
    public lsz[] f26566b;
    public lqg f26567c;
    public lom f26568d;
    public Long f26569e;
    public String f26570f;
    public byte[] f26571g;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30683b(nyt);
    }

    public luz() {
        m30684d();
    }

    private luz m30684d() {
        this.responseHeader = null;
        this.f26566b = lsz.m30398d();
        this.f26567c = null;
        this.f26568d = null;
        this.f26569e = null;
        this.f26570f = null;
        this.f26571g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26569e != null) {
            nyu.a(2, this.f26569e.longValue());
        }
        if (this.f26570f != null) {
            nyu.a(3, this.f26570f);
        }
        if (this.f26566b != null && this.f26566b.length > 0) {
            for (nzf nzf : this.f26566b) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        if (this.f26571g != null) {
            nyu.a(5, this.f26571g);
        }
        if (this.f26567c != null) {
            nyu.b(6, this.f26567c);
        }
        if (this.f26568d != null) {
            nyu.b(7, this.f26568d);
        }
        if (this.f26565a != null) {
            nyu.a(8, this.f26565a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26569e != null) {
            b += nyu.e(2, this.f26569e.longValue());
        }
        if (this.f26570f != null) {
            b += nyu.b(3, this.f26570f);
        }
        if (this.f26566b != null && this.f26566b.length > 0) {
            int i = b;
            for (nzf nzf : this.f26566b) {
                if (nzf != null) {
                    i += nyu.d(4, nzf);
                }
            }
            b = i;
        }
        if (this.f26571g != null) {
            b += nyu.b(5, this.f26571g);
        }
        if (this.f26567c != null) {
            b += nyu.d(6, this.f26567c);
        }
        if (this.f26568d != null) {
            b += nyu.d(7, this.f26568d);
        }
        if (this.f26565a != null) {
            return b + nyu.f(8, this.f26565a.intValue());
        }
        return b;
    }

    private luz m30683b(nyt nyt) {
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
                    this.f26569e = Long.valueOf(nyt.d());
                    continue;
                case wi.dx /*26*/:
                    this.f26570f = nyt.j();
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26566b == null) {
                        a = 0;
                    } else {
                        a = this.f26566b.length;
                    }
                    Object obj = new lsz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26566b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsz();
                    nyt.a(obj[a]);
                    this.f26566b = obj;
                    continue;
                case 42:
                    this.f26571g = nyt.k();
                    continue;
                case 50:
                    if (this.f26567c == null) {
                        this.f26567c = new lqg();
                    }
                    nyt.a(this.f26567c);
                    continue;
                case 58:
                    if (this.f26568d == null) {
                        this.f26568d = new lom();
                    }
                    nyt.a(this.f26568d);
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
                            this.f26565a = Integer.valueOf(a);
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
