package defpackage;

public final class ldf extends nyx<ldf> {
    private static volatile ldf[] c;
    public String[] a;
    public ldg[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ldf[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ldf[0];
                }
            }
        }
        return c;
    }

    public ldf() {
        g();
    }

    private ldf g() {
        this.a = nzl.f;
        this.b = ldg.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null && this.a.length > 0) {
            for (String str : this.a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf = this.b[i];
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b();
        if (this.a == null || this.a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.a) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.b != null && this.b.length > 0) {
            while (i2 < this.b.length) {
                nzf nzf = this.b[i2];
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private ldf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.a == null ? 0 : this.a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new ldg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldg();
                    nyt.a(obj[a]);
                    this.b = obj;
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
