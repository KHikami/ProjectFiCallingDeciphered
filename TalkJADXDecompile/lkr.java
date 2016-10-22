import com.google.api.client.http.HttpStatusCodes;

public final class lkr extends nyx<lkr> {
    private static volatile lkr[] n;
    public Integer a;
    public Integer b;
    public Integer c;
    public Long d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Long h;
    public Integer i;
    public lkn j;
    public lkn k;
    public Integer l;
    public lks m;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lkr[] d() {
        if (n == null) {
            synchronized (nzc.c) {
                if (n == null) {
                    n = new lkr[0];
                }
            }
        }
        return n;
    }

    public lkr() {
        g();
    }

    private lkr g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(19, this.a.intValue());
        nyu.a(20, this.b.intValue());
        nyu.a(21, this.c.intValue());
        nyu.b(22, this.d.longValue());
        nyu.a(23, this.e.intValue());
        nyu.b(24, this.h.longValue());
        nyu.a(25, this.i.intValue());
        if (this.j != null) {
            nyu.b(26, this.j);
        }
        if (this.k != null) {
            nyu.b(27, this.k);
        }
        if (this.l != null) {
            nyu.a(73, this.l.intValue());
        }
        if (this.m != null) {
            nyu.b(74, this.m);
        }
        if (this.f != null) {
            nyu.a(108, this.f.intValue());
        }
        if (this.g != null) {
            nyu.a(109, this.g.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((((((super.b() + nyu.f(19, this.a.intValue())) + nyu.f(20, this.b.intValue())) + nyu.f(21, this.c.intValue())) + nyu.f(22, this.d.longValue())) + nyu.f(23, this.e.intValue())) + nyu.f(24, this.h.longValue())) + nyu.f(25, this.i.intValue());
        if (this.j != null) {
            b += nyu.d(26, this.j);
        }
        if (this.k != null) {
            b += nyu.d(27, this.k);
        }
        if (this.l != null) {
            b += nyu.f(73, this.l.intValue());
        }
        if (this.m != null) {
            b += nyu.d(74, this.m);
        }
        if (this.f != null) {
            b += nyu.f(108, this.f.intValue());
        }
        if (this.g != null) {
            return b + nyu.f(109, this.g.intValue());
        }
        return b;
    }

    private lkr b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case 152:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 160:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case 168:
                    this.c = Integer.valueOf(nyt.f());
                    continue;
                case 176:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 184:
                    this.e = Integer.valueOf(nyt.f());
                    continue;
                case 192:
                    this.h = Long.valueOf(nyt.e());
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.i = Integer.valueOf(nyt.f());
                    continue;
                case 210:
                    if (this.j == null) {
                        this.j = new lkn();
                    }
                    nyt.a(this.j);
                    continue;
                case 218:
                    if (this.k == null) {
                        this.k = new lkn();
                    }
                    nyt.a(this.k);
                    continue;
                case 584:
                    this.l = Integer.valueOf(nyt.f());
                    continue;
                case 594:
                    if (this.m == null) {
                        this.m = new lks();
                    }
                    nyt.a(this.m);
                    continue;
                case 864:
                    this.f = Integer.valueOf(nyt.f());
                    continue;
                case 872:
                    this.g = Integer.valueOf(nyt.f());
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
