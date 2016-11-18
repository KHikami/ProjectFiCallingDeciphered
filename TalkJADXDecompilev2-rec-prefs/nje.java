package p000;

public final class nje extends nyx<nje> {
    public Integer f29975a;
    public Integer f29976b;
    public Integer f29977c;
    public Integer f29978d;

    public /* synthetic */ nzf m35203a(nyt nyt) {
        return m35201b(nyt);
    }

    public nje() {
        m35202d();
    }

    private nje m35202d() {
        this.f29975a = null;
        this.f29976b = null;
        this.f29977c = null;
        this.f29978d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35204a(nyu nyu) {
        if (this.f29975a != null) {
            nyu.m37168a(1, this.f29975a.intValue());
        }
        if (this.f29976b != null) {
            nyu.m37168a(2, this.f29976b.intValue());
        }
        if (this.f29977c != null) {
            nyu.m37168a(3, this.f29977c.intValue());
        }
        if (this.f29978d != null) {
            nyu.m37168a(4, this.f29978d.intValue());
        }
        super.a(nyu);
    }

    protected int m35205b() {
        int b = super.b();
        if (this.f29975a != null) {
            b += nyu.m37147f(1, this.f29975a.intValue());
        }
        if (this.f29976b != null) {
            b += nyu.m37147f(2, this.f29976b.intValue());
        }
        if (this.f29977c != null) {
            b += nyu.m37147f(3, this.f29977c.intValue());
        }
        if (this.f29978d != null) {
            return b + nyu.m37147f(4, this.f29978d.intValue());
        }
        return b;
    }

    private nje m35201b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29975a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29976b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f29977c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f29978d = Integer.valueOf(nyt.m37112f());
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
