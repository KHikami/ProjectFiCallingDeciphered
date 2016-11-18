package defpackage;

public final class ldt extends nyx<ldt> {
    private static volatile ldt[] d;
    public Integer a;
    public ldu b;
    public ogh c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ldt[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ldt[0];
                }
            }
        }
        return d;
    }

    public ldt() {
        g();
    }

    private ldt g() {
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.b != null) {
            nyu.b(6, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.b != null) {
            return b + nyu.d(6, this.b);
        }
        return b;
    }

    private ldt b(nyt nyt) {
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
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 1001:
                        case 1002:
                        case 1003:
                        case 1004:
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dx /*26*/:
                    if (this.c == null) {
                        this.c = new ogh();
                    }
                    nyt.a(this.c);
                    continue;
                case 50:
                    if (this.b == null) {
                        this.b = new ldu();
                    }
                    nyt.a(this.b);
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
