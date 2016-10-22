public final class kym extends nyx<kym> {
    private static volatile kym[] j;
    public String a;
    public String b;
    public Boolean c;
    public Boolean d;
    public String e;
    public String f;
    public String g;
    public ldn h;
    public Boolean i;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kym[] d() {
        if (j == null) {
            synchronized (nzc.c) {
                if (j == null) {
                    j = new kym[0];
                }
            }
        }
        return j;
    }

    public kym() {
        g();
    }

    private kym g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a);
        nyu.a(2, this.b);
        nyu.a(3, this.c.booleanValue());
        nyu.a(4, this.d.booleanValue());
        if (this.e != null) {
            nyu.a(5, this.e);
        }
        if (this.f != null) {
            nyu.a(6, this.f);
        }
        if (this.g != null) {
            nyu.a(7, this.g);
        }
        if (this.h != null) {
            nyu.b(8, this.h);
        }
        if (this.i != null) {
            nyu.a(9, this.i.booleanValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = (super.b() + nyu.b(1, this.a)) + nyu.b(2, this.b);
        this.c.booleanValue();
        b += nyu.h(3) + 1;
        this.d.booleanValue();
        b += nyu.h(4) + 1;
        if (this.e != null) {
            b += nyu.b(5, this.e);
        }
        if (this.f != null) {
            b += nyu.b(6, this.f);
        }
        if (this.g != null) {
            b += nyu.b(7, this.g);
        }
        if (this.h != null) {
            b += nyu.d(8, this.h);
        }
        if (this.i == null) {
            return b;
        }
        this.i.booleanValue();
        return b + (nyu.h(9) + 1);
    }

    private kym b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case wi.w /*0*/:
                    break;
                case wi.dr /*10*/:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.j();
                    continue;
                case wi.dA /*24*/:
                    this.c = Boolean.valueOf(nyt.i());
                    continue;
                case 32:
                    this.d = Boolean.valueOf(nyt.i());
                    continue;
                case 42:
                    this.e = nyt.j();
                    continue;
                case 50:
                    this.f = nyt.j();
                    continue;
                case 58:
                    this.g = nyt.j();
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new ldn();
                    }
                    nyt.a(this.h);
                    continue;
                case 72:
                    this.i = Boolean.valueOf(nyt.i());
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
