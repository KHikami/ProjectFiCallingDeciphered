package p000;

public final class kld extends nyx<kld> {
    private static volatile kld[] f22136c;
    public klk f22137a;
    public String f22138b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26356b(nyt);
    }

    public static kld[] m26357d() {
        if (f22136c == null) {
            synchronized (nzc.c) {
                if (f22136c == null) {
                    f22136c = new kld[0];
                }
            }
        }
        return f22136c;
    }

    public kld() {
        m26358g();
    }

    private kld m26358g() {
        this.f22137a = null;
        this.f22138b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22137a != null) {
            nyu.b(1, this.f22137a);
        }
        if (this.f22138b != null) {
            nyu.a(2, this.f22138b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22137a != null) {
            b += nyu.d(1, this.f22137a);
        }
        if (this.f22138b != null) {
            return b + nyu.b(2, this.f22138b);
        }
        return b;
    }

    private kld m26356b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22137a == null) {
                        this.f22137a = new klk();
                    }
                    nyt.a(this.f22137a);
                    continue;
                case wi.dH /*18*/:
                    this.f22138b = nyt.j();
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
