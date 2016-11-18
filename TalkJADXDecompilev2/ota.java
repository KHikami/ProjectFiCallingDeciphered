package defpackage;

public final class ota extends nyx<ota> {
    private static volatile ota[] g;
    public int a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public String f;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ota[] d() {
        if (g == null) {
            synchronized (nzc.c) {
                if (g == null) {
                    g = new ota[0];
                }
            }
        }
        return g;
    }

    public ota() {
        this.a = 0;
        this.b = "";
        this.c = false;
        this.d = "";
        this.e = "";
        this.f = "";
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (!(this.d == null || this.d.equals(""))) {
            nyu.a(3, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(4, this.e);
        }
        if (!(this.f == null || this.f.equals(""))) {
            nyu.a(5, this.f);
        }
        if (this.c) {
            nyu.a(6, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            b += nyu.f(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (!(this.d == null || this.d.equals(""))) {
            b += nyu.b(3, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            b += nyu.b(4, this.e);
        }
        if (!(this.f == null || this.f.equals(""))) {
            b += nyu.b(5, this.f);
        }
        if (!this.c) {
            return b;
        }
        boolean z = this.c;
        return b + (nyu.h(6) + 1);
    }

    private ota b(nyt nyt) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    this.f = nyt.j();
                    continue;
                case 48:
                    this.c = nyt.i();
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
