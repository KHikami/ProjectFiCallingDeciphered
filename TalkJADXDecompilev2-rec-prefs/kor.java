package p000;

public final class kor extends nyx<kor> {
    public ocu f22569a;
    public ocy f22570b;
    public nuq f22571c;
    public oho f22572d;
    public Long f22573e;
    public nzq f22574f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26825b(nyt);
    }

    public kor() {
        this.f22573e = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22569a != null) {
            nyu.b(1, this.f22569a);
        }
        if (this.f22570b != null) {
            nyu.b(2, this.f22570b);
        }
        if (this.f22571c != null) {
            nyu.b(3, this.f22571c);
        }
        if (this.f22572d != null) {
            nyu.b(4, this.f22572d);
        }
        if (this.f22573e != null) {
            nyu.b(5, this.f22573e.longValue());
        }
        if (this.f22574f != null) {
            nyu.b(6, this.f22574f);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22569a != null) {
            b += nyu.d(1, this.f22569a);
        }
        if (this.f22570b != null) {
            b += nyu.d(2, this.f22570b);
        }
        if (this.f22571c != null) {
            b += nyu.d(3, this.f22571c);
        }
        if (this.f22572d != null) {
            b += nyu.d(4, this.f22572d);
        }
        if (this.f22573e != null) {
            b += nyu.f(5, this.f22573e.longValue());
        }
        if (this.f22574f != null) {
            return b + nyu.d(6, this.f22574f);
        }
        return b;
    }

    private kor m26825b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22569a == null) {
                        this.f22569a = new ocu();
                    }
                    nyt.a(this.f22569a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22570b == null) {
                        this.f22570b = new ocy();
                    }
                    nyt.a(this.f22570b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22571c == null) {
                        this.f22571c = new nuq();
                    }
                    nyt.a(this.f22571c);
                    continue;
                case 34:
                    if (this.f22572d == null) {
                        this.f22572d = new oho();
                    }
                    nyt.a(this.f22572d);
                    continue;
                case 40:
                    this.f22573e = Long.valueOf(nyt.e());
                    continue;
                case 50:
                    if (this.f22574f == null) {
                        this.f22574f = new nzq();
                    }
                    nyt.a(this.f22574f);
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
