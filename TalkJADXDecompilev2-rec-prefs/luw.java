package p000;

public final class luw extends nyx<luw> {
    public lqc[] f26544a;
    public Boolean f26545b;
    public lov[] f26546c;
    public luq responseHeader;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30668b(nyt);
    }

    public luw() {
        m30669d();
    }

    private luw m30669d() {
        this.responseHeader = null;
        this.f26544a = lqc.m30002d();
        this.f26545b = null;
        this.f26546c = lov.m29813d();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        int i = 0;
        if (this.responseHeader != null) {
            nyu.b(1, this.responseHeader);
        }
        if (this.f26544a != null && this.f26544a.length > 0) {
            for (nzf nzf : this.f26544a) {
                if (nzf != null) {
                    nyu.b(2, nzf);
                }
            }
        }
        if (this.f26545b != null) {
            nyu.a(3, this.f26545b.booleanValue());
        }
        if (this.f26546c != null && this.f26546c.length > 0) {
            while (i < this.f26546c.length) {
                nzf nzf2 = this.f26546c[i];
                if (nzf2 != null) {
                    nyu.b(4, nzf2);
                }
                i++;
            }
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int i = 0;
        int b = super.mo147b();
        if (this.responseHeader != null) {
            b += nyu.d(1, this.responseHeader);
        }
        if (this.f26544a != null && this.f26544a.length > 0) {
            int i2 = b;
            for (nzf nzf : this.f26544a) {
                if (nzf != null) {
                    i2 += nyu.d(2, nzf);
                }
            }
            b = i2;
        }
        if (this.f26545b != null) {
            this.f26545b.booleanValue();
            b += nyu.h(3) + 1;
        }
        if (this.f26546c != null && this.f26546c.length > 0) {
            while (i < this.f26546c.length) {
                nzf nzf2 = this.f26546c[i];
                if (nzf2 != null) {
                    b += nyu.d(4, nzf2);
                }
                i++;
            }
        }
        return b;
    }

    private luw m30668b(nyt nyt) {
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
                    if (this.f26544a == null) {
                        a = 0;
                    } else {
                        a = this.f26544a.length;
                    }
                    obj = new lqc[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26544a, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lqc();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lqc();
                    nyt.a(obj[a]);
                    this.f26544a = obj;
                    continue;
                case wi.dA /*24*/:
                    this.f26545b = Boolean.valueOf(nyt.i());
                    continue;
                case 34:
                    b = nzl.b(nyt, 34);
                    if (this.f26546c == null) {
                        a = 0;
                    } else {
                        a = this.f26546c.length;
                    }
                    obj = new lov[(b + a)];
                    if (a != 0) {
                        System.arraycopy(this.f26546c, 0, obj, 0, a);
                    }
                    while (a < obj.length - 1) {
                        obj[a] = new lov();
                        nyt.a(obj[a]);
                        nyt.a();
                        a++;
                    }
                    obj[a] = new lov();
                    nyt.a(obj[a]);
                    this.f26546c = obj;
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
