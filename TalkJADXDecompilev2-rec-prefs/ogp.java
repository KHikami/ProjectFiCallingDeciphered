package p000;

public final class ogp extends nyx<ogp> {
    public int f32743a;
    public byte[] f32744b;

    public /* synthetic */ nzf m38218a(nyt nyt) {
        return m38217b(nyt);
    }

    public ogp() {
        this.f32743a = nzf.UNSET_ENUM_VALUE;
        this.f32744b = null;
        this.cachedSize = -1;
    }

    public void m38219a(nyu nyu) {
        if (this.f32743a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32743a);
        }
        if (this.f32744b != null) {
            nyu.m37173a(2, this.f32744b);
        }
        super.a(nyu);
    }

    protected int m38220b() {
        int b = super.b();
        if (this.f32743a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32743a);
        }
        if (this.f32744b != null) {
            return b + nyu.m37139b(2, this.f32744b);
        }
        return b;
    }

    private ogp m38217b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                            this.f32743a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f32744b = nyt.m37118k();
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
