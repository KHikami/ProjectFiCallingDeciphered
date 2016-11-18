package p000;

public final class lde extends nyx<lde> {
    public ldf[] f24654a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28712b(nyt);
    }

    public lde() {
        m28713d();
    }

    private lde m28713d() {
        this.f24654a = ldf.m28718d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24654a != null && this.f24654a.length > 0) {
            for (nzf nzf : this.f24654a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24654a != null && this.f24654a.length > 0) {
            for (nzf nzf : this.f24654a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lde m28712b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24654a == null) {
                        a = 0;
                    } else {
                        a = this.f24654a.length;
                    }
                    Object obj = new ldf[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24654a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ldf();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ldf();
                    nyt.a(obj[a]);
                    this.f24654a = obj;
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
