package p000;

public final class nsn extends nyx<nsn> {
    public nsq f30715a;

    public /* synthetic */ nzf m36383a(nyt nyt) {
        return m36382b(nyt);
    }

    public nsn() {
        this.cachedSize = -1;
    }

    public void m36384a(nyu nyu) {
        if (this.f30715a != null) {
            nyu.m37182b(1, this.f30715a);
        }
        super.a(nyu);
    }

    protected int m36385b() {
        int b = super.b();
        if (this.f30715a != null) {
            return b + nyu.m37145d(1, this.f30715a);
        }
        return b;
    }

    private nsn m36382b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f30715a == null) {
                        this.f30715a = new nsq();
                    }
                    nyt.m37101a(this.f30715a);
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
