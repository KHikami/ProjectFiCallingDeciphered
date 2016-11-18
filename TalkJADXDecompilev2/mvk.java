package defpackage;

public final class mvk extends nyx<mvk> {
    public String a;
    public String b;
    public mvl c;
    public long d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvk() {
        d();
    }

    private mvk d() {
        this.a = "";
        this.b = "";
        this.c = null;
        this.d = 0;
        this.e = "";
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
        if (this.d != 0) {
            nyu.b(4, this.d);
        }
        if (!(this.e == null || this.e.equals(""))) {
            nyu.a(5, this.e);
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
        if (this.d != 0) {
            b += nyu.f(4, this.d);
        }
        if (this.e == null || this.e.equals("")) {
            return b;
        }
        return b + nyu.b(5, this.e);
    }

    private mvk b(nyt nyt) {
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
                        this.c = new mvl();
                    }
                    nyt.a(this.c);
                    continue;
                case 32:
                    this.d = nyt.e();
                    continue;
                case 42:
                    this.e = nyt.j();
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
