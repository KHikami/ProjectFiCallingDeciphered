package p000;

public final class lpp extends nyx<lpp> {
    private static volatile lpp[] f26013g;
    public Integer f26014a;
    public Double f26015b;
    public Double f26016c;
    public Long f26017d;
    public Integer f26018e;
    public String f26019f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29930b(nyt);
    }

    public static lpp[] m29931d() {
        if (f26013g == null) {
            synchronized (nzc.c) {
                if (f26013g == null) {
                    f26013g = new lpp[0];
                }
            }
        }
        return f26013g;
    }

    public lpp() {
        m29932g();
    }

    private lpp m29932g() {
        this.f26015b = null;
        this.f26016c = null;
        this.f26017d = null;
        this.f26018e = null;
        this.f26019f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26014a != null) {
            nyu.a(1, this.f26014a.intValue());
        }
        if (this.f26015b != null) {
            nyu.a(2, this.f26015b.doubleValue());
        }
        if (this.f26016c != null) {
            nyu.a(3, this.f26016c.doubleValue());
        }
        if (this.f26017d != null) {
            nyu.b(4, this.f26017d.longValue());
        }
        if (this.f26018e != null) {
            nyu.a(5, this.f26018e.intValue());
        }
        if (this.f26019f != null) {
            nyu.a(6, this.f26019f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26014a != null) {
            b += nyu.f(1, this.f26014a.intValue());
        }
        if (this.f26015b != null) {
            this.f26015b.doubleValue();
            b += nyu.h(2) + 8;
        }
        if (this.f26016c != null) {
            this.f26016c.doubleValue();
            b += nyu.h(3) + 8;
        }
        if (this.f26017d != null) {
            b += nyu.f(4, this.f26017d.longValue());
        }
        if (this.f26018e != null) {
            b += nyu.f(5, this.f26018e.intValue());
        }
        if (this.f26019f != null) {
            return b + nyu.b(6, this.f26019f);
        }
        return b;
    }

    private lpp m29930b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.f26014a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dK /*17*/:
                    this.f26015b = Double.valueOf(nyt.b());
                    continue;
                case wi.dz /*25*/:
                    this.f26016c = Double.valueOf(nyt.b());
                    continue;
                case 32:
                    this.f26017d = Long.valueOf(nyt.e());
                    continue;
                case 40:
                    this.f26018e = Integer.valueOf(nyt.f());
                    continue;
                case 50:
                    this.f26019f = nyt.j();
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
