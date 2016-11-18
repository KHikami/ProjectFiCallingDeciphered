package p000;

public final class oig extends nyx<oig> {
    public String f32969a;
    public ohu f32970b;
    public Integer f32971c;
    public oif f32972d;

    public /* synthetic */ nzf m38469a(nyt nyt) {
        return m38467b(nyt);
    }

    public oig() {
        m38468d();
    }

    private oig m38468d() {
        this.f32969a = null;
        this.f32970b = null;
        this.f32971c = null;
        this.f32972d = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38470a(nyu nyu) {
        if (this.f32969a != null) {
            nyu.m37170a(1, this.f32969a);
        }
        if (this.f32970b != null) {
            nyu.m37182b(2, this.f32970b);
        }
        if (this.f32971c != null) {
            nyu.m37168a(3, this.f32971c.intValue());
        }
        if (this.f32972d != null) {
            nyu.m37182b(4, this.f32972d);
        }
        super.a(nyu);
    }

    protected int m38471b() {
        int b = super.b();
        if (this.f32969a != null) {
            b += nyu.m37137b(1, this.f32969a);
        }
        if (this.f32970b != null) {
            b += nyu.m37145d(2, this.f32970b);
        }
        if (this.f32971c != null) {
            b += nyu.m37147f(3, this.f32971c.intValue());
        }
        if (this.f32972d != null) {
            return b + nyu.m37145d(4, this.f32972d);
        }
        return b;
    }

    private oig m38467b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32969a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    if (this.f32970b == null) {
                        this.f32970b = new ohu();
                    }
                    nyt.m37101a(this.f32970b);
                    continue;
                case wi.dA /*24*/:
                    this.f32971c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 34:
                    if (this.f32972d == null) {
                        this.f32972d = new oif();
                    }
                    nyt.m37101a(this.f32972d);
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
