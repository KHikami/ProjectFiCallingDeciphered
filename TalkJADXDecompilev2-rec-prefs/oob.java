package p000;

public final class oob extends nyx<oob> {
    private static volatile oob[] f33357d;
    public ooh[] f33358a;
    public onk[] f33359b;
    public onp f33360c;

    public /* synthetic */ nzf m38876a(nyt nyt) {
        return m38874b(nyt);
    }

    public static oob[] m38875d() {
        if (f33357d == null) {
            synchronized (nzc.f31309c) {
                if (f33357d == null) {
                    f33357d = new oob[0];
                }
            }
        }
        return f33357d;
    }

    public oob() {
        this.f33358a = ooh.m38900d();
        this.f33359b = onk.m38807d();
        this.cachedSize = -1;
    }

    public void m38877a(nyu nyu) {
        int i = 0;
        if (this.f33358a != null && this.f33358a.length > 0) {
            for (nzf nzf : this.f33358a) {
                if (nzf != null) {
                    nyu.m37182b(1, nzf);
                }
            }
        }
        if (this.f33359b != null && this.f33359b.length > 0) {
            while (i < this.f33359b.length) {
                nzf nzf2 = this.f33359b[i];
                if (nzf2 != null) {
                    nyu.m37182b(2, nzf2);
                }
                i++;
            }
        }
        if (this.f33360c != null) {
            nyu.m37182b(3, this.f33360c);
        }
        super.a(nyu);
    }

    protected int m38878b() {
        int i = 0;
        int b = super.b();
        if (this.f33358a != null && this.f33358a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f33358a) {
                if (nzf != null) {
                    i2 += nyu.m37145d(1, nzf);
                }
            }
            b = i2;
        }
        if (this.f33359b != null && this.f33359b.length > 0) {
            while (i < this.f33359b.length) {
                nzf nzf2 = this.f33359b[i];
                if (nzf2 != null) {
                    b += nyu.m37145d(2, nzf2);
                }
                i++;
            }
        }
        if (this.f33360c != null) {
            return b + nyu.m37145d(3, this.f33360c);
        }
        return b;
    }

    private oob m38874b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.m37265b(nyt, 10);
                    if (this.f33358a == null) {
                        a = 0;
                    } else {
                        a = this.f33358a.length;
                    }
                    obj = new ooh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33358a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ooh();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ooh();
                    nyt.m37101a(obj[a]);
                    this.f33358a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.m37265b(nyt, 18);
                    if (this.f33359b == null) {
                        a = 0;
                    } else {
                        a = this.f33359b.length;
                    }
                    obj = new onk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f33359b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new onk();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new onk();
                    nyt.m37101a(obj[a]);
                    this.f33359b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f33360c == null) {
                        this.f33360c = new onp();
                    }
                    nyt.m37101a(this.f33360c);
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
