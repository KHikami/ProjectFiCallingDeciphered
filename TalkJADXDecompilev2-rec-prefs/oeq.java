package p000;

public final class oeq extends nyx<oeq> {
    public int f32477a;
    public int f32478b;
    public int f32479c;

    public /* synthetic */ nzf m37975a(nyt nyt) {
        return m37973b(nyt);
    }

    public oeq() {
        m37974d();
    }

    private oeq m37974d() {
        this.f32477a = 0;
        this.f32478b = 0;
        this.f32479c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37976a(nyu nyu) {
        if (this.f32477a != 0) {
            nyu.m37168a(1, this.f32477a);
        }
        if (this.f32478b != 0) {
            nyu.m37168a(2, this.f32478b);
        }
        if (this.f32479c != 0) {
            nyu.m37168a(3, this.f32479c);
        }
        super.a(nyu);
    }

    protected int m37977b() {
        int b = super.b();
        if (this.f32477a != 0) {
            b += nyu.m37147f(1, this.f32477a);
        }
        if (this.f32478b != 0) {
            b += nyu.m37147f(2, this.f32478b);
        }
        if (this.f32479c != 0) {
            return b + nyu.m37147f(3, this.f32479c);
        }
        return b;
    }

    private oeq m37973b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32477a = nyt.m37112f();
                    continue;
                case 16:
                    this.f32478b = nyt.m37112f();
                    continue;
                case wi.dA /*24*/:
                    this.f32479c = nyt.m37112f();
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
