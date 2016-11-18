package p000;

public final class kvl extends nyx<kvl> {
    private static volatile kvl[] f23642c;
    public kvm f23643a;
    public String f23644b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27699b(nyt);
    }

    public static kvl[] m27700d() {
        if (f23642c == null) {
            synchronized (nzc.c) {
                if (f23642c == null) {
                    f23642c = new kvl[0];
                }
            }
        }
        return f23642c;
    }

    public kvl() {
        this.f23644b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23643a != null) {
            nyu.b(1, this.f23643a);
        }
        if (this.f23644b != null) {
            nyu.a(2, this.f23644b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23643a != null) {
            b += nyu.d(1, this.f23643a);
        }
        if (this.f23644b != null) {
            return b + nyu.b(2, this.f23644b);
        }
        return b;
    }

    private kvl m27699b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23643a == null) {
                        this.f23643a = new kvm();
                    }
                    nyt.a(this.f23643a);
                    continue;
                case wi.dH /*18*/:
                    this.f23644b = nyt.j();
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
