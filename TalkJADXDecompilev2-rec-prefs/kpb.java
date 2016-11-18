package p000;

public final class kpb extends nyx<kpb> {
    private static volatile kpb[] f22608c;
    public Integer f22609a;
    public String f22610b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26873b(nyt);
    }

    public static kpb[] m26874d() {
        if (f22608c == null) {
            synchronized (nzc.c) {
                if (f22608c == null) {
                    f22608c = new kpb[0];
                }
            }
        }
        return f22608c;
    }

    public kpb() {
        m26875g();
    }

    private kpb m26875g() {
        this.f22610b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22609a != null) {
            nyu.a(1, this.f22609a.intValue());
        }
        if (this.f22610b != null) {
            nyu.a(2, this.f22610b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22609a != null) {
            b += nyu.f(1, this.f22609a.intValue());
        }
        if (this.f22610b != null) {
            return b + nyu.b(2, this.f22610b);
        }
        return b;
    }

    private kpb m26873b(nyt nyt) {
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
                            this.f22609a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f22610b = nyt.j();
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
