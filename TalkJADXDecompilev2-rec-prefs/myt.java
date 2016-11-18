package p000;

public final class myt extends nyx<myt> {
    private static volatile myt[] f29176c;
    public String f29177a;
    public nap f29178b;

    public /* synthetic */ nzf m33860a(nyt nyt) {
        return m33857b(nyt);
    }

    public static myt[] m33858d() {
        if (f29176c == null) {
            synchronized (nzc.f31309c) {
                if (f29176c == null) {
                    f29176c = new myt[0];
                }
            }
        }
        return f29176c;
    }

    public myt() {
        m33859g();
    }

    private myt m33859g() {
        this.f29177a = null;
        this.f29178b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33861a(nyu nyu) {
        if (this.f29177a != null) {
            nyu.m37170a(1, this.f29177a);
        }
        if (this.f29178b != null) {
            nyu.m37182b(2, this.f29178b);
        }
        super.a(nyu);
    }

    protected int m33862b() {
        int b = super.b();
        if (this.f29177a != null) {
            b += nyu.m37137b(1, this.f29177a);
        }
        if (this.f29178b != null) {
            return b + nyu.m37145d(2, this.f29178b);
        }
        return b;
    }

    private myt m33857b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f29177a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f29178b == null) {
                        this.f29178b = new nap();
                    }
                    nyt.m37101a(this.f29178b);
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
