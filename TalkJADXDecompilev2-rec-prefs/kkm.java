package p000;

public final class kkm extends nyx<kkm> {
    public String[] f22061a;
    public String[] f22062b;
    public klz[] f22063c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26257b(nyt);
    }

    public kkm() {
        m26258d();
    }

    private kkm m26258d() {
        this.f22061a = nzl.f;
        this.f22062b = nzl.f;
        this.f22063c = klz.m26482d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22061a != null && this.f22061a.length > 0) {
            for (String str : this.f22061a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f22062b != null && this.f22062b.length > 0) {
            for (String str2 : this.f22062b) {
                if (str2 != null) {
                    nyu.a(2, str2);
                }
            }
        }
        if (this.f22063c != null && this.f22063c.length > 0) {
            while (i < this.f22063c.length) {
                nzf nzf = this.f22063c[i];
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int b = super.mo147b();
        if (this.f22061a == null || this.f22061a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f22061a) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f22062b != null && this.f22062b.length > 0) {
            i3 = 0;
            b = 0;
            for (String str2 : this.f22062b) {
                if (str2 != null) {
                    b++;
                    i3 += nyu.b(str2);
                }
            }
            i = (i + i3) + (b * 1);
        }
        if (this.f22063c != null && this.f22063c.length > 0) {
            while (i4 < this.f22063c.length) {
                nzf nzf = this.f22063c[i4];
                if (nzf != null) {
                    i += nyu.d(3, nzf);
                }
                i4++;
            }
        }
        return i;
    }

    private kkm m26257b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.f22061a == null ? 0 : this.f22061a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22061a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22061a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f22062b == null ? 0 : this.f22062b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22062b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22062b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    if (this.f22063c == null) {
                        a = 0;
                    } else {
                        a = this.f22063c.length;
                    }
                    obj = new klz[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22063c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new klz();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new klz();
                    nyt.a(obj[a]);
                    this.f22063c = obj;
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
