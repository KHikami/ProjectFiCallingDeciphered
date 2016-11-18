package p000;

public final class oer extends nyx<oer> {
    public int f32480a;
    public int f32481b;
    public int f32482c;

    public /* synthetic */ nzf m37980a(nyt nyt) {
        return m37978b(nyt);
    }

    public oer() {
        m37979d();
    }

    private oer m37979d() {
        this.f32480a = 0;
        this.f32481b = 0;
        this.f32482c = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37981a(nyu nyu) {
        if (this.f32480a != 0) {
            nyu.m37168a(1, this.f32480a);
        }
        if (this.f32481b != 0) {
            nyu.m37168a(2, this.f32481b);
        }
        if (this.f32482c != 0) {
            nyu.m37168a(3, this.f32482c);
        }
        super.a(nyu);
    }

    protected int m37982b() {
        int b = super.b();
        if (this.f32480a != 0) {
            b += nyu.m37147f(1, this.f32480a);
        }
        if (this.f32481b != 0) {
            b += nyu.m37147f(2, this.f32481b);
        }
        if (this.f32482c != 0) {
            return b + nyu.m37147f(3, this.f32482c);
        }
        return b;
    }

    private oer m37978b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32480a = nyt.m37112f();
                    continue;
                case 16:
                    this.f32481b = nyt.m37112f();
                    continue;
                case wi.dA /*24*/:
                    this.f32482c = nyt.m37112f();
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
