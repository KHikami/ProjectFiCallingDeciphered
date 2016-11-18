package p000;

public final class lxk extends nyx<lxk> {
    public String f26779a;
    public String f26780b;
    public Boolean f26781c;
    public Integer f26782d;
    public String[] f26783e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31008b(nyt);
    }

    public lxk() {
        m31009d();
    }

    private lxk m31009d() {
        this.f26779a = null;
        this.f26780b = null;
        this.f26781c = null;
        this.f26783e = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26779a != null) {
            nyu.a(1, this.f26779a);
        }
        if (this.f26780b != null) {
            nyu.a(2, this.f26780b);
        }
        if (this.f26781c != null) {
            nyu.a(3, this.f26781c.booleanValue());
        }
        if (this.f26782d != null) {
            nyu.a(4, this.f26782d.intValue());
        }
        if (this.f26783e != null && this.f26783e.length > 0) {
            for (String str : this.f26783e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f26779a != null) {
            b += nyu.b(1, this.f26779a);
        }
        if (this.f26780b != null) {
            b += nyu.b(2, this.f26780b);
        }
        if (this.f26781c != null) {
            this.f26781c.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26782d != null) {
            b += nyu.f(4, this.f26782d.intValue());
        }
        if (this.f26783e == null || this.f26783e.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f26783e.length) {
            String str = this.f26783e[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private lxk m31008b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f26779a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.f26780b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.f26781c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f26782d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f26783e == null ? 0 : this.f26783e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26783e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f26783e = obj;
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
