package defpackage;

public final class mvw extends nyx<mvw> {
    public int a;
    public boolean b;

    public /* synthetic */ nzf a(nyt nyt) {
        return b(nyt);
    }

    public mvw() {
        d();
    }

    private mvw d() {
        this.a = 0;
        this.b = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void a(nyu nyu) {
        if (this.a != 0) {
            nyu.a(1, this.a);
        }
        if (this.b) {
            nyu.a(2, this.b);
        }
        super.a(nyu);
    }

    protected int b() {
        int b = super.b();
        if (this.a != 0) {
            b += nyu.f(1, this.a);
        }
        if (!this.b) {
            return b;
        }
        boolean z = this.b;
        return b + (nyu.h(2) + 1);
    }

    private mvw b(nyt nyt) {
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
                            this.a = a;
                            break;
                        default:
                            continue;
                    }
                case 16:
                    this.b = nyt.i();
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
