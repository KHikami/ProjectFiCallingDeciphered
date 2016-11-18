package p000;

public final class pbu extends nyx<pbu> {
    public String f34979a;

    public /* synthetic */ nzf m40237a(nyt nyt) {
        return m40236b(nyt);
    }

    public pbu() {
        this.f34979a = null;
        this.cachedSize = -1;
    }

    public void m40238a(nyu nyu) {
        if (this.f34979a != null) {
            nyu.m37170a(1, this.f34979a);
        }
        super.a(nyu);
    }

    protected int m40239b() {
        int b = super.b();
        if (this.f34979a != null) {
            return b + nyu.m37137b(1, this.f34979a);
        }
        return b;
    }

    private pbu m40236b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f34979a = nyt.m37117j();
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
