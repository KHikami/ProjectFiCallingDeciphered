package p000;

public final class mvn extends nyx<mvn> {
    private static volatile mvn[] f28498c;
    public String f28499a;
    public mvy f28500b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33103b(nyt);
    }

    public static mvn[] m33104d() {
        if (f28498c == null) {
            synchronized (nzc.c) {
                if (f28498c == null) {
                    f28498c = new mvn[0];
                }
            }
        }
        return f28498c;
    }

    public mvn() {
        m33105g();
    }

    private mvn m33105g() {
        this.f28499a = "";
        this.f28500b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (!(this.f28499a == null || this.f28499a.equals(""))) {
            nyu.a(1, this.f28499a);
        }
        if (this.f28500b != null) {
            nyu.b(2, this.f28500b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (!(this.f28499a == null || this.f28499a.equals(""))) {
            b += nyu.b(1, this.f28499a);
        }
        if (this.f28500b != null) {
            return b + nyu.d(2, this.f28500b);
        }
        return b;
    }

    private mvn m33103b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f28499a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f28500b == null) {
                        this.f28500b = new mvy();
                    }
                    nyt.a(this.f28500b);
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
