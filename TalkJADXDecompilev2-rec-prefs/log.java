package p000;

public final class log extends nyx<log> {
    private static volatile log[] f25862d;
    public loe f25863a;
    public Integer f25864b;
    public Long f25865c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29732b(nyt);
    }

    public static log[] m29733d() {
        if (f25862d == null) {
            synchronized (nzc.c) {
                if (f25862d == null) {
                    f25862d = new log[0];
                }
            }
        }
        return f25862d;
    }

    public log() {
        m29734g();
    }

    private log m29734g() {
        this.f25863a = null;
        this.f25865c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25863a != null) {
            nyu.b(1, this.f25863a);
        }
        if (this.f25864b != null) {
            nyu.a(2, this.f25864b.intValue());
        }
        if (this.f25865c != null) {
            nyu.b(3, this.f25865c.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25863a != null) {
            b += nyu.d(1, this.f25863a);
        }
        if (this.f25864b != null) {
            b += nyu.f(2, this.f25864b.intValue());
        }
        if (this.f25865c != null) {
            return b + nyu.f(3, this.f25865c.longValue());
        }
        return b;
    }

    private log m29732b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25863a == null) {
                        this.f25863a = new loe();
                    }
                    nyt.a(this.f25863a);
                    continue;
                case 16:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 10:
                        case 20:
                        case 30:
                        case 40:
                            this.f25864b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    this.f25865c = Long.valueOf(nyt.e());
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
