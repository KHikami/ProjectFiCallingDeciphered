package p000;

public final class naj extends nyx<naj> {
    private static volatile naj[] f29361c;
    public Float f29362a;
    public Float f29363b;

    public /* synthetic */ nzf m34050a(nyt nyt) {
        return m34048b(nyt);
    }

    public static naj[] m34049d() {
        if (f29361c == null) {
            synchronized (nzc.f31309c) {
                if (f29361c == null) {
                    f29361c = new naj[0];
                }
            }
        }
        return f29361c;
    }

    public naj() {
        this.f29362a = null;
        this.f29363b = null;
        this.cachedSize = -1;
    }

    public void m34051a(nyu nyu) {
        if (this.f29362a != null) {
            nyu.m37167a(1, this.f29362a.floatValue());
        }
        if (this.f29363b != null) {
            nyu.m37167a(2, this.f29363b.floatValue());
        }
        super.a(nyu);
    }

    protected int m34052b() {
        int b = super.b();
        if (this.f29362a != null) {
            this.f29362a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f29363b == null) {
            return b;
        }
        this.f29363b.floatValue();
        return b + (nyu.m37154h(2) + 4);
    }

    private naj m34048b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f29362a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f29363b = Float.valueOf(nyt.m37106c());
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
