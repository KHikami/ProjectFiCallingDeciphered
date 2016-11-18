package p000;

public final class low extends nyx<low> {
    public lor f25946a;
    public lsh[] f25947b;
    public Integer f25948c;
    public String f25949d;
    public byte[][] f25950e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29818b(nyt);
    }

    public low() {
        m29819d();
    }

    private low m29819d() {
        this.f25946a = null;
        this.f25947b = lsh.m30303d();
        this.f25949d = null;
        this.f25950e = nzl.g;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25946a != null) {
            nyu.b(1, this.f25946a);
        }
        if (this.f25950e != null && this.f25950e.length > 0) {
            for (byte[] bArr : this.f25950e) {
                if (bArr != null) {
                    nyu.a(2, bArr);
                }
            }
        }
        if (this.f25947b != null && this.f25947b.length > 0) {
            while (i < this.f25947b.length) {
                nzf nzf = this.f25947b[i];
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
                i++;
            }
        }
        if (this.f25948c != null) {
            nyu.a(4, this.f25948c.intValue());
        }
        if (this.f25949d != null) {
            nyu.a(5, this.f25949d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f25946a != null) {
            b += nyu.d(1, this.f25946a);
        }
        if (this.f25950e != null && this.f25950e.length > 0) {
            int i2 = 0;
            int i3 = 0;
            for (byte[] bArr : this.f25950e) {
                if (bArr != null) {
                    i3++;
                    i2 += nyu.b(bArr);
                }
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f25947b != null && this.f25947b.length > 0) {
            while (i < this.f25947b.length) {
                nzf nzf = this.f25947b[i];
                if (nzf != null) {
                    b += nyu.d(3, nzf);
                }
                i++;
            }
        }
        if (this.f25948c != null) {
            b += nyu.f(4, this.f25948c.intValue());
        }
        if (this.f25949d != null) {
            return b + nyu.b(5, this.f25949d);
        }
        return b;
    }

    private low m29818b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25946a == null) {
                        this.f25946a = new lor();
                    }
                    nyt.a(this.f25946a);
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f25950e == null ? 0 : this.f25950e.length;
                    obj = new byte[(b + a)][];
                    if (a != 0) {
                        System.arraycopy(this.f25950e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.k();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.k();
                    this.f25950e = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f25947b == null) {
                        a = 0;
                    } else {
                        a = this.f25947b.length;
                    }
                    obj = new lsh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25947b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsh();
                    nyt.a(obj[a]);
                    this.f25947b = obj;
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                            this.f25948c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 42:
                    this.f25949d = nyt.j();
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
