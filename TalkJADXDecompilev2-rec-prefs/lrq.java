package p000;

public final class lrq extends nyx<lrq> {
    public lqc[] f26260a;
    public Boolean f26261b;
    public lrs f26262c;
    public lrs f26263d;
    public lrs f26264e;
    public lrs f26265f;
    public lrs f26266g;
    public lrs f26267h;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30211b(nyt);
    }

    public lrq() {
        m30212d();
    }

    private lrq m30212d() {
        this.responseHeader = null;
        this.f26260a = lqc.m30002d();
        this.f26261b = null;
        this.f26262c = null;
        this.f26263d = null;
        this.f26264e = null;
        this.f26265f = null;
        this.f26266g = null;
        this.f26267h = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26260a != null && this.f26260a.length > 0) {
            for (nzf nzf : this.f26260a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26261b != null) {
            nyu.a(3, this.f26261b.booleanValue());
        }
        if (this.f26263d != null) {
            nyu.b(4, this.f26263d);
        }
        if (this.f26264e != null) {
            nyu.b(5, this.f26264e);
        }
        if (this.f26265f != null) {
            nyu.b(6, this.f26265f);
        }
        if (this.f26266g != null) {
            nyu.b(7, this.f26266g);
        }
        if (this.f26267h != null) {
            nyu.b(8, this.f26267h);
        }
        if (this.f26262c != null) {
            nyu.b(9, this.f26262c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26260a != null && this.f26260a.length > 0) {
            int i = b;
            for (nzf nzf : this.f26260a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f26261b != null) {
            this.f26261b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26263d != null) {
            b += nyu.d(4, this.f26263d);
        }
        if (this.f26264e != null) {
            b += nyu.d(5, this.f26264e);
        }
        if (this.f26265f != null) {
            b += nyu.d(6, this.f26265f);
        }
        if (this.f26266g != null) {
            b += nyu.d(7, this.f26266g);
        }
        if (this.f26267h != null) {
            b += nyu.d(8, this.f26267h);
        }
        if (this.f26262c != null) {
            return b + nyu.d(9, this.f26262c);
        }
        return b;
    }

    private lrq m30211b(nyt nyt) {
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
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f26260a == null) {
                        a = 0;
                    } else {
                        a = this.f26260a.length;
                    }
                    Object obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26260a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26260a = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f26261b = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    if (this.f26263d == null) {
                        this.f26263d = new lrs();
                    }
                    nyt.a(this.f26263d);
                    continue;
                case 42:
                    if (this.f26264e == null) {
                        this.f26264e = new lrs();
                    }
                    nyt.a(this.f26264e);
                    continue;
                case 50:
                    if (this.f26265f == null) {
                        this.f26265f = new lrs();
                    }
                    nyt.a(this.f26265f);
                    continue;
                case 58:
                    if (this.f26266g == null) {
                        this.f26266g = new lrs();
                    }
                    nyt.a(this.f26266g);
                    continue;
                case 66:
                    if (this.f26267h == null) {
                        this.f26267h = new lrs();
                    }
                    nyt.a(this.f26267h);
                    continue;
                case 74:
                    if (this.f26262c == null) {
                        this.f26262c = new lrs();
                    }
                    nyt.a(this.f26262c);
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
