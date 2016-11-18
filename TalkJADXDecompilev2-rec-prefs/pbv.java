package p000;

public final class pbv extends nyx<pbv> {
    public pbn f34980a;
    public Integer f34981b;

    public /* synthetic */ nzf m40241a(nyt nyt) {
        return m40240b(nyt);
    }

    public pbv() {
        this.f34981b = null;
        this.cachedSize = -1;
    }

    public void m40242a(nyu nyu) {
        if (this.f34980a != null) {
            nyu.m37182b(1, this.f34980a);
        }
        if (this.f34981b != null) {
            nyu.m37168a(2, this.f34981b.intValue());
        }
        super.a(nyu);
    }

    protected int m40243b() {
        int b = super.b();
        if (this.f34980a != null) {
            b += nyu.m37145d(1, this.f34980a);
        }
        if (this.f34981b != null) {
            return b + nyu.m37147f(2, this.f34981b.intValue());
        }
        return b;
    }

    private pbv m40240b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f34980a == null) {
                        this.f34980a = new pbn();
                    }
                    nyt.m37101a(this.f34980a);
                    continue;
                case 16:
                    this.f34981b = Integer.valueOf(nyt.m37112f());
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
