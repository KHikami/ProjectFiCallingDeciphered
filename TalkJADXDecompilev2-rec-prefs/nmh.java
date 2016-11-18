package p000;

public final class nmh extends nyx<nmh> {
    public nmf f30223a;
    public nkt f30224b;
    public nff f30225c;
    public nhf f30226d;
    public String f30227e;

    public /* synthetic */ nzf m35627a(nyt nyt) {
        return m35625b(nyt);
    }

    public nmh() {
        m35626d();
    }

    private nmh m35626d() {
        this.f30223a = null;
        this.f30224b = null;
        this.f30225c = null;
        this.f30226d = null;
        this.f30227e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35628a(nyu nyu) {
        if (this.f30223a != null) {
            nyu.m37182b(1, this.f30223a);
        }
        if (this.f30224b != null) {
            nyu.m37182b(2, this.f30224b);
        }
        if (this.f30225c != null) {
            nyu.m37182b(3, this.f30225c);
        }
        if (this.f30226d != null) {
            nyu.m37182b(4, this.f30226d);
        }
        if (this.f30227e != null) {
            nyu.m37170a(5, this.f30227e);
        }
        super.a(nyu);
    }

    protected int m35629b() {
        int b = super.b();
        if (this.f30223a != null) {
            b += nyu.m37145d(1, this.f30223a);
        }
        if (this.f30224b != null) {
            b += nyu.m37145d(2, this.f30224b);
        }
        if (this.f30225c != null) {
            b += nyu.m37145d(3, this.f30225c);
        }
        if (this.f30226d != null) {
            b += nyu.m37145d(4, this.f30226d);
        }
        if (this.f30227e != null) {
            return b + nyu.m37137b(5, this.f30227e);
        }
        return b;
    }

    private nmh m35625b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30223a == null) {
                        this.f30223a = new nmf();
                    }
                    nyt.m37101a(this.f30223a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30224b == null) {
                        this.f30224b = new nkt();
                    }
                    nyt.m37101a(this.f30224b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30225c == null) {
                        this.f30225c = new nff();
                    }
                    nyt.m37101a(this.f30225c);
                    continue;
                case 34:
                    if (this.f30226d == null) {
                        this.f30226d = new nhf();
                    }
                    nyt.m37101a(this.f30226d);
                    continue;
                case 42:
                    this.f30227e = nyt.m37117j();
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
