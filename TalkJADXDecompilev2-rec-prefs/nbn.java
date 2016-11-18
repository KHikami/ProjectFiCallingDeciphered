package p000;

public final class nbn extends nyx<nbn> {
    public nbi f29443a;
    public nbk f29444b;
    public nbo f29445c;
    public nbp f29446d;
    public nbs f29447e;
    public nbt f29448f;
    public nbj f29449g;
    public nbr f29450h;

    public /* synthetic */ nzf m34201a(nyt nyt) {
        return m34200b(nyt);
    }

    public nbn() {
        this.cachedSize = -1;
    }

    public void m34202a(nyu nyu) {
        if (this.f29443a != null) {
            nyu.m37182b(1, this.f29443a);
        }
        if (this.f29444b != null) {
            nyu.m37182b(2, this.f29444b);
        }
        if (this.f29445c != null) {
            nyu.m37182b(3, this.f29445c);
        }
        if (this.f29446d != null) {
            nyu.m37182b(4, this.f29446d);
        }
        if (this.f29447e != null) {
            nyu.m37182b(5, this.f29447e);
        }
        if (this.f29448f != null) {
            nyu.m37182b(6, this.f29448f);
        }
        if (this.f29449g != null) {
            nyu.m37182b(7, this.f29449g);
        }
        if (this.f29450h != null) {
            nyu.m37182b(8, this.f29450h);
        }
        super.a(nyu);
    }

    protected int m34203b() {
        int b = super.b();
        if (this.f29443a != null) {
            b += nyu.m37145d(1, this.f29443a);
        }
        if (this.f29444b != null) {
            b += nyu.m37145d(2, this.f29444b);
        }
        if (this.f29445c != null) {
            b += nyu.m37145d(3, this.f29445c);
        }
        if (this.f29446d != null) {
            b += nyu.m37145d(4, this.f29446d);
        }
        if (this.f29447e != null) {
            b += nyu.m37145d(5, this.f29447e);
        }
        if (this.f29448f != null) {
            b += nyu.m37145d(6, this.f29448f);
        }
        if (this.f29449g != null) {
            b += nyu.m37145d(7, this.f29449g);
        }
        if (this.f29450h != null) {
            return b + nyu.m37145d(8, this.f29450h);
        }
        return b;
    }

    private nbn m34200b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29443a == null) {
                        this.f29443a = new nbi();
                    }
                    nyt.m37101a(this.f29443a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f29444b == null) {
                        this.f29444b = new nbk();
                    }
                    nyt.m37101a(this.f29444b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f29445c == null) {
                        this.f29445c = new nbo();
                    }
                    nyt.m37101a(this.f29445c);
                    continue;
                case 34:
                    if (this.f29446d == null) {
                        this.f29446d = new nbp();
                    }
                    nyt.m37101a(this.f29446d);
                    continue;
                case 42:
                    if (this.f29447e == null) {
                        this.f29447e = new nbs();
                    }
                    nyt.m37101a(this.f29447e);
                    continue;
                case 50:
                    if (this.f29448f == null) {
                        this.f29448f = new nbt();
                    }
                    nyt.m37101a(this.f29448f);
                    continue;
                case 58:
                    if (this.f29449g == null) {
                        this.f29449g = new nbj();
                    }
                    nyt.m37101a(this.f29449g);
                    continue;
                case 66:
                    if (this.f29450h == null) {
                        this.f29450h = new nbr();
                    }
                    nyt.m37101a(this.f29450h);
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
