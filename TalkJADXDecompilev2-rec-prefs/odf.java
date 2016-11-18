package p000;

public final class odf extends nyx<odf> {
    public odi f32403a;
    public odi f32404b;
    public odj f32405c;
    public odj f32406d;

    public /* synthetic */ nzf m37840a(nyt nyt) {
        return m37839b(nyt);
    }

    public odf() {
        this.cachedSize = -1;
    }

    public void m37841a(nyu nyu) {
        if (this.f32403a != null) {
            nyu.m37182b(1, this.f32403a);
        }
        if (this.f32404b != null) {
            nyu.m37182b(2, this.f32404b);
        }
        if (this.f32405c != null) {
            nyu.m37182b(3, this.f32405c);
        }
        if (this.f32406d != null) {
            nyu.m37182b(4, this.f32406d);
        }
        super.a(nyu);
    }

    protected int m37842b() {
        int b = super.b();
        if (this.f32403a != null) {
            b += nyu.m37145d(1, this.f32403a);
        }
        if (this.f32404b != null) {
            b += nyu.m37145d(2, this.f32404b);
        }
        if (this.f32405c != null) {
            b += nyu.m37145d(3, this.f32405c);
        }
        if (this.f32406d != null) {
            return b + nyu.m37145d(4, this.f32406d);
        }
        return b;
    }

    private odf m37839b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32403a == null) {
                        this.f32403a = new odi();
                    }
                    nyt.m37101a(this.f32403a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32404b == null) {
                        this.f32404b = new odi();
                    }
                    nyt.m37101a(this.f32404b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32405c == null) {
                        this.f32405c = new odj();
                    }
                    nyt.m37101a(this.f32405c);
                    continue;
                case 34:
                    if (this.f32406d == null) {
                        this.f32406d = new odj();
                    }
                    nyt.m37101a(this.f32406d);
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
