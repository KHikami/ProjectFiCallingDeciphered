package p000;

public final class ose extends nyx<ose> {
    public osg f34117a;
    public osg f34118b;
    public osg f34119c;

    public /* synthetic */ nzf m39542a(nyt nyt) {
        return m39540b(nyt);
    }

    public ose() {
        m39541d();
    }

    private ose m39541d() {
        this.f34117a = null;
        this.f34118b = null;
        this.f34119c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39543a(nyu nyu) {
        if (this.f34117a != null) {
            nyu.m37182b(1, this.f34117a);
        }
        if (this.f34118b != null) {
            nyu.m37182b(2, this.f34118b);
        }
        if (this.f34119c != null) {
            nyu.m37182b(3, this.f34119c);
        }
        super.a(nyu);
    }

    protected int m39544b() {
        int b = super.b();
        if (this.f34117a != null) {
            b += nyu.m37145d(1, this.f34117a);
        }
        if (this.f34118b != null) {
            b += nyu.m37145d(2, this.f34118b);
        }
        if (this.f34119c != null) {
            return b + nyu.m37145d(3, this.f34119c);
        }
        return b;
    }

    private ose m39540b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34117a == null) {
                        this.f34117a = new osg();
                    }
                    nyt.m37101a(this.f34117a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34118b == null) {
                        this.f34118b = new osg();
                    }
                    nyt.m37101a(this.f34118b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f34119c == null) {
                        this.f34119c = new osg();
                    }
                    nyt.m37101a(this.f34119c);
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
