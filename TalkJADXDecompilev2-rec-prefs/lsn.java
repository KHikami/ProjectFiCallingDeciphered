package p000;

public final class lsn extends nyx<lsn> {
    public lsm[] f26332a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30335b(nyt);
    }

    public lsn() {
        m30336d();
    }

    private lsn m30336d() {
        this.f26332a = lsm.m30330d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26332a != null && this.f26332a.length > 0) {
            for (nzf nzf : this.f26332a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26332a != null && this.f26332a.length > 0) {
            for (nzf nzf : this.f26332a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        return b;
    }

    private lsn m30335b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f26332a == null) {
                        a = 0;
                    } else {
                        a = this.f26332a.length;
                    }
                    Object obj = new lsm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26332a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lsm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lsm();
                    nyt.a(obj[a]);
                    this.f26332a = obj;
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
