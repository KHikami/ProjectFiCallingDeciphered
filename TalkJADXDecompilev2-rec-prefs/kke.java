package p000;

public final class kke extends nyx<kke> {
    private static volatile kke[] f22036c;
    public Integer f22037a;
    public kkf f22038b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26214b(nyt);
    }

    public static kke[] m26215d() {
        if (f22036c == null) {
            synchronized (nzc.c) {
                if (f22036c == null) {
                    f22036c = new kke[0];
                }
            }
        }
        return f22036c;
    }

    public kke() {
        m26216g();
    }

    private kke m26216g() {
        this.f22038b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22037a != null) {
            nyu.a(1, this.f22037a.intValue());
        }
        if (this.f22038b != null) {
            nyu.b(2, this.f22038b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22037a != null) {
            b += nyu.f(1, this.f22037a.intValue());
        }
        if (this.f22038b != null) {
            return b + nyu.d(2, this.f22038b);
        }
        return b;
    }

    private kke m26214b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f22037a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f22038b == null) {
                        this.f22038b = new kkf();
                    }
                    nyt.a(this.f22038b);
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
