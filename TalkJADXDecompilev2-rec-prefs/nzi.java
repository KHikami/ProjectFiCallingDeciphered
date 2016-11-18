package p000;

public final class nzi extends nyx<nzi> {
    private int f31315a;
    private long f31316b;
    private int f31317c;

    public /* synthetic */ nzf m37254a(nyt nyt) {
        return m37252b(nyt);
    }

    public nzi() {
        m37253d();
    }

    private nzi m37253d() {
        this.f31315a = 0;
        this.f31316b = 0;
        this.f31317c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37255a(nyu nyu) {
        if ((this.f31315a & 1) != 0) {
            nyu.m37181b(1, this.f31316b);
        }
        if ((this.f31315a & 2) != 0) {
            nyu.m37168a(2, this.f31317c);
        }
        super.a(nyu);
    }

    protected int m37256b() {
        int b = super.b();
        if ((this.f31315a & 1) != 0) {
            b += nyu.m37148f(1, this.f31316b);
        }
        if ((this.f31315a & 2) != 0) {
            return b + nyu.m37147f(2, this.f31317c);
        }
        return b;
    }

    private nzi m37252b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f31316b = nyt.m37110e();
                    this.f31315a |= 1;
                    continue;
                case 16:
                    this.f31317c = nyt.m37112f();
                    this.f31315a |= 2;
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
