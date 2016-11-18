package defpackage;

public final class kke extends nyx<kke> {
    private static volatile kke[] c;
    public Integer a;
    public kkf b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kke[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new kke[0];
                }
            }
        }
        return c;
    }

    public kke() {
        g();
    }

    private kke g() {
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private kke b(nyt nyt) {
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
                            this.a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new kkf();
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
