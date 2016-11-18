package p000;

public final class ltk extends nyx<ltk> {
    private static volatile ltk[] f26382c;
    public lor f26383a;
    public ltl[] f26384b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30454b(nyt);
    }

    public static ltk[] m30455d() {
        if (f26382c == null) {
            synchronized (nzc.c) {
                if (f26382c == null) {
                    f26382c = new ltk[0];
                }
            }
        }
        return f26382c;
    }

    public ltk() {
        m30456g();
    }

    private ltk m30456g() {
        this.f26383a = null;
        this.f26384b = ltl.m30461d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26383a != null) {
            nyu.b(1, this.f26383a);
        }
        if (this.f26384b != null && this.f26384b.length > 0) {
            for (nzf nzf : this.f26384b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26383a != null) {
            b += nyu.d(1, this.f26383a);
        }
        if (this.f26384b == null || this.f26384b.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.f26384b) {
            if (nzf != null) {
                i += nyu.d(2, nzf);
            }
        }
        return i;
    }

    private ltk m30454b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f26383a == null) {
                        this.f26383a = new lor();
                    }
                    nyt.a(this.f26383a);
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.f26384b == null) {
                        a = 0;
                    } else {
                        a = this.f26384b.length;
                    }
                    Object obj = new ltl[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26384b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new ltl();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new ltl();
                    nyt.a(obj[a]);
                    this.f26384b = obj;
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
