package defpackage;

public final class nfy extends nyx<nfy> {
    public nqb[] a;
    public Boolean b;
    public Boolean c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nfy() {
        d();
    }

    private nfy d() {
        this.a = nqb.d();
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(2, this.c.booleanValue());
        }
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(3, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(1) + 1;
        }
        if (this.c != null) {
            this.c.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.a == null || this.a.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.a) {
            if (nzf != null) {
                i += nyu.d(3, nzf);
            }
        }
        return i;
    }

    private nfy b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 16:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dx /*26*/:
                    int b = nzl.b(nyt, 26);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    Object obj = new nqb[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nqb();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nqb();
                    nyt.a(obj[a]);
                    this.a = obj;
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
