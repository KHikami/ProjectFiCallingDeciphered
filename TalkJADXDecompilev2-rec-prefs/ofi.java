package p000;

public final class ofi extends nyx<ofi> {
    public static final nyy<ofj, ofi> f32635a = nyy.m37203a(11, ofi.class, 693824626);
    private static final ofi[] f32636h = new ofi[0];
    public int f32637b;
    public int f32638c;
    public int f32639d;
    public int f32640e;
    public int f32641f;
    public int f32642g;

    public /* synthetic */ nzf m38064a(nyt nyt) {
        return m38063b(nyt);
    }

    public ofi() {
        this.f32637b = nzf.UNSET_ENUM_VALUE;
        this.f32638c = nzf.UNSET_ENUM_VALUE;
        this.f32639d = nzf.UNSET_ENUM_VALUE;
        this.f32640e = nzf.UNSET_ENUM_VALUE;
        this.f32641f = nzf.UNSET_ENUM_VALUE;
        this.f32642g = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m38065a(nyu nyu) {
        if (this.f32637b != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f32637b);
        }
        if (this.f32638c != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(2, this.f32638c);
        }
        if (this.f32639d != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(3, this.f32639d);
        }
        if (this.f32640e != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f32640e);
        }
        if (this.f32641f != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(5, this.f32641f);
        }
        if (this.f32642g != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(6, this.f32642g);
        }
        super.a(nyu);
    }

    protected int m38066b() {
        int b = super.b();
        if (this.f32637b != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f32637b);
        }
        if (this.f32638c != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(2, this.f32638c);
        }
        if (this.f32639d != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(3, this.f32639d);
        }
        if (this.f32640e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(4, this.f32640e);
        }
        if (this.f32641f != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(5, this.f32641f);
        }
        if (this.f32642g != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(6, this.f32642g);
        }
        return b;
    }

    private ofi m38063b(nyt nyt) {
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f32637b = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32638c = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dA /*24*/:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32639d = a;
                            break;
                        default:
                            continue;
                    }
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f32640e = a;
                            break;
                        default:
                            continue;
                    }
                case 40:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32641f = a;
                            break;
                        default:
                            continue;
                    }
                case 48:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f32642g = a;
                            break;
                        default:
                            continue;
                    }
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
