public final class lta extends nyx<lta> {
    public Integer a;
    public ltr[] b;
    public Integer c;
    public byte[][] d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lta() {
        d();
    }

    private lta d() {
        this.b = ltr.d();
        this.d = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (byte[] bArr : this.d) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf = this.b[i];
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
                i++;
            }
        }
        if (this.c != null) {
            nyu.a(4, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.d != null && this.d.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (byte[] bArr : this.d) {
                if (bArr != null) {
                    i3++;
                    i2 += nyu.b(bArr);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.b != null && this.b.length > 0) {
            while (i < this.b.length) {
                nzf nzf = this.b[i];
                if (nzf != null) {
                    b += nyu.d(3, nzf);
                }
                i++;
            }
        }
        if (this.c != null) {
            return b + nyu.f(4, this.c.intValue());
        }
        return b;
    }

    private lta b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.m /*8*/:
                    a = nyt.f();
                    switch (a) {
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.d == null ? 0 : this.d.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.d = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new ltr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltr();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case wi.w /*0*/:
                        case wi.j /*1*/:
                        case wi.l /*2*/:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
