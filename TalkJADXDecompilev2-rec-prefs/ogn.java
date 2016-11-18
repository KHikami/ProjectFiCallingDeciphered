package p000;

public final class ogn extends nyx<ogn> {
    public Integer f32734a;
    public byte[] f32735b;
    public byte[] f32736c;
    public Long f32737d;
    public Long f32738e;
    public String f32739f;
    public String f32740g;

    public /* synthetic */ nzf m38210a(nyt nyt) {
        return m38209b(nyt);
    }

    public ogn() {
        this.f32734a = null;
        this.f32735b = null;
        this.f32736c = null;
        this.f32737d = null;
        this.f32738e = null;
        this.f32739f = null;
        this.f32740g = null;
        this.cachedSize = -1;
    }

    public void m38211a(nyu nyu) {
        nyu.m37168a(1, this.f32734a.intValue());
        nyu.m37173a(2, this.f32735b);
        nyu.m37173a(3, this.f32736c);
        if (this.f32737d != null) {
            nyu.m37181b(4, this.f32737d.longValue());
        }
        if (this.f32738e != null) {
            nyu.m37181b(6, this.f32738e.longValue());
        }
        if (this.f32739f != null) {
            nyu.m37170a(7, this.f32739f);
        }
        if (this.f32740g != null) {
            nyu.m37170a(8, this.f32740g);
        }
        super.a(nyu);
    }

    protected int m38212b() {
        int b = ((super.b() + nyu.m37147f(1, this.f32734a.intValue())) + nyu.m37139b(2, this.f32735b)) + nyu.m37139b(3, this.f32736c);
        if (this.f32737d != null) {
            b += nyu.m37148f(4, this.f32737d.longValue());
        }
        if (this.f32738e != null) {
            b += nyu.m37148f(6, this.f32738e.longValue());
        }
        if (this.f32739f != null) {
            b += nyu.m37137b(7, this.f32739f);
        }
        if (this.f32740g != null) {
            return b + nyu.m37137b(8, this.f32740g);
        }
        return b;
    }

    private ogn m38209b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 8:
                    this.f32734a = Integer.valueOf(nyt.m37112f());
                    continue;
                case wi.dH /*18*/:
                    this.f32735b = nyt.m37118k();
                    continue;
                case wi.dx /*26*/:
                    this.f32736c = nyt.m37118k();
                    continue;
                case 32:
                    this.f32737d = Long.valueOf(nyt.m37110e());
                    continue;
                case 48:
                    this.f32738e = Long.valueOf(nyt.m37110e());
                    continue;
                case 58:
                    this.f32739f = nyt.m37117j();
                    continue;
                case 66:
                    this.f32740g = nyt.m37117j();
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
