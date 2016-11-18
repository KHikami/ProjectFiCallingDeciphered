package p000;

public final class llx extends nyx<llx> {
    public lly[] f25430a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29422b(nyt);
    }

    public llx() {
        m29423d();
    }

    private llx m29423d() {
        this.f25430a = lly.m29428d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25430a != null && this.f25430a.length > 0) {
            for (nzf nzf : this.f25430a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25430a != null && this.f25430a.length > 0) {
            for (nzf nzf : this.f25430a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private llx m29422b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25430a == null) {
                        a = 0;
                    } else {
                        a = this.f25430a.length;
                    }
                    Object obj = new lly[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25430a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lly();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lly();
                    nyt.a(obj[a]);
                    this.f25430a = obj;
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
