package defpackage;

public final class klm extends nyx<klm> {
    private static volatile klm[] h;
    public klk a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public kmm g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static klm[] d() {
        if (h == null) {
            synchronized (nzc.c) {
                if (h == null) {
                    h = new klm[0];
                }
            }
        }
        return h;
    }

    public klm() {
        g();
    }

    private klm g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.e != null) {
            nyu.a(4, this.e);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.g != null) {
            nyu.b(6, this.g);
        }
        if (this.f != null) {
            nyu.a(7, this.f);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.e != null) {
            b += nyu.b(4, this.e);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.g != null) {
            b += nyu.d(6, this.g);
        }
        if (this.f != null) {
            return b + nyu.b(7, this.f);
        }
        return b;
    }

    private klm b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.a == null) {
                        this.a = new klk();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    if (this.g == null) {
                        this.g = new kmm();
                    }
                    nyt.a(this.g);
                    continue;
                case 58:
                    this.f = nyt.j();
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
