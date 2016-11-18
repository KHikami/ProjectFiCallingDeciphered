package p000;

public final class lpb extends nyx<lpb> {
    public lpf f25984a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29857b(nyt);
    }

    public lpb() {
        m29858d();
    }

    private lpb m29858d() {
        this.f25984a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25984a != null) {
            nyu.b(1, this.f25984a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25984a != null) {
            return b + nyu.d(1, this.f25984a);
        }
        return b;
    }

    private lpb m29857b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25984a == null) {
                        this.f25984a = new lpf();
                    }
                    nyt.a(this.f25984a);
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
