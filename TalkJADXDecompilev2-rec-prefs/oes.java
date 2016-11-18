package p000;

public final class oes extends nyx<oes> {
    public oeu f32483a;
    public oet f32484b;

    public /* synthetic */ nzf m37985a(nyt nyt) {
        return m37983b(nyt);
    }

    public oes() {
        m37984d();
    }

    private oes m37984d() {
        this.f32483a = null;
        this.f32484b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37986a(nyu nyu) {
        if (this.f32483a != null) {
            nyu.m37182b(1, this.f32483a);
        }
        if (this.f32484b != null) {
            nyu.m37182b(2, this.f32484b);
        }
        super.a(nyu);
    }

    protected int m37987b() {
        int b = super.b();
        if (this.f32483a != null) {
            b += nyu.m37145d(1, this.f32483a);
        }
        if (this.f32484b != null) {
            return b + nyu.m37145d(2, this.f32484b);
        }
        return b;
    }

    private oes m37983b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32483a == null) {
                        this.f32483a = new oeu();
                    }
                    nyt.m37101a(this.f32483a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32484b == null) {
                        this.f32484b = new oet();
                    }
                    nyt.m37101a(this.f32484b);
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
