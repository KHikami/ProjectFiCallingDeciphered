package p000;

import com.google.api.client.http.HttpStatusCodes;

public final class lkr extends nyx<lkr> {
    private static volatile lkr[] f25198n;
    public Integer f25199a;
    public Integer f25200b;
    public Integer f25201c;
    public Long f25202d;
    public Integer f25203e;
    public Integer f25204f;
    public Integer f25205g;
    public Long f25206h;
    public Integer f25207i;
    public lkn f25208j;
    public lkn f25209k;
    public Integer f25210l;
    public lks f25211m;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29254b(nyt);
    }

    public static lkr[] m29255d() {
        if (f25198n == null) {
            synchronized (nzc.c) {
                if (f25198n == null) {
                    f25198n = new lkr[0];
                }
            }
        }
        return f25198n;
    }

    public lkr() {
        m29256g();
    }

    private lkr m29256g() {
        this.f25199a = null;
        this.f25200b = null;
        this.f25201c = null;
        this.f25202d = null;
        this.f25203e = null;
        this.f25204f = null;
        this.f25205g = null;
        this.f25206h = null;
        this.f25207i = null;
        this.f25208j = null;
        this.f25209k = null;
        this.f25210l = null;
        this.f25211m = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        nyu.a(19, this.f25199a.intValue());
        nyu.a(20, this.f25200b.intValue());
        nyu.a(21, this.f25201c.intValue());
        nyu.b(22, this.f25202d.longValue());
        nyu.a(23, this.f25203e.intValue());
        nyu.b(24, this.f25206h.longValue());
        nyu.a(25, this.f25207i.intValue());
        if (this.f25208j != null) {
            nyu.b(26, this.f25208j);
        }
        if (this.f25209k != null) {
            nyu.b(27, this.f25209k);
        }
        if (this.f25210l != null) {
            nyu.a(73, this.f25210l.intValue());
        }
        if (this.f25211m != null) {
            nyu.b(74, this.f25211m);
        }
        if (this.f25204f != null) {
            nyu.a(108, this.f25204f.intValue());
        }
        if (this.f25205g != null) {
            nyu.a(109, this.f25205g.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = ((((((super.mo147b() + nyu.f(19, this.f25199a.intValue())) + nyu.f(20, this.f25200b.intValue())) + nyu.f(21, this.f25201c.intValue())) + nyu.f(22, this.f25202d.longValue())) + nyu.f(23, this.f25203e.intValue())) + nyu.f(24, this.f25206h.longValue())) + nyu.f(25, this.f25207i.intValue());
        if (this.f25208j != null) {
            b += nyu.d(26, this.f25208j);
        }
        if (this.f25209k != null) {
            b += nyu.d(27, this.f25209k);
        }
        if (this.f25210l != null) {
            b += nyu.f(73, this.f25210l.intValue());
        }
        if (this.f25211m != null) {
            b += nyu.d(74, this.f25211m);
        }
        if (this.f25204f != null) {
            b += nyu.f(108, this.f25204f.intValue());
        }
        if (this.f25205g != null) {
            return b + nyu.f(109, this.f25205g.intValue());
        }
        return b;
    }

    private lkr m29254b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 152:
                    this.f25199a = Integer.valueOf(nyt.f());
                    continue;
                case 160:
                    this.f25200b = Integer.valueOf(nyt.f());
                    continue;
                case 168:
                    this.f25201c = Integer.valueOf(nyt.f());
                    continue;
                case 176:
                    this.f25202d = Long.valueOf(nyt.e());
                    continue;
                case 184:
                    this.f25203e = Integer.valueOf(nyt.f());
                    continue;
                case 192:
                    this.f25206h = Long.valueOf(nyt.e());
                    continue;
                case HttpStatusCodes.STATUS_CODE_OK /*200*/:
                    this.f25207i = Integer.valueOf(nyt.f());
                    continue;
                case 210:
                    if (this.f25208j == null) {
                        this.f25208j = new lkn();
                    }
                    nyt.a(this.f25208j);
                    continue;
                case 218:
                    if (this.f25209k == null) {
                        this.f25209k = new lkn();
                    }
                    nyt.a(this.f25209k);
                    continue;
                case 584:
                    this.f25210l = Integer.valueOf(nyt.f());
                    continue;
                case 594:
                    if (this.f25211m == null) {
                        this.f25211m = new lks();
                    }
                    nyt.a(this.f25211m);
                    continue;
                case 864:
                    this.f25204f = Integer.valueOf(nyt.f());
                    continue;
                case 872:
                    this.f25205g = Integer.valueOf(nyt.f());
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
