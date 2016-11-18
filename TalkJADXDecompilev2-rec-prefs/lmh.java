package p000;

public final class lmh extends nyx<lmh> {
    public Integer f25532a;
    public String[] f25533b;
    public Integer f25534c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29477b(nyt);
    }

    public lmh() {
        m29478d();
    }

    private lmh m29478d() {
        this.f25533b = nzl.f;
        this.f25534c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25532a != null) {
            nyu.a(1, this.f25532a.intValue());
        }
        if (this.f25533b != null && this.f25533b.length > 0) {
            for (String str : this.f25533b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f25534c != null) {
            nyu.c(3, this.f25534c.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25532a != null) {
            b += nyu.f(1, this.f25532a.intValue());
        }
        if (this.f25533b != null && this.f25533b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f25533b.length) {
                String str = this.f25533b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f25534c != null) {
            return b + nyu.g(3, this.f25534c.intValue());
        }
        return b;
    }

    private lmh m29477b(nyt nyt) {
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
                            this.f25532a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f25533b == null ? 0 : this.f25533b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25533b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25533b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f25534c = Integer.valueOf(nyt.l());
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
