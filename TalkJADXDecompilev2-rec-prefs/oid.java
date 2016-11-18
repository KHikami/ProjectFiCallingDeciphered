package p000;

public final class oid extends nyx<oid> {
    public String f32962a;
    public ohu f32963b;
    public Integer f32964c;
    public oif f32965d;

    public /* synthetic */ nzf m38454a(nyt nyt) {
        return m38452b(nyt);
    }

    public oid() {
        m38453d();
    }

    private oid m38453d() {
        this.f32962a = null;
        this.f32963b = null;
        this.f32964c = null;
        this.f32965d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38455a(nyu nyu) {
        if (this.f32962a != null) {
            nyu.m37170a(1, this.f32962a);
        }
        if (this.f32963b != null) {
            nyu.m37182b(2, this.f32963b);
        }
        if (this.f32964c != null) {
            nyu.m37168a(3, this.f32964c.intValue());
        }
        if (this.f32965d != null) {
            nyu.m37182b(4, this.f32965d);
        }
        super.a(nyu);
    }

    protected int m38456b() {
        int b = super.b();
        if (this.f32962a != null) {
            b += nyu.m37137b(1, this.f32962a);
        }
        if (this.f32963b != null) {
            b += nyu.m37145d(2, this.f32963b);
        }
        if (this.f32964c != null) {
            b += nyu.m37147f(3, this.f32964c.intValue());
        }
        if (this.f32965d != null) {
            return b + nyu.m37145d(4, this.f32965d);
        }
        return b;
    }

    private oid m38452b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32962a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32963b == null) {
                        this.f32963b = new ohu();
                    }
                    nyt.m37101a(this.f32963b);
                    continue;
                case wi.dA /*24*/:
                    this.f32964c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    if (this.f32965d == null) {
                        this.f32965d = new oif();
                    }
                    nyt.m37101a(this.f32965d);
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
