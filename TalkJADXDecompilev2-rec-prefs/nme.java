package p000;

public final class nme extends nyx<nme> {
    private static volatile nme[] f30212c;
    public njz f30213a;
    public nmq f30214b;

    public /* synthetic */ nzf m35612a(nyt nyt) {
        return m35609b(nyt);
    }

    public static nme[] m35610d() {
        if (f30212c == null) {
            synchronized (nzc.f31309c) {
                if (f30212c == null) {
                    f30212c = new nme[0];
                }
            }
        }
        return f30212c;
    }

    public nme() {
        m35611g();
    }

    private nme m35611g() {
        this.f30213a = null;
        this.f30214b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35613a(nyu nyu) {
        if (this.f30213a != null) {
            nyu.m37182b(1, this.f30213a);
        }
        if (this.f30214b != null) {
            nyu.m37182b(2, this.f30214b);
        }
        super.a(nyu);
    }

    protected int m35614b() {
        int b = super.b();
        if (this.f30213a != null) {
            b += nyu.m37145d(1, this.f30213a);
        }
        if (this.f30214b != null) {
            return b + nyu.m37145d(2, this.f30214b);
        }
        return b;
    }

    private nme m35609b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30213a == null) {
                        this.f30213a = new njz();
                    }
                    nyt.m37101a(this.f30213a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f30214b == null) {
                        this.f30214b = new nmq();
                    }
                    nyt.m37101a(this.f30214b);
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
