package p000;

public final class oew extends nyx<oew> {
    public oex f32496a;
    public oey f32497b;

    public /* synthetic */ nzf m38005a(nyt nyt) {
        return m38003b(nyt);
    }

    public oew() {
        m38004d();
    }

    private oew m38004d() {
        this.f32496a = null;
        this.f32497b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38006a(nyu nyu) {
        if (this.f32496a != null) {
            nyu.m37182b(1, this.f32496a);
        }
        if (this.f32497b != null) {
            nyu.m37182b(2, this.f32497b);
        }
        super.a(nyu);
    }

    protected int m38007b() {
        int b = super.b();
        if (this.f32496a != null) {
            b += nyu.m37145d(1, this.f32496a);
        }
        if (this.f32497b != null) {
            return b + nyu.m37145d(2, this.f32497b);
        }
        return b;
    }

    private oew m38003b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32496a == null) {
                        this.f32496a = new oex();
                    }
                    nyt.m37101a(this.f32496a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32497b == null) {
                        this.f32497b = new oey();
                    }
                    nyt.m37101a(this.f32497b);
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
