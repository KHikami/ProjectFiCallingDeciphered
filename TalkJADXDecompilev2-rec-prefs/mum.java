package p000;

public final class mum extends nyx<mum> {
    private static volatile mum[] f28380f;
    public Integer f28381a;
    public Boolean f28382b;
    public Integer f28383c;
    public mul f28384d;
    public mul f28385e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32967b(nyt);
    }

    public static mum[] m32968d() {
        if (f28380f == null) {
            synchronized (nzc.c) {
                if (f28380f == null) {
                    f28380f = new mum[0];
                }
            }
        }
        return f28380f;
    }

    public mum() {
        m32969g();
    }

    private mum m32969g() {
        this.f28382b = null;
        this.f28384d = null;
        this.f28385e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28381a != null) {
            nyu.a(1, this.f28381a.intValue());
        }
        if (this.f28382b != null) {
            nyu.a(2, this.f28382b.booleanValue());
        }
        if (this.f28383c != null) {
            nyu.a(3, this.f28383c.intValue());
        }
        if (this.f28384d != null) {
            nyu.b(6, this.f28384d);
        }
        if (this.f28385e != null) {
            nyu.b(7, this.f28385e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28381a != null) {
            b += nyu.f(1, this.f28381a.intValue());
        }
        if (this.f28382b != null) {
            this.f28382b.booleanValue();
            b += nyu.h(2) + 1;
        }
        if (this.f28383c != null) {
            b += nyu.f(3, this.f28383c.intValue());
        }
        if (this.f28384d != null) {
            b += nyu.d(6, this.f28384d);
        }
        if (this.f28385e != null) {
            return b + nyu.d(7, this.f28385e);
        }
        return b;
    }

    private mum m32967b(nyt nyt) {
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
                            this.f28381a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f28382b = Boolean.valueOf(nyt.i());
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
                            this.f28383c = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 50:
                    if (this.f28384d == null) {
                        this.f28384d = new mul();
                    }
                    nyt.a(this.f28384d);
                    continue;
                case 58:
                    if (this.f28385e == null) {
                        this.f28385e = new mul();
                    }
                    nyt.a(this.f28385e);
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
