package p000;

public final class mun extends nyx<mun> {
    public static final nyy<ozo, mun> f28386a = nyy.a(11, mun.class, 122048994);
    private static final mun[] f28387d = new mun[0];
    public muk[] f28388b;
    public muf f28389c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32973b(nyt);
    }

    public mun() {
        m32974d();
    }

    private mun m32974d() {
        this.f28388b = muk.m32957d();
        this.f28389c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28388b != null && this.f28388b.length > 0) {
            for (nzf nzf : this.f28388b) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f28389c != null) {
            nyu.b(500, this.f28389c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28388b != null && this.f28388b.length > 0) {
            for (nzf nzf : this.f28388b) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f28389c != null) {
            return b + nyu.d(500, this.f28389c);
        }
        return b;
    }

    private mun m32973b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f28388b == null) {
                        a = 0;
                    } else {
                        a = this.f28388b.length;
                    }
                    Object obj = new muk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f28388b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new muk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new muk();
                    nyt.a(obj[a]);
                    this.f28388b = obj;
                    continue;
                case 4002:
                    if (this.f28389c == null) {
                        this.f28389c = new muf();
                    }
                    nyt.a(this.f28389c);
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
