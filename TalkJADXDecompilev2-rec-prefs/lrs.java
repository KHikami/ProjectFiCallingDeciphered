package p000;

public final class lrs extends nyx<lrs> {
    public Boolean f26272a;
    public byte[] f26273b;
    public lrr[] f26274c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30222b(nyt);
    }

    public lrs() {
        m30223d();
    }

    private lrs m30223d() {
        this.f26272a = null;
        this.f26273b = null;
        this.f26274c = lrr.m30217d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26272a != null) {
            nyu.a(1, this.f26272a.booleanValue());
        }
        if (this.f26273b != null) {
            nyu.a(2, this.f26273b);
        }
        if (this.f26274c != null && this.f26274c.length > 0) {
            for (nzf nzf : this.f26274c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26272a != null) {
            this.f26272a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f26273b != null) {
            b += nyu.b(2, this.f26273b);
        }
        if (this.f26274c == null || this.f26274c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26274c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private lrs m30222b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26272a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    this.f26273b = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f26274c == null) {
                        a = 0;
                    } else {
                        a = this.f26274c.length;
                    }
                    Object obj = new lrr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26274c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lrr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lrr();
                    nyt.a(obj[a]);
                    this.f26274c = obj;
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
