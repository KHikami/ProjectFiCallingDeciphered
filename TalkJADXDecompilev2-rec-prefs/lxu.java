package p000;

public final class lxu extends nyx<lxu> {
    public lxh f26810a;
    public lzj f26811b;
    public lxh[] f26812c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31058b(nyt);
    }

    public lxu() {
        m31059d();
    }

    private lxu m31059d() {
        this.responseHeader = null;
        this.f26810a = null;
        this.f26811b = null;
        this.f26812c = lxh.m30993d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26810a != null) {
            nyu.b(2, this.f26810a);
        }
        if (this.f26811b != null) {
            nyu.b(3, this.f26811b);
        }
        if (this.f26812c != null && this.f26812c.length > 0) {
            for (nzf nzf : this.f26812c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26810a != null) {
            b += nyu.d(2, this.f26810a);
        }
        if (this.f26811b != null) {
            b += nyu.d(3, this.f26811b);
        }
        if (this.f26812c == null || this.f26812c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26812c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lxu m31058b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.responseHeader == null) {
                        this.responseHeader = new luq();
                    }
                    nyt.a(this.responseHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26810a == null) {
                        this.f26810a = new lxh();
                    }
                    nyt.a(this.f26810a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26811b == null) {
                        this.f26811b = new lzj();
                    }
                    nyt.a(this.f26811b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26812c == null) {
                        a = 0;
                    } else {
                        a = this.f26812c.length;
                    }
                    Object obj = new lxh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26812c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxh();
                    nyt.a(obj[a]);
                    this.f26812c = obj;
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
