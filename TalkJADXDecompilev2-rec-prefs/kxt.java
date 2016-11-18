package p000;

public final class kxt extends nyx<kxt> {
    public Integer f23955a;
    public String[] f23956b;
    public Long f23957c;
    public Long f23958d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27971b(nyt);
    }

    public kxt() {
        m27972d();
    }

    private kxt m27972d() {
        this.f23955a = null;
        this.f23956b = nzl.f;
        this.f23957c = null;
        this.f23958d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23955a != null) {
            nyu.a(1, this.f23955a.intValue());
        }
        if (this.f23956b != null && this.f23956b.length > 0) {
            for (String str : this.f23956b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f23957c != null) {
            nyu.b(3, this.f23957c.longValue());
        }
        if (this.f23958d != null) {
            nyu.b(4, this.f23958d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23955a != null) {
            b += nyu.f(1, this.f23955a.intValue());
        }
        if (this.f23956b != null && this.f23956b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f23956b.length) {
                String str = this.f23956b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f23957c != null) {
            b += nyu.f(3, this.f23957c.longValue());
        }
        if (this.f23958d != null) {
            return b + nyu.f(4, this.f23958d.longValue());
        }
        return b;
    }

    private kxt m27971b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23955a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f23956b == null ? 0 : this.f23956b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23956b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23956b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f23957c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f23958d = Long.valueOf(nyt.e());
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
