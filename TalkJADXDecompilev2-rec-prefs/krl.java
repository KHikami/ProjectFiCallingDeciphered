package p000;

public final class krl extends nyx<krl> {
    public int f22908a;
    public String[] f22909b;
    public krn f22910c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27204b(nyt);
    }

    public void mo146a(nyu nyu) {
        if (this.f22908a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f22908a);
        }
        if (this.f22909b != null && this.f22909b.length > 0) {
            for (String str : this.f22909b) {
                if (str != null) {
                    nyu.a(2, str);
                }
            }
        }
        if (this.f22910c != null) {
            nyu.b(3, this.f22910c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.f22908a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f22908a);
        }
        if (this.f22909b != null && this.f22909b.length > 0) {
            int i2 = 0;
            int i3 = 0;
            while (i < this.f22909b.length) {
                String str = this.f22909b[i];
                if (str != null) {
                    i3++;
                    i2 += nyu.b(str);
                }
                i++;
            }
            b = (b + i2) + (i3 * 1);
        }
        if (this.f22910c != null) {
            return b + nyu.d(3, this.f22910c);
        }
        return b;
    }

    private krl m27204b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f22908a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    a = this.f22909b == null ? 0 : this.f22909b.length;
                    Object obj = new String[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f22909b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = nyt.j();
                        nyt.a();
                        a++;
                    }
                    obj[a] = nyt.j();
                    this.f22909b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.f22910c == null) {
                        this.f22910c = new krn();
                    }
                    nyt.a(this.f22910c);
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
