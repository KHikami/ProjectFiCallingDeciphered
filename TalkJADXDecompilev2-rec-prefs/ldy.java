package p000;

public final class ldy extends nyx<ldy> {
    public ldx[] f24734a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28811b(nyt);
    }

    public ldy() {
        m28812d();
    }

    private ldy m28812d() {
        this.f24734a = ldx.m28806d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24734a != null && this.f24734a.length > 0) {
            for (nzf nzf : this.f24734a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24734a != null && this.f24734a.length > 0) {
            for (nzf nzf : this.f24734a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private ldy m28811b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24734a == null) {
                        a = 0;
                    } else {
                        a = this.f24734a.length;
                    }
                    Object obj = new ldx[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24734a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldx();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldx();
                    nyt.a(obj[a]);
                    this.f24734a = obj;
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
