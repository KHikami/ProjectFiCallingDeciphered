package p000;

public final class oye extends nyx<oye> {
    public oyh f34619a;
    public oyh f34620b;
    public oyi f34621c;
    public oyi f34622d;

    public /* synthetic */ nzf m39885a(nyt nyt) {
        return m39883b(nyt);
    }

    public oye() {
        m39884d();
    }

    private oye m39884d() {
        this.f34619a = null;
        this.f34620b = null;
        this.f34621c = null;
        this.f34622d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39886a(nyu nyu) {
        if (this.f34619a != null) {
            nyu.m37182b(1, this.f34619a);
        }
        if (this.f34620b != null) {
            nyu.m37182b(2, this.f34620b);
        }
        if (this.f34621c != null) {
            nyu.m37182b(3, this.f34621c);
        }
        if (this.f34622d != null) {
            nyu.m37182b(4, this.f34622d);
        }
        super.a(nyu);
    }

    protected int m39887b() {
        int b = super.b();
        if (this.f34619a != null) {
            b += nyu.m37145d(1, this.f34619a);
        }
        if (this.f34620b != null) {
            b += nyu.m37145d(2, this.f34620b);
        }
        if (this.f34621c != null) {
            b += nyu.m37145d(3, this.f34621c);
        }
        if (this.f34622d != null) {
            return b + nyu.m37145d(4, this.f34622d);
        }
        return b;
    }

    private oye m39883b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34619a == null) {
                        this.f34619a = new oyh();
                    }
                    nyt.m37101a(this.f34619a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f34620b == null) {
                        this.f34620b = new oyh();
                    }
                    nyt.m37101a(this.f34620b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f34621c == null) {
                        this.f34621c = new oyi();
                    }
                    nyt.m37101a(this.f34621c);
                    continue;
                case 34:
                    if (this.f34622d == null) {
                        this.f34622d = new oyi();
                    }
                    nyt.m37101a(this.f34622d);
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
