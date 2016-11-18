package p000;

public final class nja extends nyx<nja> {
    public Integer f29956a;
    public Integer f29957b;
    public Integer f29958c;
    public Integer f29959d;
    public Integer f29960e;
    public Integer f29961f;
    public Float f29962g;
    public Float f29963h;
    public Float f29964i;

    public /* synthetic */ nzf m35183a(nyt nyt) {
        return m35181b(nyt);
    }

    public nja() {
        m35182d();
    }

    private nja m35182d() {
        this.f29956a = null;
        this.f29957b = null;
        this.f29958c = null;
        this.f29959d = null;
        this.f29960e = null;
        this.f29961f = null;
        this.f29962g = null;
        this.f29963h = null;
        this.f29964i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m35184a(nyu nyu) {
        if (this.f29956a != null) {
            nyu.m37168a(1, this.f29956a.intValue());
        }
        if (this.f29957b != null) {
            nyu.m37168a(2, this.f29957b.intValue());
        }
        if (this.f29958c != null) {
            nyu.m37168a(3, this.f29958c.intValue());
        }
        if (this.f29959d != null) {
            nyu.m37168a(4, this.f29959d.intValue());
        }
        if (this.f29960e != null) {
            nyu.m37168a(5, this.f29960e.intValue());
        }
        if (this.f29961f != null) {
            nyu.m37168a(6, this.f29961f.intValue());
        }
        if (this.f29962g != null) {
            nyu.m37167a(7, this.f29962g.floatValue());
        }
        if (this.f29963h != null) {
            nyu.m37167a(8, this.f29963h.floatValue());
        }
        if (this.f29964i != null) {
            nyu.m37167a(9, this.f29964i.floatValue());
        }
        super.a(nyu);
    }

    protected int m35185b() {
        int b = super.b();
        if (this.f29956a != null) {
            b += nyu.m37147f(1, this.f29956a.intValue());
        }
        if (this.f29957b != null) {
            b += nyu.m37147f(2, this.f29957b.intValue());
        }
        if (this.f29958c != null) {
            b += nyu.m37147f(3, this.f29958c.intValue());
        }
        if (this.f29959d != null) {
            b += nyu.m37147f(4, this.f29959d.intValue());
        }
        if (this.f29960e != null) {
            b += nyu.m37147f(5, this.f29960e.intValue());
        }
        if (this.f29961f != null) {
            b += nyu.m37147f(6, this.f29961f.intValue());
        }
        if (this.f29962g != null) {
            this.f29962g.floatValue();
            b += nyu.m37154h(7) + 4;
        }
        if (this.f29963h != null) {
            this.f29963h.floatValue();
            b += nyu.m37154h(8) + 4;
        }
        if (this.f29964i == null) {
            return b;
        }
        this.f29964i.floatValue();
        return b + (nyu.m37154h(9) + 4);
    }

    private nja m35181b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f29956a = Integer.valueOf(nyt.m37112f());
                    continue;
                case 16:
                    this.f29957b = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dA /*24*/:
                    this.f29958c = Integer.valueOf(nyt.m37112f());
                    continue;
                case 32:
                    this.f29959d = Integer.valueOf(nyt.m37112f());
                    continue;
                case 40:
                    this.f29960e = Integer.valueOf(nyt.m37112f());
                    continue;
                case 48:
                    this.f29961f = Integer.valueOf(nyt.m37112f());
                    continue;
                case 61:
                    this.f29962g = Float.valueOf(nyt.m37106c());
                    continue;
                case 69:
                    this.f29963h = Float.valueOf(nyt.m37106c());
                    continue;
                case 77:
                    this.f29964i = Float.valueOf(nyt.m37106c());
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
