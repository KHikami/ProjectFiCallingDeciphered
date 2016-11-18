package p000;

public final class lvf extends nyx<lvf> {
    public loa[] f26582a;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30713b(nyt);
    }

    public lvf() {
        m30714d();
    }

    private lvf m30714d() {
        this.responseHeader = null;
        this.f26582a = loa.m29701d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26582a != null && this.f26582a.length > 0) {
            for (nzf nzf : this.f26582a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.responseHeader != null) {
            nyu.b(2, this.responseHeader);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26582a != null && this.f26582a.length > 0) {
            for (nzf nzf : this.f26582a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.responseHeader != null) {
            return b + nyu.d(2, this.responseHeader);
        }
        return b;
    }

    private lvf m30713b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26582a == null) {
                        a = 0;
                    } else {
                        a = this.f26582a.length;
                    }
                    Object obj = new loa[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26582a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new loa();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new loa();
                    nyt.a(obj[a]);
                    this.f26582a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
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
