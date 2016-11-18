package p000;

public final class lrw extends nyx<lrw> {
    private static volatile lrw[] f26284c;
    public mrp f26285a;
    public lrx f26286b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30242b(nyt);
    }

    public static lrw[] m30243d() {
        if (f26284c == null) {
            synchronized (nzc.c) {
                if (f26284c == null) {
                    f26284c = new lrw[0];
                }
            }
        }
        return f26284c;
    }

    public lrw() {
        m30244g();
    }

    private lrw m30244g() {
        this.f26285a = null;
        this.f26286b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26285a != null) {
            nyu.b(1, this.f26285a);
        }
        if (this.f26286b != null) {
            nyu.b(2, this.f26286b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26285a != null) {
            b += nyu.d(1, this.f26285a);
        }
        if (this.f26286b != null) {
            return b + nyu.d(2, this.f26286b);
        }
        return b;
    }

    private lrw m30242b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26285a == null) {
                        this.f26285a = new mrp();
                    }
                    nyt.a(this.f26285a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26286b == null) {
                        this.f26286b = new lrx();
                    }
                    nyt.a(this.f26286b);
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
