package p000;

public final class kwp extends nyx<kwp> {
    public String f23783a;
    public kwq f23784b;
    public Integer f23785c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27827b(nyt);
    }

    public kwp() {
        m27828d();
    }

    private kwp m27828d() {
        this.f23783a = null;
        this.f23784b = null;
        this.f23785c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23783a != null) {
            nyu.a(1, this.f23783a);
        }
        if (this.f23784b != null) {
            nyu.b(2, this.f23784b);
        }
        if (this.f23785c != null) {
            nyu.a(3, this.f23785c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23783a != null) {
            b += nyu.b(1, this.f23783a);
        }
        if (this.f23784b != null) {
            b += nyu.d(2, this.f23784b);
        }
        if (this.f23785c != null) {
            return b + nyu.f(3, this.f23785c.intValue());
        }
        return b;
    }

    private kwp m27827b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23783a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f23784b == null) {
                        this.f23784b = new kwq();
                    }
                    nyt.a(this.f23784b);
                    continue;
                case wi.dA /*24*/:
                    this.f23785c = Integer.valueOf(nyt.f());
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
