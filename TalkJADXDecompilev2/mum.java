package defpackage;

public final class mum extends nyx<mum> {
    private static volatile mum[] f;
    public Integer a;
    public Boolean b;
    public Integer c;
    public mul d;
    public mul e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mum[] d() {
        if (f == null) {
            synchronized (nzc.c) {
                if (f == null) {
                    f = new mum[0];
                }
            }
        }
        return f;
    }

    public mum() {
        g();
    }

    private mum g() {
        this.b = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.a(2, this.b.booleanValue());
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        if (this.d != null) {
            nyu.b(6, this.d);
        }
        if (this.e != null) {
            nyu.b(7, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            this.b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.c != null) {
            b += nyu.f(3, this.c.intValue());
        }
        if (this.d != null) {
            b += nyu.d(6, this.d);
        }
        if (this.e != null) {
            return b + nyu.d(7, this.e);
        }
        return b;
    }

    private mum b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = Boolean.valueOf(nyt.i());
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 257:
                        case 258:
                        case 513:
                        case 514:
                        case 515:
                        case 769:
                        case 770:
                        case 771:
                        case 772:
                        case 773:
                        case 774:
                        case 1025:
                        case 1026:
                        case 1027:
                        case 1028:
                        case 1029:
                        case 1030:
                        case 1281:
                        case 1282:
                        case 262913:
                            this.c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.d == null) {
                        this.d = new mul();
                    }
                    nyt.a(this.d);
                    continue;
                case 58:
                    if (this.e == null) {
                        this.e = new mul();
                    }
                    nyt.a(this.e);
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
