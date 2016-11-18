package p000;

public final class kkc extends nyx<kkc> {
    private static volatile kkc[] f22029e;
    public klk f22030a;
    public String f22031b;
    public String f22032c;
    public String f22033d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26203b(nyt);
    }

    public static kkc[] m26204d() {
        if (f22029e == null) {
            synchronized (nzc.c) {
                if (f22029e == null) {
                    f22029e = new kkc[0];
                }
            }
        }
        return f22029e;
    }

    public kkc() {
        m26205g();
    }

    private kkc m26205g() {
        this.f22030a = null;
        this.f22031b = null;
        this.f22032c = null;
        this.f22033d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22030a != null) {
            nyu.b(1, this.f22030a);
        }
        if (this.f22031b != null) {
            nyu.a(2, this.f22031b);
        }
        if (this.f22032c != null) {
            nyu.a(3, this.f22032c);
        }
        if (this.f22033d != null) {
            nyu.a(4, this.f22033d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22030a != null) {
            b += nyu.d(1, this.f22030a);
        }
        if (this.f22031b != null) {
            b += nyu.b(2, this.f22031b);
        }
        if (this.f22032c != null) {
            b += nyu.b(3, this.f22032c);
        }
        if (this.f22033d != null) {
            return b + nyu.b(4, this.f22033d);
        }
        return b;
    }

    private kkc m26203b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22030a == null) {
                        this.f22030a = new klk();
                    }
                    nyt.a(this.f22030a);
                    continue;
                case wi.dH /*18*/:
                    this.f22031b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f22032c = nyt.j();
                    continue;
                case 34:
                    this.f22033d = nyt.j();
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
