package defpackage;

public final class nsx extends nyx<nsx> {
    public nsy a;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public nsx() {
        this.cachedSize = -1;
    }

    public void a(nyu nyu) {
        if (this.a != null) {
            nyu.b(2, this.a);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != null) {
            return b + nyu.d(2, this.a);
        }
        return b;
    }

    private nsx b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case wi.dH /*18*/:
                    if (this.a == null) {
                        this.a = new nsy();
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
