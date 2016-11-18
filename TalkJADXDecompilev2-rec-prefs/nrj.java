package p000;

public final class nrj extends nyx<nrj> {
    public int f30587a;
    public nsf f30588b;
    public nto f30589c;
    public ndi f30590d;
    public ncs[] f30591e;

    public /* synthetic */ nzf m36259a(nyt nyt) {
        return m36258b(nyt);
    }

    public nrj() {
        this.f30587a = nzf.UNSET_ENUM_VALUE;
        this.f30591e = ncs.m34347d();
        this.cachedSize = -1;
    }

    public void m36260a(nyu nyu) {
        if (this.f30587a != nzf.UNSET_ENUM_VALUE) {
            nyu.m37168a(1, this.f30587a);
        }
        if (this.f30588b != null) {
            nyu.m37182b(2, this.f30588b);
        }
        if (this.f30589c != null) {
            nyu.m37182b(3, this.f30589c);
        }
        if (this.f30590d != null) {
            nyu.m37182b(4, this.f30590d);
        }
        if (this.f30591e != null && this.f30591e.length > 0) {
            for (nzf nzf : this.f30591e) {
                if (nzf != null) {
                    nyu.m37182b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int m36261b() {
        int b = super.b();
        if (this.f30587a != nzf.UNSET_ENUM_VALUE) {
            b += nyu.m37147f(1, this.f30587a);
        }
        if (this.f30588b != null) {
            b += nyu.m37145d(2, this.f30588b);
        }
        if (this.f30589c != null) {
            b += nyu.m37145d(3, this.f30589c);
        }
        if (this.f30590d != null) {
            b += nyu.m37145d(4, this.f30590d);
        }
        if (this.f30591e == null || this.f30591e.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f30591e) {
            if (nzf != null) {
                i += nyu.m37145d(5, nzf);
            }
        }
        return i;
    }

    private nrj m36258b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                            this.f30587a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f30588b == null) {
                        this.f30588b = new nsf();
                    }
                    nyt.m37101a(this.f30588b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f30589c == null) {
                        this.f30589c = new nto();
                    }
                    nyt.m37101a(this.f30589c);
                    continue;
                case 34:
                    if (this.f30590d == null) {
                        this.f30590d = new ndi();
                    }
                    nyt.m37101a(this.f30590d);
                    continue;
                case 42:
                    int b = nzl.m37265b(nyt, 42);
                    if (this.f30591e == null) {
                        a = 0;
                    } else {
                        a = this.f30591e.length;
                    }
                    Object obj = new ncs[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f30591e, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ncs();
                        nyt.m37101a(obj[a]);
                        nyt.m37099a();
                        a++;
                    }
                    obj[a] = new ncs();
                    nyt.m37101a(obj[a]);
                    this.f30591e = obj;
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
