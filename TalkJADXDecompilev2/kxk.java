package defpackage;

public final class kxk extends nyx<kxk> {
    private static volatile kxk[] c;
    public String a;
    public String b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static kxk[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new kxk[0];
                }
            }
        }
        return c;
    }

    public kxk() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
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

    private kxk b(nyt nyt) {
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
