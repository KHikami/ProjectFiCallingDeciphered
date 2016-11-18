package p000;

public final class opn extends nyx<opn> {
    public opq f33569a;
    public opo f33570b;

    public /* synthetic */ nzf m39066a(nyt nyt) {
        return m39064b(nyt);
    }

    public opn() {
        m39065d();
    }

    private opn m39065d() {
        this.f33569a = null;
        this.f33570b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39067a(nyu nyu) {
        if (this.f33569a != null) {
            nyu.m37182b(1, this.f33569a);
        }
        if (this.f33570b != null) {
            nyu.m37182b(2, this.f33570b);
        }
        super.a(nyu);
    }

    protected int m39068b() {
        int b = super.b();
        if (this.f33569a != null) {
            b += nyu.m37145d(1, this.f33569a);
        }
        if (this.f33570b != null) {
            return b + nyu.m37145d(2, this.f33570b);
        }
        return b;
    }

    private opn m39064b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33569a == null) {
                        this.f33569a = new opq();
                    }
                    nyt.m37101a(this.f33569a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f33570b == null) {
                        this.f33570b = new opo();
                    }
                    nyt.m37101a(this.f33570b);
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
