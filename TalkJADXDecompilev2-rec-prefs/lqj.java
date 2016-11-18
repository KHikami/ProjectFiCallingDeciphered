package p000;

public final class lqj extends nyx<lqj> {
    private static volatile lqj[] f26137c;
    public Integer f26138a;
    public String f26139b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30040b(nyt);
    }

    public static lqj[] m30041d() {
        if (f26137c == null) {
            synchronized (nzc.c) {
                if (f26137c == null) {
                    f26137c = new lqj[0];
                }
            }
        }
        return f26137c;
    }

    public lqj() {
        m30042g();
    }

    private lqj m30042g() {
        this.f26138a = null;
        this.f26139b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26138a != null) {
            nyu.a(1, this.f26138a.intValue());
        }
        if (this.f26139b != null) {
            nyu.a(2, this.f26139b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26138a != null) {
            b += nyu.f(1, this.f26138a.intValue());
        }
        if (this.f26139b != null) {
            return b + nyu.b(2, this.f26139b);
        }
        return b;
    }

    private lqj m30040b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f26138a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.f26139b = nyt.j();
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
