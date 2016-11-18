package p000;

public final class nod extends nyx<nod> {
    public Boolean f30343a;
    public ngw f30344b;
    public noe f30345c;
    public noc f30346d;
    public ngv f30347e;

    public /* synthetic */ nzf m35874a(nyt nyt) {
        return m35872b(nyt);
    }

    public nod() {
        m35873d();
    }

    private nod m35873d() {
        this.f30343a = null;
        this.f30344b = null;
        this.f30345c = null;
        this.f30346d = null;
        this.f30347e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35875a(nyu nyu) {
        if (this.f30343a != null) {
            nyu.m37172a(1, this.f30343a.booleanValue());
        }
        if (this.f30344b != null) {
            nyu.m37182b(2, this.f30344b);
        }
        if (this.f30345c != null) {
            nyu.m37182b(3, this.f30345c);
        }
        if (this.f30346d != null) {
            nyu.m37182b(4, this.f30346d);
        }
        if (this.f30347e != null) {
            nyu.m37182b(5, this.f30347e);
        }
        super.a(nyu);
    }

    protected int m35876b() {
        int b = super.b();
        if (this.f30343a != null) {
            this.f30343a.booleanValue();
            b += nyu.m37154h(1) + 1;
        }
        if (this.f30344b != null) {
            b += nyu.m37145d(2, this.f30344b);
        }
        if (this.f30345c != null) {
            b += nyu.m37145d(3, this.f30345c);
        }
        if (this.f30346d != null) {
            b += nyu.m37145d(4, this.f30346d);
        }
        if (this.f30347e != null) {
            return b + nyu.m37145d(5, this.f30347e);
        }
        return b;
    }

    private nod m35872b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f30343a = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dH /*18*/:
                    if (this.f30344b == null) {
                        this.f30344b = new ngw();
                    }
                    nyt.m37101a(this.f30344b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30345c == null) {
                        this.f30345c = new noe();
                    }
                    nyt.m37101a(this.f30345c);
                    continue;
                case 34:
                    if (this.f30346d == null) {
                        this.f30346d = new noc();
                    }
                    nyt.m37101a(this.f30346d);
                    continue;
                case 42:
                    if (this.f30347e == null) {
                        this.f30347e = new ngv();
                    }
                    nyt.m37101a(this.f30347e);
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
