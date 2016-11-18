package p000;

public final class myn extends nyx<myn> {
    public Float f29160a;
    public Float f29161b;
    public myo f29162c;

    public /* synthetic */ nzf m33831a(nyt nyt) {
        return m33829b(nyt);
    }

    public myn() {
        m33830d();
    }

    private myn m33830d() {
        this.f29160a = null;
        this.f29161b = null;
        this.f29162c = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m33832a(nyu nyu) {
        if (this.f29160a != null) {
            nyu.m37167a(1, this.f29160a.floatValue());
        }
        if (this.f29161b != null) {
            nyu.m37167a(2, this.f29161b.floatValue());
        }
        if (this.f29162c != null) {
            nyu.m37182b(3, this.f29162c);
        }
        super.a(nyu);
    }

    protected int m33833b() {
        int b = super.b();
        if (this.f29160a != null) {
            this.f29160a.floatValue();
            b += nyu.m37154h(1) + 4;
        }
        if (this.f29161b != null) {
            this.f29161b.floatValue();
            b += nyu.m37154h(2) + 4;
        }
        if (this.f29162c != null) {
            return b + nyu.m37145d(3, this.f29162c);
        }
        return b;
    }

    private myn m33829b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 13:
                    this.f29160a = Float.valueOf(nyt.m37106c());
                    continue;
                case 21:
                    this.f29161b = Float.valueOf(nyt.m37106c());
                    continue;
                case wi.dx /*26*/:
                    if (this.f29162c == null) {
                        this.f29162c = new myo();
                    }
                    nyt.m37101a(this.f29162c);
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
