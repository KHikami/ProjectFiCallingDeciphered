package defpackage;

public final class lxr extends nyx<lxr> {
    public lxh a;
    public lzj b;
    public lxh[] c;
    public lup requestHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public lxr() {
        d();
    }

    private lxr d() {
        this.requestHeader = null;
        this.a = null;
        this.b = null;
        this.c = lxh.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.requestHeader != null) {
            nyu.b(1, this.requestHeader);
        }
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (this.c != null && this.c.length > 0) {
            for (nzf nzf : this.c) {
                if (nzf != null) {
                    nyu.b(4, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.requestHeader != null) {
            b += nyu.d(1, this.requestHeader);
        }
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (this.c == null || this.c.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.c) {
            if (nzf != null) {
                i += nyu.d(4, nzf);
            }
        }
        return i;
    }

    private lxr b(nyt nyt) {
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
                    if (this.a == null) {
                        this.a = new lxh();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new lzj();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    int b = nzl.b(nyt, 34);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    Object obj = new lxh[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lxh();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lxh();
                    nyt.a(obj[a]);
                    this.c = obj;
                    continue;
                default:
                    if (!super.a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
