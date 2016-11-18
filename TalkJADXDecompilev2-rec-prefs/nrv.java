package p000;

public final class nrv extends nyx<nrv> {
    public String f30621a;
    public String f30622b;
    public Integer f30623c;
    public String[] f30624d;

    public /* synthetic */ nzf m36309a(nyt nyt) {
        return m36308b(nyt);
    }

    public nrv() {
        this.f30621a = null;
        this.f30622b = null;
        this.f30623c = null;
        this.f30624d = nzl.f31332f;
        this.cachedSize = -1;
    }

    public void m36310a(nyu nyu) {
        if (this.f30621a != null) {
            nyu.m37170a(1, this.f30621a);
        }
        if (this.f30622b != null) {
            nyu.m37170a(2, this.f30622b);
        }
        if (this.f30623c != null) {
            nyu.m37168a(3, this.f30623c.intValue());
        }
        if (this.f30624d != null && this.f30624d.length > 0) {
            for (String str : this.f30624d) {
                if (str != null) {
                    nyu.m37170a(4, str);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36311b() {
        int i = 0;
        int b = super.b();
        if (this.f30621a != null) {
            b += nyu.m37137b(1, this.f30621a);
        }
        if (this.f30622b != null) {
            b += nyu.m37137b(2, this.f30622b);
        }
        if (this.f30623c != null) {
            b += nyu.m37147f(3, this.f30623c.intValue());
        }
        if (this.f30624d == null || this.f30624d.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f30624d.length) {
            String str = this.f30624d[i];
            if (str != null) {
                i3++;
                i2 += nyu.m37140b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private nrv m36308b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30621a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f30622b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f30623c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    int b = nzl.m37265b(nyt, 34);
                    a = this.f30624d == null ? 0 : this.f30624d.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30624d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.m37117j();
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = nyt.m37117j();
                    this.f30624d = obj;
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
