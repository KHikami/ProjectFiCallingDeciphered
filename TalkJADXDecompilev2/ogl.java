package defpackage;

public final class ogl extends nyx<ogl> {
    public static final nyy<ozo, ogl> a = nyy.a(11, ogl.class, 375452826);
    private static final ogl[] d = new ogl[0];
    public Integer b;
    public ogk c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ogl() {
        d();
    }

    private ogl d() {
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.intValue());
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.f(1, this.b.intValue());
        }
        if (this.c != null) {
            return b + nyu.d(2, this.c);
        }
        return b;
    }

    private ogl b(nyt nyt) {
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
                            this.b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new ogk();
                    }
                    nyt.a(this.c);
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
