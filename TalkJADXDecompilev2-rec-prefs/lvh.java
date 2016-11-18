package p000;

public final class lvh extends nyx<lvh> {
    public loj[] f26587a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30723b(nyt);
    }

    public lvh() {
        m30724d();
    }

    private lvh m30724d() {
        this.responseHeader = null;
        this.f26587a = loj.m29750d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26587a != null && this.f26587a.length > 0) {
            for (nzf nzf : this.f26587a) {
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
        if (this.f26587a == null || this.f26587a.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26587a) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private lvh m30723b(nyt nyt) {
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
                    if (this.f26587a == null) {
                        a = 0;
                    } else {
                        a = this.f26587a.length;
                    }
                    Object obj = new loj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26587a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loj();
                    nyt.a(obj[a]);
                    this.f26587a = obj;
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
