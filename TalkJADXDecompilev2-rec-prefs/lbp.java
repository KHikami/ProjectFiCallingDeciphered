package p000;

public final class lbp extends nyx<lbp> {
    public String f24502a;
    public String f24503b;
    public String f24504c;
    public Integer f24505d;
    public int f24506e;
    public String[] f24507f;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28503b(nyt);
    }

    public lbp() {
        this.f24502a = null;
        this.f24503b = null;
        this.f24504c = null;
        this.f24505d = null;
        this.f24506e = nzf.UNSET_ENUM_VALUE;
        this.f24507f = nzl.f;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24502a != null) {
            nyu.a(1, this.f24502a);
        }
        if (this.f24503b != null) {
            nyu.a(2, this.f24503b);
        }
        if (this.f24504c != null) {
            nyu.a(3, this.f24504c);
        }
        if (this.f24505d != null) {
            nyu.a(4, this.f24505d.intValue());
        }
        if (this.f24506e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.f24506e);
        }
        if (this.f24507f != null && this.f24507f.length > 0) {
            for (String str : this.f24507f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f24502a != null) {
            b += nyu.b(1, this.f24502a);
        }
        if (this.f24503b != null) {
            b += nyu.b(2, this.f24503b);
        }
        if (this.f24504c != null) {
            b += nyu.b(3, this.f24504c);
        }
        if (this.f24505d != null) {
            b += nyu.f(4, this.f24505d.intValue());
        }
        if (this.f24506e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.f24506e);
        }
        if (this.f24507f == null || this.f24507f.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f24507f.length) {
            String str = this.f24507f[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lbp m28503b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f24502a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f24503b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24504c = nyt.j();
                    continue;
                case 32:
                    this.f24505d = Integer.valueOf(nyt.f());
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
                            this.f24506e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f24507f == null ? 0 : this.f24507f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24507f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24507f = obj;
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
