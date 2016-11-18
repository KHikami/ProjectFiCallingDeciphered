package p000;

public final class kvk extends nyx<kvk> {
    public Integer f23638a;
    public String[] f23639b;
    public Long f23640c;
    public Long f23641d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27695b(nyt);
    }

    public kvk() {
        this.f23638a = null;
        this.f23639b = nzl.f;
        this.f23640c = null;
        this.f23641d = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23638a != null) {
            nyu.a(1, this.f23638a.intValue());
        }
        if (this.f23639b != null && this.f23639b.length > 0) {
            for (String str : this.f23639b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f23640c != null) {
            nyu.b(3, this.f23640c.longValue());
        }
        if (this.f23641d != null) {
            nyu.b(4, this.f23641d.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23638a != null) {
            b += nyu.f(1, this.f23638a.intValue());
        }
        if (this.f23639b != null && this.f23639b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f23639b.length) {
                String str = this.f23639b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f23640c != null) {
            b += nyu.f(3, this.f23640c.longValue());
        }
        if (this.f23641d != null) {
            return b + nyu.f(4, this.f23641d.longValue());
        }
        return b;
    }

    private kvk m27695b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23638a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f23639b == null ? 0 : this.f23639b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23639b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23639b = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f23640c = Long.valueOf(nyt.e());
                    continue;
                case 32:
                    this.f23641d = Long.valueOf(nyt.e());
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
