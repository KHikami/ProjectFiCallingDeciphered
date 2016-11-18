package p000;

public final class lrc extends nyx<lrc> {
    public Integer f26200a;
    public lox f26201b;
    public lty f26202c;
    public lus[] f26203d;
    public lqc[] f26204e;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30140b(nyt);
    }

    public lrc() {
        m30141d();
    }

    private lrc m30141d() {
        this.responseHeader = null;
        this.f26201b = null;
        this.f26202c = null;
        this.f26203d = lus.m30648d();
        this.f26204e = lqc.m30002d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26201b != null) {
            nyu.b(2, this.f26201b);
        }
        if (this.f26200a != null) {
            nyu.a(3, this.f26200a.intValue());
        }
        if (this.f26202c != null) {
            nyu.b(4, this.f26202c);
        }
        if (this.f26203d != null && this.f26203d.length > 0) {
            for (nzf nzf : this.f26203d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f26204e != null && this.f26204e.length > 0) {
            while (i < this.f26204e.length) {
                nzf nzf2 = this.f26204e[i];
                if (nzf2 != null) {
                    nyu.b(7, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26201b != null) {
            b += nyu.d(2, this.f26201b);
        }
        if (this.f26200a != null) {
            b += nyu.f(3, this.f26200a.intValue());
        }
        if (this.f26202c != null) {
            b += nyu.d(4, this.f26202c);
        }
        if (this.f26203d != null && this.f26203d.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26203d) {
                if (nzf != null) {
                    i2 += nyu.d(5, nzf);
                }
            }
            b = i2;
        }
        if (this.f26204e != null && this.f26204e.length > 0) {
            while (i < this.f26204e.length) {
                nzf nzf2 = this.f26204e[i];
                if (nzf2 != null) {
                    b += nyu.d(7, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private lrc m30140b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26201b == null) {
                        this.f26201b = new lox();
                    }
                    nyt.a(this.f26201b);
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                            this.f26200a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    if (this.f26202c == null) {
                        this.f26202c = new lty();
                    }
                    nyt.a(this.f26202c);
                    continue;
                case 42:
                    b = nzl.b(nyt, 42);
                    if (this.f26203d == null) {
                        a = 0;
                    } else {
                        a = this.f26203d.length;
                    }
                    obj = new lus[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26203d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lus();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lus();
                    nyt.a(obj[a]);
                    this.f26203d = obj;
                    continue;
                case 58:
                    b = nzl.b(nyt, 58);
                    if (this.f26204e == null) {
                        a = 0;
                    } else {
                        a = this.f26204e.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26204e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26204e = obj;
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
