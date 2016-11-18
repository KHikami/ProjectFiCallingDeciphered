package p000;

public final class mvw extends nyx<mvw> {
    public int f28524a;
    public boolean f28525b;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m33145b(nyt);
    }

    public mvw() {
        m33146d();
    }

    private mvw m33146d() {
        this.f28524a = 0;
        this.f28525b = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f28524a != 0) {
            nyu.a(1, this.f28524a);
        }
        if (this.f28525b) {
            nyu.a(2, this.f28525b);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f28524a != 0) {
            b += nyu.f(1, this.f28524a);
        }
        if (!this.f28525b) {
            return b;
        }
        boolean z = this.f28525b;
        return b + (nyu.h(2) + 1);
    }

    private mvw m33145b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.f();
                    switch (a) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            this.f28524a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.f28525b = nyt.i();
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
