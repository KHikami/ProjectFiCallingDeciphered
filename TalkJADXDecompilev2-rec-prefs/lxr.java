package p000;

public final class lxr extends nyx<lxr> {
    public lxh f26801a;
    public lzj f26802b;
    public lxh[] f26803c;
    public lup requestHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m31043b(nyt);
    }

    public lxr() {
        m31044d();
    }

    private lxr m31044d() {
        this.requestHeader = null;
        this.f26801a = null;
        this.f26802b = null;
        this.f26803c = lxh.m30993d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.f26801a != null) {
            nyu.b(2, this.f26801a);
        }
        if (this.f26802b != null) {
            nyu.b(3, this.f26802b);
        }
        if (this.f26803c != null && this.f26803c.length > 0) {
            for (nzf nzf : this.f26803c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.f26801a != null) {
            b += nyu.d(2, this.f26801a);
        }
        if (this.f26802b != null) {
            b += nyu.d(3, this.f26802b);
        }
        if (this.f26803c == null || this.f26803c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26803c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lxr m31043b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.requestHeader == null) {
                        this.requestHeader = new lup();
                    }
                    nyt.a(this.requestHeader);
                    continue;
                case wi.dH /*18*/:
                    if (this.f26801a == null) {
                        this.f26801a = new lxh();
                    }
                    nyt.a(this.f26801a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f26802b == null) {
                        this.f26802b = new lzj();
                    }
                    nyt.a(this.f26802b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.f26803c == null) {
                        a = 0;
                    } else {
                        a = this.f26803c.length;
                    }
                    Object obj = new lxh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26803c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxh();
                    nyt.a(obj[a]);
                    this.f26803c = obj;
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
