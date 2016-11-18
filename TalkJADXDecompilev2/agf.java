package defpackage;

public final class agf extends nyx<agf> {
    public static final nyy<ozo, agf> a = nyy.a(11, agf.class, 196484970);
    private static final agf[] d = new agf[0];
    public c b;
    public b[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public agf() {
        d();
    }

    private agf d() {
        this.b = null;
        this.c = b.a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.b(1, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.d(1, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.c) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private agf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new c();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new b[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new b();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new b();
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
