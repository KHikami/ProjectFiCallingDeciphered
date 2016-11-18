package defpackage;

public final class ort extends nyx<ort> {
    private static volatile ort[] c;
    public oqv[] a;
    public String[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ort[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new ort[0];
                }
            }
        }
        return c;
    }

    public ort() {
        g();
    }

    private ort g() {
        this.a = oqv.d();
        this.b = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
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
            while (i < this.b.length) {
                String str = this.b[i];
                if (str != null) {
                    nyu.a(2, str);
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
        if (this.a != null && this.a.length > 0) {
            i = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i += nyu.d(1, nzf);
                }
            }
            b = i;
        }
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        i = 0;
        int i3 = 0;
        while (i2 < this.b.length) {
            String str = this.b[i2];
            if (str != null) {
                i3++;
                i += nyu.b(str);
            }
            i2++;
        }
        return (b + i) + (i3 * 1);
    }

    private ort b(nyt nyt) {
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
                    obj = new oqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oqv();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.b == null ? 0 : this.b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
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
