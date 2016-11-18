package p000;

public final class oha extends nyx<oha> {
    public ogo f32811a;

    public /* synthetic */ nzf m38310a(nyt nyt) {
        return m38309b(nyt);
    }

    public oha() {
        this.cachedSize = -1;
    }

    public void m38311a(nyu nyu) {
        if (this.f32811a != null) {
            nyu.m37182b(4, this.f32811a);
        }
        super.a(nyu);
    }

    protected int m38312b() {
        int b = super.b();
        if (this.f32811a != null) {
            return b + nyu.m37145d(4, this.f32811a);
        }
        return b;
    }

    private oha m38309b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.f32811a == null) {
                        this.f32811a = new ogo();
                    }
                    nyt.m37101a(this.f32811a);
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
