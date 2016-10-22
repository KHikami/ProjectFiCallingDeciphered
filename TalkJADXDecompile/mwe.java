public final class mwe extends nyx<mwe> {
    private static volatile mwe[] b;
    public mwd a;
    private int c;
    private String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static mwe[] d() {
        if (b == null) {
            synchronized (nzc.c) {
                if (b == null) {
                    b = new mwe[0];
                }
            }
        }
        return b;
    }

    public mwe() {
        g();
    }

    private mwe g() {
        this.c = 0;
        this.d = "";
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        if ((this.c & 1) != 0) {
            nyu.a(3, this.d);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.d(2, this.a);
        }
        if ((this.c & 1) != 0) {
            return b + nyu.b(3, this.d);
        }
        return b;
    }

    private mwe b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new mwd();
                    }
                    nyt.a(this.a);
                    continue;
                case wi.dx /*26*/:
                    this.d = nyt.j();
                    this.c |= 1;
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
