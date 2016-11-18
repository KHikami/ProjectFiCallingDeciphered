package defpackage;

public final class krb extends nyx<krb> {
    private static volatile krb[] e;
    public kqd a;
    public kpi b;
    public String c;
    public Integer d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static krb[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new krb[0];
                }
            }
        }
        return e;
    }

    public krb() {
        g();
    }

    private krb g() {
        this.a = null;
        this.b = null;
        this.c = null;
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
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
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
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            return b + nyu.f(4, this.d.intValue());
        }
        return b;
    }

    private krb b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new kqd();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new kpi();
                    }
                    nyt.a(this.b);
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            this.d = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
