package p000;

public final class nam extends nyx<nam> {
    private static volatile nam[] f29370c;
    public Float f29371a;
    public Float f29372b;

    public /* synthetic */ nzf m34067a(nyt nyt) {
        return m34064b(nyt);
    }

    public static nam[] m34065d() {
        if (f29370c == null) {
            synchronized (nzc.f31309c) {
                if (f29370c == null) {
                    f29370c = new nam[0];
                }
            }
        }
        return f29370c;
    }

    public nam() {
        m34066g();
    }

    private nam m34066g() {
        this.f29371a = null;
        this.f29372b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m34068a(nyu nyu) {
        if (this.f29371a != null) {
            nyu.m37167a(1, this.f29371a.floatValue());
        }
        if (this.f29372b != null) {
            nyu.m37167a(2, this.f29372b.floatValue());
        }
        super.a(nyu);
    }

    protected int m34069b() {
        int b = super.b();
        if (this.f29371a != null) {
            this.f29371a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f29372b == null) {
            return b;
        }
        this.f29372b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private nam m34064b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f29371a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f29372b = Float.valueOf(nyt.m37106c());
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
