package defpackage;

public final class pbq extends nyx<pbq> {
    private static volatile pbq[] e;
    public String a;
    public pbr b;
    public pbs c;
    public String d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static pbq[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new pbq[0];
                }
            }
        }
        return e;
    }

    public pbq() {
        this.a = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.d != null) {
            nyu.a(2, this.d);
        }
        if (this.c != null) {
            nyu.b(3, this.c);
        }
        if (this.b != null) {
            nyu.b(4, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.d != null) {
            b += nyu.b(2, this.d);
        }
        if (this.c != null) {
            b += nyu.d(3, this.c);
        }
        if (this.b != null) {
            return b + nyu.d(4, this.b);
        }
        return b;
    }

    private pbq b(nyt nyt) {
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
                    if (this.c == null) {
                        this.c = new pbs();
                    }
                    nyt.a(this.c);
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new pbr();
                    }
                    nyt.a(this.b);
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
