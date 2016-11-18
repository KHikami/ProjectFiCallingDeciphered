package defpackage;

public final class nfu extends nyx<nfu> {
    private static volatile nfu[] e;
    public Integer a;
    public nfs[] b;
    public Integer c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nfu[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new nfu[0];
                }
            }
        }
        return e;
    }

    public nfu() {
        g();
    }

    private nfu g() {
        this.b = nfs.d();
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.a(3, this.d);
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.d != null) {
            b += nyu.b(3, this.d);
        }
        if (this.c != null) {
            return b + nyu.f(4, this.c.intValue());
        }
        return b;
    }

    private nfu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new nfs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nfs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nfs();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 32:
                    this.c = Integer.valueOf(nyt.f());
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
