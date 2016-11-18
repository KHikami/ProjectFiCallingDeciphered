package p000;

public final class obh extends nyx<obh> {
    public oam f31921a;
    public oao[] f31922b;
    public oao f31923c;
    public int f31924d;

    public /* synthetic */ nzf m37619a(nyt nyt) {
        return m37618b(nyt);
    }

    public obh() {
        this.f31922b = oao.f31663b;
        this.f31924d = nzf.UNSET_ENUM_VALUE;
        this.cachedSize = -1;
    }

    public void m37620a(nyu nyu) {
        if (this.f31921a != null) {
            nyu.m37182b(1, this.f31921a);
        }
        if (this.f31922b != null && this.f31922b.length > 0) {
            for (nzf nzf : this.f31922b) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        if (this.f31923c != null) {
            nyu.m37182b(3, this.f31923c);
        }
        if (this.f31924d != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(4, this.f31924d);
        }
        super.a(nyu);
    }

    protected int m37621b() {
        int b = super.b();
        if (this.f31921a != null) {
            b += nyu.m37145d(1, this.f31921a);
        }
        if (this.f31922b != null && this.f31922b.length > 0) {
            int i = b;
            for (nzf nzf : this.f31922b) {
                if (nzf != null) {
                    i += nyu.m37145d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f31923c != null) {
            b += nyu.m37145d(3, this.f31923c);
        }
        if (this.f31924d != nzf.UNSET_ENUM_VALUE) {
            return b + nyu.m37147f(4, this.f31924d);
        }
        return b;
    }

    private obh m37618b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31921a == null) {
                        this.f31921a = new oam();
                    }
                    nyt.m37101a(this.f31921a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f31922b == null) {
                        a = 0;
                    } else {
                        a = this.f31922b.length;
                    }
                    Object obj = new oao[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31922b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oao();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oao();
                    nyt.m37101a(obj[a]);
                    this.f31922b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f31923c == null) {
                        this.f31923c = new oao();
                    }
                    nyt.m37101a(this.f31923c);
                    continue;
                case 32:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f31924d = a;
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
