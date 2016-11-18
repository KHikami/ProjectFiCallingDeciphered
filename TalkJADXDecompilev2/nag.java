package defpackage;

public final class nag extends nyx<nag> {
    public Long a;
    public oyq[] b;
    public nus c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nag() {
        d();
    }

    private nag d() {
        this.a = null;
        this.b = oyq.d();
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.longValue());
        }
        if (this.b != null && this.b.length > 0) {
            int i = b;
            for (nzf nzf : this.b) {
                if (nzf != null) {
                    i += nyu.d(2, nzf);
                }
            }
            b = i;
        }
        if (this.c != null) {
            return b + nyu.d(3, this.c);
        }
        return b;
    }

    private nag b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    int b = nzl.b(nyt, 18);
                    if (this.b == null) {
                        a = 0;
                    } else {
                        a = this.b.length;
                    }
                    Object obj = new oyq[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.b, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new oyq();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new oyq();
                    nyt.a(obj[a]);
                    this.b = obj;
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nus();
                    }
                    nyt.a(this.c);
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
