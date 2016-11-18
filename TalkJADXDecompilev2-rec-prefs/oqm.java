package p000;

public final class oqm extends nyx<oqm> {
    private static volatile oqm[] f33765f;
    public String f33766a;
    public oqu f33767b;
    public oqv[] f33768c;
    public oqv f33769d;
    public oqo[] f33770e;

    public /* synthetic */ nzf m39200a(nyt nyt) {
        return m39197b(nyt);
    }

    public static oqm[] m39198d() {
        if (f33765f == null) {
            synchronized (nzc.f31309c) {
                if (f33765f == null) {
                    f33765f = new oqm[0];
                }
            }
        }
        return f33765f;
    }

    public oqm() {
        m39199g();
    }

    private oqm m39199g() {
        this.f33766a = null;
        this.f33767b = null;
        this.f33768c = oqv.m39246d();
        this.f33769d = null;
        this.f33770e = oqo.m39209d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39201a(nyu nyu) {
        int i = 0;
        if (this.f33766a != null) {
            nyu.m37170a(1, this.f33766a);
        }
        if (this.f33767b != null) {
            nyu.m37182b(2, this.f33767b);
        }
        if (this.f33768c != null && this.f33768c.length > 0) {
            for (nzf nzf : this.f33768c) {
                if (nzf != null) {
                    nyu.m37182b(3, nzf);
                }
            }
        }
        if (this.f33769d != null) {
            nyu.m37182b(4, this.f33769d);
        }
        if (this.f33770e != null && this.f33770e.length > 0) {
            while (i < this.f33770e.length) {
                nzf nzf2 = this.f33770e[i];
                if (nzf2 != null) {
                    nyu.m37182b(5, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int m39202b() {
        int i = 0;
        int b = super.b();
        if (this.f33766a != null) {
            b += nyu.m37137b(1, this.f33766a);
        }
        if (this.f33767b != null) {
            b += nyu.m37145d(2, this.f33767b);
        }
        if (this.f33768c != null && this.f33768c.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33768c) {
                if (nzf != null) {
                    i2 += nyu.m37145d(3, nzf);
                }
            }
            b = i2;
        }
        if (this.f33769d != null) {
            b += nyu.m37145d(4, this.f33769d);
        }
        if (this.f33770e != null && this.f33770e.length > 0) {
            while (i < this.f33770e.length) {
                nzf nzf2 = this.f33770e[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(5, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private oqm m39197b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f33766a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f33767b == null) {
                        this.f33767b = new oqu();
                    }
                    nyt.m37101a(this.f33767b);
                    continue;
                case wi.dx /*26*/:
                    b = nzl.m37265b(nyt, 26);
                    if (this.f33768c == null) {
                        a = 0;
                    } else {
                        a = this.f33768c.length;
                    }
                    obj = new oqv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33768c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqv();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqv();
                    nyt.m37101a(obj[a]);
                    this.f33768c = obj;
                    continue;
                case 34:
                    if (this.f33769d == null) {
                        this.f33769d = new oqv();
                    }
                    nyt.m37101a(this.f33769d);
                    continue;
                case 42:
                    b = nzl.m37265b(nyt, 42);
                    if (this.f33770e == null) {
                        a = 0;
                    } else {
                        a = this.f33770e.length;
                    }
                    obj = new oqo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33770e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oqo();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new oqo();
                    nyt.m37101a(obj[a]);
                    this.f33770e = obj;
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
