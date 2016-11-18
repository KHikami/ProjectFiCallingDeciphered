package p000;

public final class ohv extends nyx<ohv> {
    private static volatile ohv[] f32939d;
    public Integer f32940a;
    public Boolean f32941b;
    public ohw f32942c;

    public /* synthetic */ nzf m38410a(nyt nyt) {
        return m38407b(nyt);
    }

    public static ohv[] m38408d() {
        if (f32939d == null) {
            synchronized (nzc.f31309c) {
                if (f32939d == null) {
                    f32939d = new ohv[0];
                }
            }
        }
        return f32939d;
    }

    public ohv() {
        m38409g();
    }

    private ohv m38409g() {
        this.f32941b = null;
        this.f32942c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38411a(nyu nyu) {
        if (this.f32940a != null) {
            nyu.m37168a(1, this.f32940a.intValue());
        }
        if (this.f32941b != null) {
            nyu.m37172a(2, this.f32941b.booleanValue());
        }
        if (this.f32942c != null) {
            nyu.m37182b(3, this.f32942c);
        }
        super.a(nyu);
    }

    protected int m38412b() {
        int b = super.b();
        if (this.f32940a != null) {
            b += nyu.m37147f(1, this.f32940a.intValue());
        }
        if (this.f32941b != null) {
            this.f32941b.booleanValue();
            b += nyu.m37154h(2) + 1;
        }
        if (this.f32942c != null) {
            return b + nyu.m37145d(3, this.f32942c);
        }
        return b;
    }

    private ohv m38407b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f32940a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f32941b = Boolean.valueOf(nyt.m37116i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f32942c == null) {
                        this.f32942c = new ohw();
                    }
                    nyt.m37101a(this.f32942c);
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
