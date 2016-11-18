package p000;

public final class kxl extends nyx<kxl> {
    public int f23853a;
    public kxn[] f23854b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27935b(nyt);
    }

    public kxl() {
        this.f23853a = nzf.UNSET_ENUM_VALUE;
        this.f23854b = kxn.m27944d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f23853a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.f23853a);
        }
        if (this.f23854b != null && this.f23854b.length > 0) {
            for (nzf nzf : this.f23854b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23853a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.f23853a);
        }
        if (this.f23854b == null || this.f23854b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f23854b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kxl m27935b(nyt nyt) {
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
                            this.f23853a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f23854b == null) {
                        a = 0;
                    } else {
                        a = this.f23854b.length;
                    }
                    Object obj = new kxn[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f23854b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxn();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxn();
                    nyt.a(obj[a]);
                    this.f23854b = obj;
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
