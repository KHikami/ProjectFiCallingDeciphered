package defpackage;

public final class nrm extends nyx<nrm> {
    private static volatile nrm[] c;
    public nrs a;
    public nrp[] b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nrm[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new nrm[0];
                }
            }
        }
        return c;
    }

    public nrm() {
        this.b = nrp.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
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
        if (this.b == null || this.b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private nrm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nrs();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new nrp[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nrp();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nrp();
                    nyt.a(obj[a]);
                    this.b = obj;
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
