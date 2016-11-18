package p000;

public final class nzn extends nyx<nzn> {
    public nzo f31344a;
    public String f31345b;
    public String f31346c;
    public Long f31347d;
    public String f31348e;
    public lmq f31349f;
    public lmp f31350g;
    public String f31351h;
    public String f31352i;
    public String f31353j;
    public Long f31354k;
    public String f31355l;
    public String f31356m;
    public Long f31357n;

    public /* synthetic */ nzf m37272a(nyt nyt) {
        return m37271b(nyt);
    }

    public nzn() {
        this.f31345b = null;
        this.f31346c = null;
        this.f31347d = null;
        this.f31348e = null;
        this.f31351h = null;
        this.f31352i = null;
        this.f31353j = null;
        this.f31354k = null;
        this.f31355l = null;
        this.f31356m = null;
        this.f31357n = null;
        this.cachedSize = -1;
    }

    public void m37273a(nyu nyu) {
        if (this.f31344a != null) {
            nyu.m37182b(1, this.f31344a);
        }
        if (this.f31345b != null) {
            nyu.m37170a(2, this.f31345b);
        }
        if (this.f31346c != null) {
            nyu.m37170a(3, this.f31346c);
        }
        if (this.f31347d != null) {
            nyu.m37181b(4, this.f31347d.longValue());
        }
        if (this.f31348e != null) {
            nyu.m37170a(5, this.f31348e);
        }
        if (this.f31349f != null) {
            nyu.m37182b(6, this.f31349f);
        }
        if (this.f31351h != null) {
            nyu.m37170a(7, this.f31351h);
        }
        if (this.f31352i != null) {
            nyu.m37170a(8, this.f31352i);
        }
        if (this.f31353j != null) {
            nyu.m37170a(9, this.f31353j);
        }
        if (this.f31354k != null) {
            nyu.m37181b(10, this.f31354k.longValue());
        }
        if (this.f31355l != null) {
            nyu.m37170a(11, this.f31355l);
        }
        if (this.f31350g != null) {
            nyu.m37182b(12, this.f31350g);
        }
        if (this.f31356m != null) {
            nyu.m37170a(13, this.f31356m);
        }
        if (this.f31357n != null) {
            nyu.m37169a(14, this.f31357n.longValue());
        }
        super.a(nyu);
    }

    protected int m37274b() {
        int b = super.b();
        if (this.f31344a != null) {
            b += nyu.m37145d(1, this.f31344a);
        }
        if (this.f31345b != null) {
            b += nyu.m37137b(2, this.f31345b);
        }
        if (this.f31346c != null) {
            b += nyu.m37137b(3, this.f31346c);
        }
        if (this.f31347d != null) {
            b += nyu.m37148f(4, this.f31347d.longValue());
        }
        if (this.f31348e != null) {
            b += nyu.m37137b(5, this.f31348e);
        }
        if (this.f31349f != null) {
            b += nyu.m37145d(6, this.f31349f);
        }
        if (this.f31351h != null) {
            b += nyu.m37137b(7, this.f31351h);
        }
        if (this.f31352i != null) {
            b += nyu.m37137b(8, this.f31352i);
        }
        if (this.f31353j != null) {
            b += nyu.m37137b(9, this.f31353j);
        }
        if (this.f31354k != null) {
            b += nyu.m37148f(10, this.f31354k.longValue());
        }
        if (this.f31355l != null) {
            b += nyu.m37137b(11, this.f31355l);
        }
        if (this.f31350g != null) {
            b += nyu.m37145d(12, this.f31350g);
        }
        if (this.f31356m != null) {
            b += nyu.m37137b(13, this.f31356m);
        }
        if (this.f31357n != null) {
            return b + nyu.m37146e(14, this.f31357n.longValue());
        }
        return b;
    }

    private nzn m37271b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f31344a == null) {
                        this.f31344a = new nzo();
                    }
                    nyt.m37101a(this.f31344a);
                    continue;
                case wi.dH /*18*/:
                    this.f31345b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    this.f31346c = nyt.m37117j();
                    continue;
                case 32:
                    this.f31347d = Long.valueOf(nyt.m37110e());
                    continue;
                case 42:
                    this.f31348e = nyt.m37117j();
                    continue;
                case 50:
                    if (this.f31349f == null) {
                        this.f31349f = new lmq();
                    }
                    nyt.m37101a(this.f31349f);
                    continue;
                case 58:
                    this.f31351h = nyt.m37117j();
                    continue;
                case 66:
                    this.f31352i = nyt.m37117j();
                    continue;
                case 74:
                    this.f31353j = nyt.m37117j();
                    continue;
                case 80:
                    this.f31354k = Long.valueOf(nyt.m37110e());
                    continue;
                case 90:
                    this.f31355l = nyt.m37117j();
                    continue;
                case 98:
                    if (this.f31350g == null) {
                        this.f31350g = new lmp();
                    }
                    nyt.m37101a(this.f31350g);
                    continue;
                case 106:
                    this.f31356m = nyt.m37117j();
                    continue;
                case 112:
                    this.f31357n = Long.valueOf(nyt.m37109d());
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
