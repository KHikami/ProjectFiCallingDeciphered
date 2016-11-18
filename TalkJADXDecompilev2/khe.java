package defpackage;

public final class khe extends nyx<khe> {
    private static volatile khe[] d;
    public String a;
    public String b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static khe[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new khe[0];
                }
            }
        }
        return d;
    }

    public khe() {
        g();
    }

    private khe g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            return b + nyu.f(3, this.c.intValue());
        }
        return b;
    }

    private khe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    a = nyt.f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.c = Integer.valueOf(a);
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
