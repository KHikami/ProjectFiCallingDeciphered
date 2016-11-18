package p000;

public final class lsr extends nyx<lsr> {
    public ltk[] f26340a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30356b(nyt);
    }

    public lsr() {
        m30357d();
    }

    private lsr m30357d() {
        this.f26340a = ltk.m30455d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26340a != null && this.f26340a.length > 0) {
            for (nzf nzf : this.f26340a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26340a != null && this.f26340a.length > 0) {
            for (nzf nzf : this.f26340a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lsr m30356b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26340a == null) {
                        a = 0;
                    } else {
                        a = this.f26340a.length;
                    }
                    Object obj = new ltk[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26340a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltk();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltk();
                    nyt.a(obj[a]);
                    this.f26340a = obj;
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
