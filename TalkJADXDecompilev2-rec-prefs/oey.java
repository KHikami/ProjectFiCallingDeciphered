package p000;

public final class oey extends nyx<oey> {
    public String f32500a;
    public String f32501b;
    public oeq f32502c;
    public oer f32503d;
    public long f32504e;

    public /* synthetic */ nzf m38015a(nyt nyt) {
        return m38013b(nyt);
    }

    public oey() {
        m38014d();
    }

    private oey m38014d() {
        this.f32500a = "";
        this.f32501b = "";
        this.f32502c = null;
        this.f32503d = null;
        this.f32504e = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38016a(nyu nyu) {
        if (!(this.f32500a == null || this.f32500a.equals(""))) {
            nyu.m37170a(1, this.f32500a);
        }
        if (!(this.f32501b == null || this.f32501b.equals(""))) {
            nyu.m37170a(2, this.f32501b);
        }
        if (this.f32502c != null) {
            nyu.m37182b(3, this.f32502c);
        }
        if (this.f32503d != null) {
            nyu.m37182b(4, this.f32503d);
        }
        if (this.f32504e != 0) {
            nyu.m37181b(5, this.f32504e);
        }
        super.a(nyu);
    }

    protected int m38017b() {
        int b = super.b();
        if (!(this.f32500a == null || this.f32500a.equals(""))) {
            b += nyu.m37137b(1, this.f32500a);
        }
        if (!(this.f32501b == null || this.f32501b.equals(""))) {
            b += nyu.m37137b(2, this.f32501b);
        }
        if (this.f32502c != null) {
            b += nyu.m37145d(3, this.f32502c);
        }
        if (this.f32503d != null) {
            b += nyu.m37145d(4, this.f32503d);
        }
        if (this.f32504e != 0) {
            return b + nyu.m37148f(5, this.f32504e);
        }
        return b;
    }

    private oey m38013b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.f32500a = nyt.m37117j();
                    continue;
                case wi.dH /*18*/:
                    this.f32501b = nyt.m37117j();
                    continue;
                case wi.dx /*26*/:
                    if (this.f32502c == null) {
                        this.f32502c = new oeq();
                    }
                    nyt.m37101a(this.f32502c);
                    continue;
                case 34:
                    if (this.f32503d == null) {
                        this.f32503d = new oer();
                    }
                    nyt.m37101a(this.f32503d);
                    continue;
                case 40:
                    this.f32504e = nyt.m37110e();
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
