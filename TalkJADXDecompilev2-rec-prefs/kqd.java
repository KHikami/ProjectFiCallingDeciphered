package p000;

public final class kqd extends nyx<kqd> {
    public String f22743a;
    public lcx f22744b;
    public Boolean f22745c;
    public Boolean f22746d;
    public Boolean f22747e;
    public String[] f22748f;
    public Integer f22749g;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27023b(nyt);
    }

    public kqd() {
        m27024d();
    }

    private kqd m27024d() {
        this.f22743a = null;
        this.f22744b = null;
        this.f22745c = null;
        this.f22746d = null;
        this.f22747e = null;
        this.f22748f = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22743a != null) {
            nyu.a(1, this.f22743a);
        }
        if (this.f22745c != null) {
            nyu.a(2, this.f22745c.booleanValue());
        }
        if (this.f22746d != null) {
            nyu.a(3, this.f22746d.booleanValue());
        }
        if (this.f22747e != null) {
            nyu.a(4, this.f22747e.booleanValue());
        }
        if (this.f22748f != null && this.f22748f.length > 0) {
            for (String str : this.f22748f) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        if (this.f22749g != null) {
            nyu.a(6, this.f22749g.intValue());
        }
        if (this.f22744b != null) {
            nyu.b(7, this.f22744b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22743a != null) {
            b += nyu.b(1, this.f22743a);
        }
        if (this.f22745c != null) {
            this.f22745c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f22746d != null) {
            this.f22746d.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f22747e != null) {
            this.f22747e.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.f22748f != null && this.f22748f.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f22748f.length) {
                String str = this.f22748f[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f22749g != null) {
            b += nyu.f(6, this.f22749g.intValue());
        }
        if (this.f22744b != null) {
            return b + nyu.d(7, this.f22744b);
        }
        return b;
    }

    private kqd m27023b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f22743a = nyt.j();
                    continue;
                case 16:
                    this.f22745c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    this.f22746d = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.f22747e = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f22748f == null ? 0 : this.f22748f.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22748f, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22748f = obj;
                    continue;
                case 48:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f22749g = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 58:
                    if (this.f22744b == null) {
                        this.f22744b = new lcx();
                    }
                    nyt.a(this.f22744b);
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
