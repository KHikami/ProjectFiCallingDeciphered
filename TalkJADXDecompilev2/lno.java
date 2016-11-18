package defpackage;

public final class lno extends nyx<lno> {
    public lqm a;
    public lsh[] b;
    public byte[] c;
    public Long d;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lno() {
        d();
    }

    private lno d() {
        this.requestHeader = null;
        this.a = null;
        this.b = lsh.d();
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.c != null) {
            nyu.a(2, this.c);
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.d != null) {
            nyu.a(4, this.d.longValue());
        }
        if (this.a != null) {
            nyu.b(5, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.c != null) {
            b += nyu.b(2, this.c);
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.d != null) {
            b += nyu.e(4, this.d.longValue());
        }
        if (this.a != null) {
            return b + nyu.d(5, this.a);
        }
        return b;
    }

    private lno b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    this.c = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.a == null) {
                        this.a = new lqm();
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
