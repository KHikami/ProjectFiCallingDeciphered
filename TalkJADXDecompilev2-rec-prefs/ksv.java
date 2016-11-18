package p000;

public final class ksv extends nyx<ksv> {
    public Long f23166a;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m27379b(nyt);
    }

    public ksv() {
        m27380d();
    }

    private ksv m27380d() {
        this.f23166a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f23166a != null) {
            nyu.b(1, this.f23166a.longValue());
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f23166a != null) {
            return b + nyu.f(1, this.f23166a.longValue());
        }
        return b;
    }

    private ksv m27379b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f23166a = Long.valueOf(nyt.e());
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
