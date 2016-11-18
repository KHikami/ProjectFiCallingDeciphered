package p000;

public final class lmy extends nyx<lmy> {
    private static volatile lmy[] f25715d;
    public Integer f25716a;
    public Integer f25717b;
    public Integer f25718c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29558b(nyt);
    }

    public static lmy[] m29559d() {
        if (f25715d == null) {
            synchronized (nzc.c) {
                if (f25715d == null) {
                    f25715d = new lmy[0];
                }
            }
        }
        return f25715d;
    }

    public lmy() {
        this.f25716a = null;
        this.f25717b = null;
        this.f25718c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f25716a.intValue());
        nyu.a(2, this.f25717b.intValue());
        nyu.a(3, this.f25718c.intValue());
        super.mo146a(nyu);
    }

    protected int mo147b() {
        return ((super.mo147b() + nyu.f(1, this.f25716a.intValue())) + nyu.f(2, this.f25717b.intValue())) + nyu.f(3, this.f25718c.intValue());
    }

    private lmy m29558b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25716a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25717b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25718c = Integer.valueOf(nyt.f());
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
