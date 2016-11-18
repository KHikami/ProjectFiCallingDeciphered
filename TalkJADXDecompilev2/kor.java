package defpackage;

public final class kor extends nyx<kor> {
    public ocu a;
    public ocy b;
    public nuq c;
    public oho d;
    public Long e;
    public nzq f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public kor() {
        this.e = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null) {
            nyu.b(5, this.e.longValue());
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != null) {
            b += nyu.f(5, this.e.longValue());
        }
        if (this.f != null) {
            return b + nyu.d(6, this.f);
        }
        return b;
    }

    private kor b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new ocu();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new ocy();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nuq();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new oho();
                    }
                    nyt.a(this.d);
                    continue;
                case 40:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new nzq();
                    }
                    nyt.a(this.f);
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
