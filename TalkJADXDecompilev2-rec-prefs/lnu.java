package p000;

public final class lnu extends nyx<lnu> {
    public lnv[] f25826a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29668b(nyt);
    }

    public lnu() {
        m29669d();
    }

    private lnu m29669d() {
        this.f25826a = lnv.m29674d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25826a != null && this.f25826a.length > 0) {
            for (nzf nzf : this.f25826a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25826a != null && this.f25826a.length > 0) {
            for (nzf nzf : this.f25826a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lnu m29668b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f25826a == null) {
                        a = 0;
                    } else {
                        a = this.f25826a.length;
                    }
                    Object obj = new lnv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f25826a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lnv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lnv();
                    nyt.a(obj[a]);
                    this.f25826a = obj;
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
