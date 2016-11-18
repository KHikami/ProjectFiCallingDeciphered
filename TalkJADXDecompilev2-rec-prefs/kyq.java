package p000;

public final class kyq extends nyx<kyq> {
    public kym f24099a;
    public String f24100b;
    public String f24101c;
    public kxv[] f24102d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28108b(nyt);
    }

    public kyq() {
        m28109d();
    }

    private kyq m28109d() {
        this.f24099a = null;
        this.f24100b = null;
        this.f24101c = null;
        this.f24102d = kxv.m27983d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24099a != null) {
            nyu.b(1, this.f24099a);
        }
        if (this.f24100b != null) {
            nyu.a(2, this.f24100b);
        }
        if (this.f24101c != null) {
            nyu.a(3, this.f24101c);
        }
        if (this.f24102d != null && this.f24102d.length > 0) {
            for (nzf nzf : this.f24102d) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24099a != null) {
            b += nyu.d(1, this.f24099a);
        }
        if (this.f24100b != null) {
            b += nyu.b(2, this.f24100b);
        }
        if (this.f24101c != null) {
            b += nyu.b(3, this.f24101c);
        }
        if (this.f24102d == null || this.f24102d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f24102d) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private kyq m28108b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f24099a == null) {
                        this.f24099a = new kym();
                    }
                    nyt.a(this.f24099a);
                    continue;
                case wi.dH /*18*/:
                    this.f24100b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.f24101c = nyt.j();
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f24102d == null) {
                        a = 0;
                    } else {
                        a = this.f24102d.length;
                    }
                    Object obj = new kxv[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24102d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new kxv();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new kxv();
                    nyt.a(obj[a]);
                    this.f24102d = obj;
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
