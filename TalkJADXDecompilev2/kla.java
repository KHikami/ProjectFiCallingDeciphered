package defpackage;

public final class kla extends nyx<kla> {
    private static volatile kla[] e;
    public String a;
    public String b;
    public klk c;
    public Integer d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kla[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new kla[0];
                }
            }
        }
        return e;
    }

    public kla() {
        g();
    }

    private kla g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.c != null) {
            nyu.b(1, this.c);
        }
        if (this.a != null) {
            nyu.a(2, this.a);
        }
        if (this.b != null) {
            nyu.a(3, this.b);
        }
        if (this.d != null) {
            nyu.a(4, this.d.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.c != null) {
            b += nyu.d(1, this.c);
        }
        if (this.a != null) {
            b += nyu.b(2, this.a);
        }
        if (this.b != null) {
            b += nyu.b(3, this.b);
        }
        if (this.d != null) {
            return b + nyu.f(4, this.d.intValue());
        }
        return b;
    }

    private kla b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.c == null) {
                        this.c = new klk();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dH /*18*/:
                    this.a = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.b = nyt.j();
                    continue;
                case 32:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
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
