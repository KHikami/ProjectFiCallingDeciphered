package defpackage;

public final class ojf extends nyx<ojf> {
    private static volatile ojf[] d;
    public Long a;
    public String b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ojf[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new ojf[0];
                }
            }
        }
        return d;
    }

    public ojf() {
        g();
    }

    private ojf g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.b(1, this.a.longValue());
        nyu.a(2, this.b);
        nyu.a(3, this.c);
        super.a(nyu);
    }

    protected int b() {
        return ((super.b() + nyu.f(1, this.a.longValue())) + nyu.b(2, this.b)) + nyu.b(3, this.c);
    }

    private ojf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Long.valueOf(nyt.e());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.j();
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
