package p000;

public final class oco extends nyx<oco> {
    public String f32279a;
    public ock f32280b;
    public ock f32281c;

    public /* synthetic */ nzf m37767a(nyt nyt) {
        return m37766b(nyt);
    }

    public oco() {
        this.f32279a = null;
        this.cachedSize = -1;
    }

    public void m37768a(nyu nyu) {
        if (this.f32279a != null) {
            nyu.m37170a(1, this.f32279a);
        }
        if (this.f32280b != null) {
            nyu.m37182b(2, this.f32280b);
        }
        if (this.f32281c != null) {
            nyu.m37182b(3, this.f32281c);
        }
        super.a(nyu);
    }

    protected int m37769b() {
        int b = super.b();
        if (this.f32279a != null) {
            b += nyu.m37137b(1, this.f32279a);
        }
        if (this.f32280b != null) {
            b += nyu.m37145d(2, this.f32280b);
        }
        if (this.f32281c != null) {
            return b + nyu.m37145d(3, this.f32281c);
        }
        return b;
    }

    private oco m37766b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32279a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32280b == null) {
                        this.f32280b = new ock();
                    }
                    nyt.m37101a(this.f32280b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f32281c == null) {
                        this.f32281c = new ock();
                    }
                    nyt.m37101a(this.f32281c);
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
