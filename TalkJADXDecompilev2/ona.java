package defpackage;

public final class ona extends nyx<ona> {
    public Integer a;
    public Integer b;
    public float[] c;
    public float[] d;
    public onb e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ona() {
        d();
    }

    private ona d() {
        this.b = null;
        this.c = nzl.c;
        this.d = nzl.c;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            for (float a : this.c) {
                nyu.a(3, a);
            }
        }
        if (this.d != null && this.d.length > 0) {
            while (i < this.d.length) {
                nyu.a(4, this.d[i]);
                i++;
            }
        }
        if (this.e != null) {
            nyu.b(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.intValue());
        }
        if (this.c != null && this.c.length > 0) {
            b = (b + (this.c.length * 4)) + (this.c.length * 1);
        }
        if (this.d != null && this.d.length > 0) {
            b = (b + (this.d.length * 4)) + (this.d.length * 1);
        }
        if (this.e != null) {
            return b + nyu.d(5, this.e);
        }
        return b;
    }

    private ona b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dx /*26*/:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.c == null ? 0 : this.c.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.c();
                        a++;
                    }
                    this.c = obj;
                    nyt.e(d);
                    continue;
                case 29:
                    d = nzl.b(nyt, 29);
                    a = this.c == null ? 0 : this.c.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.c();
                    this.c = obj2;
                    continue;
                case 34:
                    a = nyt.r();
                    d = nyt.d(a);
                    i = a / 4;
                    a = this.d == null ? 0 : this.d.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.c();
                        a++;
                    }
                    this.d = obj;
                    nyt.e(d);
                    continue;
                case 37:
                    d = nzl.b(nyt, 37);
                    a = this.d == null ? 0 : this.d.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.c();
                        nyt.a();
                        a++;
                    }
                    obj2[a] = nyt.c();
                    this.d = obj2;
                    continue;
                case 42:
                    if (this.e == null) {
                        this.e = new onb();
                    }
                    nyt.a(this.e);
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
