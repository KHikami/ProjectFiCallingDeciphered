package p000;

public final class onk extends nyx<onk> {
    private static volatile onk[] f33310c;
    public Integer f33311a;
    public onp f33312b;

    public /* synthetic */ nzf m38808a(nyt nyt) {
        return m38806b(nyt);
    }

    public static onk[] m38807d() {
        if (f33310c == null) {
            synchronized (nzc.f31309c) {
                if (f33310c == null) {
                    f33310c = new onk[0];
                }
            }
        }
        return f33310c;
    }

    public onk() {
        this.f33311a = null;
        this.cachedSize = -1;
    }

    public void m38809a(nyu nyu) {
        if (this.f33311a != null) {
            nyu.m37168a(1, this.f33311a.intValue());
        }
        if (this.f33312b != null) {
            nyu.m37182b(2, this.f33312b);
        }
        super.a(nyu);
    }

    protected int m38810b() {
        int b = super.b();
        if (this.f33311a != null) {
            b += nyu.m37147f(1, this.f33311a.intValue());
        }
        if (this.f33312b != null) {
            return b + nyu.m37145d(2, this.f33312b);
        }
        return b;
    }

    private onk m38806b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f33311a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    if (this.f33312b == null) {
                        this.f33312b = new onp();
                    }
                    nyt.m37101a(this.f33312b);
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
