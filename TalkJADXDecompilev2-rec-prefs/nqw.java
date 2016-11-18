package p000;

public final class nqw extends nyx<nqw> {
    public String f30530a;

    public /* synthetic */ nzf m36205a(nyt nyt) {
        return m36204b(nyt);
    }

    public nqw() {
        this.f30530a = null;
        this.cachedSize = -1;
    }

    public void m36206a(nyu nyu) {
        if (this.f30530a != null) {
            nyu.m37170a(1, this.f30530a);
        }
        super.a(nyu);
    }

    protected int m36207b() {
        int b = super.b();
        if (this.f30530a != null) {
            return b + nyu.m37137b(1, this.f30530a);
        }
        return b;
    }

    private nqw m36204b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f30530a = nyt.m37117j();
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
