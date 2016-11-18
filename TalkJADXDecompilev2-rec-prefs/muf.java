package p000;

public final class muf extends nyx<muf> {
    public mug f28347a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32930b(nyt);
    }

    public muf() {
        m32931d();
    }

    private muf m32931d() {
        this.f28347a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28347a != null) {
            nyu.b(15, this.f28347a);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28347a != null) {
            return b + nyu.d(15, this.f28347a);
        }
        return b;
    }

    private muf m32930b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 122:
                    if (this.f28347a == null) {
                        this.f28347a = new mug();
                    }
                    nyt.a(this.f28347a);
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
