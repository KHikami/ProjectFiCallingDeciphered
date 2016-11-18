package p000;

public final class oev extends nyx<oev> {
    public String f32491a;
    public oes f32492b;
    public oew f32493c;
    public String f32494d;
    public String f32495e;

    public /* synthetic */ nzf m38000a(nyt nyt) {
        return m37998b(nyt);
    }

    public oev() {
        m37999d();
    }

    private oev m37999d() {
        this.f32491a = "";
        this.f32492b = null;
        this.f32493c = null;
        this.f32494d = "";
        this.f32495e = "";
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38001a(nyu nyu) {
        if (!(this.f32491a == null || this.f32491a.equals(""))) {
            nyu.m37170a(1, this.f32491a);
        }
        if (!(this.f32494d == null || this.f32494d.equals(""))) {
            nyu.m37170a(2, this.f32494d);
        }
        if (this.f32492b != null) {
            nyu.m37182b(3, this.f32492b);
        }
        if (!(this.f32495e == null || this.f32495e.equals(""))) {
            nyu.m37170a(4, this.f32495e);
        }
        if (this.f32493c != null) {
            nyu.m37182b(5, this.f32493c);
        }
        super.a(nyu);
    }

    protected int m38002b() {
        int b = super.b();
        if (!(this.f32491a == null || this.f32491a.equals(""))) {
            b += nyu.m37137b(1, this.f32491a);
        }
        if (!(this.f32494d == null || this.f32494d.equals(""))) {
            b += nyu.m37137b(2, this.f32494d);
        }
        if (this.f32492b != null) {
            b += nyu.m37145d(3, this.f32492b);
        }
        if (!(this.f32495e == null || this.f32495e.equals(""))) {
            b += nyu.m37137b(4, this.f32495e);
        }
        if (this.f32493c != null) {
            return b + nyu.m37145d(5, this.f32493c);
        }
        return b;
    }

    private oev m37998b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32491a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32494d = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32492b == null) {
                        this.f32492b = new oes();
                    }
                    nyt.m37101a(this.f32492b);
                    continue;
                case 34:
                    this.f32495e = nyt.m37117j();
                    continue;
                case 42:
                    if (this.f32493c == null) {
                        this.f32493c = new oew();
                    }
                    nyt.m37101a(this.f32493c);
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
