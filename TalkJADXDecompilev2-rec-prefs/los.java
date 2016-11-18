package p000;

public final class los extends nyx<los> {
    public lom f25932a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m29796b(nyt);
    }

    public los() {
        m29797d();
    }

    private los m29797d() {
        this.f25932a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f25932a != null) {
            nyu.b(1, this.f25932a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f25932a != null) {
            return b + nyu.d(1, this.f25932a);
        }
        return b;
    }

    private los m29796b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f25932a == null) {
                        this.f25932a = new lom();
                    }
                    nyt.a(this.f25932a);
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
