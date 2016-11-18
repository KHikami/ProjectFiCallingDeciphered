package p000;

public final class lut extends nyx<lut> {
    public lus[] f26531a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30653b(nyt);
    }

    public lut() {
        m30654d();
    }

    private lut m30654d() {
        this.f26531a = lus.m30648d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26531a != null && this.f26531a.length > 0) {
            for (nzf nzf : this.f26531a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26531a != null && this.f26531a.length > 0) {
            for (nzf nzf : this.f26531a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lut m30653b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26531a == null) {
                        a = 0;
                    } else {
                        a = this.f26531a.length;
                    }
                    Object obj = new lus[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26531a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lus();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lus();
                    nyt.a(obj[a]);
                    this.f26531a = obj;
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
