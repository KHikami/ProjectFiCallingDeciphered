package p000;

public final class lmr extends nyx<lmr> {
    public lml[] f25662a;
    public long[] f25663b;
    public String[] f25664c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29526b(nyt);
    }

    public lmr() {
        this.f25662a = lml.m29500d();
        this.f25663b = nzl.b;
        this.f25664c = nzl.f;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25662a != null && this.f25662a.length > 0) {
            for (nzf nzf : this.f25662a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25663b != null && this.f25663b.length > 0) {
            for (long b : this.f25663b) {
                nyu.b(2, b);
            }
        }
        if (this.f25664c != null && this.f25664c.length > 0) {
            while (i < this.f25664c.length) {
                String str = this.f25664c[i];
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
        if (this.f25662a != null && this.f25662a.length > 0) {
            i = b;
            for (nzf nzf : this.f25662a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.f25663b != null && this.f25663b.length > 0) {
            i2 = 0;
            for (long f : this.f25663b) {
                i2 += nyu.f(f);
            }
            b = (b + i2) + (this.f25663b.length * 1);
        }
        if (this.f25664c == null || this.f25664c.length <= 0) {
            return b;
        }
        i = 0;
        i2 = 0;
        while (i3 < this.f25664c.length) {
            String str = this.f25664c[i3];
            if (str != null) {
                i2++;
                i += nyu.b(str);
            }
            i3++;
        }
        return (b + i) + (i2 * 1);
    }

    private lmr m29526b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.f25662a == null) {
                        a = 0;
                    } else {
                        a = this.f25662a.length;
                    }
                    obj = new lml[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25662a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lml();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lml();
                    nyt.a(obj[a]);
                    this.f25662a = obj;
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.f25663b == null ? 0 : this.f25663b.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25663b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.f25663b = obj;
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
                    b = this.f25663b == null ? 0 : this.f25663b.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.f25663b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.f25663b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f25664c == null ? 0 : this.f25664c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25664c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25664c = obj;
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
