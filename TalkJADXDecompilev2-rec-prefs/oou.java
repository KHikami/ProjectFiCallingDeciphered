package p000;

public final class oou extends nyx<oou> {
    public mun f33493a;
    public String f33494b;
    public muj f33495c;
    public Float f33496d;
    public oqu f33497e;
    public String f33498f;

    public /* synthetic */ nzf m38965a(nyt nyt) {
        return m38963b(nyt);
    }

    public oou() {
        m38964d();
    }

    private oou m38964d() {
        this.f33493a = null;
        this.f33494b = null;
        this.f33495c = null;
        this.f33496d = null;
        this.f33497e = null;
        this.f33498f = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38966a(nyu nyu) {
        if (this.f33493a != null) {
            nyu.m37182b(1, this.f33493a);
        }
        if (this.f33494b != null) {
            nyu.m37170a(2, this.f33494b);
        }
        if (this.f33495c != null) {
            nyu.m37182b(3, this.f33495c);
        }
        if (this.f33496d != null) {
            nyu.m37167a(4, this.f33496d.floatValue());
        }
        if (this.f33497e != null) {
            nyu.m37182b(5, this.f33497e);
        }
        if (this.f33498f != null) {
            nyu.m37170a(6, this.f33498f);
        }
        super.a(nyu);
    }

    protected int m38967b() {
        int b = super.b();
        if (this.f33493a != null) {
            b += nyu.m37145d(1, this.f33493a);
        }
        if (this.f33494b != null) {
            b += nyu.m37137b(2, this.f33494b);
        }
        if (this.f33495c != null) {
            b += nyu.m37145d(3, this.f33495c);
        }
        if (this.f33496d != null) {
            this.f33496d.floatValue();
            b += nyu.m37154h(4) + 4;
        }
        if (this.f33497e != null) {
            b += nyu.m37145d(5, this.f33497e);
        }
        if (this.f33498f != null) {
            return b + nyu.m37137b(6, this.f33498f);
        }
        return b;
    }

    private oou m38963b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f33493a == null) {
                        this.f33493a = new mun();
                    }
                    nyt.m37101a(this.f33493a);
                    continue;
                case wi.dH /*18*/:
                    this.f33494b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f33495c == null) {
                        this.f33495c = new muj();
                    }
                    nyt.m37101a(this.f33495c);
                    continue;
                case 37:
                    this.f33496d = Float.valueOf(nyt.m37106c());
                    continue;
                case 42:
                    if (this.f33497e == null) {
                        this.f33497e = new oqu();
                    }
                    nyt.m37101a(this.f33497e);
                    continue;
                case 50:
                    this.f33498f = nyt.m37117j();
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
