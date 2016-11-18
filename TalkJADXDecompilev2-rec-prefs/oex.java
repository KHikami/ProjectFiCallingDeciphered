package p000;

public final class oex extends nyx<oex> {
    public oer f32498a;
    public oeq f32499b;

    public /* synthetic */ nzf m38010a(nyt nyt) {
        return m38008b(nyt);
    }

    public oex() {
        m38009d();
    }

    private oex m38009d() {
        this.f32498a = null;
        this.f32499b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38011a(nyu nyu) {
        if (this.f32498a != null) {
            nyu.m37182b(1, this.f32498a);
        }
        if (this.f32499b != null) {
            nyu.m37182b(2, this.f32499b);
        }
        super.a(nyu);
    }

    protected int m38012b() {
        int b = super.b();
        if (this.f32498a != null) {
            b += nyu.m37145d(1, this.f32498a);
        }
        if (this.f32499b != null) {
            return b + nyu.m37145d(2, this.f32499b);
        }
        return b;
    }

    private oex m38008b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32498a == null) {
                        this.f32498a = new oer();
                    }
                    nyt.m37101a(this.f32498a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f32499b == null) {
                        this.f32499b = new oeq();
                    }
                    nyt.m37101a(this.f32499b);
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
