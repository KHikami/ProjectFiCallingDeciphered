package defpackage;

public final class lmr extends nyx<lmr> {
    public lml[] a;
    public long[] b;
    public String[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lmr() {
        this.a = lml.d();
        this.b = nzl.b;
        this.c = nzl.f;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            for (long b : this.b) {
                nyu.b(2, b);
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                String str = this.c[i];
                if (str != null) {
                    nyu.a(3, str);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2;
        int i3 = 0;
        int b = super.b();
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.b != null && this.b.length > 0) {
            i2 = 0;
            for (long f : this.b) {
                i2 += nyu.f(f);
            }
            b = (b + i2) + (this.b.length * 1);
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        i = 0;
        i2 = 0;
        while (i3 < this.c.length) {
            String str = this.c[i3];
            if (str != null) {
                i2++;
                i += nyu.b(str);
            }
            i3++;
        }
        return (b + i) + (i2 * 1);
    }

    private lmr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new lml[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lml();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lml();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case 16:
                    b = nzl.b(nyt, 16);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new long[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.e();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.e();
                    this.b = obj;
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
                    b = this.b == null ? 0 : this.b.length;
                    Object obj2 = new long[(a + b)];
                    if (b != 0) {
                        System.arraycopy(this.b, 0, obj2, 0, b);
                    }
                    while (b < obj2.length) {
                        obj2[b] = nyt.e();
                        b++;
                    }
                    this.b = obj2;
                    nyt.e(d);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.c == null ? 0 : this.c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.c = obj;
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
