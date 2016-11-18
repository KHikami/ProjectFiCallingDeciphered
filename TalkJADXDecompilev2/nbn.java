package defpackage;

public final class nbn extends nyx<nbn> {
    public nbi a;
    public nbk b;
    public nbo c;
    public nbp d;
    public nbs e;
    public nbt f;
    public nbj g;
    public nbr h;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nbn() {
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
            nyu.b(5, this.e);
        }
        if (this.f != null) {
            nyu.b(6, this.f);
        }
        if (this.g != null) {
            nyu.b(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
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
            b += nyu.d(5, this.e);
        }
        if (this.f != null) {
            b += nyu.d(6, this.f);
        }
        if (this.g != null) {
            b += nyu.d(7, this.g);
        }
        if (this.h != null) {
            return b + nyu.d(8, this.h);
        }
        return b;
    }

    private nbn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nbi();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nbk();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nbo();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new nbp();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new nbs();
                    }
                    nyt.a(this.e);
                    continue;
                case 50:
                    if (this.f == null) {
                        this.f = new nbt();
                    }
                    nyt.a(this.f);
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new nbj();
                    }
                    nyt.a(this.g);
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new nbr();
                    }
                    nyt.a(this.h);
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
