package defpackage;

public final class ogn extends nyx<ogn> {
    public Integer a;
    public byte[] b;
    public byte[] c;
    public Long d;
    public Long e;
    public String f;
    public String g;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ogn() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        nyu.a(1, this.a.intValue());
        nyu.a(2, this.b);
        nyu.a(3, this.c);
        if (this.d != null) {
            nyu.b(4, this.d.longValue());
        }
        if (this.e != null) {
            nyu.b(6, this.e.longValue());
        }
        if (this.f != null) {
            nyu.a(7, this.f);
        }
        if (this.g != null) {
            nyu.a(8, this.g);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = ((super.b() + nyu.f(1, this.a.intValue())) + nyu.b(2, this.b)) + nyu.b(3, this.c);
        if (this.d != null) {
            b += nyu.f(4, this.d.longValue());
        }
        if (this.e != null) {
            b += nyu.f(6, this.e.longValue());
        }
        if (this.f != null) {
            b += nyu.b(7, this.f);
        }
        if (this.g != null) {
            return b + nyu.b(8, this.g);
        }
        return b;
    }

    private ogn b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    this.b = nyt.k();
                    continue;
                case wi.dx /*26*/:
                    this.c = nyt.k();
                    continue;
                case 32:
                    this.d = Long.valueOf(nyt.e());
                    continue;
                case 48:
                    this.e = Long.valueOf(nyt.e());
                    continue;
                case 58:
                    this.f = nyt.j();
                    continue;
                case 66:
                    this.g = nyt.j();
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
