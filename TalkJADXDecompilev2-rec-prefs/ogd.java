package p000;

public final class ogd extends nyx<ogd> {
    public ogf f32700a;
    public oge f32701b;
    public Double f32702c;

    public /* synthetic */ nzf m38162a(nyt nyt) {
        return m38160b(nyt);
    }

    public ogd() {
        m38161d();
    }

    private ogd m38161d() {
        this.f32700a = null;
        this.f32701b = null;
        this.f32702c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38163a(nyu nyu) {
        if (this.f32700a != null) {
            nyu.m37182b(1, this.f32700a);
        }
        if (this.f32701b != null) {
            nyu.m37182b(2, this.f32701b);
        }
        if (this.f32702c != null) {
            nyu.m37166a(3, this.f32702c.doubleValue());
        }
        super.a(nyu);
    }

    protected int m38164b() {
        int b = super.b();
        if (this.f32700a != null) {
            b += nyu.m37145d(1, this.f32700a);
        }
        if (this.f32701b != null) {
            b += nyu.m37145d(2, this.f32701b);
        }
        if (this.f32702c == null) {
            return b;
        }
        this.f32702c.doubleValue();
        return b + (nyu.m37154h(3) + 8);
    }

    private ogd m38160b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32700a == null) {
                        this.f32700a = new ogf();
                    }
                    nyt.m37101a(this.f32700a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32701b == null) {
                        this.f32701b = new oge();
                    }
                    nyt.m37101a(this.f32701b);
                    continue;
                case wi.dz /*25*/:
                    this.f32702c = Double.valueOf(nyt.m37104b());
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
