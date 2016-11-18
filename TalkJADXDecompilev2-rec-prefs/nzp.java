package p000;

public final class nzp extends nyx<nzp> {
    public static final nyy<Object, nzp> f31360a = nyy.m37203a(11, nzp.class, 196484970);
    private static final nzp[] f31361d = new nzp[0];
    public nzn f31362b;
    public nzm[] f31363c;

    public /* synthetic */ nzf m37280a(nyt nyt) {
        return m37279b(nyt);
    }

    public nzp() {
        this.f31363c = nzm.m37267d();
        this.cachedSize = -1;
    }

    public void m37281a(nyu nyu) {
        if (this.f31362b != null) {
            nyu.m37182b(1, this.f31362b);
        }
        if (this.f31363c != null && this.f31363c.length > 0) {
            for (nzf nzf : this.f31363c) {
                if (nzf != null) {
                    nyu.m37182b(2, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m37282b() {
        int b = super.b();
        if (this.f31362b != null) {
            b += nyu.m37145d(1, this.f31362b);
        }
        if (this.f31363c == null || this.f31363c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f31363c) {
            if (nzf != null) {
                i += nyu.m37145d(2, nzf);
            }
        }
        return i;
    }

    private nzp m37279b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31362b == null) {
                        this.f31362b = new nzn();
                    }
                    nyt.m37101a(this.f31362b);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.m37265b(nyt, 18);
                    if (this.f31363c == null) {
                        a = 0;
                    } else {
                        a = this.f31363c.length;
                    }
                    Object obj = new nzm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f31363c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nzm();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new nzm();
                    nyt.m37101a(obj[a]);
                    this.f31363c = obj;
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
