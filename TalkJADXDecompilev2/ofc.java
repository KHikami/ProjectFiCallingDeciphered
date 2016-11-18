package defpackage;

public final class ofc extends nyx<ofc> {
    private static volatile ofc[] d;
    public String a;
    public String[] b;
    public ofb[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ofc[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ofc[0];
                }
            }
        }
        return d;
    }

    public ofc() {
        g();
    }

    private ofc g() {
        this.a = null;
        this.b = nzl.f;
        this.c = ofb.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        nyu.a(1, this.a);
        if (this.b != null && this.b.length > 0) {
            for (String str : this.b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf = this.c[i];
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i;
        int i2 = 0;
        int b = super.b() + nyu.b(1, this.a);
        if (this.b == null || this.b.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.b) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.c != null && this.c.length > 0) {
            while (i2 < this.c.length) {
                nzf nzf = this.c[i2];
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private ofc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
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
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new ofb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ofb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ofb();
                    nyt.a(obj[a]);
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
