package p000;

public final class ons extends nyx<ons> {
    public Integer f33324a;
    public Integer f33325b;
    public Integer f33326c;
    public Integer f33327d;

    public /* synthetic */ nzf m38836a(nyt nyt) {
        return m38835b(nyt);
    }

    public ons() {
        this.f33324a = null;
        this.f33325b = null;
        this.f33326c = null;
        this.f33327d = null;
        this.cachedSize = -1;
    }

    public void m38837a(nyu nyu) {
        if (this.f33324a != null) {
            nyu.m37168a(1, this.f33324a.intValue());
        }
        if (this.f33325b != null) {
            nyu.m37168a(2, this.f33325b.intValue());
        }
        if (this.f33326c != null) {
            nyu.m37168a(3, this.f33326c.intValue());
        }
        if (this.f33327d != null) {
            nyu.m37168a(4, this.f33327d.intValue());
        }
        super.a(nyu);
    }

    protected int m38838b() {
        int b = super.b();
        if (this.f33324a != null) {
            b += nyu.m37147f(1, this.f33324a.intValue());
        }
        if (this.f33325b != null) {
            b += nyu.m37147f(2, this.f33325b.intValue());
        }
        if (this.f33326c != null) {
            b += nyu.m37147f(3, this.f33326c.intValue());
        }
        if (this.f33327d != null) {
            return b + nyu.m37147f(4, this.f33327d.intValue());
        }
        return b;
    }

    private ons m38835b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33324a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f33325b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f33326c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f33327d = Integer.valueOf(nyt.m37112f());
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
