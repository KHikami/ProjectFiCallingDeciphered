package p000;

public final class kmt extends nyx<kmt> {
    public Boolean f22397a;
    public oxt f22398b;
    public String f22399c;
    public String f22400d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26585b(nyt);
    }

    public kmt() {
        m26586d();
    }

    private kmt m26586d() {
        this.f22397a = null;
        this.f22398b = null;
        this.f22399c = null;
        this.f22400d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22397a != null) {
            nyu.a(2, this.f22397a.booleanValue());
        }
        if (this.f22398b != null) {
            nyu.b(3, this.f22398b);
        }
        if (this.f22399c != null) {
            nyu.a(4, this.f22399c);
        }
        if (this.f22400d != null) {
            nyu.a(5, this.f22400d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22397a != null) {
            this.f22397a.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22398b != null) {
            b += nyu.d(3, this.f22398b);
        }
        if (this.f22399c != null) {
            b += nyu.b(4, this.f22399c);
        }
        if (this.f22400d != null) {
            return b + nyu.b(5, this.f22400d);
        }
        return b;
    }

    private kmt m26585b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 16:
                    this.f22397a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f22398b == null) {
                        this.f22398b = new oxt();
                    }
                    nyt.a(this.f22398b);
                    continue;
                case 34:
                    this.f22399c = nyt.j();
                    continue;
                case 42:
                    this.f22400d = nyt.j();
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
