package p000;

public final class ops extends nyx<ops> {
    public Integer f33588a;
    public String f33589b;
    public Boolean f33590c;

    public /* synthetic */ nzf m39092a(nyt nyt) {
        return m39090b(nyt);
    }

    public ops() {
        m39091d();
    }

    private ops m39091d() {
        this.f33589b = null;
        this.f33590c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39093a(nyu nyu) {
        if (this.f33588a != null) {
            nyu.m37168a(1, this.f33588a.intValue());
        }
        if (this.f33589b != null) {
            nyu.m37170a(2, this.f33589b);
        }
        if (this.f33590c != null) {
            nyu.m37172a(3, this.f33590c.booleanValue());
        }
        super.a(nyu);
    }

    protected int m39094b() {
        int b = super.b();
        if (this.f33588a != null) {
            b += nyu.m37147f(1, this.f33588a.intValue());
        }
        if (this.f33589b != null) {
            b += nyu.m37137b(2, this.f33589b);
        }
        if (this.f33590c == null) {
            return b;
        }
        this.f33590c.booleanValue();
        return b + (nyu.m37154h(3) + 1);
    }

    private ops m39090b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 0:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                            this.f33588a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case wi.dH /*18*/:
                    this.f33589b = nyt.m37117j();
                    continue;
                case wi.dA /*24*/:
                    this.f33590c = Boolean.valueOf(nyt.m37116i());
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
