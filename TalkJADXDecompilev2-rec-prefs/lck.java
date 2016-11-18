package p000;

public final class lck extends nyx<lck> {
    public lcm[] f24578a;
    public lcm f24579b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28607b(nyt);
    }

    public lck() {
        this.f24578a = lcm.m28617d();
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f24578a != null && this.f24578a.length > 0) {
            for (nzf nzf : this.f24578a) {
                if (nzf != null) {
                    nyu.b(1, nzf);
                }
            }
        }
        if (this.f24579b != null) {
            nyu.b(2, this.f24579b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24578a != null && this.f24578a.length > 0) {
            for (nzf nzf : this.f24578a) {
                if (nzf != null) {
                    b += nyu.d(1, nzf);
                }
            }
        }
        if (this.f24579b != null) {
            return b + nyu.d(2, this.f24579b);
        }
        return b;
    }

    private lck m28607b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    int b = nzl.b(nyt, 10);
                    if (this.f24578a == null) {
                        a = 0;
                    } else {
                        a = this.f24578a.length;
                    }
                    Object obj = new lcm[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f24578a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lcm();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lcm();
                    nyt.a(obj[a]);
                    this.f24578a = obj;
                    continue;
                case wi.dH /*18*/:
                    if (this.f24579b == null) {
                        this.f24579b = new lcm();
                    }
                    nyt.a(this.f24579b);
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
