package defpackage;

public final class nrj extends nyx<nrj> {
    public int a;
    public nsf b;
    public nto c;
    public ndi d;
    public ncs[] e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nrj() {
        this.a = nzf.UNSET_ENUM_VALUE;
        this.e = ncs.d();
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != null && this.e.length > 0) {
            for (nzf nzf : this.e) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.f(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e == null || this.e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.e) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private nrj b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nsf();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nto();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new ndi();
                    }
                    nyt.a(this.d);
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.e == null) {
                        a = 0;
                    } else {
                        a = this.e.length;
                    }
                    Object obj = new ncs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncs();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ncs();
                    nyt.a(obj[a]);
                    this.e = obj;
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
