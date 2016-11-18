package p000;

public final class maf extends nyx<maf> {
    public Integer f27096a;
    public mau f27097b;
    public mag[] f27098c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31408b(nyt);
    }

    public maf() {
        m31409d();
    }

    private maf m31409d() {
        this.f27097b = null;
        this.f27098c = mag.m31414d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f27096a != null) {
            nyu.a(1, this.f27096a.intValue());
        }
        if (this.f27097b != null) {
            nyu.b(2, this.f27097b);
        }
        if (this.f27098c != null && this.f27098c.length > 0) {
            for (nzf nzf : this.f27098c) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f27096a != null) {
            b += nyu.f(1, this.f27096a.intValue());
        }
        if (this.f27097b != null) {
            b += nyu.d(2, this.f27097b);
        }
        if (this.f27098c == null || this.f27098c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f27098c) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private maf m31408b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f27096a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f27097b == null) {
                        this.f27097b = new mau();
                    }
                    nyt.a(this.f27097b);
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f27098c == null) {
                        a = 0;
                    } else {
                        a = this.f27098c.length;
                    }
                    Object obj = new mag[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27098c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mag();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mag();
                    nyt.a(obj[a]);
                    this.f27098c = obj;
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
