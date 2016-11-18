package defpackage;

public final class onk extends nyx<onk> {
    private static volatile onk[] c;
    public Integer a;
    public onp b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public static onk[] d() {
        if (c == null) {
            synchronized (nzc.c) {
                if (c == null) {
                    c = new onk[0];
                }
            }
        }
        return c;
    }

    public onk() {
        this.a = null;
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.a(1, this.a.intValue());
        }
        if (this.b != null) {
            nyu.b(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            b += nyu.f(1, this.a.intValue());
        }
        if (this.b != null) {
            return b + nyu.d(2, this.b);
        }
        return b;
    }

    private onk b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.a = Integer.valueOf(nyt.f());
                    continue;
                case wi.dH /*18*/:
                    if (this.b == null) {
                        this.b = new onp();
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
