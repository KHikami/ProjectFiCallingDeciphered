package p000;

public final class oyi extends nyx<oyi> {
    public Float f34633a;
    public Float f34634b;
    public Float f34635c;

    public /* synthetic */ nzf m39907a(nyt nyt) {
        return m39905b(nyt);
    }

    public oyi() {
        m39906d();
    }

    private oyi m39906d() {
        this.f34633a = null;
        this.f34634b = null;
        this.f34635c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39908a(nyu nyu) {
        if (this.f34633a != null) {
            nyu.m37167a(1, this.f34633a.floatValue());
        }
        if (this.f34634b != null) {
            nyu.m37167a(2, this.f34634b.floatValue());
        }
        if (this.f34635c != null) {
            nyu.m37167a(3, this.f34635c.floatValue());
        }
        super.a(nyu);
    }

    protected int m39909b() {
        int b = super.b();
        if (this.f34633a != null) {
            this.f34633a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f34634b != null) {
            this.f34634b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f34635c == null) {
            return b;
        }
        this.f34635c.floatValue();
        return b + (nyu.m37154h(3) + 4);
    }

    private oyi m39905b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f34633a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f34634b = Float.valueOf(nyt.m37106c());
                    continue;
                case 29:
                    this.f34635c = Float.valueOf(nyt.m37106c());
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
