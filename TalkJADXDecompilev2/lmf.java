package defpackage;

public final class lmf extends nyx<lmf> {
    private static volatile lmf[] d;
    public Integer a;
    public Integer b;
    public Integer c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lmf[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new lmf[0];
                }
            }
        }
        return d;
    }

    public lmf() {
        g();
    }

    private lmf g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b.intValue());
        nyu.a(3, this.c.intValue());
        super.a(nyu);
    }

    protected int b() {
        return ((super.b() + nyu.f(1, this.a.intValue())) + nyu.f(2, this.b.intValue())) + nyu.f(3, this.c.intValue());
    }

    private lmf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.f());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.f());
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