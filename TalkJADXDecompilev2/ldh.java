package defpackage;

public final class ldh extends nyx<ldh> {
    private static volatile ldh[] e;
    public String a;
    public ldg b;
    public lde c;
    public ldi d;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static ldh[] d() {
        if (e == null) {
            synchronized (nzc.c) {
                if (e == null) {
                    e = new ldh[0];
                }
            }
        }
        return e;
    }

    public ldh() {
        g();
    }

    private ldh g() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.c != null) {
            nyu.b(2, this.c);
        }
        if (this.d != null) {
            nyu.b(3, this.d);
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
        if (this.c != null) {
            b += nyu.d(2, this.c);
        }
        if (this.d != null) {
            b += nyu.d(3, this.d);
        }
        if (this.b != null) {
            return b + nyu.d(4, this.b);
        }
        return b;
    }

    private ldh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.c == null) {
                        this.c = new lde();
                    }
                    nyt.a(this.c);
                    continue;
                case wi.dx /*26*/:
                    if (this.d == null) {
                        this.d = new ldi();
                    }
                    nyt.a(this.d);
                    continue;
                case 34:
                    if (this.b == null) {
                        this.b = new ldg();
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
