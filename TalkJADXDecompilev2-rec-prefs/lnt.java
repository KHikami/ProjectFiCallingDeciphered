package p000;

public final class lnt extends nyx<lnt> {
    public lwd[] f25825a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29663b(nyt);
    }

    public lnt() {
        m29664d();
    }

    private lnt m29664d() {
        this.f25825a = lwd.m30837d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25825a != null && this.f25825a.length > 0) {
            for (nzf nzf : this.f25825a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25825a != null && this.f25825a.length > 0) {
            for (nzf nzf : this.f25825a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lnt m29663b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25825a == null) {
                        a = 0;
                    } else {
                        a = this.f25825a.length;
                    }
                    Object obj = new lwd[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25825a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lwd();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lwd();
                    nyt.a(obj[a]);
                    this.f25825a = obj;
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
