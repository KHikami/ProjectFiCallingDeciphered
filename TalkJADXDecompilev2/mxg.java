package defpackage;

public final class mxg extends nyx<mxg> {
    public mxh a;
    public Long b;
    public mxi c;
    public mxo[] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mxg() {
        d();
    }

    private mxg d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = mxo.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b.longValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.f(2, this.b.longValue());
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d == null || this.d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private mxg b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new mxh();
                    }
                    nyt.a(this.a);
                    continue;
                case 16:
                    this.b = Long.valueOf(nyt.e());
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new mxi();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    Object obj = new mxo[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new mxo();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new mxo();
                    nyt.a(obj[a]);
                    this.d = obj;
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
