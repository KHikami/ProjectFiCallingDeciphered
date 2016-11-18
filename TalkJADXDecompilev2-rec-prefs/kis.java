package p000;

public final class kis extends nyx<kis> {
    public Integer f21876a;
    public String f21877b;
    public String f21878c;
    public String f21879d;
    public Integer f21880e;
    public String[] f21881f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26005b(nyt);
    }

    public kis() {
        m26006d();
    }

    private kis m26006d() {
        this.f21877b = null;
        this.f21878c = null;
        this.f21879d = null;
        this.f21881f = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(1, this.f21876a.intValue());
        if (this.f21877b != null) {
            nyu.a(2, this.f21877b);
        }
        if (this.f21878c != null) {
            nyu.a(3, this.f21878c);
        }
        if (this.f21879d != null) {
            nyu.a(4, this.f21879d);
        }
        if (this.f21880e != null) {
            nyu.a(5, this.f21880e.intValue());
        }
        if (this.f21881f != null && this.f21881f.length > 0) {
            for (String str : this.f21881f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b() + nyu.f(1, this.f21876a.intValue());
        if (this.f21877b != null) {
            b += nyu.b(2, this.f21877b);
        }
        if (this.f21878c != null) {
            b += nyu.b(3, this.f21878c);
        }
        if (this.f21879d != null) {
            b += nyu.b(4, this.f21879d);
        }
        if (this.f21880e != null) {
            b += nyu.f(5, this.f21880e.intValue());
        }
        if (this.f21881f == null || this.f21881f.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f21881f.length) {
            String str = this.f21881f[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private kis m26005b(nyt nyt) {
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
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case wi.dK /*17*/:
                        case wi.dH /*18*/:
                        case wi.dL /*19*/:
                        case 20:
                        case 21:
                        case 22:
                        case wi.f29038do /*23*/:
                        case wi.dA /*24*/:
                        case wi.dz /*25*/:
                        case wi.dx /*26*/:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                            this.f21876a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f21877b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f21878c = nyt.j();
                    continue;
                case 34:
                    this.f21879d = nyt.j();
                    continue;
                case 40:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                            this.f21880e = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f21881f == null ? 0 : this.f21881f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f21881f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f21881f = obj;
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
