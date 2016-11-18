package defpackage;

public final class ngc extends nyx<ngc> {
    private static volatile ngc[] d;
    public String a;
    public String b;
    public ngd[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ngc[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ngc[0];
                }
            }
        }
        return d;
    }

    public ngc() {
        g();
    }

    private ngc g() {
        this.a = null;
        this.b = null;
        this.c = ngd.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.c != null && this.c.length > 0) {
            int i = b;
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.b != null) {
            return b + nyu.b(3, this.b);
        }
        return b;
    }

    private ngc b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new ngd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ngd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ngd();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
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
