package p000;

public final class ofo extends nyx<ofo> {
    public String f32653a;

    public /* synthetic */ nzf m38087a(nyt nyt) {
        return m38086b(nyt);
    }

    public ofo() {
        this.f32653a = null;
        this.cachedSize = -1;
    }

    public void m38088a(nyu nyu) {
        if (this.f32653a != null) {
            nyu.m37170a(1, this.f32653a);
        }
        super.a(nyu);
    }

    protected int m38089b() {
        int b = super.b();
        if (this.f32653a != null) {
            return b + nyu.m37137b(1, this.f32653a);
        }
        return b;
    }

    private ofo m38086b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32653a = nyt.m37117j();
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
