package p000;

public final class ofm extends nyx<ofm> {
    private static volatile ofm[] f32645c;
    public nzr f32646a;
    public String f32647b;

    public /* synthetic */ nzf m38079a(nyt nyt) {
        return m38076b(nyt);
    }

    public static ofm[] m38077d() {
        if (f32645c == null) {
            synchronized (nzc.f31309c) {
                if (f32645c == null) {
                    f32645c = new ofm[0];
                }
            }
        }
        return f32645c;
    }

    public ofm() {
        m38078g();
    }

    private ofm m38078g() {
        this.f32646a = null;
        this.f32647b = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    public void m38080a(nyu nyu) {
        if (this.f32646a != null) {
            nyu.m37182b(1, this.f32646a);
        }
        if (this.f32647b != null) {
            nyu.m37170a(3, this.f32647b);
        }
        super.a(nyu);
    }

    protected int m38081b() {
        int b = super.b();
        if (this.f32646a != null) {
            b += nyu.m37145d(1, this.f32646a);
        }
        if (this.f32647b != null) {
            return b + nyu.m37137b(3, this.f32647b);
        }
        return b;
    }

    private ofm m38076b(nyt nyt) {
        while (true) {
            int a = nyt.m37099a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    if (this.f32646a == null) {
                        this.f32646a = new nzr();
                    }
                    nyt.m37101a(this.f32646a);
                    continue;
                case wi.dx /*26*/:
                    this.f32647b = nyt.m37117j();
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
