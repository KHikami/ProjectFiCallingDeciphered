package p000;

public final class lme extends nyx<lme> {
    public lmf[] f25524a;
    public Long f25525b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29461b(nyt);
    }

    public lme() {
        m29462d();
    }

    private lme m29462d() {
        this.f25524a = lmf.m29467d();
        this.f25525b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25524a != null && this.f25524a.length > 0) {
            for (nzf nzf : this.f25524a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f25525b != null) {
            nyu.b(2, this.f25525b.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25524a != null && this.f25524a.length > 0) {
            for (nzf nzf : this.f25524a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f25525b != null) {
            return b + nyu.f(2, this.f25525b.longValue());
        }
        return b;
    }

    private lme m29461b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25524a == null) {
                        a = 0;
                    } else {
                        a = this.f25524a.length;
                    }
                    Object obj = new lmf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25524a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lmf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lmf();
                    nyt.a(obj[a]);
                    this.f25524a = obj;
                    continue;
                case 16:
                    this.f25525b = Long.valueOf(nyt.e());
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
