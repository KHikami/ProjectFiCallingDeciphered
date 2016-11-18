package defpackage;

public final class lob extends nyx<lob> {
    public ltb a;
    public lqj[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lob() {
        d();
    }

    private lob d() {
        this.a = null;
        this.b = lqj.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.a != null) {
            nyu.b(3, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    b += nyu.d(2, nzf);
                }
            }
        }
        if (this.a != null) {
            return b + nyu.d(3, this.a);
        }
        return b;
    }

    private lob b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new lqj[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqj();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqj();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.a == null) {
                        this.a = new ltb();
                    }
                    nyt.a(this.a);
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
