package p000;

public final class lnb extends nyx<lnb> {
    public int f25727a;
    public String[] f25728b;
    public Integer f25729c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29574b(nyt);
    }

    public lnb() {
        this.f25727a = nzf.UNSET_ENUM_VALUE;
        this.f25728b = nzl.f;
        this.f25729c = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25727a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f25727a);
        }
        if (this.f25728b != null && this.f25728b.length > 0) {
            for (String str : this.f25728b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f25729c != null) {
            nyu.c(3, this.f25729c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25727a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f25727a);
        }
        if (this.f25728b != null && this.f25728b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f25728b.length) {
                String str = this.f25728b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f25729c != null) {
            return b + nyu.g(3, this.f25729c.intValue());
        }
        return b;
    }

    private lnb m29574b(nyt nyt) {
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
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f25727a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f25728b == null ? 0 : this.f25728b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25728b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25728b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f25729c = Integer.valueOf(nyt.l());
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
