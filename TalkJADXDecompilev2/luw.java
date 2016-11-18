package defpackage;

public final class luw extends nyx<luw> {
    public lqc[] a;
    public Boolean b;
    public lov[] c;
    public luq responseHeader;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public luw() {
        d();
    }

    private luw d() {
        this.responseHeader = null;
        this.a = lqc.d();
        this.b = null;
        this.c = lov.d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.a != null && this.a.length > 0) {
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.b != null) {
            nyu.a(3, this.b.booleanValue());
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf2 = this.c[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.a(nyu);
    }

    protected int b() {
        int i = 0;
        int b = super.b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.a != null && this.a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.a) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.c != null && this.c.length > 0) {
            while (i < this.c.length) {
                nzf nzf2 = this.c[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private luw b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            int b;
            Object obj;
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
                    b = nzl.b(nyt, 18);
                    if (this.a == null) {
                        a = 0;
                    } else {
                        a = this.a.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.a = obj;
                    continue;
                case wi.dA /*24*/:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.c == null) {
                        a = 0;
                    } else {
                        a = this.c.length;
                    }
                    obj = new lov[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lov();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lov();
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
