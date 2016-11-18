package p000;

public final class ohl extends nyx<ohl> {
    private static volatile ohl[] f32886d;
    public String f32887a;
    public ohj f32888b;
    public Long f32889c;

    public /* synthetic */ nzf m38358a(nyt nyt) {
        return m38356b(nyt);
    }

    public static ohl[] m38357d() {
        if (f32886d == null) {
            synchronized (nzc.f31309c) {
                if (f32886d == null) {
                    f32886d = new ohl[0];
                }
            }
        }
        return f32886d;
    }

    public ohl() {
        this.f32887a = null;
        this.f32889c = null;
        this.cachedSize = -1;
    }

    public void m38359a(nyu nyu) {
        nyu.m37170a(1, this.f32887a);
        if (this.f32888b != null) {
            nyu.m37182b(2, this.f32888b);
        }
        if (this.f32889c != null) {
            nyu.m37181b(3, this.f32889c.longValue());
        }
        super.a(nyu);
    }

    protected int m38360b() {
        int b = super.b() + nyu.m37137b(1, this.f32887a);
        if (this.f32888b != null) {
            b += nyu.m37145d(2, this.f32888b);
        }
        if (this.f32889c != null) {
            return b + nyu.m37148f(3, this.f32889c.longValue());
        }
        return b;
    }

    private ohl m38356b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32887a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32888b == null) {
                        this.f32888b = new ohj();
                    }
                    nyt.m37101a(this.f32888b);
                    continue;
                case wi.dA /*24*/:
                    this.f32889c = Long.valueOf(nyt.m37110e());
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
