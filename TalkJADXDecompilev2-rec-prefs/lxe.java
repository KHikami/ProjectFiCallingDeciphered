package p000;

public final class lxe extends nyx<lxe> {
    public lxb[] f26750a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30976b(nyt);
    }

    public lxe() {
        m30977d();
    }

    private lxe m30977d() {
        this.responseHeader = null;
        this.f26750a = lxb.m30960d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26750a != null && this.f26750a.length > 0) {
            for (nzf nzf : this.f26750a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26750a == null || this.f26750a.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26750a) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lxe m30976b(nyt nyt) {
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
                    if (this.f26750a == null) {
                        a = 0;
                    } else {
                        a = this.f26750a.length;
                    }
                    Object obj = new lxb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26750a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxb();
                    nyt.a(obj[a]);
                    this.f26750a = obj;
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
