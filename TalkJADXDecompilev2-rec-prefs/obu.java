package p000;

public final class obu extends nyx<obu> {
    public nzu f32059a;

    public /* synthetic */ nzf m37673a(nyt nyt) {
        return m37672b(nyt);
    }

    public obu() {
        this.cachedSize = -1;
    }

    public void m37674a(nyu nyu) {
        if (this.f32059a != null) {
            nyu.m37182b(1, this.f32059a);
        }
        super.a(nyu);
    }

    protected int m37675b() {
        int b = super.b();
        if (this.f32059a != null) {
            return b + nyu.m37145d(1, this.f32059a);
        }
        return b;
    }

    private obu m37672b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32059a == null) {
                        this.f32059a = new nzu();
                    }
                    nyt.m37101a(this.f32059a);
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
