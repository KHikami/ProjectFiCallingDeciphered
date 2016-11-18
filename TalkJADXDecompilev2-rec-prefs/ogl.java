package p000;

public final class ogl extends nyx<ogl> {
    public static final nyy<ozo, ogl> f32726a = nyy.m37203a(11, ogl.class, 375452826);
    private static final ogl[] f32727d = new ogl[0];
    public Integer f32728b;
    public ogk f32729c;

    public /* synthetic */ nzf m38202a(nyt nyt) {
        return m38200b(nyt);
    }

    public ogl() {
        m38201d();
    }

    private ogl m38201d() {
        this.f32729c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38203a(nyu nyu) {
        if (this.f32728b != null) {
            nyu.m37168a(1, this.f32728b.intValue());
        }
        if (this.f32729c != null) {
            nyu.m37182b(2, this.f32729c);
        }
        super.a(nyu);
    }

    protected int m38204b() {
        int b = super.b();
        if (this.f32728b != null) {
            b += nyu.m37147f(1, this.f32728b.intValue());
        }
        if (this.f32729c != null) {
            return b + nyu.m37145d(2, this.f32729c);
        }
        return b;
    }

    private ogl m38200b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.f32728b = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f32729c == null) {
                        this.f32729c = new ogk();
                    }
                    nyt.m37101a(this.f32729c);
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
