package p000;

public final class kyl extends nyx<kyl> {
    public Integer f24077a;
    public kxv[] f24078b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28081b(nyt);
    }

    public kyl() {
        m28082d();
    }

    private kyl m28082d() {
        this.f24077a = null;
        this.f24078b = kxv.m27983d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24077a != null) {
            nyu.a(1, this.f24077a.intValue());
        }
        if (this.f24078b != null && this.f24078b.length > 0) {
            for (nzf nzf : this.f24078b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24077a != null) {
            b += nyu.f(1, this.f24077a.intValue());
        }
        if (this.f24078b == null || this.f24078b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24078b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private kyl m28081b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f24077a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f24078b == null) {
                        a = 0;
                    } else {
                        a = this.f24078b.length;
                    }
                    Object obj = new kxv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24078b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxv();
                    nyt.a(obj[a]);
                    this.f24078b = obj;
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
