package defpackage;

public final class oha extends nyx<oha> {
    public ogo a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oha() {
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(4, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.d(4, this.a);
        }
        return b;
    }

    private oha b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 34:
                    if (this.a == null) {
                        this.a = new ogo();
                    }
                    nyt.a(this.a);
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
