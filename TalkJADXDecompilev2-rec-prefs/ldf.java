package p000;

public final class ldf extends nyx<ldf> {
    private static volatile ldf[] f24655c;
    public String[] f24656a;
    public ldg[] f24657b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28717b(nyt);
    }

    public static ldf[] m28718d() {
        if (f24655c == null) {
            synchronized (nzc.c) {
                if (f24655c == null) {
                    f24655c = new ldf[0];
                }
            }
        }
        return f24655c;
    }

    public ldf() {
        m28719g();
    }

    private ldf m28719g() {
        this.f24656a = nzl.f;
        this.f24657b = ldg.m28724d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f24656a != null && this.f24656a.length > 0) {
            for (String str : this.f24656a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f24657b != null && this.f24657b.length > 0) {
            while (i < this.f24657b.length) {
                nzf nzf = this.f24657b[i];
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i;
        int i2 = 0;
        int b = super.mo147b();
        if (this.f24656a == null || this.f24656a.length <= 0) {
            i = b;
        } else {
            int i3 = 0;
            int i4 = 0;
            for (String str : this.f24656a) {
                if (str != null) {
                    i4++;
                    i3 += nyu.b(str);
                }
            }
            i = (b + i3) + (i4 * 1);
        }
        if (this.f24657b != null && this.f24657b.length > 0) {
            while (i2 < this.f24657b.length) {
                nzf nzf = this.f24657b[i2];
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
                i2++;
            }
        }
        return i;
    }

    private ldf m28717b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.f24656a == null ? 0 : this.f24656a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24656a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f24656a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f24657b == null) {
                        a = 0;
                    } else {
                        a = this.f24657b.length;
                    }
                    obj = new ldg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24657b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldg();
                    nyt.a(obj[a]);
                    this.f24657b = obj;
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
