package p000;

public final class llu extends nyx<llu> {
    public llr[] f25406a;
    public Long f25407b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29405b(nyt);
    }

    public llu() {
        m29406d();
    }

    private llu m29406d() {
        this.f25406a = llr.m29390d();
        this.f25407b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25406a != null && this.f25406a.length > 0) {
            for (nzf nzf : this.f25406a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25407b != null) {
            nyu.b(2, this.f25407b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25406a != null && this.f25406a.length > 0) {
            for (nzf nzf : this.f25406a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f25407b != null) {
            return b + nyu.f(2, this.f25407b.longValue());
        }
        return b;
    }

    private llu m29405b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25406a == null) {
                        a = 0;
                    } else {
                        a = this.f25406a.length;
                    }
                    Object obj = new llr[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25406a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new llr();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new llr();
                    nyt.a(obj[a]);
                    this.f25406a = obj;
                    continue;
                case 16:
                    this.f25407b = Long.valueOf(nyt.e());
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
