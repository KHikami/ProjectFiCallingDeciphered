package p000;

public final class ktb extends nyx<ktb> {
    public String f23200a;
    public odm f23201b;
    public Boolean f23202c;
    public mzw f23203d;
    public String[] f23204e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27409b(nyt);
    }

    public ktb() {
        this.f23200a = null;
        this.f23202c = null;
        this.f23204e = nzl.f;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23201b != null) {
            nyu.b(1, this.f23201b);
        }
        if (this.f23202c != null) {
            nyu.a(2, this.f23202c.booleanValue());
        }
        if (this.f23203d != null) {
            nyu.b(3, this.f23203d);
        }
        if (this.f23200a != null) {
            nyu.a(4, this.f23200a);
        }
        if (this.f23204e != null && this.f23204e.length > 0) {
            for (String str : this.f23204e) {
                if (str != null) {
                    nyu.a(5, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f23201b != null) {
            b += nyu.d(1, this.f23201b);
        }
        if (this.f23202c != null) {
            this.f23202c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f23203d != null) {
            b += nyu.d(3, this.f23203d);
        }
        if (this.f23200a != null) {
            b += nyu.b(4, this.f23200a);
        }
        if (this.f23204e == null || this.f23204e.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f23204e.length) {
            String str = this.f23204e[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private ktb m27409b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f23201b == null) {
                        this.f23201b = new odm();
                    }
                    nyt.a(this.f23201b);
                    continue;
                case 16:
                    this.f23202c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    if (this.f23203d == null) {
                        this.f23203d = new mzw();
                    }
                    nyt.a(this.f23203d);
                    continue;
                case 34:
                    this.f23200a = nyt.j();
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    a = this.f23204e == null ? 0 : this.f23204e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23204e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f23204e = obj;
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
