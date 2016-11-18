package defpackage;

public final class lzh extends nyx<lzh> {
    private static volatile lzh[] c;
    public String a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static lzh[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new lzh[0];
                }
            }
        }
        return c;
    }

    public lzh() {
        g();
    }

    private lzh g() {
        this.a = null;
        this.b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.b(2, this.b);
        }
        return b;
    }

    private lzh b(nyt nyt) {
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
