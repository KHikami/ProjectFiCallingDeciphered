package p000;

public final class mug extends nyx<mug> {
    public muh f28348a;
    private int f28349b;
    private boolean f28350c;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m32935b(nyt);
    }

    public mug() {
        m32936d();
    }

    private mug m32936d() {
        this.f28349b = 0;
        this.f28348a = null;
        this.f28350c = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28348a != null) {
            nyu.b(1, this.f28348a);
        }
        if ((this.f28349b & 1) != 0) {
            nyu.a(2, this.f28350c);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28348a != null) {
            b += nyu.d(1, this.f28348a);
        }
        if ((this.f28349b & 1) == 0) {
            return b;
        }
        boolean z = this.f28350c;
        return b + (nyu.h(2) + 1);
    }

    private mug m32935b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f28348a == null) {
                        this.f28348a = new muh();
                    }
                    nyt.a(this.f28348a);
                    continue;
                case 16:
                    this.f28350c = nyt.i();
                    this.f28349b |= 1;
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
