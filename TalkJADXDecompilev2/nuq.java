package defpackage;

public final class nuq extends nyx<nuq> {
    public String a;
    public Boolean b;
    public String c;
    public Long d;
    public Long e;
    public Boolean f;
    public Long g;
    public String h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nuq() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.d != null) {
            nyu.c(3, this.d.longValue());
        }
        if (this.e != null) {
            nyu.c(4, this.e.longValue());
        }
        if (this.f != null) {
            nyu.a(5, this.f.booleanValue());
        }
        if (this.b != null) {
            nyu.a(6, this.b.booleanValue());
        }
        if (this.g != null) {
            nyu.b(7, this.g.longValue());
        }
        if (this.h != null) {
            nyu.a(8, this.h);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.d != null) {
            this.d.longValue();
            b += nyu.h(3) + 8;
        }
        if (this.e != null) {
            this.e.longValue();
            b += nyu.h(4) + 8;
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(5) + 1;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g != null) {
            b += nyu.f(7, this.g.longValue());
        }
        if (this.h != null) {
            return b + nyu.b(8, this.h);
        }
        return b;
    }

    private nuq b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.j();
                    continue;
                case wi.dz /*25*/:
                    this.d = Long.valueOf(nyt.g());
                    continue;
                case 33:
                    this.e = Long.valueOf(nyt.g());
                    continue;
                case 40:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 48:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.g = Long.valueOf(nyt.e());
                    continue;
                case 66:
                    this.h = nyt.j();
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
