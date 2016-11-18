package p000;

public final class kzc extends nyx<kzc> {
    public Integer f24182a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m28196b(nyt);
    }

    public kzc() {
        m28197d();
    }

    private kzc m28197d() {
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f24182a != null) {
            nyu.a(1, this.f24182a.intValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f24182a != null) {
            return b + nyu.f(1, this.f24182a.intValue());
        }
        return b;
    }

    private kzc m28196b(nyt nyt) {
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
                            this.f24182a = Integer.valueOf(a);
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
