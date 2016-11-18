package defpackage;

public final class oeu extends nyx<oeu> {
    public String a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public oeu() {
        d();
    }

    private oeu d() {
        this.a = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (!(this.a == null || this.a.equals(""))) {
            nyu.a(1, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a == null || this.a.equals("")) {
            return b;
        }
        return b + nyu.b(1, this.a);
    }

    private oeu b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = nyt.j();
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
