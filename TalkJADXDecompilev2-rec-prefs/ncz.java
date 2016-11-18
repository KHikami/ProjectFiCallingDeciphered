package p000;

public final class ncz extends nyx<ncz> {
    public nou f29541a;

    public /* synthetic */ nzf m34377a(nyt nyt) {
        return m34376b(nyt);
    }

    public ncz() {
        this.cachedSize = -1;
    }

    public void m34378a(nyu nyu) {
        if (this.f29541a != null) {
            nyu.m37182b(1, this.f29541a);
        }
        super.a(nyu);
    }

    protected int m34379b() {
        int b = super.b();
        if (this.f29541a != null) {
            return b + nyu.m37145d(1, this.f29541a);
        }
        return b;
    }

    private ncz m34376b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f29541a == null) {
                        this.f29541a = new nou();
                    }
                    nyt.m37101a(this.f29541a);
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
