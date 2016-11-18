package defpackage;

public final class nzp extends nyx<nzp> {
    public static final nyy<Object, nzp> a = nyy.a(11, nzp.class, 196484970);
    private static final nzp[] d = new nzp[0];
    public nzn b;
    public nzm[] c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nzp() {
        this.c = nzm.d();
        this.cachedSize = -1;
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

    private nzp b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.b == null) {
                        this.b = new nzn();
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
                    Object obj = new nzm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nzm();
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
