package p000;

public final class nnp extends nyx<nnp> {
    public Boolean f30299a;
    public Boolean f30300b;
    public nnq[] f30301c;

    public /* synthetic */ nzf m35802a(nyt nyt) {
        return m35800b(nyt);
    }

    public nnp() {
        m35801d();
    }

    private nnp m35801d() {
        this.f30299a = null;
        this.f30300b = null;
        this.f30301c = nnq.m35806d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35803a(nyu nyu) {
        if (this.f30299a != null) {
            nyu.m37172a(1, this.f30299a.booleanValue());
        }
        if (this.f30300b != null) {
            nyu.m37172a(2, this.f30300b.booleanValue());
        }
        if (this.f30301c != null && this.f30301c.length > 0) {
            for (nzf nzf : this.f30301c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m35804b() {
        int b = super.b();
        if (this.f30299a != null) {
            this.f30299a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30300b != null) {
            this.f30300b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f30301c == null || this.f30301c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30301c) {
            if (nzf != null) {
                i += nyu.m37145d(3, nzf);
            }
        }
        return i;
    }

    private nnp m35800b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30299a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case 16:
                    this.f30300b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.m37265b(nyt, 26);
                    if (this.f30301c == null) {
                        a = 0;
                    } else {
                        a = this.f30301c.length;
                    }
                    Object obj = new nnq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30301c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nnq();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nnq();
                    nyt.m37101a(obj[a]);
                    this.f30301c = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
