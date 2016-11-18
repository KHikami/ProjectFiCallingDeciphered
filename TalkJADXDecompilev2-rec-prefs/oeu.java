package p000;

public final class oeu extends nyx<oeu> {
    public String f32490a;

    public /* synthetic */ nzf m37995a(nyt nyt) {
        return m37993b(nyt);
    }

    public oeu() {
        m37994d();
    }

    private oeu m37994d() {
        this.f32490a = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m37996a(nyu nyu) {
        if (!(this.f32490a == null || this.f32490a.equals(""))) {
            nyu.m37170a(1, this.f32490a);
        }
        super.a(nyu);
    }

    protected int m37997b() {
        int b = super.b();
        if (this.f32490a == null || this.f32490a.equals("")) {
            return b;
        }
        return b + nyu.m37137b(1, this.f32490a);
    }

    private oeu m37993b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32490a = nyt.m37117j();
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
