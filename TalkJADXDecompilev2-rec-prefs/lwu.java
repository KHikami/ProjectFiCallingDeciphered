package p000;

public final class lwu extends nyx<lwu> {
    public ltr[] f26728a;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30923b(nyt);
    }

    public lwu() {
        m30924d();
    }

    private lwu m30924d() {
        this.requestHeader = null;
        this.f26728a = ltr.m30492d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26728a != null && this.f26728a.length > 0) {
            for (nzf nzf : this.f26728a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26728a == null || this.f26728a.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26728a) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lwu m30923b(nyt nyt) {
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
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f26728a == null) {
                        a = 0;
                    } else {
                        a = this.f26728a.length;
                    }
                    Object obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26728a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.f26728a = obj;
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
