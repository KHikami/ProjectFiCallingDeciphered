package p000;

public final class kkl extends nyx<kkl> {
    private static volatile kkl[] f22056e;
    public klk f22057a;
    public String f22058b;
    public String f22059c;
    public String f22060d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26251b(nyt);
    }

    public static kkl[] m26252d() {
        if (f22056e == null) {
            synchronized (nzc.c) {
                if (f22056e == null) {
                    f22056e = new kkl[0];
                }
            }
        }
        return f22056e;
    }

    public kkl() {
        m26253g();
    }

    private kkl m26253g() {
        this.f22057a = null;
        this.f22058b = null;
        this.f22059c = null;
        this.f22060d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22057a != null) {
            nyu.b(1, this.f22057a);
        }
        if (this.f22058b != null) {
            nyu.a(2, this.f22058b);
        }
        if (this.f22059c != null) {
            nyu.a(3, this.f22059c);
        }
        if (this.f22060d != null) {
            nyu.a(4, this.f22060d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22057a != null) {
            b += nyu.d(1, this.f22057a);
        }
        if (this.f22058b != null) {
            b += nyu.b(2, this.f22058b);
        }
        if (this.f22059c != null) {
            b += nyu.b(3, this.f22059c);
        }
        if (this.f22060d != null) {
            return b + nyu.b(4, this.f22060d);
        }
        return b;
    }

    private kkl m26251b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22057a == null) {
                        this.f22057a = new klk();
                    }
                    nyt.a(this.f22057a);
                    continue;
                case wi.dH /*18*/:
                    this.f22058b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22059c = nyt.j();
                    continue;
                case 34:
                    this.f22060d = nyt.j();
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
