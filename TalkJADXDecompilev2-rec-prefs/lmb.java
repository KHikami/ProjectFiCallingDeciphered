package p000;

public final class lmb extends nyx<lmb> {
    public llv[] f25506a;
    public long[] f25507b;
    public String[] f25508c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29445b(nyt);
    }

    public lmb() {
        m29446d();
    }

    private lmb m29446d() {
        this.f25506a = llv.m29411d();
        this.f25507b = nzl.b;
        this.f25508c = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25506a != null && this.f25506a.length > 0) {
            for (nzf nzf : this.f25506a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25507b != null && this.f25507b.length > 0) {
            for (long b : this.f25507b) {
                nyu.b(2, b);
            }
        }
        if (this.f25508c != null && this.f25508c.length > 0) {
            while (i < this.f25508c.length) {
                String str = this.f25508c[i];
                if (str != null) {
                    nyu.a(3, str);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.mo147b();
        if (this.f25506a != null && this.f25506a.length > 0) {
            i = b;
            for (nzf nzf : this.f25506a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f25507b != null && this.f25507b.length > 0) {
            i2 = 0;
            for (long f : this.f25507b) {
                i2 += nyu.f(f);
            }
            b = (b + i2) + (this.f25507b.length * 1);
        }
        if (this.f25508c == null || this.f25508c.length <= 0) {
            return b;
        }
        i = 0;
        i2 = 0;
        while (i3 < this.f25508c.length) {
            String str = this.f25508c[i3];
            if (str != null) {
                i2++;
                i += nyu.b(str);
            }
            i3++;
        }
        return (b + i) + (i2 * 1);
    }

    private lmb m29445b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f25506a == null) {
                        a = 0;
                    } else {
                        a = this.f25506a.length;
                    }
                    obj = new llv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25506a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llv();
                    nyt.a(obj[a]);
                    this.f25506a = obj;
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f25507b == null ? 0 : this.f25507b.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25507b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f25507b = obj;
                    continue;
                case wi.dH /*18*/:
                    int d = nyt.d(nyt.r());
                    b = nyt.u();
                    a = 0;
                    while (nyt.s() > 0) {
                        nyt.e();
                        a++;
                    }
                    nyt.f(b);
                    b = this.f25507b == null ? 0 : this.f25507b.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f25507b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f25507b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f25508c == null ? 0 : this.f25508c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25508c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25508c = obj;
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
