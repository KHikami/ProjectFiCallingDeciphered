package p000;

public final class lno extends nyx<lno> {
    public lqm f25793a;
    public lsh[] f25794b;
    public byte[] f25795c;
    public Long f25796d;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29637b(nyt);
    }

    public lno() {
        m29638d();
    }

    private lno m29638d() {
        this.requestHeader = null;
        this.f25793a = null;
        this.f25794b = lsh.m30303d();
        this.f25795c = null;
        this.f25796d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f25795c != null) {
            nyu.a(2, this.f25795c);
        }
        if (this.f25794b != null && this.f25794b.length > 0) {
            for (nzf nzf : this.f25794b) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        if (this.f25796d != null) {
            nyu.a(4, this.f25796d.longValue());
        }
        if (this.f25793a != null) {
            nyu.b(5, this.f25793a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f25795c != null) {
            b += nyu.b(2, this.f25795c);
        }
        if (this.f25794b != null && this.f25794b.length > 0) {
            int i = b;
            for (nzf nzf : this.f25794b) {
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
            }
            b = i;
        }
        if (this.f25796d != null) {
            b += nyu.e(4, this.f25796d.longValue());
        }
        if (this.f25793a != null) {
            return b + nyu.d(5, this.f25793a);
        }
        return b;
    }

    private lno m29637b(nyt nyt) {
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
                    this.f25795c = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.f25794b == null) {
                        a = 0;
                    } else {
                        a = this.f25794b.length;
                    }
                    Object obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25794b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.f25794b = obj;
                    continue;
                case 32:
                    this.f25796d = Long.valueOf(nyt.d());
                    continue;
                case 42:
                    if (this.f25793a == null) {
                        this.f25793a = new lqm();
                    }
                    nyt.a(this.f25793a);
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
