package p000;

public final class mvk extends nyx<mvk> {
    public String f28481a;
    public String f28482b;
    public mvl f28483c;
    public long f28484d;
    public String f28485e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33087b(nyt);
    }

    public mvk() {
        m33088d();
    }

    private mvk m33088d() {
        this.f28481a = "";
        this.f28482b = "";
        this.f28483c = null;
        this.f28484d = 0;
        this.f28485e = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28481a == null || this.f28481a.equals(""))) {
            nyu.a(1, this.f28481a);
        }
        if (!(this.f28482b == null || this.f28482b.equals(""))) {
            nyu.a(2, this.f28482b);
        }
        if (this.f28483c != null) {
            nyu.b(3, this.f28483c);
        }
        if (this.f28484d != 0) {
            nyu.b(4, this.f28484d);
        }
        if (!(this.f28485e == null || this.f28485e.equals(""))) {
            nyu.a(5, this.f28485e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28481a == null || this.f28481a.equals(""))) {
            b += nyu.b(1, this.f28481a);
        }
        if (!(this.f28482b == null || this.f28482b.equals(""))) {
            b += nyu.b(2, this.f28482b);
        }
        if (this.f28483c != null) {
            b += nyu.d(3, this.f28483c);
        }
        if (this.f28484d != 0) {
            b += nyu.f(4, this.f28484d);
        }
        if (this.f28485e == null || this.f28485e.equals("")) {
            return b;
        }
        return b + nyu.b(5, this.f28485e);
    }

    private mvk m33087b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28481a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f28482b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f28483c == null) {
                        this.f28483c = new mvl();
                    }
                    nyt.a(this.f28483c);
                    continue;
                case 32:
                    this.f28484d = nyt.e();
                    continue;
                case 42:
                    this.f28485e = nyt.j();
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
