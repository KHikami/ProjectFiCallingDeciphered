package defpackage;

public final class oev extends nyx<oev> {
    public String a;
    public oes b;
    public oew c;
    public String d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oev() {
        d();
    }

    private oev d() {
        this.a = "";
        this.b = null;
        this.c = null;
        this.d = "";
        this.e = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        if (!(this.d == null || this.d.equals(""))) {
            nyu.a(2, this.d);
        }
        if (this.b != null) {
            nyu.b(3, this.b);
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(4, this.e);
        }
        if (this.c != null) {
            nyu.b(5, this.c);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (!(this.a == null || this.a.equals(""))) {
            b += nyu.b(1, this.a);
        }
        if (!(this.d == null || this.d.equals(""))) {
            b += nyu.b(2, this.d);
        }
        if (this.b != null) {
            b += nyu.d(3, this.b);
        }
        if (!(this.e == null || this.e.equals(""))) {
            b += nyu.b(4, this.e);
        }
        if (this.c != null) {
            return b + nyu.d(5, this.c);
        }
        return b;
    }

    private oev b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    this.d = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    if (this.b == null) {
                        this.b = new oes();
                    }
                    nyt.a(this.b);
                    continue;
                case 34:
                    this.e = nyt.j();
                    continue;
                case 42:
                    if (this.c == null) {
                        this.c = new oew();
                    }
                    nyt.a(this.c);
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
