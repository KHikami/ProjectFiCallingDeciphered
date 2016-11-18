package defpackage;

public final class nej extends nyx<nej> {
    private static volatile nej[] c;
    public Integer a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nej[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new nej[0];
                }
            }
        }
        return c;
    }

    public nej() {
        g();
    }

    private nej g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.a != null) {
            nyu.a(3, this.a.intValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.a != null) {
            return b + nyu.f(3, this.a.intValue());
        }
        return b;
    }

    private nej b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.a = Integer.valueOf(nyt.f());
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
