package p000;

public final class kvw extends nyx<kvw> {
    public int f23681a;
    public kvv f23682b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27744b(nyt);
    }

    public kvw() {
        this.f23681a = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23681a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23681a);
        }
        if (this.f23682b != null) {
            nyu.b(2, this.f23682b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23681a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23681a);
        }
        if (this.f23682b != null) {
            return b + nyu.d(2, this.f23682b);
        }
        return b;
    }

    private kvw m27744b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f23681a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f23682b == null) {
                        this.f23682b = new kvv();
                    }
                    nyt.a(this.f23682b);
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
