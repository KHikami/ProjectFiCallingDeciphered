package p000;

public final class nrq extends nyx<nrq> {
    public Integer f30614a;
    public Integer f30615b;

    public /* synthetic */ nzf m36289a(nyt nyt) {
        return m36288b(nyt);
    }

    public nrq() {
        this.f30614a = null;
        this.f30615b = null;
        this.cachedSize = -1;
    }

    public void m36290a(nyu nyu) {
        if (this.f30614a != null) {
            nyu.m37180b(1, this.f30614a.intValue());
        }
        if (this.f30615b != null) {
            nyu.m37180b(2, this.f30615b.intValue());
        }
        super.a(nyu);
    }

    protected int m36291b() {
        int b = super.b();
        if (this.f30614a != null) {
            this.f30614a.intValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f30615b == null) {
            return b;
        }
        this.f30615b.intValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private nrq m36288b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f30614a = Integer.valueOf(nyt.m37115h());
                    continue;
                case 21:
                    this.f30615b = Integer.valueOf(nyt.m37115h());
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
