package p000;

public final class oqp extends nyx<oqp> {
    public oqn f33778a;
    public oqn f33779b;
    public oqv f33780c;
    public oqv f33781d;
    public oqm f33782e;

    public /* synthetic */ nzf m39216a(nyt nyt) {
        return m39214b(nyt);
    }

    public oqp() {
        m39215d();
    }

    private oqp m39215d() {
        this.f33778a = null;
        this.f33779b = null;
        this.f33780c = null;
        this.f33781d = null;
        this.f33782e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39217a(nyu nyu) {
        if (this.f33778a != null) {
            nyu.m37182b(1, this.f33778a);
        }
        if (this.f33779b != null) {
            nyu.m37182b(2, this.f33779b);
        }
        if (this.f33781d != null) {
            nyu.m37182b(3, this.f33781d);
        }
        if (this.f33782e != null) {
            nyu.m37182b(4, this.f33782e);
        }
        if (this.f33780c != null) {
            nyu.m37182b(5, this.f33780c);
        }
        super.a(nyu);
    }

    protected int m39218b() {
        int b = super.b();
        if (this.f33778a != null) {
            b += nyu.m37145d(1, this.f33778a);
        }
        if (this.f33779b != null) {
            b += nyu.m37145d(2, this.f33779b);
        }
        if (this.f33781d != null) {
            b += nyu.m37145d(3, this.f33781d);
        }
        if (this.f33782e != null) {
            b += nyu.m37145d(4, this.f33782e);
        }
        if (this.f33780c != null) {
            return b + nyu.m37145d(5, this.f33780c);
        }
        return b;
    }

    private oqp m39214b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33778a == null) {
                        this.f33778a = new oqn();
                    }
                    nyt.m37101a(this.f33778a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33779b == null) {
                        this.f33779b = new oqn();
                    }
                    nyt.m37101a(this.f33779b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f33781d == null) {
                        this.f33781d = new oqv();
                    }
                    nyt.m37101a(this.f33781d);
                    continue;
                case 34:
                    if (this.f33782e == null) {
                        this.f33782e = new oqm();
                    }
                    nyt.m37101a(this.f33782e);
                    continue;
                case 42:
                    if (this.f33780c == null) {
                        this.f33780c = new oqv();
                    }
                    nyt.m37101a(this.f33780c);
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
