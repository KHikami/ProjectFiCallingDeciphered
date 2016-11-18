package defpackage;

public final class oey extends nyx<oey> {
    public String a;
    public String b;
    public oeq c;
    public oer d;
    public long e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oey() {
        d();
    }

    private oey d() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = null;
        this.e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.d != null) {
            nyu.b(4, this.d);
        }
        if (this.e != 0) {
            nyu.b(5, this.e);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!(this.b == null || this.b.equals(""))) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.d != null) {
            b += nyu.d(4, this.d);
        }
        if (this.e != 0) {
            return b + nyu.f(5, this.e);
        }
        return b;
    }

    private oey b(nyt nyt) {
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
                    if (this.c == null) {
                        this.c = new oeq();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.d == null) {
                        this.d = new oer();
                    }
                    nyt.a(this.d);
                    continue;
                case 40:
                    this.e = nyt.e();
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
