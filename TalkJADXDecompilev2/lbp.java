package defpackage;

public final class lbp extends nyx<lbp> {
    public String a;
    public String b;
    public String c;
    public Integer d;
    public int e;
    public String[] f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lbp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = nzf.UNSET_ENUM_VALUE;
        this.f = nzl.f;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            nyu.a(5, this.e);
        }
        if (this.f != null && this.f.length > 0) {
            for (String str : this.f) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            b += nyu.f(4, this.d.intValue());
        }
        if (this.e != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(5, this.e);
        }
        if (this.f == null || this.f.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f.length) {
            String str = this.f[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lbp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    this.d = Integer.valueOf(nyt.f());
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
                            this.e = a;
                            break;
                        default:
                            continue;
                    }
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f == null ? 0 : this.f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f = obj;
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
