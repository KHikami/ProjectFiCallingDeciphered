package p000;

public final class lwy extends nyx<lwy> {
    public Integer f26735a;
    public lqv[] f26736b;
    public byte[] f26737c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30944b(nyt);
    }

    public lwy() {
        m30945d();
    }

    private lwy m30945d() {
        this.responseHeader = null;
        this.f26736b = lqv.m30104d();
        this.f26737c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26735a != null) {
            nyu.a(2, this.f26735a.intValue());
        }
        if (this.f26736b != null && this.f26736b.length > 0) {
            for (nzf nzf : this.f26736b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f26737c != null) {
            nyu.a(4, this.f26737c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26735a != null) {
            b += nyu.f(2, this.f26735a.intValue());
        }
        if (this.f26736b != null && this.f26736b.length > 0) {
            int i = b;
            for (nzf nzf : this.f26736b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f26737c != null) {
            return b + nyu.b(4, this.f26737c);
        }
        return b;
    }

    private lwy m30944b(nyt nyt) {
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
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f26735a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f26736b == null) {
                        a = 0;
                    } else {
                        a = this.f26736b.length;
                    }
                    Object obj = new lqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26736b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqv();
                    nyt.a(obj[a]);
                    this.f26736b = obj;
                    continue;
                case 34:
                    this.f26737c = nyt.k();
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
