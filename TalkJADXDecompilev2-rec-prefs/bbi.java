package p000;

public final class bbi extends nyx<bbi> {
    public lmw[] f2844a;
    public Integer f2845b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m4737b(nyt);
    }

    public bbi() {
        m4738d();
    }

    private bbi m4738d() {
        this.f2844a = lmw.m29549d();
        this.f2845b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f2844a != null && this.f2844a.length > 0) {
            for (nzf nzf : this.f2844a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f2845b != null) {
            nyu.a(2, this.f2845b.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f2844a != null && this.f2844a.length > 0) {
            for (nzf nzf : this.f2844a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f2845b != null) {
            return b + nyu.f(2, this.f2845b.intValue());
        }
        return b;
    }

    private bbi m4737b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f2844a == null) {
                        a = 0;
                    } else {
                        a = this.f2844a.length;
                    }
                    Object obj = new lmw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f2844a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmw();
                    nyt.a(obj[a]);
                    this.f2844a = obj;
                    continue;
                case 16:
                    this.f2845b = Integer.valueOf(nyt.f());
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
