package p000;

public final class lbi extends nyx<lbi> {
    public ldm f24474a;
    public ldm[] f24475b;
    public lbe f24476c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28471b(nyt);
    }

    public lbi() {
        m28472d();
    }

    private lbi m28472d() {
        this.f24474a = null;
        this.f24475b = ldm.m28752d();
        this.f24476c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24474a != null) {
            nyu.b(4, this.f24474a);
        }
        if (this.f24475b != null && this.f24475b.length > 0) {
            for (nzf nzf : this.f24475b) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        if (this.f24476c != null) {
            nyu.b(6, this.f24476c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24474a != null) {
            b += nyu.d(4, this.f24474a);
        }
        if (this.f24475b != null && this.f24475b.length > 0) {
            int i = b;
            for (nzf nzf : this.f24475b) {
                if (nzf != null) {
                    i += nyu.d(5, nzf);
                }
            }
            b = i;
        }
        if (this.f24476c != null) {
            return b + nyu.d(6, this.f24476c);
        }
        return b;
    }

    private lbi m28471b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.f24474a == null) {
                        this.f24474a = new ldm();
                    }
                    nyt.a(this.f24474a);
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.f24475b == null) {
                        a = 0;
                    } else {
                        a = this.f24475b.length;
                    }
                    Object obj = new ldm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24475b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldm();
                    nyt.a(obj[a]);
                    this.f24475b = obj;
                    continue;
                case 50:
                    if (this.f24476c == null) {
                        this.f24476c = new lbe();
                    }
                    nyt.a(this.f24476c);
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
