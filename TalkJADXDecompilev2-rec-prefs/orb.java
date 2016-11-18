package p000;

public final class orb extends nyx<orb> {
    public Integer f33853a;
    public String f33854b;
    public oox f33855c;
    public osq f33856d;

    public /* synthetic */ nzf m39284a(nyt nyt) {
        return m39282b(nyt);
    }

    public orb() {
        m39283d();
    }

    private orb m39283d() {
        this.f33854b = null;
        this.f33855c = null;
        this.f33856d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m39285a(nyu nyu) {
        if (this.f33853a != null) {
            nyu.m37168a(1, this.f33853a.intValue());
        }
        if (this.f33854b != null) {
            nyu.m37170a(4, this.f33854b);
        }
        if (this.f33856d != null) {
            nyu.m37182b(5, this.f33856d);
        }
        if (this.f33855c != null) {
            nyu.m37182b(6, this.f33855c);
        }
        super.a(nyu);
    }

    protected int m39286b() {
        int b = super.b();
        if (this.f33853a != null) {
            b += nyu.m37147f(1, this.f33853a.intValue());
        }
        if (this.f33854b != null) {
            b += nyu.m37137b(4, this.f33854b);
        }
        if (this.f33856d != null) {
            b += nyu.m37145d(5, this.f33856d);
        }
        if (this.f33855c != null) {
            return b + nyu.m37145d(6, this.f33855c);
        }
        return b;
    }

    private orb m39282b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    a = nyt.m37112f();
                    switch (a) {
                        case 1:
                        case 2:
                        case 3:
                            this.f33853a = Integer.valueOf(a);
                            break;
                        default:
                            continue;
                    }
                case 34:
                    this.f33854b = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f33856d == null) {
                        this.f33856d = new osq();
                    }
                    nyt.m37101a(this.f33856d);
                    continue;
                case 50:
                    if (this.f33855c == null) {
                        this.f33855c = new oox();
                    }
                    nyt.m37101a(this.f33855c);
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
