package defpackage;

public final class osn extends nyx<osn> {
    private static volatile osn[] e;
    public String a;
    public Integer b;
    public Integer c;
    public Boolean d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static osn[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new osn[0];
                }
            }
        }
        return e;
    }

    public osn() {
        g();
    }

    private osn g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.c(2, this.b.intValue());
        nyu.c(3, this.c.intValue());
        if (this.d != null) {
            nyu.a(4, this.d.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((super.b() + nyu.b(1, this.a)) + nyu.g(2, this.b.intValue())) + nyu.g(3, this.c.intValue());
        if (this.d == null) {
            return b;
        }
        this.d.booleanValue();
        return b + (nyu.h(4) + 1);
    }

    private osn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case 16:
                    this.b = Integer.valueOf(nyt.l());
                    continue;
                case wi.dA /*24*/:
                    this.c = Integer.valueOf(nyt.l());
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
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
