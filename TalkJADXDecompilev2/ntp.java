package defpackage;

public final class ntp extends nyx<ntp> {
    public String a;
    public String b;
    public String c;
    public Double d;
    public Double e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ntp() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        if (this.c != null) {
            nyu.a(3, this.c);
        }
        if (this.d != null) {
            nyu.a(4, this.d.doubleValue());
        }
        if (this.e != null) {
            nyu.a(5, this.e.doubleValue());
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            b += nyu.b(2, this.b);
        }
        if (this.c != null) {
            b += nyu.b(3, this.c);
        }
        if (this.d != null) {
            this.d.doubleValue();
            b += nyu.h(4) + 8;
        }
        if (this.e == null) {
            return b;
        }
        this.e.doubleValue();
        return b + (nyu.h(5) + 8);
    }

    private ntp b(nyt nyt) {
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
                case 33:
                    this.d = Double.valueOf(nyt.b());
                    continue;
                case 41:
                    this.e = Double.valueOf(nyt.b());
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
