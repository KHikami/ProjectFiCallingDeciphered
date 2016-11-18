package p000;

public final class mal extends nyx<mal> {
    public String f27116a;
    public String f27117b;
    public String f27118c;
    public lzj f27119d;
    public String[] f27120e;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31439b(nyt);
    }

    public mal() {
        m31440d();
    }

    private mal m31440d() {
        this.requestHeader = null;
        this.f27116a = null;
        this.f27117b = null;
        this.f27118c = null;
        this.f27119d = null;
        this.f27120e = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f27116a != null) {
            nyu.a(2, this.f27116a);
        }
        if (this.f27117b != null) {
            nyu.a(3, this.f27117b);
        }
        if (this.f27118c != null) {
            nyu.a(4, this.f27118c);
        }
        if (this.f27119d != null) {
            nyu.b(5, this.f27119d);
        }
        if (this.f27120e != null && this.f27120e.length > 0) {
            for (String str : this.f27120e) {
                if (str != null) {
                    nyu.a(6, str);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f27116a != null) {
            b += nyu.b(2, this.f27116a);
        }
        if (this.f27117b != null) {
            b += nyu.b(3, this.f27117b);
        }
        if (this.f27118c != null) {
            b += nyu.b(4, this.f27118c);
        }
        if (this.f27119d != null) {
            b += nyu.d(5, this.f27119d);
        }
        if (this.f27120e == null || this.f27120e.length <= 0) {
            return b;
        }
        int i2 = 0;
        int i3 = 0;
        while (i < this.f27120e.length) {
            String str = this.f27120e[i];
            if (str != null) {
                i3++;
                i2 += nyu.b(str);
            }
            i++;
        }
        return (b + i2) + (i3 * 1);
    }

    private mal m31439b(nyt nyt) {
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
                    this.f27116a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f27117b = nyt.j();
                    continue;
                case 34:
                    this.f27118c = nyt.j();
                    continue;
                case 42:
                    if (this.f27119d == null) {
                        this.f27119d = new lzj();
                    }
                    nyt.a(this.f27119d);
                    continue;
                case 50:
                    int b = nzl.b(nyt, 50);
                    a = this.f27120e == null ? 0 : this.f27120e.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f27120e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f27120e = obj;
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
