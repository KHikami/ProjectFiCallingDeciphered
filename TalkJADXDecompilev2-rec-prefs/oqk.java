package p000;

public final class oqk extends nyx<oqk> {
    private static volatile oqk[] f33758c;
    public mud f33759a;
    public Float f33760b;

    public /* synthetic */ nzf m39188a(nyt nyt) {
        return m39185b(nyt);
    }

    public static oqk[] m39186d() {
        if (f33758c == null) {
            synchronized (nzc.f31309c) {
                if (f33758c == null) {
                    f33758c = new oqk[0];
                }
            }
        }
        return f33758c;
    }

    public oqk() {
        m39187g();
    }

    private oqk m39187g() {
        this.f33759a = null;
        this.f33760b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39189a(nyu nyu) {
        if (this.f33759a != null) {
            nyu.m37182b(1, this.f33759a);
        }
        if (this.f33760b != null) {
            nyu.m37167a(2, this.f33760b.floatValue());
        }
        super.a(nyu);
    }

    protected int m39190b() {
        int b = super.b();
        if (this.f33759a != null) {
            b += nyu.m37145d(1, this.f33759a);
        }
        if (this.f33760b == null) {
            return b;
        }
        this.f33760b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private oqk m39185b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33759a == null) {
                        this.f33759a = new mud();
                    }
                    nyt.m37101a(this.f33759a);
                    continue;
                case 21:
                    this.f33760b = Float.valueOf(nyt.m37106c());
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
