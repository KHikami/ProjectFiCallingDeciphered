package p000;

public final class klq extends nyx<klq> {
    private static volatile klq[] f22282c;
    public klk f22283a;
    public String f22284b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26428b(nyt);
    }

    public static klq[] m26429d() {
        if (f22282c == null) {
            synchronized (nzc.c) {
                if (f22282c == null) {
                    f22282c = new klq[0];
                }
            }
        }
        return f22282c;
    }

    public klq() {
        m26430g();
    }

    private klq m26430g() {
        this.f22283a = null;
        this.f22284b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22283a != null) {
            nyu.b(1, this.f22283a);
        }
        if (this.f22284b != null) {
            nyu.a(2, this.f22284b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22283a != null) {
            b += nyu.d(1, this.f22283a);
        }
        if (this.f22284b != null) {
            return b + nyu.b(2, this.f22284b);
        }
        return b;
    }

    private klq m26428b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22283a == null) {
                        this.f22283a = new klk();
                    }
                    nyt.a(this.f22283a);
                    continue;
                case wi.dH /*18*/:
                    this.f22284b = nyt.j();
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
