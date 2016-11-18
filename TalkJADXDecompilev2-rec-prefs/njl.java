package p000;

public final class njl extends nyx<njl> {
    public Long f29994a;
    public Long f29995b;

    public /* synthetic */ nzf m35239a(nyt nyt) {
        return m35237b(nyt);
    }

    public njl() {
        m35238d();
    }

    private njl m35238d() {
        this.f29994a = null;
        this.f29995b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35240a(nyu nyu) {
        if (this.f29994a != null) {
            nyu.m37181b(1, this.f29994a.longValue());
        }
        if (this.f29995b != null) {
            nyu.m37181b(2, this.f29995b.longValue());
        }
        super.a(nyu);
    }

    protected int m35241b() {
        int b = super.b();
        if (this.f29994a != null) {
            b += nyu.m37148f(1, this.f29994a.longValue());
        }
        if (this.f29995b != null) {
            return b + nyu.m37148f(2, this.f29995b.longValue());
        }
        return b;
    }

    private njl m35237b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29994a = Long.valueOf(nyt.m37110e());
                    continue;
                case 16:
                    this.f29995b = Long.valueOf(nyt.m37110e());
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
