package p000;

public final class oia extends nyx<oia> {
    public ohy f32952a;
    public ohu f32953b;

    public /* synthetic */ nzf m38439a(nyt nyt) {
        return m38437b(nyt);
    }

    public oia() {
        m38438d();
    }

    private oia m38438d() {
        this.f32952a = null;
        this.f32953b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38440a(nyu nyu) {
        if (this.f32952a != null) {
            nyu.m37182b(2, this.f32952a);
        }
        if (this.f32953b != null) {
            nyu.m37182b(3, this.f32953b);
        }
        super.a(nyu);
    }

    protected int m38441b() {
        int b = super.b();
        if (this.f32952a != null) {
            b += nyu.m37145d(2, this.f32952a);
        }
        if (this.f32953b != null) {
            return b + nyu.m37145d(3, this.f32953b);
        }
        return b;
    }

    private oia m38437b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.f32952a == null) {
                        this.f32952a = new ohy();
                    }
                    nyt.m37101a(this.f32952a);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32953b == null) {
                        this.f32953b = new ohu();
                    }
                    nyt.m37101a(this.f32953b);
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
