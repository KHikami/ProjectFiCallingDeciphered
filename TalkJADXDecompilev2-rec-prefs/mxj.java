package p000;

public final class mxj extends nyx<mxj> {
    public mxm f28681a;
    public mxl f28682b;
    public mxn f28683c;
    public mxk f28684d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33330b(nyt);
    }

    public mxj() {
        m33331d();
    }

    private mxj m33331d() {
        this.f28681a = null;
        this.f28682b = null;
        this.f28683c = null;
        this.f28684d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28681a != null) {
            nyu.b(1, this.f28681a);
        }
        if (this.f28682b != null) {
            nyu.b(2, this.f28682b);
        }
        if (this.f28683c != null) {
            nyu.b(3, this.f28683c);
        }
        if (this.f28684d != null) {
            nyu.b(4, this.f28684d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28681a != null) {
            b += nyu.d(1, this.f28681a);
        }
        if (this.f28682b != null) {
            b += nyu.d(2, this.f28682b);
        }
        if (this.f28683c != null) {
            b += nyu.d(3, this.f28683c);
        }
        if (this.f28684d != null) {
            return b + nyu.d(4, this.f28684d);
        }
        return b;
    }

    private mxj m33330b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28681a == null) {
                        this.f28681a = new mxm();
                    }
                    nyt.a(this.f28681a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f28682b == null) {
                        this.f28682b = new mxl();
                    }
                    nyt.a(this.f28682b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28683c == null) {
                        this.f28683c = new mxn();
                    }
                    nyt.a(this.f28683c);
                    continue;
                case 34:
                    if (this.f28684d == null) {
                        this.f28684d = new mxk();
                    }
                    nyt.a(this.f28684d);
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
