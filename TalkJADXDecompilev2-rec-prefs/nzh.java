package p000;

public final class nzh extends nyx<nzh> {
    private static volatile nzh[] f31312c;
    public String f31313a;
    public nzk f31314b;

    public /* synthetic */ nzf m37249a(nyt nyt) {
        return m37247b(nyt);
    }

    public static nzh[] m37248d() {
        if (f31312c == null) {
            synchronized (nzc.f31309c) {
                if (f31312c == null) {
                    f31312c = new nzh[0];
                }
            }
        }
        return f31312c;
    }

    public nzh() {
        this.f31313a = null;
        this.cachedSize = -1;
    }

    public void m37250a(nyu nyu) {
        if (this.f31313a != null) {
            nyu.m37170a(1, this.f31313a);
        }
        if (this.f31314b != null) {
            nyu.m37182b(2, this.f31314b);
        }
        super.a(nyu);
    }

    protected int m37251b() {
        int b = super.b();
        if (this.f31313a != null) {
            b += nyu.m37137b(1, this.f31313a);
        }
        if (this.f31314b != null) {
            return b + nyu.m37145d(2, this.f31314b);
        }
        return b;
    }

    private nzh m37247b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f31313a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f31314b == null) {
                        this.f31314b = new nzk();
                    }
                    nyt.m37101a(this.f31314b);
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
