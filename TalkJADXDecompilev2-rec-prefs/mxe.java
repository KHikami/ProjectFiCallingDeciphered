package p000;

public final class mxe extends nyx<mxe> {
    private static volatile mxe[] f28665e;
    public Integer f28666a;
    public mxj f28667b;
    public mxf f28668c;
    public mxg f28669d;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33303b(nyt);
    }

    public static mxe[] m33304d() {
        if (f28665e == null) {
            synchronized (nzc.c) {
                if (f28665e == null) {
                    f28665e = new mxe[0];
                }
            }
        }
        return f28665e;
    }

    public mxe() {
        m33305g();
    }

    private mxe m33305g() {
        this.f28667b = null;
        this.f28668c = null;
        this.f28669d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28666a != null) {
            nyu.a(1, this.f28666a.intValue());
        }
        if (this.f28667b != null) {
            nyu.b(2, this.f28667b);
        }
        if (this.f28668c != null) {
            nyu.b(3, this.f28668c);
        }
        if (this.f28669d != null) {
            nyu.b(4, this.f28669d);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28666a != null) {
            b += nyu.f(1, this.f28666a.intValue());
        }
        if (this.f28667b != null) {
            b += nyu.d(2, this.f28667b);
        }
        if (this.f28668c != null) {
            b += nyu.d(3, this.f28668c);
        }
        if (this.f28669d != null) {
            return b + nyu.d(4, this.f28669d);
        }
        return b;
    }

    private mxe m33303b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            this.f28666a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.f28667b == null) {
                        this.f28667b = new mxj();
                    }
                    nyt.a(this.f28667b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f28668c == null) {
                        this.f28668c = new mxf();
                    }
                    nyt.a(this.f28668c);
                    continue;
                case 34:
                    if (this.f28669d == null) {
                        this.f28669d = new mxg();
                    }
                    nyt.a(this.f28669d);
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
