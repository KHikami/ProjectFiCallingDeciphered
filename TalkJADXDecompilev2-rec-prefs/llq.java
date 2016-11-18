package p000;

public final class llq extends nyx<llq> {
    public lln[] f25393a;
    public Long f25394b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29385b(nyt);
    }

    public llq() {
        this.f25393a = lln.m29373d();
        this.f25394b = null;
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f25393a != null && this.f25393a.length > 0) {
            for (nzf nzf : this.f25393a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25394b != null) {
            nyu.b(2, this.f25394b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25393a != null && this.f25393a.length > 0) {
            for (nzf nzf : this.f25393a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f25394b != null) {
            return b + nyu.f(2, this.f25394b.longValue());
        }
        return b;
    }

    private llq m29385b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25393a == null) {
                        a = 0;
                    } else {
                        a = this.f25393a.length;
                    }
                    Object obj = new lln[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25393a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lln();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lln();
                    nyt.a(obj[a]);
                    this.f25393a = obj;
                    continue;
                case 16:
                    this.f25394b = Long.valueOf(nyt.e());
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
