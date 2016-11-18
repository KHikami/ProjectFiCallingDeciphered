package p000;

public final class lmg extends nyx<lmg> {
    public String[] f25530a;
    public String[] f25531b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29472b(nyt);
    }

    public lmg() {
        m29473d();
    }

    private lmg m29473d() {
        this.f25530a = nzl.f;
        this.f25531b = nzl.f;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.f25530a != null && this.f25530a.length > 0) {
            for (String str : this.f25530a) {
                if (str != null) {
                    nyu.a(1, str);
                }
            }
        }
        if (this.f25531b != null && this.f25531b.length > 0) {
            while (i < this.f25531b.length) {
                String str2 = this.f25531b[i];
                if (str2 != null) {
                    nyu.a(2, str2);
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
        if (this.f25530a == null || this.f25530a.length <= 0) {
            i = b;
        } else {
            i2 = 0;
            i3 = 0;
            for (String str : this.f25530a) {
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
            }
            i = (b + i2) + (i3 * 1);
        }
        if (this.f25531b == null || this.f25531b.length <= 0) {
            return i;
        }
        i2 = 0;
        i3 = 0;
        while (i4 < this.f25531b.length) {
            String str2 = this.f25531b[i4];
            if (str2 != null) {
                i3++;
                i2 += nyu.b(str2);
            }
            i4++;
        }
        return (i + i2) + (i3 * 1);
    }

    private lmg m29472b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
            switch (a) {
                case 0:
                    break;
                case 10:
                    b = nzl.b(nyt, 10);
                    a = this.f25530a == null ? 0 : this.f25530a.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25530a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25530a = obj;
                    continue;
                case wi.dH /*18*/:
                    b = nzl.b(nyt, 18);
                    a = this.f25531b == null ? 0 : this.f25531b.length;
                    obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25531b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f25531b = obj;
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
