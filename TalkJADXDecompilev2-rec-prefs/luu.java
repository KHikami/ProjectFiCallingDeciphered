package p000;

public final class luu extends nyx<luu> {
    public lti f26532a;
    public lsa[] f26533b;
    public lus[] f26534c;
    public lwi f26535d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30658b(nyt);
    }

    public luu() {
        m30659d();
    }

    private luu m30659d() {
        this.f26532a = null;
        this.f26533b = lsa.m30266d();
        this.f26534c = lus.m30648d();
        this.f26535d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f26532a != null) {
            nyu.b(1, this.f26532a);
        }
        if (this.f26533b != null && this.f26533b.length > 0) {
            for (nzf nzf : this.f26533b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26534c != null && this.f26534c.length > 0) {
            while (i < this.f26534c.length) {
                nzf nzf2 = this.f26534c[i];
                if (nzf2 != null) {
                    nyu.b(3, nzf2);
                }
                i++;
            }
        }
        if (this.f26535d != null) {
            nyu.b(4, this.f26535d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26532a != null) {
            b += nyu.d(1, this.f26532a);
        }
        if (this.f26533b != null && this.f26533b.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26533b) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f26534c != null && this.f26534c.length > 0) {
            while (i < this.f26534c.length) {
                nzf nzf2 = this.f26534c[i];
                if (nzf2 != null) {
                    b += nyu.d(3, nzf2);
                }
                i++;
            }
        }
        if (this.f26535d != null) {
            return b + nyu.d(4, this.f26535d);
        }
        return b;
    }

    private luu m30658b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26532a == null) {
                        this.f26532a = new lti();
                    }
                    nyt.a(this.f26532a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f26533b == null) {
                        a = 0;
                    } else {
                        a = this.f26533b.length;
                    }
                    obj = new lsa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26533b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsa();
                    nyt.a(obj[a]);
                    this.f26533b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f26534c == null) {
                        a = 0;
                    } else {
                        a = this.f26534c.length;
                    }
                    obj = new lus[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26534c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lus();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lus();
                    nyt.a(obj[a]);
                    this.f26534c = obj;
                    continue;
                case 34:
                    if (this.f26535d == null) {
                        this.f26535d = new lwi();
                    }
                    nyt.a(this.f26535d);
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
