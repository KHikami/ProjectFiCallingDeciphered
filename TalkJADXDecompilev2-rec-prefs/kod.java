package p000;

public final class kod extends nyx<kod> {
    public odm f22478a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26766b(nyt);
    }

    public kod() {
        this.cachedSize = -1;
    }

    public void mo146a(nyu nyu) {
        if (this.f22478a != null) {
            nyu.b(1, this.f22478a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22478a != null) {
            return b + nyu.d(1, this.f22478a);
        }
        return b;
    }

    private kod m26766b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22478a == null) {
                        this.f22478a = new odm();
                    }
                    nyt.a(this.f22478a);
                    continue;
                default:
                    if (!super.m1039a(nyt, a)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }
}
