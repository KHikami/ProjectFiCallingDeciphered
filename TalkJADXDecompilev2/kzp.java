package defpackage;

public final class kzp extends nyx<kzp> {
    private static volatile kzp[] d;
    public String a;
    public String b;
    public String c;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kzp[] d() {
        if (d == null) {
            synchronized (nzc.c) {
                if (d == null) {
                    d = new kzp[0];
                }
            }
        }
        return d;
    }

    public kzp() {
        g();
    }

    private kzp g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        if (this.c != null) {
            return b + nyu.b(3, this.c);
        }
        return b;
    }

    private kzp b(nyt nyt) {
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
