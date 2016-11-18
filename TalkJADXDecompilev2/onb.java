package defpackage;

public final class onb extends nyx<onb> {
    public String a;
    public String b;
    public String[] c;
    public float[] d;
    public float[] e;
    public Boolean f;
    public Boolean g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public onb() {
        d();
    }

    private onb d() {
        this.a = null;
        this.b = null;
        this.c = nzl.f;
        this.d = nzl.c;
        this.e = nzl.c;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (String str : this.c) {
                if (str != null) {
                    nyu.a(3, str);
                }
            }
        }
        if (this.d != null && this.d.length > 0) {
            for (float a : this.d) {
                nyu.a(4, a);
            }
        }
        if (this.e != null && this.e.length > 0) {
            while (i < this.e.length) {
                nyu.a(5, this.e[i]);
                i++;
            }
        }
        if (this.f != null) {
            nyu.a(6, this.f.booleanValue());
        }
        if (this.g != null) {
            nyu.a(7, this.g.booleanValue());
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
        if (this.c != null && this.c.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.c.length) {
                String str = this.c[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.d != null && this.d.length > 0) {
            b = (b + (this.d.length * 4)) + (this.d.length * 1);
        }
        if (this.e != null && this.e.length > 0) {
            b = (b + (this.e.length * 4)) + (this.e.length * 1);
        }
        if (this.f != null) {
            this.f.booleanValue();
            b += nyu.h(6) + 1;
        }
        if (this.g == null) {
            return b;
        }
        this.g.booleanValue();
        return b + (nyu.h(7) + 1);
    }

    private onb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            int i;
            Object obj2;
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
                case 34:
                    a = nyt.r();
                    b = nyt.d(a);
                    i = a / 4;
                    a = this.d == null ? 0 : this.d.length;
                    obj2 = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = nyt.c();
                        a++;
                    }
                    this.d = obj2;
                    nyt.e(b);
                    continue;
                case 37:
                    b = nzl.b(nyt, 37);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.c();
                    this.d = obj;
                    continue;
                case 42:
                    a = nyt.r();
                    b = nyt.d(a);
                    i = a / 4;
                    a = this.e == null ? 0 : this.e.length;
                    obj2 = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj2, 0, a);
                    }
                    while (a < obj2.length) {
                        obj2[a] = nyt.c();
                        a++;
                    }
                    this.e = obj2;
                    nyt.e(b);
                    continue;
                case 45:
                    b = nzl.b(nyt, 45);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new float[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.c();
                    this.e = obj;
                    continue;
                case 48:
                    this.f = Boolean.valueOf(nyt.i());
                    continue;
                case 56:
                    this.g = Boolean.valueOf(nyt.i());
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
