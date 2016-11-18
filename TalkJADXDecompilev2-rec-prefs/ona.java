package p000;

public final class ona extends nyx<ona> {
    public Integer f33258a;
    public Integer f33259b;
    public float[] f33260c;
    public float[] f33261d;
    public onb f33262e;

    public /* synthetic */ nzf m38777a(nyt nyt) {
        return m38775b(nyt);
    }

    public ona() {
        m38776d();
    }

    private ona m38776d() {
        this.f33259b = null;
        this.f33260c = nzl.f31329c;
        this.f33261d = nzl.f31329c;
        this.f33262e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38778a(nyu nyu) {
        int i = 0;
        if (this.f33258a != null) {
            nyu.m37168a(1, this.f33258a.intValue());
        }
        if (this.f33259b != null) {
            nyu.m37168a(2, this.f33259b.intValue());
        }
        if (this.f33260c != null && this.f33260c.length > 0) {
            for (float a : this.f33260c) {
                nyu.m37167a(3, a);
            }
        }
        if (this.f33261d != null && this.f33261d.length > 0) {
            while (i < this.f33261d.length) {
                nyu.m37167a(4, this.f33261d[i]);
                i++;
            }
        }
        if (this.f33262e != null) {
            nyu.m37182b(5, this.f33262e);
        }
        super.a(nyu);
    }

    protected int m38779b() {
        int b = super.b();
        if (this.f33258a != null) {
            b += nyu.m37147f(1, this.f33258a.intValue());
        }
        if (this.f33259b != null) {
            b += nyu.m37147f(2, this.f33259b.intValue());
        }
        if (this.f33260c != null && this.f33260c.length > 0) {
            b = (b + (this.f33260c.length * 4)) + (this.f33260c.length * 1);
        }
        if (this.f33261d != null && this.f33261d.length > 0) {
            b = (b + (this.f33261d.length * 4)) + (this.f33261d.length * 1);
        }
        if (this.f33262e != null) {
            return b + nyu.m37145d(5, this.f33262e);
        }
        return b;
    }

    private ona m38775b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int d;
            int i;
            Object obj;
            Object obj2;
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f33258a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f33259b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f33260c == null ? 0 : this.f33260c.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33260c, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f33260c = obj;
                    nyt.m37111e(d);
                    continue;
                case 29:
                    d = nzl.m37265b(nyt, 29);
                    a = this.f33260c == null ? 0 : this.f33260c.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33260c, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f33260c = obj2;
                    continue;
                case 34:
                    a = nyt.m37125r();
                    d = nyt.m37108d(a);
                    i = a / 4;
                    a = this.f33261d == null ? 0 : this.f33261d.length;
                    obj = new float[(i + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33261d, 0, obj, 0, a);
                    }
                    while (a < obj.length) {
                        obj[a] = nyt.m37106c();
                        a++;
                    }
                    this.f33261d = obj;
                    nyt.m37111e(d);
                    continue;
                case 37:
                    d = nzl.m37265b(nyt, 37);
                    a = this.f33261d == null ? 0 : this.f33261d.length;
                    obj2 = new float[(d + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33261d, 0, obj2, 0, a);
                    }
                    while (a < obj2.length - 1) {
                        obj2[a] = nyt.m37106c();
                        nyt.m37099a();
                        a++;
                    }
                    obj2[a] = nyt.m37106c();
                    this.f33261d = obj2;
                    continue;
                case 42:
                    if (this.f33262e == null) {
                        this.f33262e = new onb();
                    }
                    nyt.m37101a(this.f33262e);
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
