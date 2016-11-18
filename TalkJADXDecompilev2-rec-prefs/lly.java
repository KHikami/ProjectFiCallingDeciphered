package p000;

public final class lly extends nyx<lly> {
    private static volatile lly[] f25431e;
    public Integer f25432a;
    public Integer f25433b;
    public Integer f25434c;
    public String f25435d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29427b(nyt);
    }

    public static lly[] m29428d() {
        if (f25431e == null) {
            synchronized (nzc.c) {
                if (f25431e == null) {
                    f25431e = new lly[0];
                }
            }
        }
        return f25431e;
    }

    public lly() {
        m29429g();
    }

    private lly m29429g() {
        this.f25432a = null;
        this.f25433b = null;
        this.f25434c = null;
        this.f25435d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25432a != null) {
            nyu.a(1, this.f25432a.intValue());
        }
        if (this.f25433b != null) {
            nyu.a(2, this.f25433b.intValue());
        }
        if (this.f25434c != null) {
            nyu.a(3, this.f25434c.intValue());
        }
        if (this.f25435d != null) {
            nyu.a(4, this.f25435d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25432a != null) {
            b += nyu.f(1, this.f25432a.intValue());
        }
        if (this.f25433b != null) {
            b += nyu.f(2, this.f25433b.intValue());
        }
        if (this.f25434c != null) {
            b += nyu.f(3, this.f25434c.intValue());
        }
        if (this.f25435d != null) {
            return b + nyu.b(4, this.f25435d);
        }
        return b;
    }

    private lly m29427b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25432a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.f25433b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.f25434c = Integer.valueOf(nyt.f());
                    continue;
                case 34:
                    this.f25435d = nyt.j();
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
