public final class lky extends nyx<lky> {
    private static volatile lky[] c;
    public String a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lky[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lky[0];
                }
            }
        }
        return c;
    }

    public lky() {
        g();
    }

    private lky g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(6, this.a);
        if (this.b != null) {
            nyu.a(7, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b() + nyu.b(6, this.a);
        if (this.b != null) {
            return b + nyu.b(7, this.b);
        }
        return b;
    }

    private lky b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case 50:
                    this.a = nyt.j();
                    continue;
                case 58:
                    this.b = nyt.j();
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
