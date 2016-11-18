package p000;

public final class oic extends nyx<oic> {
    public Integer f32959a;
    public Integer f32960b;
    public ohq f32961c;

    public /* synthetic */ nzf m38449a(nyt nyt) {
        return m38447b(nyt);
    }

    public oic() {
        m38448d();
    }

    private oic m38448d() {
        this.f32959a = null;
        this.f32960b = null;
        this.f32961c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38450a(nyu nyu) {
        if (this.f32959a != null) {
            nyu.m37168a(1, this.f32959a.intValue());
        }
        if (this.f32960b != null) {
            nyu.m37168a(2, this.f32960b.intValue());
        }
        if (this.f32961c != null) {
            nyu.m37182b(3, this.f32961c);
        }
        super.a(nyu);
    }

    protected int m38451b() {
        int b = super.b();
        if (this.f32959a != null) {
            b += nyu.m37147f(1, this.f32959a.intValue());
        }
        if (this.f32960b != null) {
            b += nyu.m37147f(2, this.f32960b.intValue());
        }
        if (this.f32961c != null) {
            return b + nyu.m37145d(3, this.f32961c);
        }
        return b;
    }

    private oic m38447b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32959a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f32960b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dx /*26*/:
                    if (this.f32961c == null) {
                        this.f32961c = new ohq();
                    }
                    nyt.m37101a(this.f32961c);
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
