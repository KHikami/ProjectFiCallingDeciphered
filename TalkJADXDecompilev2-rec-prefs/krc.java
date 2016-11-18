package p000;

public final class krc extends nyx<krc> {
    private static volatile krc[] f22856e;
    public kqd f22857a;
    public kpi f22858b;
    public String f22859c;
    public Integer f22860d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27155b(nyt);
    }

    public static krc[] m27156d() {
        if (f22856e == null) {
            synchronized (nzc.c) {
                if (f22856e == null) {
                    f22856e = new krc[0];
                }
            }
        }
        return f22856e;
    }

    public krc() {
        m27157g();
    }

    private krc m27157g() {
        this.f22857a = null;
        this.f22858b = null;
        this.f22859c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22857a != null) {
            nyu.b(1, this.f22857a);
        }
        if (this.f22858b != null) {
            nyu.b(2, this.f22858b);
        }
        if (this.f22859c != null) {
            nyu.a(3, this.f22859c);
        }
        if (this.f22860d != null) {
            nyu.a(4, this.f22860d.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22857a != null) {
            b += nyu.d(1, this.f22857a);
        }
        if (this.f22858b != null) {
            b += nyu.d(2, this.f22858b);
        }
        if (this.f22859c != null) {
            b += nyu.b(3, this.f22859c);
        }
        if (this.f22860d != null) {
            return b + nyu.f(4, this.f22860d.intValue());
        }
        return b;
    }

    private krc m27155b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22857a == null) {
                        this.f22857a = new kqd();
                    }
                    nyt.a(this.f22857a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22858b == null) {
                        this.f22858b = new kpi();
                    }
                    nyt.a(this.f22858b);
                    continue;
                case wi.dx /*26*/:
                    this.f22859c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                            this.f22860d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
