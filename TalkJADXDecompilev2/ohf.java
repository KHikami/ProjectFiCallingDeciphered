package defpackage;

public final class ohf extends nyx<ohf> {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public ohf() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.b != null) {
            nyu.a(1, this.b);
        }
        if (this.e != null) {
            nyu.a(3, this.e);
        }
        if (this.c != null) {
            nyu.a(4, this.c);
        }
        if (this.d != null) {
            nyu.a(5, this.d);
        }
        if (this.a != null) {
            nyu.a(6, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.b != null) {
            b += nyu.b(1, this.b);
        }
        if (this.e != null) {
            b += nyu.b(3, this.e);
        }
        if (this.c != null) {
            b += nyu.b(4, this.c);
        }
        if (this.d != null) {
            b += nyu.b(5, this.d);
        }
        if (this.a != null) {
            return b + nyu.b(6, this.a);
        }
        return b;
    }

    private ohf b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.b = nyt.j();
                    continue;
                case wi.dx /*26*/:
                    this.e = nyt.j();
                    continue;
                case 34:
                    this.c = nyt.j();
                    continue;
                case 42:
                    this.d = nyt.j();
                    continue;
                case 50:
                    this.a = nyt.j();
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
