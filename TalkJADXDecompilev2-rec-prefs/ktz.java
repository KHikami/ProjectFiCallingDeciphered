package p000;

public final class ktz extends nyx<ktz> {
    private static volatile ktz[] f23348c;
    public String f23349a;
    public String f23350b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27524b(nyt);
    }

    public static ktz[] m27525d() {
        if (f23348c == null) {
            synchronized (nzc.c) {
                if (f23348c == null) {
                    f23348c = new ktz[0];
                }
            }
        }
        return f23348c;
    }

    public ktz() {
        this.f23349a = null;
        this.f23350b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23349a != null) {
            nyu.a(1, this.f23349a);
        }
        if (this.f23350b != null) {
            nyu.a(2, this.f23350b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23349a != null) {
            b += nyu.b(1, this.f23349a);
        }
        if (this.f23350b != null) {
            return b + nyu.b(2, this.f23350b);
        }
        return b;
    }

    private ktz m27524b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f23349a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f23350b = nyt.j();
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
