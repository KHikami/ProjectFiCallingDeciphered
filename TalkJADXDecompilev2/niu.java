package defpackage;

public final class niu extends nyx<niu> {
    public nlz a;
    public nma b;
    public nlw c;
    public nlw[] d;
    public Boolean e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public niu() {
        d();
    }

    private niu d() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = nlw.d();
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.e != null) {
            nyu.a(4, this.e.booleanValue());
        }
        if (this.d != null && this.d.length > 0) {
            for (nzf nzf : this.d) {
                if (nzf != null) {
                    nyu.b(5, nzf);
                }
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.d(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.e != null) {
            this.e.booleanValue();
            b += nyu.h(4) + 1;
        }
        if (this.d == null || this.d.length <= 0) {
            return b;
        }
        int i = b;
        for (nzf nzf : this.d) {
            if (nzf != null) {
                i += nyu.d(5, nzf);
            }
        }
        return i;
    }

    private niu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new nlz();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nma();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new nlw();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.e = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    int b = nzl.b(nyt, 42);
                    if (this.d == null) {
                        a = 0;
                    } else {
                        a = this.d.length;
                    }
                    Object obj = new nlw[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.d, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new nlw();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new nlw();
                    nyt.a(obj[a]);
                    this.d = obj;
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
