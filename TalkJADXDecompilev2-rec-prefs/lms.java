package p000;

public final class lms extends nyx<lms> {
    public Integer f25665a;
    public String f25666b;
    public ocz f25667c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29530b(nyt);
    }

    public lms() {
        this.f25665a = null;
        this.f25666b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25665a != null) {
            nyu.c(1, this.f25665a.intValue());
        }
        if (this.f25666b != null) {
            nyu.a(2, this.f25666b);
        }
        if (this.f25667c != null) {
            nyu.b(3, this.f25667c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25665a != null) {
            b += nyu.g(1, this.f25665a.intValue());
        }
        if (this.f25666b != null) {
            b += nyu.b(2, this.f25666b);
        }
        if (this.f25667c != null) {
            return b + nyu.d(3, this.f25667c);
        }
        return b;
    }

    private lms m29530b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f25665a = Integer.valueOf(nyt.l());
                    continue;
                case wi.dH /*18*/:
                    this.f25666b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f25667c == null) {
                        this.f25667c = new ocz();
                    }
                    nyt.a(this.f25667c);
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
