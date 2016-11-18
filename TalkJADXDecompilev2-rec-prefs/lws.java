package p000;

public final class lws extends nyx<lws> {
    public Integer f26724a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m30913b(nyt);
    }

    public lws() {
        m30914d();
    }

    private lws m30914d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f26724a != null) {
            nyu.a(1, this.f26724a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f26724a != null) {
            return b + nyu.f(1, this.f26724a.intValue());
        }
        return b;
    }

    private lws m30913b(nyt nyt) {
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
                            this.f26724a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
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
