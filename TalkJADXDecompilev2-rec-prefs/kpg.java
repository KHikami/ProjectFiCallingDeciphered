package p000;

public final class kpg extends nyx<kpg> {
    public kph f22638a;
    public kph f22639b;
    public kph f22640c;
    public kph f22641d;
    public kph f22642e;

    public /* synthetic */ nzf mo150a(nyt nyt) {
        return m26899b(nyt);
    }

    public kpg() {
        m26900d();
    }

    private kpg m26900d() {
        this.f22638a = null;
        this.f22639b = null;
        this.f22640c = null;
        this.f22641d = null;
        this.f22642e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void mo146a(nyu nyu) {
        if (this.f22638a != null) {
            nyu.b(1, this.f22638a);
        }
        if (this.f22639b != null) {
            nyu.b(2, this.f22639b);
        }
        if (this.f22640c != null) {
            nyu.b(3, this.f22640c);
        }
        if (this.f22641d != null) {
            nyu.b(4, this.f22641d);
        }
        if (this.f22642e != null) {
            nyu.b(5, this.f22642e);
        }
        super.mo146a(nyu);
    }

    protected int mo147b() {
        int b = super.mo147b();
        if (this.f22638a != null) {
            b += nyu.d(1, this.f22638a);
        }
        if (this.f22639b != null) {
            b += nyu.d(2, this.f22639b);
        }
        if (this.f22640c != null) {
            b += nyu.d(3, this.f22640c);
        }
        if (this.f22641d != null) {
            b += nyu.d(4, this.f22641d);
        }
        if (this.f22642e != null) {
            return b + nyu.d(5, this.f22642e);
        }
        return b;
    }

    private kpg m26899b(nyt nyt) {
        while (true) {
            int a = nyt.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f22638a == null) {
                        this.f22638a = new kph();
                    }
                    nyt.a(this.f22638a);
                    continue;
                case wi.dH /*18*/:
                    if (this.f22639b == null) {
                        this.f22639b = new kph();
                    }
                    nyt.a(this.f22639b);
                    continue;
                case wi.dx /*26*/:
                    if (this.f22640c == null) {
                        this.f22640c = new kph();
                    }
                    nyt.a(this.f22640c);
                    continue;
                case 34:
                    if (this.f22641d == null) {
                        this.f22641d = new kph();
                    }
                    nyt.a(this.f22641d);
                    continue;
                case 42:
                    if (this.f22642e == null) {
                        this.f22642e = new kph();
                    }
                    nyt.a(this.f22642e);
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
