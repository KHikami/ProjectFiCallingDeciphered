package defpackage;

public final class low extends nyx<low> {
    public lor a;
    public lsh[] b;
    public Integer c;
    public String d;
    public byte[][] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public low() {
        d();
    }

    private low d() {
        this.a = null;
        this.b = lsh.d();
        this.d = null;
        this.e = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.e != null && this.e.length > 0) {
            for (byte[] bArr : this.e) {
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
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.e != null && this.e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (byte[] bArr : this.e) {
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
            b += nyu.f(4, this.c.intValue());
        }
        if (this.d != null) {
            return b + nyu.b(5, this.d);
        }
        return b;
    }

    private low b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new lor();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.e == null ? 0 : this.e.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.e = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.d = nyt.j();
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
