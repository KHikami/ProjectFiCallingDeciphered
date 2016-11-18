package p000;

public final class lqv extends nyx<lqv> {
    private static volatile lqv[] f26177d;
    public ltr f26178a;
    public lor f26179b;
    public Integer f26180c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30103b(nyt);
    }

    public static lqv[] m30104d() {
        if (f26177d == null) {
            synchronized (nzc.c) {
                if (f26177d == null) {
                    f26177d = new lqv[0];
                }
            }
        }
        return f26177d;
    }

    public lqv() {
        m30105g();
    }

    private lqv m30105g() {
        this.f26178a = null;
        this.f26179b = null;
        this.f26180c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26178a != null) {
            nyu.b(1, this.f26178a);
        }
        if (this.f26180c != null) {
            nyu.a(2, this.f26180c.intValue());
        }
        if (this.f26179b != null) {
            nyu.b(3, this.f26179b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26178a != null) {
            b += nyu.d(1, this.f26178a);
        }
        if (this.f26180c != null) {
            b += nyu.f(2, this.f26180c.intValue());
        }
        if (this.f26179b != null) {
            return b + nyu.d(3, this.f26179b);
        }
        return b;
    }

    private lqv m30103b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26178a == null) {
                        this.f26178a = new ltr();
                    }
                    nyt.a(this.f26178a);
                    continue;
                case 16:
                    this.f26180c = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    if (this.f26179b == null) {
                        this.f26179b = new lor();
                    }
                    nyt.a(this.f26179b);
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
