package defpackage;

public final class nzh extends nyx<nzh> {
    private static volatile nzh[] c;
    public String a;
    public nzk b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static nzh[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new nzh[0];
                }
            }
        }
        return c;
    }

    public nzh() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a);
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.b(1, this.a);
        }
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private nzh b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new nzk();
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
