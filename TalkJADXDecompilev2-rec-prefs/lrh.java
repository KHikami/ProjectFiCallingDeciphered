package p000;

public final class lrh extends nyx<lrh> {
    public lqv[] f26213a;
    public byte[] f26214b;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30166b(nyt);
    }

    public lrh() {
        m30167d();
    }

    private lrh m30167d() {
        this.responseHeader = null;
        this.f26213a = lqv.m30104d();
        this.f26214b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26213a != null && this.f26213a.length > 0) {
            for (nzf nzf : this.f26213a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26214b != null) {
            nyu.a(3, this.f26214b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26213a != null && this.f26213a.length > 0) {
            int i = b;
            for (nzf nzf : this.f26213a) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f26214b != null) {
            return b + nyu.b(3, this.f26214b);
        }
        return b;
    }

    private lrh m30166b(nyt nyt) {
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
                    if (this.f26213a == null) {
                        a = 0;
                    } else {
                        a = this.f26213a.length;
                    }
                    Object obj = new lqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26213a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqv();
                    nyt.a(obj[a]);
                    this.f26213a = obj;
                    continue;
                case wi.dx /*26*/:
                    this.f26214b = nyt.k();
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
