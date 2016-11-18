package p000;

public final class kle extends nyx<kle> {
    public Boolean f22139a;
    public klg[] f22140b;
    public String[] f22141c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26362b(nyt);
    }

    public kle() {
        m26363d();
    }

    private kle m26363d() {
        this.f22139a = null;
        this.f22140b = klg.m26373d();
        this.f22141c = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f22139a != null) {
            nyu.a(1, this.f22139a.booleanValue());
        }
        if (this.f22140b != null && this.f22140b.length > 0) {
            for (nzf nzf : this.f22140b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f22141c != null && this.f22141c.length > 0) {
            while (i < this.f22141c.length) {
                String str = this.f22141c[i];
                if (str != null) {
                    nyu.a(3, str);
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
        if (this.f22139a != null) {
            this.f22139a.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.f22140b != null && this.f22140b.length > 0) {
            i = b;
            for (nzf nzf : this.f22140b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.f22141c == null || this.f22141c.length <= 0) {
            return b;
        }
        i = 0;
        int i3 = 0;
        while (i2 < this.f22141c.length) {
            String str = this.f22141c[i2];
            if (str != null) {
                i3++;
                i += nyu.b(str);
            }
            i2++;
        }
        return (b + i) + (i3 * 1);
    }

    private kle m26362b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f22139a = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    if (this.f22140b == null) {
                        a = 0;
                    } else {
                        a = this.f22140b.length;
                    }
                    obj = new klg[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22140b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new klg();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new klg();
                    nyt.a(obj[a]);
                    this.f22140b = obj;
                    continue;
                case wi.dx /*26*/:
                    b = nzl.b(nyt, 26);
                    a = this.f22141c == null ? 0 : this.f22141c.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22141c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22141c = obj;
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
